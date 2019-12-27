package co.productstore.domain;

public class Category {

	private int id;
	
	private String name;
	
	private Category parentCategory;

	public Category(String name, Category parentCategory) {
		this.name = name;
		this.parentCategory = parentCategory;
	}

	public Category() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
}
