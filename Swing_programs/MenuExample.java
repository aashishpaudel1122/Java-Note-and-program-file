import javax.swing.*;
public class MenuExample {
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,view,saveas;
    JMenuItem I1,I2,I3,I4,I5,pdf,txt;

    MenuExample(){
       f=new JFrame("Menu");
       f.setLayout(null);
       f.setSize(500,500);
       mb=new JMenuBar();

       file=new JMenu("file");
       edit=new JMenu("Edit");
       view=new JMenu("view");
       saveas=new JMenu("saveas");
        mb.add(file);mb.add(edit);mb.add(view);
        I1=new JMenuItem("I1");
        I2=new JMenuItem("I2");
        I3=new JMenuItem("I3");
        I4=new JMenuItem("I4");
        I5=new JMenuItem("I5");
        pdf=new JMenuItem("pdf");
        txt=new JMenuItem("txt");
        file.add(I1);file.add(I2);file.add(I3);file.add(saveas);
        edit.add(I4);edit.add(I5); 
        saveas.add(pdf);saveas.add(txt);  
       f.setJMenuBar(mb);
       
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setLocationRelativeTo(null);
    }
public static void main(String[] args) {
    new MenuExample();
}    
}
