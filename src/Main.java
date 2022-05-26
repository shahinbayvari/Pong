import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame board = new Board();
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board.setLocationRelativeTo(null);
        board.setResizable(false);
        board.pack();
    }
}
