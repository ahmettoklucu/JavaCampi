package javaHomework.dataAccess;

import javaHomework.entities.Category;

public class JdbcCategoryDao implements CategoryDao
{

	@Override
	public void add(Category category) 
	{
		System.out.println("Jdbc ile Category"+category.getName());
	
	}

}
