import java.util.Scanner;

public class MainMenu extends Main implements Menu {
    @Override
    public void menu() {
        secenek=-1;
        while (secenek != 0) {

            System.out.println("*********************OVAM MARKET UYGULAMASINA HOŞ GELDİNİZ*********************\n\n\n\n\n\n");
            System.out.println("1-) Hesaba giriş yap");
            System.out.println("2-) Yeni Hesap Oluştur");
            System.out.println("3-) Uygulamadan çıkış yap");

            System.out.print("\n\n\nLütfen yapmak istediğiniz işlemin numarısını giriniz -> ");

            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    System.out.println("Giriş Ekranına Yönlendiriliyorsunuz Lütfen Bekleyiniz...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("\n\n\n\n\n*********************GİRİŞ EKRANI*********************\n\n");

                    new AccountLogin().login();
                    menus.add(new CustomerMenu());
                    menus.get(menus.size() - 1).menu();

                    break;
                case 2:
                    System.out.println("Kayıt Ekranına Yönlendiriliyorsunuz Lütfen Bekleyiniz...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("\n\n\n\n\n*********************KAYIT EKRANI*********************\n\n");
                    System.out.println("Hesap oluşturmak için aşağıdaki bilgileri doldurunuz...\n");
                    new AccountRegister().register();

                    System.out.println("Ana menüye yönlendiriliyorsunuz...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:

                    System.out.println("Çıkış yapılıyor lütfen bekleyiniz...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    secenek = 0;
                    break;
                case 0:
                    new AdminLogin().adminLogin();
                    menus.add(new AdminMenu());
                    menus.get(menus.size() - 1).menu();
                    break;
                default:
                    System.out.println("Hatalı numara girdiniz lütfen tekrar deneyiniz...");
                    break;
            }
        }

    }
}
