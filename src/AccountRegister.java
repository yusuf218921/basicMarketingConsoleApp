import java.util.Scanner;

public class AccountRegister extends Main {

    Scanner scanner = new Scanner(System.in);
    boolean kontrol = true;

    public void register() {
        while (kontrol) {
            String username;
            String password;
            System.out.print("Kullınıcı adı: ");
            username = scanner.next();
            System.out.print("Şifre: ");
            password = scanner.next();
            if (new AccountQuery(username).registerQuery(accounts)) {
                System.out.print("\n\nGirmiş olduğunuz kullanıcı adı daha önce alınmıştır, kayıt işlemine devam etmek için \"true\", ana menüye geri dönmek için \"false\" yazınız -> ");
                kontrol = scanner.nextBoolean();
            } else {
                accounts.add(new Account());
                accounts.get(kayitId).setUsername(username);
                accounts.get(kayitId).setPassword(password);
                accounts.get(kayitId).setId(kayitId);
                kayitId++;
                kontrol = false;
                System.out.print("Tebrikler başarıyla hesap oluşturdunuz, ana menüye yönlendiriliyorsunuz...\n\n");
            }

        }
    }
}
