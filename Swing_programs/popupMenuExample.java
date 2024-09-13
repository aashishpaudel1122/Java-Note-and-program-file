import javax.swing.*;
import java.awt.event.*;
public class popupMenuExample {
    JFrame f;
    JPopupMenu popup;
    JMenuItem copy,cut,paste,delete;
    popupMenuExample(){
        f=new JFrame("Pop up Menu");
        f.setSize(700,700);
        f.setLayout(null);
         popup=new JPopupMenu("EDIT");
         copy=new JMenuItem("Copy");
         cut=new JMenuItem("Cut");
         paste=new JMenuItem("Paste");
         delete=new JMenuItem("Delete");
         popup.add(copy);popup.add(cut);popup.add(paste);popup.add(delete);
         //popup.show(f, 200,200);
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popup.show(f , e.getX(), e.getY());  
            }                 
         });  
         //f.add(popup);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new popupMenuExample();
    }
}
