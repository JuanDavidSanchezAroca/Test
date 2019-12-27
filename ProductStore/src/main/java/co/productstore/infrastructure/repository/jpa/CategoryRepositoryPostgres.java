package co.productstore.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.productstore.infrastructure.entities.CategoryEntity;

@Repository
public interface CategoryRepositoryPostgres extends JpaRepository<CategoryEntity, Integer> {

	@Query(value="select c from CategoryEntity c where c.name = :name and c.parentCategory is null ")
	CategoryEntity searchByName( @Param("name") String name);
	
	@Query(value="select c from CategoryEntity c where c.name = :name and c.parentCategory = :parent ")
	CategoryEntity searchByNameParent(@Param("name") String name, @Param("parent") int parent );
	

}
