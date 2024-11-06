public class AccountManager {

    public void login(String username, String password) {
        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void printWelcomeMessage(String username) {
        System.out.println("Welcome to Home Banking, " + username + "!");
    }

    public void logout() {
        System.out.println("You have been logged out.");
    }

    public void displayBalance(double balance) {
        System.out.println("Your balance is: " + balance);
    }
}


