import java.util.ArrayList;

public class Cart extends Statics{

    ArrayList<BaseProduct> cartProducts = new ArrayList<>();
    public void cartAdd(int productId){
        cartProducts.add(new Product(
                productsOnTheMarket.get(productId-1).price,
                productsOnTheMarket.get(productId-1).category,
                productsOnTheMarket.get(productId-1).productCompany,
                productsOnTheMarket.get(productId-1).productName
        ));
    }
    public void list(){
        int i = 1;
        System.out.println();
        for(BaseProduct listCart: cartProducts){
            System.out.println(i+"- "+listCart.productCompany+" "+listCart.productName+" - "+listCart.price+" tl");
            i++;
        }

    }
    public int sum(){
        int sum=0;
        for(BaseProduct listCart: cartProducts){
            sum+=listCart.price;
        }
        return sum;
    }
    public void listProduct(int productIndex){
        System.out.print("\n"+ cartProducts.get(productIndex).productCompany+" "+ cartProducts.get(productIndex).productName);
    }
}
