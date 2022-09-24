package methods;

public class Main {

	public static void main(String[] args) 
	{
		
		sayiBulmaca(6);

	}
	public static void sayiBulmaca(int aranacak) 
	{
		int [] sayilar= {1,5,7,8,9};
		boolean varMi=false;
		for (int i = 0; i < sayilar.length; i++) 
		{
			if (aranacak==sayilar[i]) 
			{
				varMi=true;
				break;
			}
			
		}
		String mesaj="";
		if (varMi) 
		{
			mesaj="sayi mevcuttur"+aranacak;
			mesajVer(mesaj);
			
			
		}
		else 
		{
			mesaj="sayi mevcut değildir"+aranacak;
			mesajVer(mesaj);
			
			
		}
	}
	public static void mesajVer(String mesaaj) 
	{
		System.out.println(mesaaj);
		
	}

}
