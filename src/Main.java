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
        BaseProduct newBaseProduct = new ElectronicProduct();
        newBaseProduct.setProductId(0);
        newBaseProduct.setCatagoryId(1);
        newBaseProduct.productName = "Laptop";
        newBaseProduct.productCompany = "Acer";
        newBaseProduct.price = 2500;
        cart.add(newBaseProduct);
        listCart listTheCart = new listCart();
        listTheCart.list();
    }
}