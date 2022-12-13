import java.util.Scanner;

public class AccountLogin extends Main {
    Scanner scanner = new Scanner(System.in);
    boolean kontrol = true;

    public void login() {
        while (kontrol) {
            String username;
            String password;

            System.out.print("Kullanıcı adi: ");
            username = scanner.next();
            System.out.print("Sifre: ");
            password = scanner.next();
            ;
            if (new AccountQuery(username, password).loginQuery(accounts)) {
                girisId = new AccountQuery(username, password).loginId(accounts);
                kontrol = false;
                System.out.println("Başarıyla giriş yaptınız ,sisteme yönlendiriliyorsunuz lütfen bekleyiniz...");
                secenek=0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.print("Yanlış kullanııcı veya şifre girdiniz ,giriş işlemine devam etmek için \"true\", ana menüye geri dönmek için \"false\" yazınız ->");
                kontrol = scanner.nextBoolean();
            }
        }

    }
}
