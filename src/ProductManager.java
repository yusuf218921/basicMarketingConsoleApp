public class ProductManager extends AdminMenu {
    public void addProduct() {
        int categoryId;
        int price;
        String companyName;
        String productName;
        System.out.println("Sırasıyla eklenecek ürünün Kategori id'sini, ücretini, markasını ve ürün adını giriniz ->");
        categoryId = scanner.nextInt();
        price = scanner.nextInt();
        companyName = scanner.next();
        productName = scanner.next();
        if (categoryId == 1) {

        } else if (categoryId == 2) {

        } else if (categoryId == 3) {

        } else {
            System.out.println("Yanlış kategori id'si girildi lütfen tekrar deneyiniz");
        }
    }

    public void removeProduct() {

    }

    public void list() {

    }
}
