package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class ProblemNumFive {
    public static void main(String[] args) {
        HashMap<Integer ,String> hs=new HashMap();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");
            String query="select title,book_id from books";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
//                System.out.println(rs.getString(1));

                hs.put(rs.getInt("book_id"),rs.getString("title"));

            }


            HashSet <String>hs1=new HashSet<>();

            Scanner sc=new Scanner(System.in);
            for(Map.Entry<Integer,String> entry:hs.entrySet()){
                if((hs1.contains(entry.getValue()))){
                    System.out.println(entry.getValue());
                    System.out.println("this name is already there please change the name of book");
                    String changedName =sc.nextLine();
                    String query1 = "update books set title='" + changedName + "' where book_id=" + entry.getKey();
                    System.out.println("value is updated: "+st.executeUpdate(query1));
                    hs1.add(changedName);
                }
                else{
                    hs1.add(entry.getValue());
//                    System.out.println(entry.getValue());
                }
            }
//        hs.forEach(System.out::println);
            System.out.println("all the old name is there: ");
            for (Map.Entry<Integer, String> entry : hs.entrySet()) {
                System.out.println("Book ID: " + entry.getKey() + ", Title: " + entry.getValue());
            }
            System.out.println("all the change and updated name is there: ");
            hs1.forEach(System.out::println);
            rs.close();
            st.close();
            con.close();



        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
