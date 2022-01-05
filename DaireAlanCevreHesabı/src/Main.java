import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        double pi=3.14, alan ,r ,a;
        
        System.out.print("Yarıçap:");
        r=scan.nextDouble();
        
        System.out.print("Açı:");
        a=scan.nextDouble();
        
        alan=(pi*r*r*a)/a;
        System.out.println("Alan: "+alan);
	}

}

