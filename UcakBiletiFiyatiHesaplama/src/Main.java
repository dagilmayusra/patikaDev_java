import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int distance,age,type;
	        double totalPrice,totalPriceAfterDiscount,pricePerKm=0.1;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Yolculuk tipi(tek yön:1 |çift yön:2 ): ");
	        type= scan.nextInt();
	        System.out.println("Yaþýnýz: ");
	        age= scan.nextInt();
	        System.out.println("Mesafe: ");
	        distance= scan.nextInt();
	        if(distance<0 || age<0 || (type!=1 && type !=2)){
	            System.out.println("Hatalý giriþ");
	        }
	        else{
	            totalPrice= distance*pricePerKm;
	            if(age<12){
	                if(type==2){
	                    totalPriceAfterDiscount = 2*((totalPrice - (totalPrice*0.5))*0.8);
	                    System.out.println(totalPriceAfterDiscount);
	                }
	                else{
	                    totalPriceAfterDiscount=totalPrice- totalPrice*0.5;
	                    System.out.println(totalPriceAfterDiscount);
	                }
	            }
	            else if(age<24){
	                if(type==2){
	                    totalPriceAfterDiscount = 2*((totalPrice - (totalPrice*0.1))*0.8);
	                    System.out.println(totalPriceAfterDiscount);
	                }
	                else{
	                    totalPriceAfterDiscount=totalPrice- totalPrice*0.1;
	                    System.out.println(totalPriceAfterDiscount);
	                }
	            }
	            else if(age>65){
	                if(type==2){
	                    totalPriceAfterDiscount = 2*((totalPrice - (totalPrice*0.3))*0.8);
	                    System.out.println(totalPriceAfterDiscount);
	                }
	                else{
	                    totalPriceAfterDiscount=totalPrice- totalPrice*0.3;
	                    System.out.println(totalPriceAfterDiscount);
	                }
	            }
	            else {
	                if(type==2){
	                    totalPriceAfterDiscount = 2*(totalPrice*0.8);
	                    System.out.println(totalPriceAfterDiscount);
	                }
	                else{
	                    totalPriceAfterDiscount=totalPrice;
	                    System.out.println(totalPriceAfterDiscount);
	                }
	            }
	        }

	}

}
