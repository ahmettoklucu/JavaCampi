package methodOverloading;

public class DortIslem 
{
	public int topla(int sayi1,int sayi2) 
	{
		return sayi1+sayi2;
	}
	public int topla(int... sayilar1) 
	{
		int topla=0;
		for (int i : sayilar1) 
		{
			topla+=i;
		}
		return topla;
	}

}
