public class ListCart extends CartMenu{
    public void list(){
        int i=1;
        System.out.println();
        for (BaseProduct baseProduct:cart){
            System.out.println(i+". Urun - "+baseProduct.productCompany+" - "+baseProduct.productName+" - "+baseProduct.price);
            i++;
        }
    }
    public void listProduct(int productId){
        System.out.print("\n"+cart.get(productId).productCompany+" "+cart.get(productId).productName);
    }
}
