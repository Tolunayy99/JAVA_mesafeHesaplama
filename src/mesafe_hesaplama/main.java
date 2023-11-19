package mesafe_hesaplama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Birinci aracın hızını giriniz : ");
		int car1 = scanner.nextInt();

		System.out.print("İkinci aracın hızını giriniz : ");
		int car2 = scanner.nextInt();

		System.out.println("Saat ile işlem için '1' dakika ile işlem için '2' giriniz :");
		int tSecim = scanner.nextInt();

		System.out.print("Süreyi giriniz : ");
		int t = scanner.nextInt();

		System.out.print("Araçlar aynı yönde gidecek ise '1' farklı yön ise '2' giriniz : ");
		int secim = scanner.nextInt();

		float result;

		if (tSecim == 1) {

			switch (secim) {
			case 1:
				result = aynıYonHesapla(car1, car2, t);
				System.out.println("Aradaki mesafe : " + result + " km");
				break;

			case 2:
				result = farklıYonHesapla(car1, car2, t);
				System.out.println("Aradaki mesafe : " + result + " km");
				break;

			default:
				System.out.println("farklı bir değer girdiniz en başa yönlendiriliyorsunuz ");
				main(args);
			}

		} else if (tSecim == 2) {

			switch (secim) {
			case 1:
				result = dakikaOlarakHesaplaAy(car1, car2, t);
				System.out.println("Aradaki mesafe : " + new DecimalFormat("##.##").format(result) + " km");
				break;

			case 2:
				result = dakikaOlarakHesaplaFy(car1, car2, t);
				System.out.println("Aradaki mesafe : " + new DecimalFormat("##.##").format(result) + " km");
				break;

			default:
				System.out.println("farklı bir değer girdiniz en başa yönlendiriliyorsunuz ");
				main(args);
			}

		}

	}

	public static int aynıYonHesapla(int x, int y, int t) {

		int sonuc = (x * t) - (y * t);
		sonuc = Math.abs(sonuc);

		/*
		 * if(sonuc < 0) { sonuc = -sonuc }
		 
		 */

		return sonuc;
	}

	public static int farklıYonHesapla(int x, int y, int t) {

		int sonuc = (x * t) + (y * t);

		return sonuc;
	}

	public static float dakikaOlarakHesaplaFy(float x, float y, float t) {
		float sonuc =  (x * (t / 60)) + (y * (t / 60));

		return sonuc;

	}

	public static float dakikaOlarakHesaplaAy(float x, float y, float t) {
		float sonuc = (x * (t / 60)) - (y * (t / 60));

		return Math.abs(sonuc);

	}

}
