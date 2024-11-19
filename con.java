package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con {
    public Statement statement; // This should be an instance variable

    public con() {
        Connection connection;
        try {
            // Establish connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "123");
            // Initialize instance-level statement variable
            this.statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
