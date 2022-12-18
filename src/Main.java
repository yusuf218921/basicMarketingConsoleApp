import java.util.Scanner;

public class Main extends Statics {

    static boolean deneme = false;
    public static void main(String[] args) {
        new Admins().admins();
        new Products().products();
        //loop=false;                         //-----------------------Eğer Commentary Değilse Main Menu Çalışmaz-------------
        while (loop) {
            menu = new MainMenu();
            menu.menu();
            if (customerLogin) {
                loop = true;
                menu = new CustomerMenu();
                menu.menu();
                customerLogin = false;
                loop = true;
            } else if (adminLogin) {
                loop = true;
                menu = new AdminMenu();
                menu.menu();
                adminLogin = false;
                loop = true;
            }
        }



    }
}