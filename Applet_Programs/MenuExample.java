import javax.swing.*;
class MenuExample{
   JFrame main;
   JMenuBar jbar;
   JMenu menu,submenu,edit;
   JMenuItem i1,i2,i3,i4,i5,i6;
   MenuExample(){
      main=new JFrame("Menu and Menu Items");
      main.setSize(600,600);

      jbar=new JMenuBar();
      menu=new JMenu("file");
      submenu=new JMenu("save as");

      main.setJMenuBar(jbar);
      jbar.add(menu);
      menu.add(submenu);
     
      i1=new JMenuItem("item 1");
      i2=new JMenuItem("item 2");
      i3=new JMenuItem("item 3");

      menu.add(i1);menu.add(i2);menu.add(i3);

      i4=new JMenuItem("item 4");
      i5=new JMenuItem("item 5");
      i6=new JMenuItem("item 6");

      submenu.add(i4);submenu.add(i5);submenu.add(i6);

      edit=new JMenu("Edit");
      jbar.add(edit);

      main.setLayout(null);
      main.setVisible(true);
      main.setLocationRelativeTo(null);
   }
   public static void main(String args[]){
      new MenuExample();
   }
}