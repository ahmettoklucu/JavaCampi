package javaHomework.bussiness;

import org.w3c.dom.ls.LSOutput;

import javaHomework.core.loggin.Logger;
import javaHomework.dataAccess.ProductDao;
import javaHomework.entities.Product;

public class ProductManager 
{
	Boolean controlBoolean=true;
	String[] productList={"c#","java","Python"};
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao _productdao,Logger[] loggers) 
	{
		this.productDao = _productdao;
		this.loggers=loggers;
	}
	public void add(Product product)  
	{
		for (int i = 0; i < productList.length; i++) 
		{
			if (product.getUnitPrice()<=0&&product.getName()==productList[i]) 
			{
				controlBoolean=false;
			}
			
		}
		if(controlBoolean==true)
		{
			productDao.add(product);
			for (Logger logger : loggers) 
			{
				logger.log(product.getName());
				
			}
		}
		else 
		{
			System.out.println("kayit edilemedi");
			
		}
	
		
		
	}

}
