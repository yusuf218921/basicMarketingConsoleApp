import java.util.ArrayList;

public class Admins {
    static ArrayList<Administrator> admins = new ArrayList<>();

    static int adminGirisId;

    public static void admins() {
        admins.add(new Administrator());
        admins.get(0).setAdminUsername("yusuf");
        admins.get(0).setAdminPassword("yusuf1");
        admins.get(0).setAdminId(0);

        admins.add(new Administrator());
        admins.get(1).setAdminUsername("recep");
        admins.get(1).setAdminPassword("recep1");
        admins.get(1).setAdminId(1);

        admins.add(new Administrator());
        admins.get(2).setAdminUsername("orkun");
        admins.get(2).setAdminPassword("orkun1");
        admins.get(2).setAdminId(2);
    }
}