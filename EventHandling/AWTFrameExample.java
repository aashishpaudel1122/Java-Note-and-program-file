import java.awt.*;
import java.awt.event.*;
public class AWTFrameExample extends Frame {
    TextArea ta;
    Choice ch;
    Checkbox m,f;
    Label ml,fl;
    AWTFrameExample()
    {
        ta=new TextArea();
        ta.setBounds(100,200,300,300);
        add(ta);


        ch=new Choice();
        ch.setBounds(50,100,100,50);
        add(ch);
        ch.add("nepal");
        ch.add("india");
        ch.add("China");
        ch.add("japan");

        ml=new Label("male");
        ml.setBounds(450,200,50,30);
        add(ml);



        m=new Checkbox();
        m.setBounds(500,200,50,30);
        add(m);

        fl=new Label("Female");
        fl.setBounds(550,200,50,30);
        add(fl);

        f=new Checkbox();
        f.setBounds(600,200,50,30);
        add(f);


      //f=new Frame();
       setSize(700,700);
       setLayout(null);
       setVisible(true);
    }
    public static void main(String args[]){
        new AWTFrameExample();
    }
}
