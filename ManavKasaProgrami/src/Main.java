import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double elmaK=3.67 , 
				armutK=2.14 , 
				domatesK=1.11 ,
				muzK=0.95 ,
				patl�canK=5.00 ,
				toplam, elma, muz, domates, armut, patl�can;
		 
		Scanner input = new Scanner(System.in);
		
		System.out.print("elma ka� kilo: " );
		elma= input.nextDouble();
		
		System.out.print("armut ka� kilo: " );
		armut= input.nextDouble();
		
		System.out.print("domates ka� kilo: " );
		domates= input.nextDouble();
		
		System.out.print("muz ka� kilo: " );
		muz= input.nextDouble();
		
		System.out.print("patl�can ka� kilo: " );
		patl�can= input.nextDouble();
		
		toplam= (elma * elmaK) + (armut * armutK) + (domates * domatesK) + (muz * muzK) + (patl�can * patl�canK);
		System.out.print("toplam: " + toplam);
		
	}

}
