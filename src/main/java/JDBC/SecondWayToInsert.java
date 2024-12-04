package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class SecondWayToInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");
            System.out.println("Connection........wroking");
            String title="last day of surryas life";
            int author_id =3;
            String publication_year="2015-07-29";
            String genre="Drama";
            int isbn=121113;
            int available_copies=33;
            String query="insert into books (title, author_id, publication_year, genre, isbn, available_copies) values(?,?,?,?,?,?)";
//            Statement st=con.createStatement();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,title);
            ps.setInt(2,author_id);
            ps.setString(3,publication_year);
            ps.setString(4,genre);
            ps.setInt(5,isbn);
            ps.setInt(6,available_copies);
            int updateStatus=ps.executeUpdate();
            System.out.println(updateStatus+" rows is affected ..... ");
            ps.close();
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
