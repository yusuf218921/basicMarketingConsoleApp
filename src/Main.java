import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Statics{


    public static void main(String[] args) {
        /*
        new Admins().admins();
        while (loop){
            menu = new MainMenu();
            menu.menu();
            if(customerLogin){
                loop=true;
                menu=new CustomerMenu();
                menu.menu();
                customerLogin=false;
                loop=true;
            }
            else if (adminLogin){
                loop=true;
                menu=new AdminMenu();
                menu.menu();
                adminLogin=false;
                loop=true;
            }
        }
        */
        BaseProduct hacerPc = new ElectronicProduct();
        hacerPc.price=2500;
        hacerPc.productName= "Laptop";
        hacerPc.productCompany= "Hacer";
        cart.add(hacerPc);
        cart.add(new ElectronicProduct(2500,"Gl","Mouse"));
        CartMenu cartMenu = new CartMenu();
        cartMenu.menu();
    }
}