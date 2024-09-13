import java.awt.Color;

import javax.swing.*;
public class swingExample {
    JFrame main;
    swingExample(){
      main=new JFrame("main");
      main.setSize(500,500);
      main.setVisible(true);
      main.setLocationRelativeTo(null);
      main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new swingExample();
    }
    
}
