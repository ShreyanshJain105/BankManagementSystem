package bank.management.system;

import java.sql.*;

/* This class is mainly use for the JDBC Connectivity
Mkae this class Object and use this class in another class
*/
public class Conn {
    Connection c;
    Statement s;

    public Conn() { // Constructor should not have a return type
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Class name should be a string
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "1974");
             // this is our local sql server credientials...
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for better debugging
        }
    }
}