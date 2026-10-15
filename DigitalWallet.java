
public class DigitalWallet {
    private double balance;
    private final String walletId;

    public DigitalWallet(String walletId, double balance) {
        this.walletId = walletId;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void spend(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getWalletId() {
        return walletId;
    }

    public static void main(String[] args) {
        DigitalWallet wallet =
                new DigitalWallet("WALLET-101", 1000);

        wallet.deposit(500);
        System.out.println("Balance: " + wallet.getBalance());

        wallet.spend(300);
        System.out.println("Balance: " + wallet.getBalance());

        wallet.spend(2000);
        System.out.println("Wallet ID: " + wallet.getWalletId());
        System.out.println("Final balance: " + wallet.getBalance());
    }
}
