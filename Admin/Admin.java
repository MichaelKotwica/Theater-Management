package Admin;

import java.util.UUID;

public class Admin {

    public String userName;
    public String password;
    public String email;
    private UUID id;

    public Admin(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        id = UUID.randomUUID();
    }

    
}
