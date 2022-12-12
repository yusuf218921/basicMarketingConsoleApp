import java.util.ArrayList;

public class AccountQuery {
    private String username;
    private String password;
    AccountQuery(String username,String password){
        this.username=username;
        this.password=password;
    }
    public boolean query(ArrayList<Account> accounts){
        for(Account account:accounts){
            if(account.getUsername().equals(username)&&account.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
