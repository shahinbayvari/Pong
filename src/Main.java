import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    private static void init() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        Paddle paddle = new Paddle();

        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        init();
    }
}
