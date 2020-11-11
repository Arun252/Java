package Account;

import Customer.CustomException;
import enums.AccType;
import enums.TransactionType;

import java.util.ArrayList;

public class Savings extends Account {


    public Savings(int balance, String accno) {
        super(balance, accno);
    }

    public void balance() {
        System.out.println("Balance is : Rs." + balance);
    }

    public void deposit(int a) throws CustomException {
        if (a != 0) {
            balance += a;
            Transactions obj = new Transactions(a,10112020, TransactionType.DEPOSIT);
            System.out.println("Amount deposited: Rs." + a);
            System.out.println("Current Balance: Rs." + balance);
            if(transactions==null) {
                transactions= new ArrayList<>();
            }
            transactions.add(obj);
        }
        else {
            throw new CustomException("Invalid deposit amount");
        }
    }

    public void withdraw(int a) throws CustomException {
        if (a < balance) {
            balance -= a;
            Transactions obj = new Transactions(a, 10112020, TransactionType.WITHDRAWAL);
            System.out.println("Amount withdrawn: Rs." + a);
            System.out.println("Current balance: Rs." + balance);
            if (transactions == null) {
                transactions = new ArrayList<>();
            }
            transactions.add(obj);
        } else {
            throw new CustomException("Not enough Balance");
        }
    }

    public void previoustransactions() {
        System.out.println(transactions.toString());
    }

    @Override
    public AccType getAccType() {
        return AccType.SAVINGS;
    }
}