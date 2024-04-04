package workshop06.account;

public class Account {
    private String account;
    private double balance;
    private double interestRate;

    public Account() {
    }

    public Account(String account, double balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate/100;
    }

    public void deposit(double money) {
        if (money < 0) {
            System.out.println("입금액이 0보다 작습니다.");
        } else {
            balance += money;
            System.out.println("잔액 : "+balance);
        }
    }

    public void withdraw(double money) {
        if (money < 0) {
            System.out.println("입금액이 0보다 작습니다.");
        } else if (balance < money) {
            System.out.println("출금액이 잔액보다 많습니다.");
        } else {
            balance -= money;
            System.out.println("잔액 : " + balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
