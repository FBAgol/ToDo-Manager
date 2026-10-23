package test.ToDo_Manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.ToDo_Manager.model.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
