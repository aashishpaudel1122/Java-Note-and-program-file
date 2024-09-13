import javax.swing.*;
public class ExampleJmenu {
    JFrame f;
    JMenuBar main;
    JMenu m1,m2,m3;
    JMenuItem i1,i2,i3,i4,i5;
    ExampleJmenu(){
        f=new JFrame();
        f.setSize(500,500);
        f.setLayout(null);
        
        main=new JMenuBar();
        m1=new JMenu("File");
        m2=new JMenu("Services");
        JMenu save=new JMenu("Save as");
        
        main.add(m1);
        main.add(m2);
        m1.add(save);

        i1=new JMenuItem("edit");
        i2=new JMenuItem("Copy");
        i3=new JMenuItem("save");
        i4=new JMenuItem("pdf");
        i5=new JMenuItem("Word");

        m1.add(i1);m1.add(i2);m1.add(i3);
        save.add(i4);save.add(i5);
        f.setJMenuBar(main);


        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new ExampleJmenu();
    }
}
