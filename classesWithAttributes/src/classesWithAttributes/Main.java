package classesWithAttributes;


public class Main {

	public static void main(String[] args) 
	{
		Product product=new Product();
		Product product2=new Product( 2,"monster","asus",5000,2);
		product.setName("laptop");
		product. setPrice(5000);
		product. setStockAmount(3);
		product.setId(1);
		product. setDescription("lenova laptop");
		product.getKod();
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		System.out.println(product2.getKod());
				
		

	}

}
