package Account;

import Database.Postgresmanager;
import enums.TransactionType;

import java.sql.*;

public class Transactions {
    int amount;
    String date;
    TransactionType trans;

    public Transactions(int amount, String date, TransactionType t) {
        this.amount = amount;
        this.date = date;
        this.trans = t;
    }

    @Override
    public String toString() {
        return " " + trans + ": " + amount  ;
    }

    public void save(long accid) {
        Connection c= null;
        try {
            c= Postgresmanager.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("insert into transaction( amount, ddate, transtype) values (?,?,?)");
            preparedStatement.setInt(1, amount);
            preparedStatement.setString(2, date);
            preparedStatement.setObject(3, trans,Types.OTHER);
            preparedStatement.execute();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
