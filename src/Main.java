import java.util.ArrayList;

public class Main {
    static int secenek=-1;
    static int kayitId;
    static int girisId = 0;
    static ArrayList<Account> accounts = new ArrayList<Account>();

    public static void main(String[] args) {
        accounts.add(new Account());
        accounts.get(0).setUsername("ovam");
        accounts.get(0).setPassword("218921");
        accounts.get(0).setId(0);
        new MainMenu().mainMenu();
    }
}