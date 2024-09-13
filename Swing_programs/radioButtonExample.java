import javax.swing.*;
public class radioButtonExample {
    JRadioButton male, female;
    ButtonGroup g;
    JFrame main;
    JCheckBox term;
    JComboBox select;
    radioButtonExample(){
     main=new JFrame("Main");
     main.setLayout(null);
     main.setSize(500,500);
     g=new ButtonGroup();
     
     male=new JRadioButton("male");
     male.setBounds(100,200,100,50);

     female=new JRadioButton("female");
     female.setBounds(200, 200, 100,50);
     g.add(male);g.add(female);
     main.add(male);main.add(female);
     String country[]={"Nepal","India","Bangladesh","Butan","Srilanka"};
     select=new JComboBox(country);
     select.addItem("Japan");
     select.setBounds(200,300,100,50);
     main.add(select);


     term=new JCheckBox("terms and Condition");
     term.setBounds(200,400,350,50);
     main.add(term);
      
     main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     main.setLocationRelativeTo(null);
     main.setVisible(true);
     
     
    }
    public static void main(String[] args) {
        new radioButtonExample();
    }
}
