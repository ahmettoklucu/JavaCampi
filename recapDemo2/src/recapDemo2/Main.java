package recapDemo2;

public class Main {

	public static void main(String[] args) 
	{
		double [] d1= {1.25,6.99,8.23};
		double total=0;
		double max=d1[0];
		for(int i=0; i<=d1.length-1;i++) 
		{
			if(d1[i]>max) 
			{
				max=d1[i];
			}
			System.out.println(d1[i]);
			total=total+d1[i];	

		}
		System.out.println("toplam "+total);
		System.out.println("enbüyük "+max);
	}

}
