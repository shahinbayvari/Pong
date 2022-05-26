import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Board extends JPanel {
    public Board() {

    }
    public void paint(Graphics g) {
        // paddle 1
        g.setColor(Color.BLACK);
        g.fillRect(950, 450, 10, 100);

        // paddle 2
        g.setColor(Color.BLACK);
        g.fillRect(50, 450, 10, 100);

        // ball
        g.setColor(Color.BLACK);
        g.fillRect(490, 490, 20, 20);
    }
}
