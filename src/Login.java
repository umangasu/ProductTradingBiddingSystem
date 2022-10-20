import java.util.Scanner;

public class Login {

    int userType;

    Login() {
        userType = 0;
    }

    public int login() {

        System.out.println("Enter Username ");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        System.out.println("Enter Password ");
        String password = scan.next();
        userType = validation(username, password);
        return userType;
    }

    public int validation(String username, String password) {
        if ((username.equalsIgnoreCase("Student")) && (password.equalsIgnoreCase(password))) {
            System.out.println("Welcome Student ");
            userType = 0;
        } else if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
            System.out.println("Welcome tutu ");
            userType = 0;
        } else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
            System.out.println("Welcome mimi ");
            userType = 0;
        } else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
            System.out.println("Welcome pepe ");
            userType = 1;
        } else {
            System.out.println("Incorrect User ");
            System.exit(-1);
        }

        return userType;

    }

}
