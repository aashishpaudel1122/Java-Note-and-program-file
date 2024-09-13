import java.sql.*;

import javax.swing.JOptionPane;
public class DatabaseConnectionExample {
    Connection con;
    public Connection connection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jmc","root", "prithvi1234");
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null,"error"+ e);
        }
        return con;
    }
  public static void main(String[] args) {
    DatabaseConnectionExample db=new DatabaseConnectionExample();
    db.connection();
  }  
}
