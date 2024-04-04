package workshop04.account;

public class Account {
    private String account;
    private int balance;
    private double interestRate;

    public Account() {
    }

    public Account(String account, int balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double calculateInterest() {
        return balance*interestRate/100;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        this.balance-=money;
    }

    @Override
    public String toString() {
        return  "계좌정보: " +account + " 현재 잔액 " +balance ;
    }

    public String accountInfo() {
        return "계좌정보: " + account + " 현재 잔액 " + balance + " 이자율 " + interestRate+"%";
    }
}


