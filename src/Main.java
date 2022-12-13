import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int secenek = -1;
    static int kayitId = 0;
    static int girisId;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static ArrayList<Menu> menus = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();


    public static void main(String[] args) {
        menus.add(new MainMenu());
        menus.get(menus.size() - 1).menu();
    }
}