import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to PacMan!");

        // tile map: 19(columns)x21(rows)
        // tile size = 32pix X 32pix
        // width - 19c x 32 ; height - 21r x 32
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        // create window
        JFrame frame = new JFrame("Pac Man");
        // frame.setVisible(true);
        // frame.setSize(boardWidth, boardHeight);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // want to make sure user cannot change the size of the window
        frame.setResizable(false);
        // game must terminate when player clicks "X" button on window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);

    }
}
