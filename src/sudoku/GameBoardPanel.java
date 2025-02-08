package sudoku;

import javax.swing.JPanel;
import java.awt.GridLayout;

public class GameBoardPanel extends JPanel {
    private Cell[][] cells;

    public GameBoardPanel() {
        super(new GridLayout(SudokuConstants.GRID_SIZE, SudokuConstants.GRID_SIZE));
        cells = new Cell[SudokuConstants.GRID_SIZE][SudokuConstants.GRID_SIZE];
        for (int row = 0; row < SudokuConstants.GRID_SIZE; row++) {
            for (int col = 0; col < SudokuConstants.GRID_SIZE; col++) {
                cells[row][col] = new Cell(row, col);
                this.add(cells[row][col]);
            }
        }
    }

    public void newGame() {
        // Initialize the game board with a new puzzle
    }

    public void paint() {
        // Custom painting logic if needed
    }
}