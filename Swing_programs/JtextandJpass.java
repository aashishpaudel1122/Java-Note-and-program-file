import javax.swing.*;
public class JtextandJpass {
    JFrame f;
    JTextField name;
    JPasswordField pass;
    JtextandJpass(){
        f=new JFrame("TextField and PassWordField");
        f.setSize(500,500);

        name=new JTextField();
        name.setBounds(100,100,200,50);
        f.add(name);

        pass=new JPasswordField();
        pass.setBounds(100,200,200,50);
        f.add(pass);

        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JtextandJpass(); 
    }
}
