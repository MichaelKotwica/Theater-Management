package Customer;

import java.util.UUID;

public class Customer {
    
    public String userName;
    public String password;
    public String email;
    private UUID id;
    public int cardNumber;
    public int cvv2;


    public Customer(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        id = UUID.randomUUID();
        
    }
}
