import java.sql.*;
public class JDBCExample1 {
 public static void main(String[] args)throws Exception {
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","prithvi1234");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("Select * from info");
    while(rs.next()){
        System.out.println(rs.getString(1)+rs.getString(2));
    }
    }
    catch(Exception e){
        System.out.println(e);
    }
    
 }   
}
