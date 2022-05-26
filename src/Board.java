import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public Board() {

    }
    public void paint(Graphics g) {
        // paddle
        g.setColor(Color.BLACK);
        g.fillRect(310, 550, 100, 8);
    }
}
