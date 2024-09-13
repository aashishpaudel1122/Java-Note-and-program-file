import java.sql.*;
public class ReadData {
    public void readData1(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","prithvi1234");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from info");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void writeData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","prithvi1234");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into info values('kriti','Pokhjara-26',5)");
        con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
      public static void main(String[] args) {
        //new ReadData().readData();
        new ReadData().writeData();
    }
}
