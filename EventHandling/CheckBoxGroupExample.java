// program to demonstrate CHeck box group
import java.awt.*;
public class CheckBoxGroupExample {
    Checkbox male, female,othrs;
    CheckboxGroup cbg;
    Frame f;
    CheckBoxGroupExample(){
      f=new Frame("check box group");
      f.setSize(600,600);
      cbg=new CheckboxGroup();
      f.setLayout(null);

      male= new Checkbox("Male",cbg, false);
      male.setBounds(200,300,100,30);
      f.add(male);

      female=new Checkbox("Female",cbg,false);
      female.setBounds(300,300,100,30);
      f.add(female);

      othrs=new Checkbox("others",cbg,false);
      othrs.setBounds(400,300,100,30);
      f.add(othrs);


      f.setVisible(true);
      
    }
public static void main(String[] args) {
    new CheckBoxGroupExample();
}    
}
