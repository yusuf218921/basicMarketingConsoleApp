public class CustomerConfig extends Main {

    public void configFirstName() {
        String firstName;
        System.out.print("İsim: ");
        firstName = scanner.next();
        customers.get(girisId).setFirstName(firstName);
    }

    public void configLastName() {
        String lastName;
        System.out.print("Soyisim: ");
        lastName = scanner.next();
        customers.get(girisId).setLastName(lastName);
    }

    public void configTel() {
        String tel;
        System.out.print("Telefon: ");
        tel = scanner.next();
        customers.get(girisId).setTel(tel);
    }

    public void configEmail() {
        String email;
        System.out.print("Email: ");
        email = scanner.next();
        customers.get(girisId).setEmail(email);
    }
}
