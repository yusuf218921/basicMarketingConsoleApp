public class AccountLogin extends Main {
    boolean check = true;

    public void login() {
        while (check) {
            String username;
            String password;

            System.out.print("Kullanıcı adi: ");
            username = scanner.next();
            System.out.print("Sifre: ");
            password = scanner.next();

            if (new AccountQuery(username, password).loginQuery(accounts)) {
                loginId = new AccountQuery(username, password).loginId(accounts);
                check = false;
                System.out.println("Başarıyla giriş yaptınız ,sisteme yönlendiriliyorsunuz lütfen bekleyiniz...");
                customerLogin = true;
                loop = false;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.print("Yanlış kullanııcı veya şifre girdiniz ,giriş işlemine devam etmek için \"true\", ana menüye geri dönmek için \"false\" yazınız ->");
                check = scanner.nextBoolean();
            }
        }

    }
}
