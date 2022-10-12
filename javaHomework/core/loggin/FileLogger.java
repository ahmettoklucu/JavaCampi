package javaHomework.core.loggin;

public class FileLogger implements Logger
{
	public void log(String data) 
	{
		System.out.println("Dosyaya loglandı:"+data);
	}
}
