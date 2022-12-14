import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int secenek = -1;
    static int kayitId = 0;
    static int girisId;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static Menu menu;
    static ArrayList<Customer> customers = new ArrayList<>();

    static ArrayList<BaseProduct> cart = new ArrayList<>();

    public static void main(String[] args) {
        //menu = new MainMenu();
        //menu.menu();
        listCart listTheCart = new listCart();
        listTheCart.list();
    }
}