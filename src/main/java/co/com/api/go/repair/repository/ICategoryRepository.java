package co.com.api.go.repair.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.api.go.repair.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long>{

}
