package sudokugui;

import enums.CellStatus;
import java.awt.*;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Cell extends JTextField {

    private static final long serialVersionUID = 1L;  // to prevent serial warning

    public static final Color BG_GIVEN = new Color(240, 240, 240); // RGB
    public static final Color FG_GIVEN = Color.BLACK;
    public static final Color FG_NOT_GIVEN = Color.GRAY;
    public static final Color BG_TO_GUESS = Color.YELLOW;
    public static final Color BG_CORRECT_GUESS = new Color(0, 216, 0);
    public static final Color BG_WRONG_GUESS = new Color(216, 0, 0);
    public static final Font FONT_NUMBERS = new Font("OCR A Extended", Font.PLAIN, 28);

    int row, col;
    int number;
    CellStatus status;

    public Cell(int row, int col) {
        super();
        this.row = row;
        this.col = col;

        super.setHorizontalAlignment(JTextField.CENTER);
        super.setFont(FONT_NUMBERS);
    }

    public void newGame(int number, boolean isGiven) {
        this.number = number;
        status = isGiven ? CellStatus.GIVEN : CellStatus.TO_GUESS;
        paint();
    }

    public void paint() {
        if (null != status) {
            switch (status) {
                case GIVEN -> {
                    super.setText(number + "");
                    super.setEditable(false);
                    super.setBackground(BG_GIVEN);
                    super.setForeground(FG_GIVEN);
                }
                case TO_GUESS -> {
                    super.setText("");
                    super.setEditable(true);
                    super.setBackground(BG_TO_GUESS);
                    super.setForeground(FG_NOT_GIVEN);
                }
                case CORRECT_GUESS ->
                    super.setBackground(BG_CORRECT_GUESS);
                case WRONG_GUESS ->
                    super.setBackground(BG_WRONG_GUESS);
                default -> {
                }
            }
        }
    }

}
