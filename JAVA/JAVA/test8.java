import java.util.Scanner;
class AuthenticationException extends Exception {

    public AuthenticationException(String message) {
        super(message);
    }
}
class Authentication {

    public static void authenticate(String username, String password) throws AuthenticationException {

        String validUsername = "emil";
        String validPassword = "123";


        if (!username.equals(validUsername) || !password.equals(validPassword)) {

            throw new AuthenticationException("Invalid username or password.");
        }


        System.out.println("Authentication successful.");
    }
}


public class test8 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();


            Authentication.authenticate(username, password);
        } catch (AuthenticationException e) {

            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}
