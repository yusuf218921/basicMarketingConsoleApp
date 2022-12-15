import java.util.ArrayList;
import java.util.Scanner;

public class Statics {
    static boolean customerLogin=false;
    static boolean adminLogin=false;
    static int selection;
    static boolean loop=true;
    static int regiserId = 0;
    static int loginId;
    static int productId=0;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static Menu menu;
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<BaseProduct> cart = new ArrayList<>();
    static ArrayList<Administrator> admins = new ArrayList<>();
    static ArrayList <BaseProduct> products = new ArrayList<>();

}

