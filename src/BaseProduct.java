public abstract class BaseProduct {
    int productId;
    int catagoryId;
    String productCompany;
    String productName;

                        //Setter Functions
    public void setProductId(int productId){
        this.productId = productId;
    }
    public void setCatagoryId(int catagoryId){
        this.catagoryId = catagoryId;
    }
    public void setProductCompany(String productCompany){
        this.productCompany = productCompany;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

                        //Getter Functions
    public int getProductId(){
        return productId;
    }
    public int getCatagoryId(){
        return catagoryId;
    }
    public String getProductCompany(){
        return productCompany;
    }
    public String getProductName(){
        return productName;
    }
}
