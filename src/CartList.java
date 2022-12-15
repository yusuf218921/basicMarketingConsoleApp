public class CartList extends CartMenu{
    public void list(){
        int i = 1;
        System.out.println();
        for(BaseProduct listCart:cart){
            System.out.println(i+"- "+listCart.productCompany+" "+listCart.productName+" - "+listCart.price+" tl");
            i++;
        }

    }
    public int sum(){
        int sum=0;
        for(BaseProduct listCart:cart){
            sum+=listCart.price;
        }
        return sum;
    }
    public void listProduct(int productIndex){
        System.out.print("\n"+cart.get(productIndex).productCompany+" "+cart.get(productIndex).productName);
    }
}
