package co.productstore.domain.service.category;

import co.productstore.domain.Category;
import co.productstore.domain.exception.ExceptionGeneric;
import co.productstore.domain.repository.CategoryRepository;

public class CreateSubCategoryService {

	private CategoryRepository categoryRepository;
	
	public CreateSubCategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public void create(Category category) {
		validateParent(category);
		categoryRepository.create(category);
	}
	
	public void validateParent(Category category) {
		Category parent = categoryRepository.searchByName(category.getName());
		if(parent == null) {
			throw new ExceptionGeneric("Not found category parent");
		}
		
		if(parent.getParentCategory() != null) {
			throw new ExceptionGeneric("There is no main category parent");
		}		
		category.getParentCategory().setId(parent.getId());
	}
	
	public void validatePreviousExistence(Category category) {
		Category parent = categoryRepository.searchByNameParent(category.getName(),category.getParentCategory().getId());
	}
}
