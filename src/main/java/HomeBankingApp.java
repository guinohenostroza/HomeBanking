public class HomeBankingApp {

    public static void main(String[] args) {
        User user = new User("Juan", "12345");
        user.checkBalance();
        user.transferFunds("Account123", 500.00);
        user.showAccountDetails();
    }
}

