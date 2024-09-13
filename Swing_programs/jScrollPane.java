import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class jScrollPane {
    JFrame f;
    JTextArea area;
    JScrollPane spane;
    jScrollPane(){
        f=new JFrame("Scroll Pane");
        area=new JTextArea(20,20);
        spane=new JScrollPane(area);
        f.add(spane);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new jScrollPane();
    }
}
