import Database.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {
    public static void main(String[] args) {
        Connection c = null;
        try {
            c = Postgresmanager.getConnection();
            Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Account");

            while (resultSet.next()) {
                System.out.println("AccID: " + resultSet.getLong("accid"));
                System.out.println("Balance: " + resultSet.getLong("balance"));
                System.out.println("Accountno: " + resultSet.getString("accountno"));
                System.out.println("Account type: " + resultSet.getObject("acctype"));
                System.out.println("==========================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}