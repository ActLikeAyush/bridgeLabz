package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/chat";
        String username = "root";
        String password = "root";

        try {
            // Step 1: Register MySQL JDBC Driver (optional for modern JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database!");

            // Step 3: Create a statement and execute queries
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("show tables;");

            // Step 4: Process the results
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }

            // Step 5: Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
