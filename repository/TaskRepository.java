package test.ToDo_Manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.ToDo_Manager.model.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
