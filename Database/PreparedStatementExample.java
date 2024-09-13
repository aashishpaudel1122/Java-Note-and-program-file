import java.sql.*;
import java.util.*;
public class PreparedStatementExample {
    public Connection con;
    public void dbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pnc","root", "prithvi1234");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void insert(){
        try{
            dbConnect();
            Scanner sc=new Scanner(System.in);
            
            String sql="insert into emp(name,salary)values(?,?)";
            PreparedStatement stmt=con.prepareStatement(sql);
            System.out.println("Enter name");
            stmt.setString(1,sc.nextLine());
            System.out.println("Enter salary");
            stmt.setDouble(2,sc.nextDouble());
            stmt.executeUpdate();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(){
        try{
            dbConnect();
            Scanner sc=new Scanner(System.in);
            String sql="update emp set salary=? where id=?";
            PreparedStatement stmt=con.prepareStatement(sql);
            System.out.println("Enter salary");
            stmt.setDouble(1,sc.nextDouble());
            System.out.println("enter id");
            stmt.setInt(2, sc.nextInt());
            stmt.executeUpdate();
            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
public static void main(String[] args) {
    PreparedStatementExample ps=new PreparedStatementExample();
    ps.update();
}
    
}
