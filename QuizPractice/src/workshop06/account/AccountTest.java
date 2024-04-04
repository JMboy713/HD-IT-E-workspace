package workshop06.account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("411-0290-1203",500000,7.3);
        System.out.println(account);
        account.deposit(-10);
        account.withdraw(600000);
        System.out.println(account.calculateInterest());
    }
}
