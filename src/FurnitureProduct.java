public class FurnitureProduct extends BaseProduct {
    FurnitureProduct() {
        setCatagoryId(2);
    }

    FurnitureProduct(double price, String productCompany, String productName) {
        setCatagoryId(2);
        this.price = price;
        this.productCompany = productCompany;
        this.productName = productName;
    }
}
