package udemy.course.exercise5;

public class Bank_Account {

    private int number;
    private String holder;
    private double balance;

    public Bank_Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }
    public Bank_Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    int getAccount_number(int number) {
        return number;
    }
    String getHolder(String holder) {
        return holder;
    }
    void setHolder(String holder) {
        this.holder = holder;
    }
    double getBalance() {
        return balance;
    }
    public void deposit (double amount) {
        balance += amount;
    }
    public void withdraw (double amount) {
        balance -= amount + 5 ;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f%n", balance );
    }
}
