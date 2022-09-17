package miniProject4;

public class Main 
{
	public static void main(String[] args) 
	{
		Boolean control=false;
		int[] numbers= {1,2,9,5,6,7};
		int aranacak=80;
		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i]==aranacak)
			{
				control=true;
				break;
				
			}
		}
		if (control) 
		{
			System.out.println("bulundu");
			
		}
		else 
		{
			System.out.println("bulunamadi");
		}
	}
}
