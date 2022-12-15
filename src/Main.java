

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

        cart.add(new ElectronicProduct(2500,"Hacer","Laptop"));
        cart.add(new ElectronicProduct(350,"Gl","Mouse"));
        cart.add(new ClothesProduct(200,"Lc vaykiki","T-shirt"));
        CartMenu cartMenu = new CartMenu();
        cartMenu.menu();
    }
}