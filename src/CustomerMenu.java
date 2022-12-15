public class CustomerMenu extends Main implements Menu {

    @Override
    public void menu() {
        while (loop) {
            System.out.println("\n\nHOŞGELDİNİZ SAYIN " + customers.get(loginId).getFirstName() + " " + customers.get(loginId).getLastName());
            System.out.println("\n\n1-) Hesap Bilgilerini Görüntüle");
            System.out.println("2-) Hesap Bilgilerini Güncelle");
            System.out.println("3-) Hesaba Bakiye Yükle");
            System.out.println("4-) Ürünlere Göz At");
            System.out.println("5-) Sepeti Görüntüle");
            System.out.println("6-) Ana Menüye Geri Dön");
            System.out.println("7-) Uygulamadan Çıkış yap");

            System.out.print("\n\n\nLütfen yapmak istediğiniz işlemi seçiniz -> ");
            selection = scanner.nextInt();

            switch (selection) {
                case 1 -> {
                    System.out.println("\n\n\n\n*****************Hesap Bilgilerim*****************\n\n");
                    System.out.println("İsim: " + customers.get(loginId).getFirstName());
                    System.out.println("Soyisim: " + customers.get(loginId).getLastName());
                    System.out.println("Telefon: " + customers.get(loginId).getTel());
                    System.out.println("Email: " + customers.get(loginId).getEmail());
                    System.out.println("Bakiye: " + customers.get(loginId).getBalance());
                    System.out.print("Devam etmek için herhangi bir tuşa basın...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                }
                case 2 -> {
                    int secenekGuncelleme;
                    boolean kontrol = true;
                    while (kontrol) {
                        System.out.println("\n\n\n***************Güncelleme Ekranı***************\n\n");
                        System.out.println("1-) İsim");
                        System.out.println("2-) Soyisim");
                        System.out.println("3-) Telefon Numarası");
                        System.out.println("4-) Email");
                        System.out.println("5-) Geri Dön");

                        System.out.print("Lütfen güncellemek istediğiniz bilgiyi seçiniz -> ");
                        secenekGuncelleme = scanner.nextInt();

                        switch (secenekGuncelleme) {
                            case 1 -> new CustomerConfig().configFirstName();
                            case 2 -> new CustomerConfig().configLastName();
                            case 3 -> new CustomerConfig().configTel();
                            case 4 -> new CustomerConfig().configEmail();
                            case 5 -> kontrol = false;
                            default -> System.out.println("Yanlış değer girdiniz lütfen tekrar deneyiniz");
                        }
                    }
                }
                case 3 -> {
                    int topUp;
                    String no, cvv, expirationDate;
                    System.out.println("\n\nYükleme yapılacak kartın bilgilerini giriniz...");
                    System.out.print("Kart Numarası: ");
                    no = scanner.next();
                    System.out.print("Kart CVV: ");
                    cvv = scanner.next();
                    System.out.print("Kart Son Kullanma Tarihi: ");
                    expirationDate = scanner.next();
                    System.out.print("Yükleme yapılacak tutar: ");
                    topUp = scanner.nextInt();
                    customers.get(loginId).loadBalance(topUp);
                    System.out.println("Yükleme Başarıyla gerçekleşti...");
                    System.out.print("Devam etmek için herhangi bir tuşa basınız...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                }
                case 6 -> {
                    System.out.println("Ana menüye geri gönderiliyorsunuz lütfen bekleyiniz...");
                    loop = false;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                case 7 -> {
                    System.out.println("Sistemden Çıkış yapılıyor lütfen bekleyiniz...");
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
}
