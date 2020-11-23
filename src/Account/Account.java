package Account;

import Database.Postgresmanager;
import enums.AccType;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Account {
    int balance;
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
    public void save() {
        Connection c= null;
        try {
            c= Postgresmanager.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("insert into Account( balance, accountno, acctype) values (?,?,?)");
            preparedStatement.setInt(1, balance);
            preparedStatement.setString(2, accountno);
            preparedStatement.setObject(3, getAccType(),Types.OTHER);
            preparedStatement.execute();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public long getaccid(String accno) {
        Connection c= null;
        try {
            c= Postgresmanager.getConnection();
            PreparedStatement preparedStatement = c.prepareStatement("select accid from account where accountno=?");
            preparedStatement.setString(1, accno);
            ResultSet resultSet= preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getLong("accid");
            }
        catch(SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

