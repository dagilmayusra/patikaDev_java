import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("matematik notunuz: ");
		mat= input.nextInt();
		
		System.out.print("fizik notunuz: ");
		fizik= input.nextInt();
		
		System.out.print("t�rk�e notunuz: ");
		turkce= input.nextInt();
		
		System.out.print("kimya notunuz: ");
		kimya= input.nextInt();
		
		System.out.print("m�zik notunuz: ");
		muzik= input.nextInt();
		
		double ort= (mat + fizik + turkce + kimya + muzik) / 5 ;
		
		if(ort>=0 && ort<=100) {
			if(ort <=55) {
				System.out.println("S�n�fta kald�n�z");
				System.out.println("Ortalaman�z: ");
			}else {
				System.out.println("s�n�f� ge�tiniz");
				System.out.println("ortalaman�z: " + ort);
			}
		}else {
			System.out.print("ortalama i�erisinde de�il");
		}
		
		
	}

}
