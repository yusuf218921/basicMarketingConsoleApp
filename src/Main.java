import java.util.ArrayList;

public class Main {
    static int secenek = -1;
    static int kayitId = 0;
    static int girisId;

    static boolean adminLogin = false;

    static ArrayList<Account> accounts = new ArrayList<>();


    public static void main(String[] args) {

        new MainMenu().mainMenu();
        if (adminLogin) {
            new AdminMenu().adminMenu();
        } else {

        }
    }
}