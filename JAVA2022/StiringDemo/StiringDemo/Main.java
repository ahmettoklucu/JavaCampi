package StiringDemo.StiringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava cok güzel";
		System.out.println("eleman sayisi " + mesaj.length());
		System.out.println("4. eleman " + mesaj.charAt(4));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("l"));
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.replace((' '), ('-')));
		System.out.println(mesaj.substring(2, 8));
		for (var item : mesaj.split(" ")) // spilit dizi haline getiriyor
		{
			System.out.println(item);
		}
		System.out.println(mesaj.toUpperCase());
	}
}
