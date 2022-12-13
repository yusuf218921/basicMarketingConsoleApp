public class AccountsList extends Main {
    public void list() {
        for (Account account : accounts) {
            System.out.println("\n\nId: " + account.getId());
            System.out.println("Kullanıcı adı: " + account.getUsername());
            System.out.println("sifre: " + account.getPassword());
        }
    }
}
