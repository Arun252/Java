package Account;

import java.time.Instant;

public class Transactions {
    int amount;
    int date;
    TransactionType trans;
//    int previoustransactions;
    public Transactions(int amount,int date, TransactionType t) {
        this.amount=amount;
        this.date= date;
        this.trans=t;
//        previoustransactions= amount;
//        if(previoustransactions>0) {
//            System.out.println("Deposited: Rs." + previoustransactions);
//        }
//        else if(previoustransactions<0) {
//            System.out.println("Withdrawn: Rs." + Math.abs(previoustransactions));
//        }
//        else {
//            System.out.println("No transaction occurred");
//        }
//
   }
}
