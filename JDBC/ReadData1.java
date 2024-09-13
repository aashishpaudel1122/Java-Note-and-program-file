import java.sql.*;
public class ReadData1 {
    public void displayData(){
     try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "prithvi1234");
       Statement stmt=con.createStatement();
       ResultSet rs=stmt.executeQuery("select * from login where username='ram' and password='ram123' ");
       if(rs.next()) {
        System.out.println("hello");
       }
     }
     catch(Exception e){
       System.out.println(e); 
     }
    }
    public static void main(String[] args) {
        new ReadData1().displayData();
    }
}
