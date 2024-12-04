package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
            System.out.println("Connection done..........");
            String title="last day of my life";
            int author_id =5;
            String publication_year="2020-07-09";
            String genre="Drama";
            int isbn=121112;
            int available_copies=54;
            String query = "INSERT INTO books (title, author_id, publication_year, genre, isbn, available_copies) VALUES ('"
                    + title + "', "
                    + author_id + ", '"
                    + publication_year + "', '"
                    + genre + "', "
                    + isbn + ", "
                    + available_copies + ");";
            Statement st=con.createStatement();
            int UpdateTable = st.executeUpdate(query);
            System.out.println(UpdateTable+"rows affected ");
            st.close();
            con.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
