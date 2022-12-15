public class ProductManager extends AdminMenu {
    public void addProduct() {
        boolean loop = true;
        while (loop) {
            int categoryId;
            double price;
            String companyName;
            String productName;
            System.out.println("Sırasıyla eklenecek ürünün Kategori id'sini, ücretini, markasını ve ürün adını giriniz ->");
            categoryId = scanner.nextInt();
            price = scanner.nextInt();
            companyName = scanner.next();
            productName = scanner.next();
            if (categoryId == 1) {
                products.add(new ElectronicProduct(price, companyName, productName));
                loop = false;
            } else if (categoryId == 2) {
                products.add(new FurnitureProduct(price, companyName, productName));
                loop = false;
            } else if (categoryId == 3) {
                products.add(new HouseholdAppliancesProduct(price, companyName, productName));
                loop = false;
            } else {
                System.out.println("Yanlış kategori id'si girildi lütfen tekrar deneyiniz");
            }


        }

    }

    public void removeProduct() {

    }

    public void list() {
        for (BaseProduct product : products) {
            System.out.println("\n\nKategori Id : " + product.getCatagoryId());
            System.out.println("Ürün Id : " + product.getProductId());
            System.out.println("Ürün Adı : " + product.productName);
            System.out.println("Ürün Fiyatı : " + product.price);


        }

    }
}
