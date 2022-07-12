import java.awt.*;
import java.applet.*;
public class appletHtml extends Applet {
    public void paint(Graphics g){
        g.drawLine(100,10,250, 150);
        g.drawLine(100,150,150,10);
    }
    public void static void main(String[] args) {}
} 
/*<applet code = "appletHtml" width = "420" height = "320"></applet>*/
