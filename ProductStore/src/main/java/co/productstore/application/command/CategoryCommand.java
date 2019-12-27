package co.productstore.application.command;



public class CategoryCommand {
	
	private String name;
	
	private CategoryCommand parentCategory;

	public CategoryCommand(String name, CategoryCommand parentCategory) {
		this.name = name;
		this.parentCategory = parentCategory;
	}

	public CategoryCommand() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryCommand getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(CategoryCommand parentCategory) {
		this.parentCategory = parentCategory;
	}
}
