import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("matematik notunuz: ");
		mat= input.nextInt();
		
		System.out.print("fizik notunuz: ");
		fizik= input.nextInt();
		
		System.out.print("türkçe notunuz: ");
		turkce= input.nextInt();
		
		System.out.print("kimya notunuz: ");
		kimya= input.nextInt();
		
		System.out.print("müzik notunuz: ");
		muzik= input.nextInt();
		
		double ort= (mat + fizik + turkce + kimya + muzik) / 5 ;
		
		if(ort>=0 && ort<=100) {
			if(ort <=55) {
				System.out.println("Sýnýfta kaldýnýz");
				System.out.println("Ortalamanýz: ");
			}else {
				System.out.println("sýnýfý geçtiniz");
				System.out.println("ortalamanýz: " + ort);
			}
		}else {
			System.out.print("ortalama içerisinde deðil");
		}
		
		
	}

}
