package javaHomework;

import javaHomework.bussiness.CategoryManager;
import javaHomework.bussiness.ProductManager;
import javaHomework.core.loggin.DatabaseLogger;
import javaHomework.core.loggin.Logger;
import javaHomework.dataAccess.JdbcCategoryDao;
import javaHomework.dataAccess.JdbcProductDao;
import javaHomework.entities.Category;
import javaHomework.entities.Product;

import java.util.ArrayList;
import java.util.List;
public class main {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Product product1=new Product(1,"IPhone Xr",10);
		
		Logger[] loggers= {new DatabaseLogger()};
		
		ProductManager productManager =new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
		
		Category category=new Category(1,"Telefon");
		
		Logger[] loggersCategory= {new DatabaseLogger()};
		
		CategoryManager categoryManager =new CategoryManager(new JdbcCategoryDao(),loggersCategory);
		categoryManager.add(category);


	}

		
}
