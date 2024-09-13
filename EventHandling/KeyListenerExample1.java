import javax.swing.*;
import java.awt.event.*;
public class KeyListenerExample1  {
    JFrame f;
    JTextArea a;
    KeyListenerExample1(){
        f=new JFrame("Window Listener");
        f.setSize(500,600);
        f.setLayout(null);

        a=new JTextArea();
        //a.setSize(300,300);
        a.setBounds(50,50,300,300);
        f.add(a);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
                System.out.println("closed");
            }
        });
    }
    public static void main(String[] args) {
        new KeyListenerExample1();
    }
}
