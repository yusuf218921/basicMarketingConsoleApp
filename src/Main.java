public class Main extends Statics{


    public static void main(String[] args) {
        /*new Admins().admins();
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
        }*/
        new Products().products();
        System.out.println(products.get(0).getProductId());
        System.out.println(products.get(0).getCatagoryId());
    }
}