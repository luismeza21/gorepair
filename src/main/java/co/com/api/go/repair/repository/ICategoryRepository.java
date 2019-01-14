package co.com.api.go.repair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.api.go.repair.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long>{

	
	@Query("SELECT c FROM Category c WHERE c.id = ?1")
	public Category findByIdCategory(long idCategory);
}
