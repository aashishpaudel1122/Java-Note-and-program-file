import java.awt.*;
public class awtExample1 {
    Frame main;
    Label name, address;
    TexField tname,taddress;
    Button submit;
    Panel p;
    awtExample1()
    {
        main=new Frame("main");
        main.setSize(500,500);
        main.setLayout(null);


        main.setVisible(true);
    }
   public static void main(String[] args) {
    new awtExample1();
   }
}
