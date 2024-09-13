import javax.swing.*;
public class JmenuMenuItemsExample {
    JFrame f;
    JMenuBar mb;
    JMenu m1,m2,save;
    JMenuItem i1,i2,i3,i4,i5;
    JmenuMenuItemsExample(){
        f=new JFrame("Menu Items");
        f.setSize(500,500);
        
        mb=new JMenuBar();
        m1=new JMenu("file");
        m2=new JMenu("services");
        mb.add(m1);mb.add(m2);
        ImageIcon icon=new ImageIcon("D:\\buttonIcon.png");
        i1=new JMenuItem("copy",icon);
        i2=new JMenuItem("Edit");
        i3=new JMenuItem("move");
        m1.add(i1);m1.addSeparator();
        m1.add(i2);m1.addSeparator();
        m1.add(i3);m1.addSeparator();

        save=new JMenu("save as");
        m1.add(save);
        i4=new JMenuItem("pdf");
        i5=new JMenuItem("Word");
        save.add(i5);save.add(i4);

        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new JmenuMenuItemsExample();    
    }
}
