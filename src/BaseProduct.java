public abstract class BaseProduct {
    private int productId;
    private int categoryId;
    public String category;
    public String productCompany;
    public String productName;

    public double price;

    //Constructor Blocks
    BaseProduct() {
        Statics.productId++;
        productId = Statics.productId;
        categoryId=0;
    }

    //Setter Functions
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    //Getter Functions
    public int getProductId() {
        return productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

}
