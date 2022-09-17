package MultiDiamondsarrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "bursa";
		sehirler[0][2] = "edirne";
		sehirler[1][0] = "kars";
		sehirler[1][1] = "trabzun";
		sehirler[1][2] = "artvin";
		sehirler[2][0] = "sivas";
		sehirler[2][1] = "konya";
		sehirler[2][2] = "ankara";
		for (var i = 0; i <= 2; i++) {
			for (var j = 0; j <= 2; j++) {

				System.out.println(sehirler[i][j]);
			}

			System.out.println("----------");
		}

	}

}
