package sudoku;

import javax.swing.JTextField;

public class Cell extends JTextField {
    private int row;
    private int col;
    private int number;
    private CellStatus status;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        super.setHorizontalAlignment(JTextField.CENTER);
    }

    public void setNumber(int number, boolean isGiven){
        this.number = number;
        this.status = isGiven ? CellStatus.GIVEN : CellStatus.TO_GUESS;
        super.setText(number == 0 ? "" : String.valueOf(number));
        super.setEditable(!isGiven);
    }
}
