package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Book{
    int book_id;
    String bookName;
    public String getName(){
        return  bookName;
    }
}
class BookDao{
    public Book getBook(int id){
        try{
            Book b=new Book();
            b.book_id=id;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");
            String query="Select title from books where book_id="+id;
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            rs.next();
            String name=rs.getString(1);
            b.bookName =name;

            return b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
public class GetBook {
    public static void main(String[] args) {
        BookDao bd=new BookDao();
        Book b =bd.getBook(12);
        System.out.println(b.getName());
    }
}
