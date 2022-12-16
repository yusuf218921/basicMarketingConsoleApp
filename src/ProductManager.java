public class ProductManager extends Main {
    public void addProduct() {
        boolean productManagerAddLoop = true;
        while (productManagerAddLoop) {

            System.out.print("\nLütfen ürünün katagorisini giriniz ->");
            String category = scanner.nextLine();

            boolean categoryTrue=false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    if(categoryTrue) break;
                    else if(category.toLowerCase().equals(Statics.categories[i][j].toLowerCase())){
                        categoryTrue = true;
                        break;
                    }
                }
            }
            if(categoryTrue=false){
                System.out.println("Yanlış bir katagori girdiniz. Lütfen Aşağıdaki katagorilerden birisini yazın");
            }
            else{
                System.out.print("\nLütfen ürünün ücretini giriniz ->");
                double price = scanner.nextInt();
                System.out.print("\nLütfen ürünün şirketini giriniz ->");
                String companyName = scanner.next();
                System.out.print("\nLütfen ürünün adını giriniz ->");
                String productName = scanner.next();
                productsOnTheMarket.add(new Product(price,category, companyName, productName));
                productManagerAddLoop=false;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(Statics.categories[i][j]);
                }
                System.out.println();
            }
        }
    }
    public void removeProduct() {
        System.out.print("Kaldıracağınız ürünün idsini giriniz : ");
        productsOnTheMarket.remove(scanner.nextInt() - 1);
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
