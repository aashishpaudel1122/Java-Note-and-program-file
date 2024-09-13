import java.awt.*;
public class awtExample  {
    Frame main;
    Panel p;
    Label name, address;
    TextField tname,taddress;
    Button submit;
    awtExample(){
       main=new Frame("Main");
       main.setSize(500,500);
       main.setLayout(null);

       name=new Label("Name");
       name.setBounds(50,100,50,30);
       main.add(name);

       tname=new TextField();
       tname.setBounds(100,100,150,30);
       main.add(tname);

       address =new Label("Address");
       address.setBounds(50,150,50,30);
       main.add(address);

       taddress=new TextField();
       taddress.setBounds(100,150,150,30);
       main.add(taddress);

       submit=new Button("Submit");
       submit.setBounds(200,200,100,70);
       main.add(submit);

       p=new Panel();
       p.setBounds(0,300,500,200);
       p.setBackground(Color.cyan);
       main.add(p);

       
       
       main.setVisible(true);
      
    }
    public static void main(String[] args) {
        new awtExample();
    }
    
}
