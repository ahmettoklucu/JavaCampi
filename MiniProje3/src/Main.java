
public class Main {

	public static void main(String[] args) 
	{
		int number=28;
		int Perfect=0;
		for (int j = 1; j < number; j++) 
		{
			if (number%j==0) 
			{
				Perfect=Perfect+j;
			}
		}
		if (Perfect==number) 
		{
			System.out.println("m�kemmel sayi");
			System.out.println(Perfect);
			System.out.println(number);
		}
		else 
		{
			System.out.println("m�kemmel sayi de�il");
			System.out.println(Perfect);
			System.out.println(number);
		}

	}

}
