import javax.swing.*;
public class CheckAndRadioMenuItems {
    JCheckBoxMenuItem i1,i2,i3;
    JRadioButtonMenuItem i4,i5,i6;
    ButtonGroup bg;
    JMenuBar mb;
    JMenu menu;
    JFrame f;
    CheckAndRadioMenuItems(){
    f=new JFrame("radio and check box menu items");
    f.setSize(500,500);
    
    mb=new JMenuBar();
    menu=new JMenu("letters");

    i1=new JCheckBoxMenuItem("A");
    i2=new JCheckBoxMenuItem("B");
    i3=new JCheckBoxMenuItem("C");

    menu.add(i1);menu.add(i2);menu.add(i3);

    i4=new JRadioButtonMenuItem("C");
    i5=new JRadioButtonMenuItem("D");
    i6=new JRadioButtonMenuItem("E");
    menu.add(i4);menu.add(i5);menu.add(i6);
    bg=new ButtonGroup();
    bg.add(i4);bg.add(i5);bg.add(i6);

     mb.add(menu);
    f.setJMenuBar(mb);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    }
   public static void main(String[] args) {
    new CheckAndRadioMenuItems();
   }   
}
