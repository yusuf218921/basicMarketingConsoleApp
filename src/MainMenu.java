import java.util.Scanner;

public class MainMenu{
    Scanner scanner = new Scanner(System.in);
    int secenek=-1;


    public void mainMenu() {
        while(secenek!=0){

            System.out.println("*********************OVAM MARKET UYGULAMASINA HOŞ GELDİNİZ*********************\n\n\n\n\n\n");
            System.out.println("1-) Hesaba giriş yap");
            System.out.println("2-) Yeni Hesap Oluştur");
            System.out.println("0-) Uygulamadan çıkış yap");

            System.out.print("\n\n\nLütfen yapmak istediğiniz işlemin numarısını giriniz -> ");

            secenek = scanner.nextInt();

            switch (secenek){
                case 1:
                    System.out.println("Giriş Ekranına Yönlendiriliyorsunuz Lütfen Bekleyiniz...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("\n\n\n\n\n*********************GİRİŞ EKRANI*********************\n\n");

                    new AccountLogin().login();
                    break;
                case 2:
                    System.out.println("Kayıt Ekranına Yönlendiriliyorsunuz Lütfen Bekleyiniz...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("\n\n\n\n\n*********************KAYIT EKRANI*********************\n\n");
                    System.out.println("Hesap oluşturmak için aşağıdaki bilgileri doldurunuz...");
                    new AccountRegister().register();




                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 0:

                    System.out.println("Çıkış yapılıyor lütfen bekleyiniz...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.exit(0);
            }
        }

    }
}
