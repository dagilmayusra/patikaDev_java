import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int month, day;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Do�du�unuz ay: ");
		month= input.nextInt();
		
		System.out.println("Do�du�unuz g�n: ");
		day= input.nextInt();
		
		   if (month == 1) {
	            if (day < 21) {
	                System.out.println("O�lak Burcusunuz. ");
	            } else {
	                System.out.println("Kova Burcusunuz. ");
	            }
	        } else if (month == 2) {
	            if (day < 19) {
	                System.out.println("Kova Burcusunuz. ");
	            } else {
	                System.out.println("Bal�k Burcusunuz. ");
	            }
	        } else if (month == 3) {
	            if (day < 20) {
	                System.out.println("Bal�k Burcusunuz. ");
	            } else {
	                System.out.println("Ko� Burcusunuz. ");
	            }
	        }else if (month == 4) {
	            if (day < 20) {
	                System.out.println("Ko� Burcusunuz. ");
	            } else {
	                System.out.println("Bo�a Burcusunuz. ");
	            }
	        }else if (month == 5) {
	            if (day < 21) {
	                System.out.println("Bo�a Burcusunuz. ");
	            } else {
	                System.out.println("�kizler Burcusunuz. ");
	            }
	        }else if (month == 6) {
	            if (day < 21) {
	                System.out.println("�kizler Burcusunuz. ");
	            } else {
	                System.out.println("Yenge� Burcusunuz. ");
	            }
	        }else if (month == 7) {
	            if (day < 22) {
	                System.out.println("Yenge� Burcusunuz. ");
	            } else {
	                System.out.println("Aslan Burcusunuz. ");
	            }
	        }else if (month == 8) {
	            if (day < 22) {
	                System.out.println("Aslan Burcusunuz. ");
	            } else {
	                System.out.println("Ba�ak Burcusunuz. ");
	            }
	        }else if (month == 9) {
	            if (day < 22) {
	                System.out.println("Ba�ak Burcusunuz. ");
	            } else {
	                System.out.println("Terazi Burcusunuz. ");
	            }
	        }else if (month == 10) {
	            if (day < 22) {
	                System.out.println("Terazi Burcusunuz. ");
	            } else {
	                System.out.println("Akrep Burcusunuz. ");
	            }
	        }else if (month == 11) {
	            if (day < 21) {
	                System.out.println("Akrep Burcusunuz. ");
	            } else {
	                System.out.println("Yay Burcusunuz. ");
	            }
	        }else if (month == 12) {
	            if (day < 21) {
	                System.out.println("Yay Burcusunuz. ");
	            } else {
	                System.out.println("O�lak Burcusunuz. ");
	            }
	        }
		
	}

}
