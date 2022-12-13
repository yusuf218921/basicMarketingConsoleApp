import java.util.ArrayList;

public class AdminQuery {

    private String adminUsername;
    private String adminPassword;

    AdminQuery(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public boolean loginQuery(ArrayList<Administrator> admins) {
        for (Administrator admin : admins) {
            if (admin.getAdminUsername().equals(adminUsername) && admin.getAdminPassword().equals(adminPassword)) {
                return true;
            }
        }
        return false;
    }

    public int adminLoginId(ArrayList<Administrator> admins) {
        for (Administrator admin : admins) {
            if (admin.getAdminUsername().equals(adminUsername) && admin.getAdminPassword().equals(adminPassword)) {
                return admin.getAdminId();
            }
        }
        return 0;
    }
}
