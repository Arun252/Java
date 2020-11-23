package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgresmanager {
    private static Connection connection;

    public static Connection getConnection() {
            if(connection==null) {
                try {
                        connection= DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "Buddy$100620");
                } catch(SQLException throwables) {
                    throwables.printStackTrace();
                    System.out.println("Error connecting to database");
                }
            }
            return connection;
    }
}
//Singleton design pattern is present in java where an object of a class y is created and is present in memory. When a class x tries to access this object the memory returns object of class y. and when  a new class tries to create an object of the type y, java returns this same object instead of creating multiple objects of same class.
//example is the connection class mentioned above. This is called dependency injection in java and Spring boot. this is called tupple sort in data structure where nodes are connected in graph.