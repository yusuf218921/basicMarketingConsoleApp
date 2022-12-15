public class MainMenu extends Statics implements Menu {
    @Override
    public void menu() {
        while (loop) {

            System.out.println("*********************OVAM MARKET UYGULAMASINA HOŞ GELDİNİZ*********************\n\n\n\n\n\n");
            System.out.println("1-) Hesaba giriş yap");
            System.out.println("2-) Yeni Hesap Oluştur");
            System.out.println("3-) Uygulamadan çıkış yap");

            System.out.print("\n\n\nLütfen yapmak istediğiniz işlemin numarısını giriniz -> ");

            selection = scanner.nextInt();

            switch (selection) {
                case 1 -> {
                    System.out.println("Giriş Ekranına Yönlendiriliyorsunuz Lütfen Bekleyiniz...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("\n\n\n\n\n*********************GİRİŞ EKRANI*********************\n\n");
                    new AccountLogin().login();
                    if (customerLogin) {
                        loop = false;
                        System.out.println("Giriş yapıldı " + customerLogin);
                    } else {
                        loop = true;
                    }
                    System.out.println(loop);
                }
                case 2 -> {
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
                }
                case 3 -> {
                    System.out.println("Çıkış yapılıyor lütfen bekleyiniz...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    loop = false;
                }
                case 0 -> {
                    new AdminLogin().adminLogin();
                    if (adminLogin) {
                        loop = false;
                        System.out.println("Admin girişi " + adminLogin);
                    }
                }
                default -> System.out.println("Hatalı numara girdiniz lütfen tekrar deneyiniz...");
            }
        }

    }
}
