import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class jScrollPaneExample {
        JFrame f;
        JTextArea area;
        JScrollPane pane;
        jScrollPaneExample(){
            f=new JFrame("Scroll Pane");
            f.setSize(400,400);
             //f.setLayout(null);

            area=new JTextArea(20,20);
            pane=new JScrollPane(area);
            //pane.add(area);
            f.add(pane);

            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setVisible(true);

        }
        public static void main(String[] args) {
            new jScrollPaneExample();
        }
}
