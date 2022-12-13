import java.util.Scanner;

public class AdminMenu extends Main {
    Scanner scanner = new Scanner(System.in);

    public void adminMenu() {
        secenek = -1;
        while (secenek != 0) {
            System.out.println("\n\n**********************ADMİN MENÜSÜ**********************\n\n");
            System.out.println("1-) Kayıtlı Hesapları görüntüle");
            System.out.println("2-) Kayıtlı Ürünleri görüntüle");
            System.out.println("3-) Yeni ürün ekle");
            System.out.println("4-) Ürün kaldır");
            System.out.println(("5-) Ana menüye geri dön"));

            System.out.print("\n\nLütfen yapmak istediğiniz işlemi seçiniz -> ");
            secenek = scanner.nextInt();
            switch (secenek) {
                case 1:
                    int kontrol = -1;
                    new AccountsList().list();
                    System.out.print("Geri dönmek için 1'i ana menüye dönmek için 0'ı tuşlayınız -> ");
                    while (kontrol != 0 && kontrol != 1) {
                        kontrol = scanner.nextInt();
                        if (kontrol == 1) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        } else if (kontrol == 0) {
                            System.out.println("Ana menüye gönderiliyorsunuz lütfen bekleyiniz...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            new MainMenu().mainMenu();
                        } else {
                            System.out.print("Geçersiz sayı girdiniz lütfen tekrar giriniz -> ");
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Ana menüye gönderiliyorsunuz lütfen bekleyiniz...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    new MainMenu().mainMenu();
                default:
                    break;
            }
        }
    }
}
