import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class BorderToPanel {
    JFrame f;
    BorderToPanel(){
        f=new JFrame("Border to Panel");
        f.setSize(500,500);
        f.setLayout(null);
        createUI(f);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void createUI(JFrame f){
         JPanel p=new JPanel();
         Border blackLine=BorderFactory.createLineBorder(Color.BLACK);
         p.setBounds(50,100,300,100);
         p.setBackground(Color.cyan);
         p.add(new JLabel("hello i am java Programming"));
         p.setBorder(blackLine);
         f.add(p);
    }
    public static void main(String[] args) {
        new BorderToPanel();
    }
}
