public abstract class BaseProduct {
    private int productId;
    private int catagoryId;
    public String productCompany;
    public String productName;

    public int price;
                            //Constructor Blocks
    BaseProduct(){
        productId = Statics.productId;
        Statics.productId++;
        catagoryId=0;
    }

    //Setter Functions
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    //Getter Functions
    public int getProductId() {
        return productId;
    }

    public int getCatagoryId() {
        return catagoryId;
    }

}
