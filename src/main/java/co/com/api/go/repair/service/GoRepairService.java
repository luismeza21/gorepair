package co.com.api.go.repair.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.api.go.repair.model.Category;
import co.com.api.go.repair.repository.ICategoryRepository;

@Service
public class GoRepairService {

	@Autowired
	ICategoryRepository categoryRepository;

	public List<Category> getCategory() {
	return categoryRepository.findAll();
	}
}
