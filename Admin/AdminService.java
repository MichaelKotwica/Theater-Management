package Admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import Customer.Customer;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

public class AdminService {

    public List<Admin> admins = new ArrayList<Admin>();

    /*
  

    public Admin GetAdminById(UUID id) throws AdminException {
        Admin admin = null;
        try {
            admin = repo.findById(id).get();
        } catch (Exception e) {
            throw new AdminException(id, AdminException.GetAdminByIdError, e);
        }

        return admin;
    }

    public Admin UpsertAdmin(Admin newAdmin) throws AdminException {
        Admin admin = null;
        var newId = newAdmin.getId();
        try {
            if (!repo.existsById(newId)) {
                admin = repo.save(newAdmin);
                return admin;
            }   

            admin = repo.findById(newId).get();

            admin = repo.save(admin);
        } catch (Exception e) {
            throw new AdminException(newId, AdminException.UpsertAdminError, e);
        }

        return admin;
    }

    public Admin CreateAdmin(Admin newAdmin) throws AdminException {
        Admin admin = null;
        try {
            admin = repo.save(newAdmin);
        } catch (Exception e) {
            throw new AdminException(AdminException.CreateAdminError, e);
        }

        return admin;
    }

    public void DeleteAdminById(UUID id) throws AdminException {
        try {
            repo.delete(repo.findById(id).get());
        } catch (Exception e) {
            throw new AdminException(id, AdminException.DeleteAdminByIdError, e);
        }
    }

    */
}