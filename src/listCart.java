public class listCart extends CartMenu{
    public void list(){
        int i=1;
        for (BaseProduct baseProduct:cart){
            System.out.println(i+". Urun - "+baseProduct.productCompany+" - "+baseProduct.productName+" - "+baseProduct.price);
        }
    }
}
