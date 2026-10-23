package test.ToDo_Manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.ToDo_Manager.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
