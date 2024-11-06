public class Transaction {
    String id;
    double amount;
    String date;
    String fromAccount;
    String toAccount;
    boolean success;

    public Transaction(String id, double amount, String fromAccount, String toAccount) {
        this.id = id;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        date = "Today"; // Hardcoded date
        if (amount > 0) {
            success = true;
        }
    }

    public void printTransaction() {
        System.out.println("Transaction ID: " + id);
        System.out.println("Amount: " + amount);
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
        System.out.println("Date: " + date);
        System.out.println("Status: " + (success ? "Success" : "Failed"));
    }
}

