import javax.swing.*;
public class FormExample {
    JFrame f;
    JLabel name, email, contact,gender,address;
    JTextField tname,temail,tcontact,taddress;
    JButton submit;
    JRadioButton rmale,rfemale;
    ButtonGroup grp;

    FormExample(){
       f=new JFrame("Registration form");
       f.setSize(600,700);
       f.setLayout(null);
      

       name=new JLabel("Name");
       name.setBounds(50,100,50,30);
       f.add(name);

        tname=new JTextField();
        tname.setBounds(150,100,100,30);
        f.add(tname);

        email=new JLabel("Email");
        email.setBounds(50,150,50,30);
        f.add(email);

        temail=new JTextField();
        temail.setBounds(150,150,100,30);
        f.add(temail);

        rmale=new JRadioButton("male");
        rfemale=new JRadioButton("Female");
        rmale.setBounds(150,200,70,30);
        rfemale.setBounds(250,200,70,30);
        //rmale.isSelected();
        grp=new ButtonGroup();
        grp.add(rmale);grp.add(rfemale);
        f.add(rmale);f.add(rfemale);

        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    public static void main(String[] args) {
        new FormExample();
    }
}
