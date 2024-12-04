package JDBC;

import java.sql.*;

public class FirstTestProgram {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       // Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("desc books");

        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        ResultSet rs2=st.executeQuery("Select * from books");
        int rowCount=0;
        while (rs2.next()){
            System.out.print("Row " + (++rowCount));
            System.out.print(" | book Id: "+rs2.getInt("book_id")+"|");
            System.out.print(" | book title: "+rs2.getString("title")+"|");
            System.out.print(" | book author id: "+rs2.getInt("author_id")+"|");
//            System.out.println(" | "+rs2.getString("user_password")+"|");
            System.out.print(" | book genre: "+rs2.getString("genre")+"|");
            System.out.print(" | book something: "+rs2.getInt("isbn")+"|");
            System.out.print(" | book publication year: "+rs2.getDate("publication_year")+"|");
            System.out.print(" | book available copies: "+rs2.getInt("available_copies")+"|");
            System.out.println();
        }
        System.out.println(rowCount);
    }
}