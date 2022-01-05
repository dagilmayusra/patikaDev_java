import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double elmaK=3.67 , 
				armutK=2.14 , 
				domatesK=1.11 ,
				muzK=0.95 ,
				patlýcanK=5.00 ,
				toplam, elma, muz, domates, armut, patlýcan;
		 
		Scanner input = new Scanner(System.in);
		
		System.out.print("elma kaç kilo: " );
		elma= input.nextDouble();
		
		System.out.print("armut kaç kilo: " );
		armut= input.nextDouble();
		
		System.out.print("domates kaç kilo: " );
		domates= input.nextDouble();
		
		System.out.print("muz kaç kilo: " );
		muz= input.nextDouble();
		
		System.out.print("patlýcan kaç kilo: " );
		patlýcan= input.nextDouble();
		
		toplam= (elma * elmaK) + (armut * armutK) + (domates * domatesK) + (muz * muzK) + (patlýcan * patlýcanK);
		System.out.print("toplam: " + toplam);
		
	}

}
