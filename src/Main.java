import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    private static void init() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        BufferedImage paddle;
        JLabel paddleLabel;
        try {
            paddle = ImageIO.read(new File("src/paddle.png"));
            paddleLabel = new JLabel(new ImageIcon(paddle));
            panel.add(paddleLabel);
        } catch (IOException e) {
            // don't know what to put here
        }
        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        init();
    }
}
