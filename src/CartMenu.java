import java.util.Scanner;

public class CartMenu extends Statics implements Menu {
    @Override
    public void menu() {
        System.out.println("\n\nSepetinize Hoş Geldiniz...");
        while (loop) {
            System.out.println("\n1- Sepeti Listele");
            System.out.println("2- Ürün Kaldır");
            System.out.println("3- Alışverişi Tamamla");
            System.out.println("0- Geri Dön");
            System.out.print("\nLütfen yapmak istediğiniz işlemin numarısını giriniz ->");
            boolean check = true;
            while (check) {
                try {
                    selection = new Scanner(System.in).nextInt();
                    check = false;
                } catch (Exception e) {
                    System.out.println("HATA");
                    System.out.print("\nLütfen yapmak istediğiniz işlemin numarısını giriniz -> ");
                }
            }
            switch (selection) {
                case 1:
                    carts.get(loginId).list();
                    //listTheCart.list();
                    System.out.println("Toplam : " + carts.get(loginId).sum());
                    break;
                case 2:
                    boolean loop2 = true;
                    //listTheCart.list();
                    while (loop2) {
                        System.out.print("\nSilmek istediğiniz ürünün numarasını girin -->");
                        int i = scanner.nextInt();
                        if (i <= carts.get(loginId).cartProducts.size() && i > 0) {
                            carts.get(loginId).listProduct(i - 1);
                            System.out.print(" Ürünü Başarılı Bir Şekilde Silindi\n");
                            carts.get(loginId).cartProducts.remove(i - 1);
                            loop2 = false;
                        } else if (i == 0) {
                            loop2 = false;
                        } else {
                            System.out.println("Yanlış Bir Ürün Numarası Girdiniz. Lütfen Tekrar Deneyin");
                            System.out.println("Çıkış Yapmak İçin İse \"0\" yazabilirsiniz.");
                        }
                    }
                    break;
                case 3:
                    if (customers.get(loginId).getBalance() >= carts.get(loginId).sum()) {
                        customers.get(loginId).withdrawBalance(carts.get(loginId).sum());
                        carts.get(loginId).cartProducts.clear();
                        System.out.println("Alışverişiniz Başarıyla Tamamlandı...");
                    } else {
                        System.out.println("Hesabınızda yeteri miktar bulunamadı!");
                    }
                    System.out.println("Devam etmek için herhangi bir tuşa basınız...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                case 0:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
