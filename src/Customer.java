public class Customer extends Account {
    private String firstName;
    private String lastName;
    private String tel;
    private String email;
    private int balance = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void loadBalance(int topUp) {
        if (topUp < 0) {
            System.out.println("0 dan küçük para yüklenemez!");
        }
        else {
            balance += topUp;
            System.out.println("Yükleme Başarıyla gerçekleşti...");
        }

    }

    public void withdrawBalance(int total) {
        balance -= total;
    }
}
