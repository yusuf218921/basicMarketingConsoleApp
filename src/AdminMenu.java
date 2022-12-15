public class AdminMenu extends Statics implements Menu {
    @Override
    public void menu() {
        while (loop) {
            System.out.println("\n\n**********************ADMİN MENÜSÜ**********************\n\n");
            System.out.println("1-) Kayıtlı Hesapları görüntüle");
            System.out.println("2-) Kayıtlı Ürünleri görüntüle");
            System.out.println("3-) Yeni ürün ekle");
            System.out.println("4-) Ürün kaldır");
            System.out.println(("5-) Ana menüye geri dön"));

            System.out.print("\n\nLütfen yapmak istediğiniz işlemi seçiniz -> ");
            selection = scanner.nextInt();
            switch (selection) {
                case 1 -> {
                    new AccountsList().list();
                    System.out.println("Devam etmek için herhangi bir tuşa basın...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                }
                case 2 -> {
                    new ProductManager().list();
                    System.out.println("Devam etmek için herhangi bir tuşa basın...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                }
                case 3 -> {
                    new ProductManager().addProduct();
                    System.out.println("Ürün başarıyla eklendi.");
                    System.out.println("Devam etmek için herhangi bir tuşa basın...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                }
                case 4 -> {
                    new ProductManager().removeProduct();
                    System.out.println("Ürün başarıyla kaldırıldı.");
                    System.out.println("Devam etmek için herhangi bir tuşa basın...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                }
                case 5 -> {
                    System.out.println("Ana menüye gönderiliyorsunuz lütfen bekleyiniz...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    loop = false;
                }
                default -> {
                }
            }
        }
    }
}
