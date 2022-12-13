import java.util.Scanner;

public class CustomerMenu extends Main implements Menu {

    @Override
    public void menu() {
        secenek = -1;
        while (secenek != 0) {
            System.out.println("\n\nHOŞGELDİNİZ SAYIN " + customers.get(girisId).getFirstName() + " " + customers.get(girisId).getLastName());
            System.out.println("\n\n1-) Hesap Bilgilerini Görüntüle");
            System.out.println("2-) Hesap Bilgilerini Güncelle");
            System.out.println("3-) Hesaba Bakiye Yükle");
            System.out.println("4-) Ürünlere Göz At");
            System.out.println("5-) Sepeti Görüntüle");
            System.out.println("6-) Ana Menüye Geri Dön");
            System.out.println("7-) Uygulamadan Çıkış yap");

            System.out.print("\n\n\nLütfen yapmak istediğiniz işlemi seçiniz -> ");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    System.out.println("\n\n\n\n*****************Hesap Bilgilerim*****************\n\n");
                    System.out.println("İsim: " + customers.get(girisId).getFirstName());
                    System.out.println("Soyisim: " + customers.get(girisId).getLastName());
                    System.out.println("Telefon: " + customers.get(girisId).getTel());
                    System.out.println("Email: " + customers.get(girisId).getEmail());
                    System.out.println("Bakiye: " + customers.get(girisId).getBalance());
                    System.out.print("Devam etmek için herhangi bir tuşa basın...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;
                case 2:
                    int secenekGuncelleme;
                    boolean kontrol=true;
                    while (kontrol){
                        System.out.println("\n\n\n***************Güncelleme Ekranı***************\n\n");
                        System.out.println("1-) İsim");
                        System.out.println("2-) Soyisim");
                        System.out.println("3-) Telefon Numarası");
                        System.out.println("4-) Email");
                        System.out.println("5-) Geri Dön");

                        System.out.print("Lütfen güncellemek istediğiniz bilgiyi seçiniz -> ");
                        secenekGuncelleme=scanner.nextInt();

                        switch (secenekGuncelleme){
                            case 1:
                                new CustomerConfig().configFirstName();
                                break;
                            case 2:
                                new CustomerConfig().configLastName();
                                break;
                            case 3:
                                new CustomerConfig().configTel();
                                break;
                            case 4:
                                new CustomerConfig().configEmail();
                                break;
                            case 5:
                                kontrol=false;
                                break;
                            default:
                                System.out.println("Yanlış değer girdiniz lütfen tekrar deneyiniz");
                                break;
                        }
                    }
                    break;
            }


        }
    }
}
