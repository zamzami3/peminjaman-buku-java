package method;

//import java.util.ArrayList;

public class Admin {
    private String username;
    private String password;
//    private static ArrayList<Admin> admins = new ArrayList<>();


    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
//        admins.add(this);
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
