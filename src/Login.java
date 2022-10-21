import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Login {

    int userType;

    Login() {
        userType = 0;
    }

    public int login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username ");
        String username = scan.next();
        System.out.println("Enter Password ");
        String password = scan.next();
        userType = assignUserType(username, password);
        return userType;
    }

    public int assignUserType(String username, String password) {

        String buyerFile = Utility.getFolderName() + "/BuyerInfo.txt";
        String sellerFile = Utility.getFolderName() + "/SellerInfo.txt";
        if(validateUser(username, password, buyerFile)) {
            userType = 0;
            System.out.println("Welcome Buyer " + username);
        }
        else if (validateUser(username, password, sellerFile)) {
            userType = 1;
            System.out.println("Welcome Seller " + username);
        }
        else {
            userType = -1;
            System.out.println("Wrong username or password.Please enter correct details.");
            System.out.println("Exiting....");
            System.exit(1);
        }
        return userType;
    }

    private boolean validateUser(String username, String password, String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] singleUser = line.split(":");
                if(username.equalsIgnoreCase(singleUser[0]) && password.equalsIgnoreCase(singleUser[1])){
                    return true;
                }
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        return false;
    }

}
