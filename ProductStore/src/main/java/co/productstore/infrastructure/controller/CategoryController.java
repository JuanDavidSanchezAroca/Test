package co.productstore.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.productstore.application.command.CategoryCommand;
import co.productstore.application.manager.category.ManagerCreateCategory;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
	
	private final ManagerCreateCategory managerCategory;

	public CategoryController(ManagerCreateCategory managerCategory) {
		this.managerCategory = managerCategory;
	}
	
	@PostMapping(path ="/add")
	public void add(@RequestBody CategoryCommand categoryCommand) {
		managerCategory.create(categoryCommand);
	}
	
	public void addSubCategory(@RequestBody CategoryCommand categoryCommand) {

		
	}
	
	

}
