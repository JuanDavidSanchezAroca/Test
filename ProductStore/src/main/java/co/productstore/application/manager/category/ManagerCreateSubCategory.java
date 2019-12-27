package co.productstore.application.manager.category;

import org.springframework.stereotype.Component;

import co.productstore.application.command.CategoryCommand;
import co.productstore.application.factory.FactoryCategory;
import co.productstore.domain.Category;
import co.productstore.domain.service.category.CreateSubCategoryService;

@Component
public class ManagerCreateSubCategory {

	private final CreateSubCategoryService createSubCategoryService;
	
	private final FactoryCategory factoryCategory;

	public ManagerCreateSubCategory(CreateSubCategoryService createSubCategoryService,
			FactoryCategory factoryCategory) {
		this.createSubCategoryService = createSubCategoryService;
		this.factoryCategory = factoryCategory;
	}
	
	public void create(CategoryCommand categoryCommand) {
		Category ctg = factoryCategory.create(categoryCommand);
		createSubCategoryService.create(ctg);
	}
	
	
}
