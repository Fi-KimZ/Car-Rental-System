import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        final String USERNAME = "FIKI"; 
        final String PASSWORD = "****";   

        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("Login successful. Welcome!");
                break;
            } else {
                attempts--;
                System.out.println("Invalid username or password. Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("Maximum attempts reached. Access denied.");
            }
        }

        scanner.close();
    }
}