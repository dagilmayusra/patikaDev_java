import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, select;
		         
		Scanner inp= new Scanner(System.in);
		
		System.out.print("ilk sayýyý girin: ");
		a=inp.nextInt();
		System.out.print("ikinci sayýyý girin: ");
		b=inp.nextInt();
		System.out.print("1-toplama\n2-çýkarma\n3-çarpma\n4-bolme");
		select=inp.nextInt();
		
		switch(select) {
			case 1 : 
				System.out.println("toplama: " +(a+b)); 
				break;
			case 2 : 
				System.out.println("çýkarma: " +(a-b)); 
				break;
			case 3 : 
				System.out.println("çarpma: " +(a*b)); 
				break;
			case 4 : 
				System.out.println("bölme: " +(a/b)); 
				break;
			default:
				System.out.println("geçersiz");
		}

	}

}
