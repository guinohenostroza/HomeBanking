public class User {
    String username;
    String password;
    int age;
    String email;
    String phoneNumber;
    double balance;
    String accountType;
    String address;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        balance = 1000.00;
    }

    public void checkBalance() {
        if (balance > 0) {
            System.out.println("Your balance is: " + balance);
        } else if (balance == 0) {
            System.out.println("You have no money left.");
        } else {
            System.out.println("Negative balance: Please deposit funds.");
        }
    }

    public void transferFunds(String accountNumber, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance -= amount;
            System.out.println("Transferred " + amount + " to " + accountNumber);
        }
    }

    public void showAccountDetails() {
        System.out.println("Username: " + username);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Address: " + address);
    }
}

