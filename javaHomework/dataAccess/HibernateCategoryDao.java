package javaHomework.dataAccess;

import javaHomework.entities.Category;

public class HibernateCategoryDao implements CategoryDao 
{

	@Override
	public void add(Category category) 
	{
		System.out.println("Hibernate ile Category"+category.getName());
		
	}

}
