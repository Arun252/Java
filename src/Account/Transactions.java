package Account;

import enums.TransactionType;

public class Transactions {
    int amount;
    int date;
    TransactionType trans;

    public Transactions(int amount, int date, TransactionType t) {
        this.amount = amount;
        this.date = date;
        this.trans = t;
    }

    @Override
    public String toString() {
        return " " + trans + ": " + amount  ;
    }
}
