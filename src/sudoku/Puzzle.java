package sudoku;

public class Puzzle {
    private int[][] numbers;
    private boolean[][] isGiven;

    public Puzzle() {
        numbers = new int[SudokuConstants.GRID_SIZE][SudokuConstants.GRID_SIZE];
        isGiven = new boolean[SudokuConstants.GRID_SIZE][SudokuConstants.GRID_SIZE];
    }

    public void newPuzzle(int cellsToGuess) {
        // Logic to generate a new puzzle
    }

    public int[][] getNumbers() {
        return numbers;
    }

    public boolean[][] getIsGiven() {
        return isGiven;
    }
}