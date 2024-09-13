import javax.swing.*;
public class jTextArea {
    JFrame f;
    JTextArea screen;
    jTextArea(){
        f=new JFrame("TextField and PassWordField");
        f.setSize(500,500);
         
        screen=new JTextArea();
        screen.setBounds(100,100,300,300);
        screen.append("Text Area ");
        screen.insert("hello there", 0);
        f.add(screen);
        
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new jTextArea();
    }
    
}
