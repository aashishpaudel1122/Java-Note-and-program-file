//import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class SampleUIExample {
    JFrame f;
    JLabel fn,ln,email,contact,address,gender;
    JTextField tfn,tln,temail,taddress,tcontact;
    JRadioButton male,female,others;
    ButtonGroup grp;
    JCheckBox terms;
    JButton submit;
    //JComboBox<String> cnt;
    SampleUIExample(){
        f=new JFrame("registration Form");
        f.setSize(600,600);
        f.setLayout(null);
        //String country={"Nepal","india","China"};
        //For First Name
        fn=new JLabel("First Name:");
        fn.setBounds(50,100,100,30);
        f.add(fn);

        tfn=new JTextField();
        tfn.setBounds(150,100,200,30);
        f.add(tfn);
        
        //JComboBox<String> cnt=new JComboBox<String>(cnt);
        //For lastname
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
         //cnt.setBounds(350,450,100,50);
         //f.add(cnt);
        f.add(submit);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("hello");
                String fname=tfn.getText();
                String phoneno=tcontact.getText();
                System.out.println("First Name:"+tfn.getText());
                System.out.println("Last Name:"+tln.getText());
                System.out.println("Contact:"+Integer.parseInt(phoneno));
                
            }
        });
    }
    public void display(){

    }
    public static void main(String[] args) {
        new SampleUIExample();
    }
}
