import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        String userName = "patika", password = "java101", userNameInput, passInput;

        System.out.print("Kullan�c� Ad�n�z: ");
        userNameInput = input.nextLine();

        System.out.print("�ifreniz: ");
        passInput = input.nextLine();

        if (userNameInput.equals("patika") && passInput.equals("java101")) {
            System.out.println("Ba�ar�l� giri�!");
        }else {
            System.out.print("Yanl�� Kullan�c� Bilgileri! �ifreyi s�f�rlamak istiyor musun? (y/n): ");
            String answer = input.nextLine();

            if (answer.equals("y")) {

                boolean isSame = true;

                while (isSame == true) {
                    System.out.print("Yeni �ifre: ");
                    String newPassword = input.nextLine();

                    if (password.equals(newPassword)) {
                        System.out.println("Eski �ifre yeni �ifre ile ayn� olamaz! L�tfen farkl� bir �ifre se�in");
                    } else {
                        password = newPassword;
                        isSame = false;
                        System.out.println("Yeni �ifreniz " + password);
                    }
                }
            } else {
                System.out.println("Giri� yap�lamad�.");
            }
        }
    
	}

}
