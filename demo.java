import java.io.*;

import Admin.AdminService;
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

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public CustomerService customerService;
    public AdminService adminService;

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
                demoFlag = true;
                makeAccount();
                break;
                case "LI":
                demoFlag = true;
                //login();
                break;
                case "PT":
                demoFlag = true;
                //purchase Tickets
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

        reader.close();
        
        System.out.println("\nMaking Account With Following Details:\n");
        
        if(accountType.equals("A")) {
            System.out.println("Administrative Acocount");
        } else System.out.println("Customer Account");

        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
    }
}
