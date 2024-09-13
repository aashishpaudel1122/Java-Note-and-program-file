import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.*;
public enum BorderExample1 {
            JFrame f;
            BorderExample1(){
                f=new JFrame("Border to JPanel");
                f.setSize(400,400);
                f.setLayout(null);
                createUI(f);
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationRelativeTo(null);
                
            }
            public void createUI(JFrame f){
                JPanel p=new JPanel();
                Border blackLine=BorderFactory.createLineBorder(Color.BLACK);
                p.setBounds(50,100,300,100);
                p.add(new JLabel("hello i am java"));
                p.setBorder(blackLine);
                f.add(p);
            }
            public static void main(String[] args) {
                new BorderExample1();
            }
}
