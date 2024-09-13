
import java.sql.*;
import javax.swing.*;

public class TableExample {

    public JFrame f;
    public Connection con;

    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldatabaseemployes", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    TableExample() {
        f = new JFrame();
        String data[][] = {{"101", "Amit", "670000"},
        {"102", "Jai", "780000"},
        {"101", "Sachin", "700000"}};
        String column[] = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        display();
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public void display() {

        try {
            connection();
            System.out.println("connection successfully established");

        } catch (Exception e) {
            System.out.println("error inserting" + e);
        }
    }

    public static void main(String[] args) {
        new TableExample();
    }
}
