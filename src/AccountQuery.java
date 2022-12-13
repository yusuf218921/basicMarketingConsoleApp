import java.util.ArrayList;

public class AccountQuery {
    private String username;
    private String password;

    AccountQuery(String username, String password) {
        this.username = username;
        this.password = password;
    }

    AccountQuery(String username) {
        this.username = username;
    }

    public boolean loginQuery(ArrayList<Account> accounts) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public int loginId(ArrayList<Account> accounts) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return account.getId();
            }
        }
        return 0;
    }

    public boolean registerQuery(ArrayList<Account> accounts) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
