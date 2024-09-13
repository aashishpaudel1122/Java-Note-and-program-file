//import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class SampleUIExample {
    JFrame f;
    JLabel fn,ln,email,contact,address,gender;
    JTextField tfn,tln,temail,taddress,tcontact;
    JRadioButton male,female,others;
    ButtonGroup grp;
    JCheckBox terms;
    JButton submit;
    Connection con;
    
    SampleUIExample(){
        f=new JFrame("registration Form");
        f.setSize(600,600);
        f.setLayout(null);
        
        fn=new JLabel("First Name:");
        fn.setBounds(50,100,100,30);
        f.add(fn);

        tfn=new JTextField();
        tfn.setBounds(150,100,200,30);
        f.add(tfn);
        
        ln=new JLabel("Second Name:");
        ln.setBounds(50,150,100,30);
        f.add(ln);

        tln=new JTextField();
        tln.setBounds(150,150,200,30);
        f.add(tln);

        //Contact
        contact=new JLabel("Contact");
        contact.setBounds(50,200,100,30);
        f.add(contact);

        tcontact=new JTextField();
        tcontact.setBounds(150,200,200,30);
        f.add(tcontact);

        //Gender
        gender=new JLabel("Gender");
        gender.setBounds(50,250,100,30);
        f.add(gender);

        male=new JRadioButton("male");
        female=new JRadioButton("female");
        others=new JRadioButton("Others");
        male.setBounds(150,250,70,30);
        female.setBounds(250,250,70,30);
        others.setBounds(350,250,70,30);
        grp=new ButtonGroup();
        male.setSelected(true);
        grp.add(male);grp.add(female);grp.add(others);
        f.add(male);f.add(female);f.add(others);
        
        terms=new JCheckBox("I agree terms and conditions");
        terms.setBounds(50,300,500,30);
        f.add(terms);
        //button
        submit=new JButton("Submit");
        submit.setBounds(250,350,100,30);
         
        f.add(submit);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                connection();
                insert();
                
            }
        });
    }
    public void insert(){
        try{
            if(terms.isSelected()){
                PreparedStatement stmt=con.prepareStatement("insert into records(fname,lname,contact,gender)values(?,?,?,?)");
                stmt.setString(1,tfn.getText());
                stmt.setString(2,tln.getText());
                String pnone=tcontact.getText();
                stmt.setInt(3, Integer.parseInt(pnone));
                if(male.isSelected()){
                    stmt.setBoolean(4, true);
                }
                else if(female.isSelected()){
                    stmt.setBoolean(4,false);
                }
               
                stmt.executeUpdate();
                System.out.println("inserted");

            }
            else{
                JOptionPane.showMessageDialog(null,"terms and condition not satisfied");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    public void connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pnc","root","prithvi1234");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static void main(String[] args) {
        new SampleUIExample();
    }
}
