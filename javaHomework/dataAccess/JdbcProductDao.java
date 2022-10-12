package javaHomework.dataAccess;

import javaHomework.entities.Product;

public class JdbcProductDao implements ProductDao
{

	@Override
	public void add(Product product) 
	{
		
		System.out.println("Jdbc ile Product"+product.getName());
	}

}
