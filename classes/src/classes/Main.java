package classes;

public class Main {

	public static void main(String[] args) 
	{
		CustomerManager customerManager =new CustomerManager();
		CustomerManager customerManager2 =new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
		
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println();
		
		int[] sayilar1=new int[] {1,2,3,4};
		int[] sayilar2=new int[] {5,6,7,8};
		sayilar2=sayilar1;//burada tek bir nesne var 2 değişken tek bir nesneyi tutuyor.
		sayilar1[0]=10;
		System.out.println(sayilar1[0]);

	}

}
