package Customer;

import java.util.UUID;

public class Customer {
    
    public String userName;
    public String pasword;
    public String email;
    private UUID id;


    public Customer(String userName, String password, String email) {
        this.userName = userName;
        this.pasword = password;
        this.email = email;
        id = UUID.randomUUID();
        
    }
}
