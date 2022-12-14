import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean customerLogin=false;
    static boolean adminLogin=false;
    static int selection;
    static boolean loop=true;
    static int regiserId = 0;
    static int loginId;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static Menu menu;
    static ArrayList<Customer> customers = new ArrayList<>();

    static ArrayList<BaseProduct> cart = new ArrayList<>();

    public static void main(String[] args) {
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


    }
}