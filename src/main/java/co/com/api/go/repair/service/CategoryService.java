package co.com.api.go.repair.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.api.go.repair.model.Category;
import co.com.api.go.repair.repository.ICategoryRepository;

/**
 * Service para categorias
 * @author user
 *
 */
@Service
public class CategoryService {

	public static Logger log = LoggerFactory.getLogger(CategoryService.class);

	@Autowired
	ICategoryRepository categoryRepository;

	public List<Category> getAllCategory() {
		List<Category> categoryList = null;
		try {
			categoryList = categoryRepository.findAll();

		} catch (Exception e) {
			log.error("Problemas al consultar las categorias {}", e);
		}
		return categoryList;
	}

	public Category createCategory(Category category) {
		Category cat = null;
		try {
			cat = categoryRepository.save(category);
		} catch (Exception e) {
			log.error("Problemas al momento de crear la categoria {}", e);
		}
		return cat;
	}
	
	public Category updateCategory(long idCategory, Category category) {
		Category cat = null;
		try {
			cat = categoryRepository.findByIdCategory(idCategory);
			if(cat != null) {
				cat.setDescription(category.getDescription());
				cat.setName(category.getName());
				categoryRepository.save(cat);
			}else {
				log.info("No existe categoria {}", idCategory);
			}
		} catch (Exception e) {
			log.error("Problemas al momento de actualizar la categoria {}", e);
		}
		return cat;
	}
	
	public void deleteCategory(long idCategory) {
		Category cat = null;
		try {
			cat = categoryRepository.findByIdCategory(idCategory);
			if(cat != null) {
				categoryRepository.delete(cat);
			}else {
				log.info("No existe categoria {}", idCategory);
			}
		} catch (Exception e) {
			log.error("Problemas al momento de elimiar la categoria {}", e);
		}
	}
}
