package Account;

import java.util.List;

public abstract class Account {
    int balance;
    List<Transactions> transactions;
    private String accountno;

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public abstract AccType getAccType();

    public Account(int balance, String accno) {
        this.setAccountno(accno);
        this.balance = balance;

    }
}
