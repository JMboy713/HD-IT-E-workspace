package workshop04.account;

import java.lang.String;
import java.util.Iterator;

public class AccountTest2 {
    public static void main(String[] args) {
        Account[] account = new Account[5];
        for (int i = 0; i < 5; i++) {
            StringBuilder st = new StringBuilder();
            st.append("221-0101-211").append(i+1);
            String str = st.toString();
            Account account1 = new Account(str,100000,4.5);
            account[i] = account1;
        }
        for (Account acc : account) {
            System.out.println(acc.accountInfo());
        }
        for (Account acc : account) {
            acc.setInterestRate(3.7);
            System.out.println(acc.accountInfo()+" 이자: "+acc.calculateInterest()+"원");
        }
    }
}
