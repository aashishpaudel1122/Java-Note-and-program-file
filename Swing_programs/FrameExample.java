import javax.swing.*;
import java.awt.*;
public class FrameExample{
    JFrame main;
    JLabel name,pass;
    JTextField tname;
    JPasswordField tpass;
    JButton login;
    JRadioButton male,female;
    ButtonGroup gen;
    JCheckBox terms;
    JComboBox combo;
    FrameExample(){
        main=new JFrame("Main Frame");
        main.setSize(500,600 );
        main.setLayout(null);


        name=new JLabel("Name");
        name.setBounds(50,50,80,30);
        main.add(name);

        tname=new JTextField();
        tname.setBounds(130,50,150,30);
        main.add(tname);

        pass=new JLabel("Password");
        pass.setBounds(50,100,80,30);
        main.add(pass);

        tpass=new JPasswordField();
        tpass.setBounds(130,100,150,30);
        main.add(tpass);

        login=new JButton("LOGIN");
        login.setBounds(150,150,100,30);
        main.add(login);

        male=new JRadioButton("Male");
        male.setBounds(200,230,100, 50);
        main.add(male);

        female=new JRadioButton("Female");
        female.setBounds(300,230,100, 50);
        main.add(female);

        gen=new ButtonGroup();
        gen.add(male);gen.add(female);

        String country[]={"Nep","ind","AUS","USA"};

        combo=new JComboBox(country);
        combo.setBounds(350,350,100,50);
        main.add(combo);



        main.setVisible(true);
        main.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new FrameExample();
    }
}