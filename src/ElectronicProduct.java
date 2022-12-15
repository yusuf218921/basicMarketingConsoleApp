public class ElectronicProduct extends BaseProduct {
    ElectronicProduct() {
        setCatagoryId(1);
    }

    ElectronicProduct(double price, String productCompany, String productName) {
        setCatagoryId(1);
        this.price = price;
        this.productCompany = productCompany;
        this.productName = productName;
    }

    public void sa() {

    }
}
