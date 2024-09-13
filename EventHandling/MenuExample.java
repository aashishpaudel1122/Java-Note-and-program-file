// memubar, menu and menu items
import java.awt.*;
public class MenuExample {
    Frame f;
    MenuBar main;
    Menu m1,m2,m3,m4,m5;
    MenuItem i1,i2,i3,i4,i5,i6,i7,i8;
    MenuExample()
    {
       f=new Frame("menu Example");
       f.setSize(600,600);

       main=new MenuBar();
       f.setMenuBar(main);

       m1=new Menu("file");
       main.add(m1);

       m2=new Menu("Edit");
       main.add(m2);

       m3=new Menu("Format");
       main.add(m3);

       m4=new Menu("Tools");
       main.add(m4);

       i1=new MenuItem("save");
      // i2=new MenuItem("save as");
       i3=new MenuItem("new");
       m1.add(i1);m1.add(i3);

       i4=new MenuItem("Copy");
       i5=new MenuItem("paste");
       i6=new MenuItem("cut");
       m2.add(i4);m2.add(i5);m2.add(i6);

       m5=new Menu("save as"); 
       m1.add(m5);

       i7=new MenuItem("pdf");
       i8=new MenuItem("doc");
       m5.add(i7);m5.add(i8);

       f.setLayout(null);
       f.setVisible(true);

    }
    public static void main(String args[]){
        new MenuExample();
    }  
}
