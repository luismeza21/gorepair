package co.com.api.go.repair.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.api.go.repair.model.Category;
import co.com.api.go.repair.service.GoRepairService;

@RestController
@RequestMapping(value = "/api/v1/go/repair/")
public class GoRepairController {

	public static final Logger log = LoggerFactory.getLogger(GoRepairController.class);

	@Autowired
	GoRepairService goRepairService;

	@RequestMapping(value = "inquiry/category", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Category>> getAllCategory() {
		List<Category> category = null;
		try {
			category = goRepairService.getCategory();
			log.info("Se encontraron las siguientes categorias {}", category);
		} catch (Exception e) {
			log.error("Problemas " + e);
		}

		return new ResponseEntity<>(category, HttpStatus.OK);

	}

}
