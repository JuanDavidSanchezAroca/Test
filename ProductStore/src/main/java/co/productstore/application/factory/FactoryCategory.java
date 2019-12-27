package co.productstore.application.factory;

import org.springframework.stereotype.Component;

import co.productstore.application.command.CategoryCommand;
import co.productstore.domain.Category;

@Component
public class FactoryCategory {

	public Category create(CategoryCommand categoryCommand) {
		return new Category(categoryCommand.getName(),null);
	}
}
