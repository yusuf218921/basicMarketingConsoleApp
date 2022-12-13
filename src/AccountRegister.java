
public class AccountRegister extends Main {
    boolean kontrol = true;

    public void register() {
        while (kontrol) {
            String username;
            String password;
            String firstName, lastName, tel, email;
            System.out.print("Kullınıcı adı: ");
            username = scanner.next();
            System.out.print("Şifre: ");
            password = scanner.next();
            if (new AccountQuery(username).registerQuery(accounts)) {
                System.out.print("\n\nGirmiş olduğunuz kullanıcı adı daha önce alınmıştır, kayıt işlemine devam etmek için \"true\", ana menüye geri dönmek için \"false\" yazınız -> ");
                kontrol = scanner.nextBoolean();
            } else {
                accounts.add(new Account());
                accounts.get(kayitId).setUsername(username);
                accounts.get(kayitId).setPassword(password);
                accounts.get(kayitId).setId(kayitId);
                kontrol = false;
                System.out.print("Tebrikler başarıyla hesap oluşturdunuz...\n\n");
                customers.add(new Customer());
                System.out.println("\nLütfen Kişisel Bilgilerinizi doğru bir şekilde giriniz...\n");
                System.out.print("İsim: ");
                firstName=scanner.next();
                System.out.print("Soyisim: ");
                lastName=scanner.next();
                System.out.print("Telefon Numarası: ");
                tel=scanner.next();
                System.out.print("Email: ");
                email=scanner.next();

                customers.get(kayitId).setFirstName(firstName);
                customers.get(kayitId).setLastName(lastName);
                customers.get(kayitId).setTel(tel);
                customers.get(kayitId).setEmail(email);
                kayitId++;
            }

        }
    }
}
