import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, select;
		         
		Scanner inp= new Scanner(System.in);
		
		System.out.print("ilk say�y� girin: ");
		a=inp.nextInt();
		System.out.print("ikinci say�y� girin: ");
		b=inp.nextInt();
		System.out.print("1-toplama\n2-��karma\n3-�arpma\n4-bolme");
		select=inp.nextInt();
		
		switch(select) {
			case 1 : 
				System.out.println("toplama: " +(a+b)); 
				break;
			case 2 : 
				System.out.println("��karma: " +(a-b)); 
				break;
			case 3 : 
				System.out.println("�arpma: " +(a*b)); 
				break;
			case 4 : 
				System.out.println("b�lme: " +(a/b)); 
				break;
			default:
				System.out.println("ge�ersiz");
		}

	}

}
