import java.sql.*;
import javax.swing.JOptionPane;
public class JdbcExample {
    public Connection con;
    public void connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jmc", "root", "prithvi1234");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    public void insertdb(){
       try{
        connection();
        Statement stmt=con.createStatement();
        stmt.executeUpdate("insert into info(name,address)values('Aashish','pokhara')");
       }
       catch(Exception e){
         System.out.println("Error"+e);
       }
       con.close();
    }
    public void delete(){
        try{
            connection();
            Statement stmt=con.createStatement();
            stmt.executeUpdate("delete from info where name='Aashish'");
        }
        catch(Exception e){
            System.out.println("error"+e);
        }
        con.close();
    }
    public void update(){
        try{
            connection();
            Statement stmt=con.createStatement();
            stmt.executeUpdate("update info set address='kathmandu' where name='ram'");
        }
        catch(Exception e){
            System.out.println("eroor"+e);
        }
        con.close();
    }
    public void display(){
        try{
            connection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from info");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
        }
        catch(Exception e){
            System.out.println("error"+ e);
        }
        con.close();
    }
    public static void main(String[] args) {
        JdbcExample jb=new JdbcExample();
        //jb.display();
        //.jb.insertdb();
        //jb.delete();
        jb.update();
        jb.display();
    }
    
}
