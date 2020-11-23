package Account;

import Customer.CustomException;
import Database.Postgresmanager;
import enums.AccType;
import enums.TransactionType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Savings extends Account {


    public Savings(int balance, String accno) {
        super(balance, accno);
    }

    public void balance() {
        Connection c = null;
        try {
            c= Postgresmanager.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("select balance from account where accno=?");
            preparedStatement.setString(1,getAccountno());
            ResultSet resultSet= preparedStatement.executeQuery();
            System.out.println(resultSet.getInt("balance"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deposit(int a) throws CustomException {
        if (a != 0) {
            balance += a;
            Transactions obj = new Transactions(a,"10112020", TransactionType.DEPOSIT);
            System.out.println("Amount deposited: Rs." + a);
            System.out.println("Current Balance: Rs." + balance);
            Connection c= null;
            try {
                c= Postgresmanager.getConnection();
                PreparedStatement preparedStatement = c.prepareStatement("Update account" +
                        " set balance=?" + " where accountno=?");
                preparedStatement.setInt(1,balance);
                preparedStatement.setString(2,getAccountno());
                int resultSet= preparedStatement.executeUpdate();
            } catch(SQLException e) {
                e.printStackTrace();
            }


            obj.save(getaccid(getAccountno()));
        }
        else {
            throw new CustomException("Invalid deposit amount");
        }
    }

    public void withdraw(int a) throws CustomException {
        if (a < balance) {
            balance -= a;
            Transactions obj = new Transactions(a, "10112020", TransactionType.WITHDRAWAL);
            System.out.println("Amount withdrawn: Rs." + a);
            System.out.println("Current balance: Rs." + balance);

        } else {
            throw new CustomException("Not enough Balance");
        }
    }
//    order by data in db and return it in below method.
//    public void previoustransactions() {
//        System.out.println(transactions.toString());
//    }

    @Override
    public AccType getAccType() {
        return AccType.SAVINGS;
    }
}