public class ClothesProduct extends BaseProduct {
    ClothesProduct(){
        setCatagoryId(1);
    }
    ClothesProduct(int price,String productCompany,String productName){
        setCatagoryId(1);
        this.price=price;
        this.productCompany=productCompany;
        this.productName=productName;
    }
}
