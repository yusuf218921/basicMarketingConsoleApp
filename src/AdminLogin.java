import java.util.Scanner;

public class AdminLogin extends Admins {
    Scanner scanner = new Scanner(System.in);

    public void adminLogin() {
        //admins();
        for (int i = 0; i < 3; i++) {
            String adminUsername;
            String adminPassword;

            adminUsername = scanner.next();
            adminPassword = scanner.next();

            if (new AdminQuery(adminUsername, adminPassword).loginQuery(admins)) {
                //adminGirisId = new AdminQuery(adminUsername, adminPassword).adminLoginId(admins);
                System.out.println("Admin girişi tespit edildi lütfen bekleyiniz...");
                adminLogin = true;
                loop = false;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            } else if (i == 2) {
                System.out.println("Güvenlik açığı tespit edildi uygulamadan çkış yapılıyor...");
                System.exit(0);
            } else {
                System.out.println("\nHATA\n");
            }
        }

    }
}
