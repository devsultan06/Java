package Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        boolean deposited = account.deposit(1000);
        System.out.println("Deposited: " + deposited);
        System.out.println("Balance: " + account.getBalance());
    }
}
