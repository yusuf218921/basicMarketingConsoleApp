

public class Admins extends Statics {


    public void admins() {
        admins.add(new Administrator());
        admins.get(0).setAdminUsername("yusuf");
        admins.get(0).setAdminPassword("yusuf");

        admins.add(new Administrator());
        admins.get(1).setAdminUsername("recep");
        admins.get(1).setAdminPassword("recep");

        admins.add(new Administrator());
        admins.get(2).setAdminUsername("orkun");
        admins.get(2).setAdminPassword("orkun");
    }
}
