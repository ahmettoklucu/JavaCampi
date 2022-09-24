package methods2;


public class Main {

	public static void main(String[] args) 
	{
		String mesaj="bugün hava güzel";
		String yeniMesaj= mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		int sm=sum(5, 7);
		System.out.println(sm);
		int sm2=sum2(1,5,9,8,7,6,2,7);
		System.out.println(sm2);
	}
	public void add() 
	{
		System.out.println("Added");
	}
	public void update() 
	{
		System.out.println("Updated");
	}
	public void delete() 
	{
		System.out.println("Deleted");
	}
	public static int sum (int x, int y) 
	{
		return x+y;
		
	}
	public static int sum2(int... sayilar) 
	{
		int sum=0;
		for (int i : sayilar) 
		{
			sum+=i;
			
		}
		return sum;
	}

}
