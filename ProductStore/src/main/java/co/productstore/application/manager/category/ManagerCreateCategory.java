package co.productstore.application.manager.category;

import org.springframework.stereotype.Component;

import co.productstore.application.command.CategoryCommand;
import co.productstore.application.factory.FactoryCategory;
import co.productstore.domain.Category;
import co.productstore.domain.service.category.CreateCategoryService;

@Component
public class ManagerCreateCategory {
  
	private final CreateCategoryService createCategoryService;
	
	private final FactoryCategory factoryCategory;

	public ManagerCreateCategory(CreateCategoryService createCategoryService, FactoryCategory factoryCategory) {
		this.createCategoryService = createCategoryService;
		this.factoryCategory = factoryCategory;
	}
	
	
	public void create(CategoryCommand categoryCommand) {
		Category ctg = factoryCategory.create(categoryCommand);
		createCategoryService.create(ctg);
	}
	
	
	
}
