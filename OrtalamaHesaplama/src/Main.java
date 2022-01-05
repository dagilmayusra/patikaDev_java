import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner ders= new Scanner(System.in);
		
		System.out.println("matematik notunuz: ");
		mat= ders.nextInt();	
		
		System.out.println("fizik notunuz: ");
		fizik= ders.nextInt();
		
		System.out.println("kimya notunuz: ");
		kimya= ders.nextInt();
		
		System.out.println("turkce notunuz: ");
		turkce= ders.nextInt();
		
		System.out.println("tarih notunuz: ");
		tarih= ders.nextInt();
		
		System.out.println("muzik notunuz: ");
		muzik= ders.nextInt();
		
		int toplam=(mat + fizik + kimya + turkce + tarih + muzik);
		
		double ort= toplam/6;
		System.out.println("ortalama: " + ort);
		
		System.out.println((ort) >= 60 ? "geçti" : "kaldý");

	}

}
