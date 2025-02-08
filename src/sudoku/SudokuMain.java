package sudoku;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

public class SudokuMain extends JFrame {
    private GameBoardPanel board;

    public SudokuMain() {
        super("Sudoku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        board = new GameBoardPanel();
        add(board, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SudokuMain();
        });
    }
}