package JDBC;

import java.sql.*;

public class MySQLConnectionExample {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection(  "jdbc:mysql://localhost:3306/chat", "root", "root");
            Statement st =con.createStatement();
            ResultSet rs=st.executeQuery("show tables");
            System.out.println("hy");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            rs.close();
            st.close();
            con.close();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
