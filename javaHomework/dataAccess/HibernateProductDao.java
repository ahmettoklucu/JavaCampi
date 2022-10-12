package javaHomework.dataAccess;

import javaHomework.entities.Product;

public class HibernateProductDao 
{
	public void add(Product product) 
	{
		System.out.println("Hibernate ile Product"+product.getName());
		
	}

}
