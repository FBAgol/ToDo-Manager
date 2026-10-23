package test.ToDo_Manager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "users")
@Getter@Setter@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 100)
    private String password;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false)
    private Date created_at;
}
