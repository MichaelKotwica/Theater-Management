import java.io.*;
import java.util.UUID;

import Admin.Admin;
import Admin.AdminService;
import Customer.Customer;
import Customer.CustomerService;

public class demo {

    public static boolean demoFlag = false;
    public static String df;

    private static String accountType;
    private static boolean acctFlag = false;

    private static String username;

    private static String email;

    private static String password; 
    private static String confirmPassword;
    private static boolean passwordMatch = false;

    private static boolean loginFlag = false;
    private static String loginType;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static CustomerService customerService = new CustomerService();
    public static AdminService adminService = new AdminService();

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the theater mangement software demo!\n To get started, type MA to make accounts, LI to log in to an existing account, and PT to select a movie and purchase a movie ticket.");

        while(!demoFlag) {
            try {
                df = reader.readLine().toUpperCase();
            } catch (IOException e) {
                System.out.println("Invalid Input. Please type in MA to make accounts, LI to log in to an account, and PT to purchase tickets.");
            }

            switch (df.toUpperCase()) {
                case "MA":
                    //demoFlag = true;
                    makeAccount();
                    //break;
                case "LI":
                    //demoFlag = true;
                    login();
                    //break;
                case "PT":
                    //demoFlag = true;
                    //purchase Tickets
                    //break;
                case "Q":
                    demoFlag = true;
                    break;
                default:
                    System.out.println("Invalid Input. Please type in MA to make accounts, LI to log in to an account, and PT to purchase tickets.");
            }

        }

        
    }

    public static void makeAccount() throws IOException {

        System.out.println("Please indicate your account type: C for customer, A for administator");

        while (!acctFlag) {
            try {
                accountType = reader.readLine().toUpperCase();
            } catch (IOException e) {
                System.out.println("Invalid Input. Please type in C for customer or A for administator");
            }

            if(accountType.equals("A") || accountType.equals("C")) {
                acctFlag = true;
            } else if (accountType.equals("Q")) {
                acctFlag = true;
                break;
            } else {
                System.out.println("Invalid Input. Please type in C for customer or A for administator");
            }
        }
        acctFlag = false;


        System.out.println("Please enter your username.");
        try {
            username = reader.readLine();
        } catch (IOException e) {
            System.out.println("Invalid Username! Please use characters a - z and 0 - 9!");
        }

        System.out.println("Please enter your email.");
        try {
            email = reader.readLine();
        } catch (IOException e) {
            System.out.println("Invalid email! Please use characters a - z and 0 - 9!");
        }

        System.out.println("Please enter your password.");

        while (!passwordMatch) {
            try {
                password = reader.readLine();
            } catch (IOException e) {
                System.out.println("Invalid Password! Please use characters a - z and 0 - 9!");
            }

            System.out.println("Confirm your password.");
            try {
                confirmPassword = reader.readLine();
            } catch (IOException e) {
                System.out.println("Invalid Password! Please use characters a - z and 0 - 9!");
            }

            if(password.equals(confirmPassword)) {
                passwordMatch = true;
            } else {
                System.out.println("passwords do not match! Please try again!");
            }
        }

        //reader.close();
        
        System.out.println("\nMaking Account With Following Details:\n");
        
        if(accountType.equals("C")) {
        //    System.out.println("Customer Acocount");
        //    System.out.println(username);
        //    System.out.println(email);
        //    System.out.println(password);
            customerService.customers.add(new Customer(username, password, email));
            System.out.println(customerService.customers.toString());
        } else if (accountType.equals("A")) {
        //    System.out.println("Administrative Account");
        //    System.out.println(username);
        //    System.out.println(email);
        //    System.out.println(password);
            adminService.admins.add(new Admin(username, password, email));
            System.out.println(adminService.admins.toString());
        }
        main(null);
    }

    public static void login() throws IOException {

        System.out.println("Please indicate the login account type:\nA for Admin Login\nC for Customer Login");

        while (!loginFlag) {
            try {
                loginType = reader.readLine().toUpperCase();
            } catch (IOException e) {
                System.out.println("Invalid Input. Please type in C for customer or A for administator login");
            }

            if(loginType.equals("A") || loginType.equals("C")) {
                loginFlag = true;
            } else if (loginType.equals("Q")) {
                loginFlag = true;
                break;
            } else {
                System.out.println("Invalid Input. Please type in C for customer or A for administator login");
            }
            
        }
        loginFlag = false;

        if (loginType.equals("C")) {
            customerLogin();
        } else if (loginType.equals("A")) {
            adminLogin();
        }
        main(null);
    }

    public static void customerLogin() {
        System.out.println("Please enter your email.");
        try {
            email = reader.readLine();
        } catch (IOException e) {
            System.out.println("Invalid email! Please use characters a - z and 0 - 9!");
        }

        for(Customer customer : customerService.customers) {
            
            if(email.equals(customer.email)) {
                System.out.println(email + " found\n");
                loginFlag = true;
            } else {
                System.out.println(email + " not found\n");
            }
            
            //System.out.println(customer.email);
        }

        if(loginFlag) {
            System.out.println("Please enter your password.");
            try {
                password = reader.readLine();
            } catch (IOException e) {
                System.out.println("Invalid password! Please use characters a - z and 0 - 9!");
            }

            for(Customer customer : customerService.customers) {
                if(password.equals(customer.password)) {
                    System.out.println("password found! Logging in...");
                    loginFlag = false;
                    break;
                } else {
                    System.out.println("Wrong Password\n");
                }
            }
        }
    }

    public static void adminLogin() {
        System.out.println("Please enter your email.");
        try {
            email = reader.readLine();
        } catch (IOException e) {
            System.out.println("Invalid email! Please use characters a - z and 0 - 9!");
        }

        for(Admin admin : adminService.admins) {
            
            if(email.equals(admin.email)) {
                System.out.println(email + " found\n");
                loginFlag = true;
            } else {
                System.out.println(email + " not found\n");
            }
            
            //System.out.println(admin.email);
        }

        if(loginFlag) {
            System.out.println("Please enter your password.");
            try {
                password = reader.readLine();
            } catch (IOException e) {
                System.out.println("Invalid password! Please use characters a - z and 0 - 9!");
            }

            for(Admin admin : adminService.admins) {
                if(password.equals(admin.password)) {
                    System.out.println("password found! Logging in...");
                    loginFlag = false;
                    break;
                } else {
                    System.out.println("Wrong Password\n");
                }
            }

        }
    }

}
