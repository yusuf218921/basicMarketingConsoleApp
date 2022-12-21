import java.util.Scanner;

public class CustomerMenu extends Statics implements Menu {

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
                    boolean kontrol = true;
                    while (kontrol) {
                        System.out.println("\n\n\n***************Güncelleme Ekranı***************\n\n");
                        System.out.println("1-) İsim");
                        System.out.println("2-) Soyisim");
                        System.out.println("3-) Telefon Numarası");
                        System.out.println("4-) Email");
                        System.out.println("5-) Geri Dön");

                        System.out.print("Lütfen güncellemek istediğiniz bilgiyi seçiniz -> ");
                        check = true;
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
                    System.out.print("Devam etmek için herhangi bir tuşa basınız...");
                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                }
                case 4 -> {
                    boolean categoryLoop = true;
                    while (loop) {
                        int category=-1;
                        System.out.println("\n\n\n**********KATEGORİLER**********\n\n\n");
                        System.out.println("1-) Elektronik");
                        System.out.println("2-) Mobilya");
                        System.out.println("3-) Ev Aletleri");
                        System.out.println("\n\n0-) Geri dön");

                        check = true;
                        while (check) {
                            try {
                                category = new Scanner(System.in).nextInt();
                                check = false;
                            } catch (Exception e) {
                                System.out.println("HATA");
                                System.out.print("\nLütfen yapmak istediğiniz işlemin numarısını giriniz -> ");
                            }
                        }
                        if (category == 1) {
                            for (BaseProduct product : productsOnTheMarket) {
                                if (product.getCategoryId() == 0) {
                                    System.out.println("\n\nüRÜN ID : " + product.getProductId());
                                    System.out.println("ÜRÜN MARKASI : " + product.productCompany);
                                    System.out.println("üRÜN ADI : " + product.productName);
                                    System.out.println("ÜRÜN FİYATI : " + product.price + "tl");
                                }
                            }
                            System.out.println("\n Satın almak istediğiniz ürünün id'sini giriniz -> ");
                            check = true;
                            while (check) {
                                try {
                                    selection = new Scanner(System.in).nextInt();
                                    check = false;
                                } catch (Exception e) {
                                    System.out.println("HATA");
                                    System.out.print("\nSatın almak istediğiniz ürünün id'sini giriniz -> ");
                                }
                            }
                            carts.get(loginId).cartAdd(selection);
                            System.out.println("Ürün başarıyla sepete eklendi");
                            categoryLoop = false;
                        } else if (category == 2) {
                            for (BaseProduct product : productsOnTheMarket) {
                                if (product.getCategoryId() == 1) {
                                    System.out.println("\n\nüRÜN ID : " + product.getProductId());
                                    System.out.println("ÜRÜN MARKASI : " + product.productCompany);
                                    System.out.println("üRÜN ADI : " + product.productName);
                                    System.out.println("ÜRÜN FİYATI : " + product.price + "tl");
                                }
                            }
                            System.out.println("Satın almak istediğiniz ürünün id'sini giriniz -> ");
                            check = true;
                            while (check) {
                                try {
                                    selection = new Scanner(System.in).nextInt();
                                    check = false;
                                } catch (Exception e) {
                                    System.out.println("HATA");
                                    System.out.print("\nSatın almak istediğiniz ürünün id'sini giriniz -> ");
                                }
                            }
                            carts.get(loginId).cartAdd(selection);
                            System.out.println("Ürün başarıyla sepete eklendi");
                            categoryLoop = false;

                        } else if (category == 3) {
                            for (BaseProduct product : productsOnTheMarket) {
                                if (product.getCategoryId() == 2) {
                                    System.out.println("\n\nüRÜN ID : " + product.getProductId());
                                    System.out.println("ÜRÜN MARKASI : " + product.productCompany);
                                    System.out.println("üRÜN ADI : " + product.productName);
                                    System.out.println("ÜRÜN FİYATI : " + product.price + "tl");
                                }
                            }
                            System.out.println("Satın almak istediğiniz ürünün id'sini giriniz -> ");
                            check = true;
                            while (check) {
                                try {
                                    selection = new Scanner(System.in).nextInt();
                                    check = false;
                                } catch (Exception e) {
                                    System.out.println("HATA");
                                    System.out.print("\nSatın almak istediğiniz ürünün id'sini giriniz -> ");
                                }
                            }
                            carts.get(loginId).cartAdd(selection);
                            System.out.println("Ürün başarıyla sepete eklendi");
                            categoryLoop = false;
                        } else if (category == 0) {
                            categoryLoop = false;
                            loop = false;

                        } else {
                            System.out.println("Yanlış numara girdiniz lütfen tekrar deneyiniz");
                        }
                    }
                    loop = true;
                }
                case 5 -> {
                    menu = new CartMenu();
                    menu.menu();
                    loop = true;
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
