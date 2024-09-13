import java.awt.*;
public class PanelExample {
    Frame f;
    Panel p1,p2,p3;
    Button b1;
    PanelExample(){
      f=new Frame();
      f.setSize(600,600);
      f.setLayout(null);

      p1=new Panel();
      p1.setBounds(0,0,600,200);
      p1.setBackground(Color.RED);
      f.add(p1);

      p2=new Panel();
      p2.setBounds(0,200,600,200);
      p2.setBackground(Color.CYAN);
      f.add(p2);

      p3=new Panel();
      p3.setBounds(0,400,600,200);
      p3.setBackground(Color.gray);
      f.add(p3);

      b1=new Button("Click me");
      b1.setBounds(300,500,100,50);
      p3.add(b1);
      f.setVisible(true);
    }
    public static void main(String[] args) {
        new PanelExample();
    }
}
