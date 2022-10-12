package javaHomework.bussiness;
import javaHomework.core.loggin.Logger;
import javaHomework.dataAccess.CategoryDao;
import javaHomework.entities.Category;
public class CategoryManager 
{
	Boolean controlBoolean=true;
	String[] categoryList={"yazılım","sanat","spor"};
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao _categoryDao,Logger[] loggers) 
	{
		this.categoryDao = _categoryDao;
		this.loggers=loggers;
	}
	public void add(Category category)  
	{
		for (int i = 0; i < categoryList.length; i++) 
		{
			if (category.getName()==categoryList[i]) 
			{
				controlBoolean=false;
			}
		}	
		if(controlBoolean==true)
		{
			categoryDao.add(category);
			for (Logger logger : loggers) 
			{
				logger.log(category.getName());
			}
		}
		else 
		{
			System.out.println("kayit edilemedi");	
		}
	}

}
