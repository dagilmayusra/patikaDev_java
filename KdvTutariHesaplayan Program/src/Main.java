import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double fiyat, kdvFiyat, kdvliFiyat, kdvOran=0.18;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�cret fiyat�n� giriniz: ");
		fiyat = input.nextDouble();
		
		kdvFiyat= fiyat *  kdvOran;
		kdvliFiyat= fiyat * kdvFiyat;
		
		System.out.println("kdvsiz fiyat: " + fiyat);
		System.out.println("kdv oran�: " + kdvOran);
		System.out.println("kdv fiyat�: " + kdvFiyat);
		System.out.println("kdvli fiyat: " + kdvliFiyat);
	}

}
