
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setName("kaghve makinasi3");
		product.setUnitPrice(21);
		product.setDiscount(2);
		product.setImageUrl("hnskudadsahd");
		product.setUnitInStock(12);

		Product product1 = new Product();
		product1.setName("kaghve makinasi3");
		product1.setUnitPrice(21);
		product1.setDiscount(2);
		product1.setImageUrl("hnskudadsahd");
		product1.setUnitInStock(12);

		Product product2 = new Product();
		product2.setName("kaghve makinasi");
		product2.setUnitPrice(1);
		product2.setDiscount(9);
		product2.setImageUrl("hnskusahd");
		product2.setUnitInStock(13);

		Product product3 = new Product();
		product3.setName("kaghve makinasi");
		product3.setUnitPrice(1);
		product3.setDiscount(9);
		product3.setImageUrl("hnskusahd");
		product3.setUnitInStock(13);
		Product[] products = { product, product1, product2, product3 };
		System.out.println("-------------------");
		for (Product product4 : products) {
			System.out.println(product4.getName());
		}

		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName());
			System.out.println(products[i].getDiscount());
			System.out.println(products[i].getImageUrl());
			System.out.println(products[i].getUnitPrice());
			System.out.println(products[i].getUnitInStock());
			System.out.println("*****************");
		}
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345678");
		individualCustomer.setPhone("5387372685");
		individualCustomer.setFirstName("ahmet");
		individualCustomer.setLastName("toklucu");
		
		CorparateCustomer corparateCustomer =new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCustomerNumber("123459756");
		corparateCustomer.setCompanyName("TKLC");
		corparateCustomer.setPhone("53333333333");
		corparateCustomer.setTaxNumber("123456789");
		
		Customer[] customers= {individualCustomer,corparateCustomer};
		

	}

}
