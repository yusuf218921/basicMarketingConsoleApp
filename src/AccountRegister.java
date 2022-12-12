import java.util.Scanner;

public class AccountRegister extends Main{

    Scanner scanner = new Scanner(System.in);
    boolean kontrol=true;

    public void register(){
        while(kontrol){
            String username;
            String password;
            System.out.print("Kullınıcı adı: ");
            username=scanner.next();
            System.out.print("Şifre: ");
            password=scanner.next();
            if(new AccountQuery(username).registerQuery(accounts)){
                System.out.println("\n\nGirmiş olduğunuz kullanıcı adı daha önce alınmıştır lütfen yeni bir kulanıcı adi giriniz");
            }
            else{
                kayitId++;
                accounts.add(new Account());
                accounts.get(kayitId).setUsername(username);
                accounts.get(kayitId).setPassword(password);
                accounts.get(kayitId).setId(kayitId);

                kontrol=false;
                System.out.print("Tebrikler başarıyla hesap oluşturdunuz, ana menüye yönlendiriliyorsunuz...");
            }
        }
    }
}
