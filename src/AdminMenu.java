public class AdminMenu extends Main implements Menu {
    @Override
    public void menu() {
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
                    new AccountsList().list();
                    System.out.println("Devam etmek için herhangi bir tuşa basın...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
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
                    menus.add(new MainMenu());
                    menus.get(menus.size() - 1).menu();
                    secenek = 0;
                    break;
                default:
                    break;
            }
        }
    }
}
