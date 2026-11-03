import java.applet.Applet;
import java.awt.Graphics;

public class BasicApplet extends Applet {

    public void init() {
        System.out.println("Applet Initialized");
    }

    public void start() {
        System.out.println("Applet Started");
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet", 50, 50);
        g.drawString("This is a Basic Applet Program", 50, 80);
    }

    public void stop() {
        System.out.println("Applet Stopped");
    }

    public void destroy() {
        System.out.println("Applet Destroyed");
    }
}
