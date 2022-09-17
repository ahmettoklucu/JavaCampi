package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!!");

		String ortaMetin = "�lginizi �ekebilir";
		String altMetin = "Vade s�resi";

		System.out.println(ortaMetin);

		// integer
		int vade = 12;
		double parite = 14.10;
		double parite1 = 14.10;
		if (parite < parite1) {
			System.out.println("y�ksseli�");
		} else if (parite == parite1) {
			System.out.println("e�itse");
		} else {
			System.out.println("d����");
		}
		// array
		String[] krediler = { "hizli kredi", "Maa��n�", "mutlu emekli" };
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

		}
	}

}
