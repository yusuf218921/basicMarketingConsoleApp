public class AccountRegister extends Statics {
    boolean check = true;

    public void register() {
        while (check) {
            String username;
            String password;
            String firstName, lastName, tel, email;
            System.out.print("Kullınıcı adı: ");
            username = scanner.next();
            System.out.print("Şifre: ");
            password = scanner.next();
            if (new AccountQuery(username).registerQuery(accounts)) {
                System.out.print("\n\nGirmiş olduğunuz kullanıcı adı daha önce alınmıştır, kayıt işlemine devam etmek için \"true\", ana menüye geri dönmek için \"false\" yazınız -> ");
                check = scanner.nextBoolean();
            } else {
                accounts.add(new Account());
                accounts.get(regiserId).setUsername(username);
                accounts.get(regiserId).setPassword(password);
                accounts.get(regiserId).setId(regiserId);
                check = false;
                System.out.print("Tebrikler başarıyla hesap oluşturdunuz...\n\n");
                customers.add(new Customer());
                System.out.println("\nLütfen Kişisel Bilgilerinizi doğru bir şekilde giriniz...\n");
                System.out.print("İsim: ");
                firstName = scanner.next();
                System.out.print("Soyisim: ");
                lastName = scanner.next();
                System.out.print("Telefon Numarası: ");
                tel = scanner.next();
                System.out.print("Email: ");
                email = scanner.next();

                customers.get(regiserId).setFirstName(firstName);
                customers.get(regiserId).setLastName(lastName);
                customers.get(regiserId).setTel(tel);
                customers.get(regiserId).setEmail(email);
                regiserId++;
            }

        }
    }
}
