public class CustomerConfig extends Statics {

    public void configFirstName() {
        String firstName;
        System.out.print("İsim: ");
        firstName = scanner.next();
        customers.get(loginId).setFirstName(firstName);
    }

    public void configLastName() {
        String lastName;
        System.out.print("Soyisim: ");
        lastName = scanner.next();
        customers.get(loginId).setLastName(lastName);
    }

    public void configTel() {
        String tel;
        System.out.print("Telefon: ");
        tel = scanner.next();
        customers.get(loginId).setTel(tel);
    }

    public void configEmail() {
        String email;
        System.out.print("Email: ");
        email = scanner.next();
        customers.get(loginId).setEmail(email);
    }
}
