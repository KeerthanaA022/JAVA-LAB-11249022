import java.applet.Applet;
import java.awt.*;

public class PaletteApplet extends Applet {
    public void paint(Graphics g) {
        Color[] colors = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.ORANGE,
            Color.PINK
        };

        int x = 30;

        for (int i = 0; i < colors.length; i++) {
            g.setColor(colors[i]);
            g.fillRect(x, 50, 50, 50);
            x = x + 60;
        }

        g.setColor(Color.BLACK);
        g.drawString("Java Color Palette", 100, 130);
    }
}
