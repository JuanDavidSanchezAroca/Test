package co.productstore.infrastructure.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.productstore.domain.repository.CategoryRepository;
import co.productstore.domain.service.category.CreateCategoryService;

@Configuration
public class Beans {

	/**
	 * Servicio categoria 
	 */
	
	@Bean
	public CreateCategoryService  createCategoryService(CategoryRepository categoryRepository) {
		return new  CreateCategoryService(categoryRepository);
	}
}
