import java.util.ArrayList;

public class Main {
    static ArrayList<Account> accounts = new ArrayList<Account>();
    public static void main(String[] args) {
        accounts.add(new Account());
        accounts.get(0).setUsername("yusuf218921");
        accounts.get(0).setPassword("218921");
        new MainMenu().mainMenu();

    }
}