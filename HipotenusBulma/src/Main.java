import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a,b;
		double c;
		
		Scanner girdi= new Scanner(System.in);
		System.out.print("1. kenarý giriniz: ");
		a = girdi.nextInt();
		System.out.print("2. kenarý giriniz: ");
		b = girdi.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.print("hipotenüs: " + c);
	}

}
