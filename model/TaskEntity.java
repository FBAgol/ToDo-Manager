package test.ToDo_Manager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import test.ToDo_Manager.utils.PriorityEnum;
import test.ToDo_Manager.utils.StatusEnum;

import java.util.Date;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String title;
    @Column(nullable = false, length = 50)
    private String description;
    @Column(nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @Column(nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private PriorityEnum priority;
    private Date dueDate;
    @Column(nullable = false)
    private Date created_at;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryEntity category;
}
