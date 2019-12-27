package co.productstore.domain.repository;

import java.util.List;

import co.productstore.domain.Category;

public interface CategoryRepository {
	
	void create(Category category);
	
	Category searchByName(String name);
	
	List<Category> listByCategory(String nameParent);

}
