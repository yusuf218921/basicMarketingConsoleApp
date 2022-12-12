import java.util.Scanner;

public class AccountLogin extends Main{
    Scanner scanner = new Scanner(System.in);
    boolean kontrol=true;
    public void login(){
        System.out.println("Giriş Ekranına yönlendiriliyorsunuz lütfen bekleyiniz...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n\n\n\n\n*********************GİRİŞ EKRANI*********************\n\n");

        while (kontrol){
            String username;
            String password;

            System.out.print("Kullanıcı adi: ");
            username=scanner.next();
            System.out.print("Sifre: ");
            password=scanner.next();;
            if(new AccountQuery(username,password).query(accounts)){
                kontrol=false;
                System.out.println("Başarıyla giriş yaptınız ,sisteme yönlendiriliyorsunuz lütfen bekleyiniz...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.exit(0);
            }
            else {
                System.out.println("Yanlış kullanııcı veya şifre girdiniz ,lütfen tekrar deneyiniz.");
            }
        }

    }
}
