package javaHomework.core.loggin;

public class DatabaseLogger implements Logger
{

	@Override
	public void log(String data) 
	{
		System.out.println("database loglandi:"+data);
		
	}


}
