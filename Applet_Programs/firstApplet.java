import java.applet.*;
import java.awt.*;
public class firstApplet extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawString("hello World", 100,100);
    }
}
