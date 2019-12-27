package co.productstore.domain.service.category;

import co.productstore.domain.Category;
import co.productstore.domain.exception.ExceptionGeneric;
import co.productstore.domain.repository.CategoryRepository;

public class CreateCategoryService {
	
	private CategoryRepository categoryRepository;

	public CreateCategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public void create(Category category) {
		alreadyExists(category.getName());
		categoryRepository.create(category);
	}
	
	public void alreadyExists(String name) {
		Category ctg = categoryRepository.searchByName(name);
		if(ctg != null) {
			throw new ExceptionGeneric("Already exists Category");
		}
	}
	
	

}
