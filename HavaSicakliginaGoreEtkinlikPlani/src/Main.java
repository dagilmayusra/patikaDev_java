import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heat;
		
		Scanner input= new Scanner(System.in);
		System.out.println("s�cakl� de�eri giriniz: ");
		heat= input.nextInt();
		
		if(heat<5) {
			System.out.println("kayak yapabilirsin");
		}else if(heat>=5 && heat<=15){
			System.out.println("sinemaya gidebilirsin");
		}else if(heat>=15 && heat<=25){
			System.out.println("piknik yapabilirsin");
		}else {
			System.out.println("y�zmeye gidebilirsin");
		}
	}

}
