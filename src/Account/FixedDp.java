package Account;

import Customer.CustomException;
import enums.AccType;
import enums.TransactionType;

import java.util.ArrayList;

public class FixedDp extends Account{
    int duration;
    final float rate = 7;
    double interest;
    int principle;
    public FixedDp(int balance, String accno, int t, int principle) {
        super(balance,accno);
        this.duration=t;
        this.principle= principle;
    }


    public double simpleInterest() {
        interest = (principle*rate*duration)/100;
        return interest;
    }

    public void deposit(int a) throws CustomException {
        a= principle;
        if (a != 0) {
            balance += a;
            Transactions obj = new Transactions(a,10112020, TransactionType.DEPOSIT);
            System.out.println("Amount deposited: Rs." + a);
            if(transactions==null) {
                transactions= new ArrayList<>();
            }
            transactions.add(obj);
        }
        else {
            throw new CustomException("Invalid deposit amount");
        }
    }
    @Override
    public AccType getAccType() {
        return AccType.FIXEDDEPOSIT;
    }
}
