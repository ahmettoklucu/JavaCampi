package miniProje;

public class Main 
{

	public static void main(String[] args) 
	{
		int number=3;
		boolean IsPrim=true;
		for(int i=2;i<number;i++) 
		{
			if(number%i==0) 
			{
				IsPrim=false;
				break;
			}
		}
		if (IsPrim) 
		{
			System.out.println("sayi asaldir");
			
		}
		else 
		{
			System.out.println("sayi asal de�ildir");
		}
	}
}