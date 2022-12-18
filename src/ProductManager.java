import java.util.Scanner;

public class ProductManager extends Main {
    public void addProduct() {
        boolean productManagerAddLoop = true;
        while (productManagerAddLoop) {

            System.out.print("\nLütfen ürünün katagorisini giriniz ->");
            String category = scanner.next();

            int categoryTrue = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    if (categoryTrue==1) break;
                    else if (category.toLowerCase().equals(Statics.categories[i][j].toLowerCase())) {
                        categoryTrue = 1;
                        break;
                    }
                }
            }
            if (categoryTrue == 0) {
                System.out.println("Yanlış bir katagori girdiniz. Lütfen Aşağıdaki katagorilerden birisini yazın\n");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(Statics.categories[i][j]);
                    }
                    System.out.println();
                }
            } else {
                System.out.print("\nLütfen ürünün ücretini giriniz ->");
                double price = scanner.nextInt();
                System.out.print("\nLütfen ürünün şirketini giriniz ->");
                String companyName = scanner.next();
                System.out.print("\nLütfen ürünün adını giriniz ->");
                String productName = scanner.next();
                productsOnTheMarket.add(new Product(price, category, companyName, productName));
                productManagerAddLoop = false;
            }


        }
    }

    public void removeProduct() {
        System.out.print("Kaldıracağınız ürünün idsini giriniz : ");
        boolean check = true;
        while (check) {
            try {
                selection = new Scanner(System.in).nextInt();
                check = false;
            } catch (Exception e) {
                System.out.println("HATA");
                System.out.print("Kaldıracağınız ürünün idsini giriniz : ");
            }
        }
        productsOnTheMarket.remove(selection - 1);
    }

    public void list() {
        for (BaseProduct productToList : productsOnTheMarket) {
            System.out.println("\n\nÜrün Id : " + productToList.getProductId());
            System.out.println("Kategori : " + productToList.category);
            System.out.println("Ürün Adı : " + productToList.productName);
            System.out.println("Ürün Fiyatı : " + productToList.price);
        }

    }
}
