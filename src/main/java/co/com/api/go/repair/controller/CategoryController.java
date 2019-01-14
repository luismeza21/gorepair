package co.com.api.go.repair.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.api.go.repair.model.Category;
import co.com.api.go.repair.service.CategoryService;

@RestController
@RequestMapping(value = "/api/v1/go/repair/")
public class CategoryController {

	public static final Logger log = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	CategoryService goRepairService;

	@RequestMapping(value = "get/category", method = RequestMethod.GET, produces = "application/json")
	public List<Category> getAllCategory() {
		List<Category> category = null;
		try {
			category = goRepairService.getAllCategory();
			log.info("Se encontraron las siguientes categorias {}", category);
		} catch (Exception e) {
			log.error("Problemas {}", e);
		}

		return category;

	}

	@RequestMapping(value = "create/category", method = RequestMethod.POST, produces = "application/json")
	public Category createCategory(@RequestBody Category category) {
		return goRepairService.createCategory(category);
	}
	
	@RequestMapping(value= "update/category/{id}", method = RequestMethod.PUT, produces = "application/json")
	public Category updateCategory(@PathVariable("id") long idCategory, @RequestBody Category category) {
		Category cat = null;
		try {
			cat = goRepairService.updateCategory(idCategory, category);
		}catch (Exception e) {
			log.error("Problemas {]", e);
		}
		
		return cat;
	}
	
	
	@RequestMapping(value= "delete/category/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<?> updateCategory(@PathVariable("id") long idCategory) {
		 goRepairService.deleteCategory(idCategory);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
