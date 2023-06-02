package Customer;

import java.util.UUID;

public class Customer {
    
    public String userName;
    public String pasword;
    public String email;
    private UUID id;


    public Customer() {
        id = UUID.randomUUID();
        
    }
}
