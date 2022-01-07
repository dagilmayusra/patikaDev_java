import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        String userName = "patika", password = "java101", userNameInput, passInput;

        System.out.print("Kullanýcý Adýnýz: ");
        userNameInput = input.nextLine();

        System.out.print("Þifreniz: ");
        passInput = input.nextLine();

        if (userNameInput.equals("patika") && passInput.equals("java101")) {
            System.out.println("Baþarýlý giriþ!");
        }else {
            System.out.print("Yanlýþ Kullanýcý Bilgileri! þifreyi sýfýrlamak istiyor musun? (y/n): ");
            String answer = input.nextLine();

            if (answer.equals("y")) {

                boolean isSame = true;

                while (isSame == true) {
                    System.out.print("Yeni þifre: ");
                    String newPassword = input.nextLine();

                    if (password.equals(newPassword)) {
                        System.out.println("Eski þifre yeni þifre ile ayný olamaz! Lütfen farklý bir þifre seçin");
                    } else {
                        password = newPassword;
                        isSame = false;
                        System.out.println("Yeni þifreniz " + password);
                    }
                }
            } else {
                System.out.println("Giriþ yapýlamadý.");
            }
        }
    
	}

}
