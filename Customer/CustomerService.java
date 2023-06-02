package Customer;


//import java.util.List;
import java.util.UUID;
import java.util.*;
    
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
    
  
public class CustomerService {

    public List<Customer> customers = new ArrayList<Customer>();

/*        
        public Customer GetCustomerById(UUID id) throws CustomerException {
            Customer customer = null;
            try {
                customer = repo.findById(id).get();
            } catch (Exception e) {
                throw new CustomerException(id, CustomerException.GetCustomerByIdError, e);
            }
    
            return customer;
        }
    
        public Customer UpsertCustomer(Customer newCustomer) throws CustomerException {
            Customer customer = null;
            var newId = newCustomer.getId();
            try {
                if (!repo.existsById(newId)) {
                    customer = repo.save(newCustomer);
                    return customer;
                }   
    
                // Update fields that are updateable... shouldn't allow initial ID or Created Timestamp to be udpated.
                customer = repo.findById(newId).get();
                customer.setName(newCustomer.name);
    
                customer = repo.save(customer);
            } catch (Exception e) {
                throw new CustomerException(newId, CustomerException.UpsertCustomerError, e);
            }
    
            return customer;
        }
    
        public Customer CreateCustomer(Customer newCustomer) throws CustomerException {
            Customer customer = null;
            try {
                customer = repo.save(newCustomer);
            } catch (Exception e) {
                throw new CustomerException(CustomerException.CreateCustomerError, e);
            }
    
            return customer;
        }
    
        public void DeleteCustomerById(UUID id) throws CustomerException {
            try {
                repo.delete(repo.findById(id).get());
            } catch (Exception e) {
                throw new CustomerException(id, CustomerException.DeleteCustomerByIdError, e);
            }
        }
        */

    }
    