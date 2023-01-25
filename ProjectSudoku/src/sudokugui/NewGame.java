package sudokugui;

import enums.CellStatus;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.sqrt;
import java.time.Duration;
import java.time.Instant;
import javax.swing.JPanel;
import javax.swing.Timer;
import sudokumaker.SudokuMaker;

/**
 *
 * @author Zed
 */
public class NewGame extends javax.swing.JPanel {

    GameSettings gameSettings = GameSettings.getInstance();
    SudokuMaker sudoku = new SudokuMaker(gameSettings.getGridSize(), gameSettings.getGameMode());
    int[][] solvedSudoku = sudoku.getSolvedSudoku();
    int[][] unsolvedSudoku = sudoku.getUnsolvedSudoku();
    boolean[][] isGiven = sudoku.getGiven();

    boolean start = false;
    boolean solved = false;

    public NewGame() {
        initComponents();
        init();
        if (gameSettings.getGridSize() == 9) {
            grid9x9();
        } else {
            grid4x4();
        }
    }

    private void init() {
        grid9x9Panel.setVisible(false);
        grid4x4Panel.setVisible(false);
    }

    private void grid4x4() {
        grid4x4Panel.setVisible(true);
        jTextField82.setText(String.valueOf(unsolvedSudoku[0][0]));
        jTextField83.setText(String.valueOf(unsolvedSudoku[0][1]));
        jTextField84.setText(String.valueOf(unsolvedSudoku[0][2]));
        jTextField85.setText(String.valueOf(unsolvedSudoku[0][3]));
        jTextField86.setText(String.valueOf(unsolvedSudoku[1][0]));
        jTextField87.setText(String.valueOf(unsolvedSudoku[1][1]));
        jTextField88.setText(String.valueOf(unsolvedSudoku[1][2]));
        jTextField89.setText(String.valueOf(unsolvedSudoku[1][3]));
        jTextField90.setText(String.valueOf(unsolvedSudoku[2][0]));
        jTextField91.setText(String.valueOf(unsolvedSudoku[2][1]));
        jTextField92.setText(String.valueOf(unsolvedSudoku[2][2]));
        jTextField93.setText(String.valueOf(unsolvedSudoku[2][3]));
        jTextField94.setText(String.valueOf(unsolvedSudoku[3][0]));
        jTextField95.setText(String.valueOf(unsolvedSudoku[3][1]));
        jTextField96.setText(String.valueOf(unsolvedSudoku[3][2]));
        jTextField97.setText(String.valueOf(unsolvedSudoku[3][3]));
    }

    private void grid9x9() {
        grid9x9Panel.setVisible(true);
        jTextField1.setText(String.valueOf(unsolvedSudoku[0][0]));
        jTextField2.setText(String.valueOf(unsolvedSudoku[0][1]));
        jTextField3.setText(String.valueOf(unsolvedSudoku[0][2]));
        jTextField4.setText(String.valueOf(unsolvedSudoku[0][3]));
        jTextField5.setText(String.valueOf(unsolvedSudoku[0][4]));
        jTextField6.setText(String.valueOf(unsolvedSudoku[0][5]));
        jTextField7.setText(String.valueOf(unsolvedSudoku[0][6]));
        jTextField8.setText(String.valueOf(unsolvedSudoku[0][7]));
        jTextField9.setText(String.valueOf(unsolvedSudoku[0][8]));
        jTextField10.setText(String.valueOf(unsolvedSudoku[1][0]));
        jTextField11.setText(String.valueOf(unsolvedSudoku[1][1]));
        jTextField12.setText(String.valueOf(unsolvedSudoku[1][2]));
        jTextField13.setText(String.valueOf(unsolvedSudoku[1][3]));
        jTextField14.setText(String.valueOf(unsolvedSudoku[1][4]));
        jTextField15.setText(String.valueOf(unsolvedSudoku[1][5]));
        jTextField16.setText(String.valueOf(unsolvedSudoku[1][6]));
        jTextField17.setText(String.valueOf(unsolvedSudoku[1][7]));
        jTextField18.setText(String.valueOf(unsolvedSudoku[1][8]));
        jTextField19.setText(String.valueOf(unsolvedSudoku[2][0]));
        jTextField20.setText(String.valueOf(unsolvedSudoku[2][1]));
        jTextField21.setText(String.valueOf(unsolvedSudoku[2][2]));
        jTextField22.setText(String.valueOf(unsolvedSudoku[2][3]));
        jTextField23.setText(String.valueOf(unsolvedSudoku[2][4]));
        jTextField24.setText(String.valueOf(unsolvedSudoku[2][5]));
        jTextField25.setText(String.valueOf(unsolvedSudoku[2][6]));
        jTextField26.setText(String.valueOf(unsolvedSudoku[2][7]));
        jTextField27.setText(String.valueOf(unsolvedSudoku[2][8]));
        jTextField28.setText(String.valueOf(unsolvedSudoku[3][0]));
        jTextField29.setText(String.valueOf(unsolvedSudoku[3][1]));
        jTextField30.setText(String.valueOf(unsolvedSudoku[3][2]));
        jTextField31.setText(String.valueOf(unsolvedSudoku[3][3]));
        jTextField32.setText(String.valueOf(unsolvedSudoku[3][4]));
        jTextField33.setText(String.valueOf(unsolvedSudoku[3][5]));
        jTextField34.setText(String.valueOf(unsolvedSudoku[3][6]));
        jTextField35.setText(String.valueOf(unsolvedSudoku[3][7]));
        jTextField36.setText(String.valueOf(unsolvedSudoku[3][8]));
        jTextField37.setText(String.valueOf(unsolvedSudoku[4][0]));
        jTextField38.setText(String.valueOf(unsolvedSudoku[4][1]));
        jTextField39.setText(String.valueOf(unsolvedSudoku[4][2]));
        jTextField40.setText(String.valueOf(unsolvedSudoku[4][3]));
        jTextField41.setText(String.valueOf(unsolvedSudoku[4][4]));
        jTextField42.setText(String.valueOf(unsolvedSudoku[4][5]));
        jTextField43.setText(String.valueOf(unsolvedSudoku[4][6]));
        jTextField44.setText(String.valueOf(unsolvedSudoku[4][7]));
        jTextField45.setText(String.valueOf(unsolvedSudoku[4][8]));
        jTextField46.setText(String.valueOf(unsolvedSudoku[5][0]));
        jTextField47.setText(String.valueOf(unsolvedSudoku[5][1]));
        jTextField48.setText(String.valueOf(unsolvedSudoku[5][2]));
        jTextField49.setText(String.valueOf(unsolvedSudoku[5][3]));
        jTextField50.setText(String.valueOf(unsolvedSudoku[5][4]));
        jTextField51.setText(String.valueOf(unsolvedSudoku[5][5]));
        jTextField52.setText(String.valueOf(unsolvedSudoku[5][6]));
        jTextField53.setText(String.valueOf(unsolvedSudoku[5][7]));
        jTextField54.setText(String.valueOf(unsolvedSudoku[5][8]));
        jTextField55.setText(String.valueOf(unsolvedSudoku[6][0]));
        jTextField56.setText(String.valueOf(unsolvedSudoku[6][1]));
        jTextField57.setText(String.valueOf(unsolvedSudoku[6][2]));
        jTextField58.setText(String.valueOf(unsolvedSudoku[6][3]));
        jTextField59.setText(String.valueOf(unsolvedSudoku[6][4]));
        jTextField60.setText(String.valueOf(unsolvedSudoku[6][5]));
        jTextField61.setText(String.valueOf(unsolvedSudoku[6][6]));
        jTextField62.setText(String.valueOf(unsolvedSudoku[6][7]));
        jTextField63.setText(String.valueOf(unsolvedSudoku[6][8]));
        jTextField64.setText(String.valueOf(unsolvedSudoku[7][0]));
        jTextField65.setText(String.valueOf(unsolvedSudoku[7][1]));
        jTextField66.setText(String.valueOf(unsolvedSudoku[7][2]));
        jTextField67.setText(String.valueOf(unsolvedSudoku[7][3]));
        jTextField68.setText(String.valueOf(unsolvedSudoku[7][4]));
        jTextField69.setText(String.valueOf(unsolvedSudoku[7][5]));
        jTextField70.setText(String.valueOf(unsolvedSudoku[7][6]));
        jTextField71.setText(String.valueOf(unsolvedSudoku[7][7]));
        jTextField72.setText(String.valueOf(unsolvedSudoku[7][8]));
        jTextField73.setText(String.valueOf(unsolvedSudoku[8][0]));
        jTextField74.setText(String.valueOf(unsolvedSudoku[8][1]));
        jTextField75.setText(String.valueOf(unsolvedSudoku[8][2]));
        jTextField76.setText(String.valueOf(unsolvedSudoku[8][3]));
        jTextField77.setText(String.valueOf(unsolvedSudoku[8][4]));
        jTextField78.setText(String.valueOf(unsolvedSudoku[8][5]));
        jTextField79.setText(String.valueOf(unsolvedSudoku[8][6]));
        jTextField80.setText(String.valueOf(unsolvedSudoku[8][7]));
        jTextField81.setText(String.valueOf(unsolvedSudoku[8][8]));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid9x9Panel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        grid4x4Panel = new javax.swing.JPanel();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jTextField86 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jTextField88 = new javax.swing.JTextField();
        jTextField89 = new javax.swing.JTextField();
        jTextField90 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jTextField93 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jTextField95 = new javax.swing.JTextField();
        jTextField96 = new javax.swing.JTextField();
        jTextField97 = new javax.swing.JTextField();
        prompt = new javax.swing.JLabel();
        secText = new javax.swing.JLabel();
        counterText = new javax.swing.JLabel();
        checkButton = new javax.swing.JLabel();
        quitGameButton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grid9x9Panel.setLayout(new java.awt.GridLayout(9, 9));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        grid9x9Panel.add(jTextField1);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        grid9x9Panel.add(jTextField2);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        grid9x9Panel.add(jTextField3);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        grid9x9Panel.add(jTextField4);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");
        grid9x9Panel.add(jTextField5);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        grid9x9Panel.add(jTextField6);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        grid9x9Panel.add(jTextField7);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        grid9x9Panel.add(jTextField8);

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        grid9x9Panel.add(jTextField9);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        grid9x9Panel.add(jTextField10);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("0");
        grid9x9Panel.add(jTextField11);

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("0");
        grid9x9Panel.add(jTextField12);

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("0");
        grid9x9Panel.add(jTextField13);

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("0");
        grid9x9Panel.add(jTextField14);

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("0");
        grid9x9Panel.add(jTextField15);

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("0");
        grid9x9Panel.add(jTextField16);

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("0");
        grid9x9Panel.add(jTextField17);

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("0");
        grid9x9Panel.add(jTextField18);

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("0");
        grid9x9Panel.add(jTextField19);

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("0");
        grid9x9Panel.add(jTextField20);

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("0");
        grid9x9Panel.add(jTextField21);

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("0");
        grid9x9Panel.add(jTextField22);

        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("0");
        grid9x9Panel.add(jTextField23);

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setText("0");
        grid9x9Panel.add(jTextField24);

        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setText("0");
        grid9x9Panel.add(jTextField25);

        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setText("0");
        grid9x9Panel.add(jTextField26);

        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setText("0");
        grid9x9Panel.add(jTextField27);

        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setText("0");
        grid9x9Panel.add(jTextField28);

        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setText("0");
        grid9x9Panel.add(jTextField29);

        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("0");
        grid9x9Panel.add(jTextField30);

        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("0");
        grid9x9Panel.add(jTextField31);

        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("0");
        grid9x9Panel.add(jTextField32);

        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setText("0");
        grid9x9Panel.add(jTextField33);

        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("0");
        grid9x9Panel.add(jTextField34);

        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("0");
        grid9x9Panel.add(jTextField35);

        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("0");
        grid9x9Panel.add(jTextField36);

        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("0");
        grid9x9Panel.add(jTextField37);

        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setText("0");
        grid9x9Panel.add(jTextField38);

        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setText("0");
        grid9x9Panel.add(jTextField39);

        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setText("0");
        grid9x9Panel.add(jTextField40);

        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setText("0");
        grid9x9Panel.add(jTextField41);

        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setText("0");
        grid9x9Panel.add(jTextField42);

        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setText("0");
        grid9x9Panel.add(jTextField43);

        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setText("0");
        grid9x9Panel.add(jTextField44);

        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setText("0");
        grid9x9Panel.add(jTextField45);

        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setText("0");
        grid9x9Panel.add(jTextField46);

        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setText("0");
        grid9x9Panel.add(jTextField47);

        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setText("0");
        grid9x9Panel.add(jTextField48);

        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setText("0");
        grid9x9Panel.add(jTextField49);

        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setText("0");
        grid9x9Panel.add(jTextField50);

        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setText("0");
        grid9x9Panel.add(jTextField51);

        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.setText("0");
        grid9x9Panel.add(jTextField52);

        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setText("0");
        grid9x9Panel.add(jTextField53);

        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.setText("0");
        grid9x9Panel.add(jTextField54);

        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setText("0");
        grid9x9Panel.add(jTextField55);

        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setText("0");
        grid9x9Panel.add(jTextField56);

        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.setText("0");
        grid9x9Panel.add(jTextField57);

        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setText("0");
        grid9x9Panel.add(jTextField58);

        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField59.setText("0");
        grid9x9Panel.add(jTextField59);

        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.setText("0");
        grid9x9Panel.add(jTextField60);

        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.setText("0");
        grid9x9Panel.add(jTextField61);

        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField62.setText("0");
        grid9x9Panel.add(jTextField62);

        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField63.setText("0");
        grid9x9Panel.add(jTextField63);

        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField64.setText("0");
        grid9x9Panel.add(jTextField64);

        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField65.setText("0");
        grid9x9Panel.add(jTextField65);

        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField66.setText("0");
        grid9x9Panel.add(jTextField66);

        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField67.setText("0");
        grid9x9Panel.add(jTextField67);

        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField68.setText("0");
        grid9x9Panel.add(jTextField68);

        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField69.setText("0");
        grid9x9Panel.add(jTextField69);

        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField70.setText("0");
        grid9x9Panel.add(jTextField70);

        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField71.setText("0");
        grid9x9Panel.add(jTextField71);

        jTextField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField72.setText("0");
        grid9x9Panel.add(jTextField72);

        jTextField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField73.setText("0");
        grid9x9Panel.add(jTextField73);

        jTextField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField74.setText("0");
        grid9x9Panel.add(jTextField74);

        jTextField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField75.setText("0");
        grid9x9Panel.add(jTextField75);

        jTextField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField76.setText("0");
        grid9x9Panel.add(jTextField76);

        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField77.setText("0");
        grid9x9Panel.add(jTextField77);

        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField78.setText("0");
        grid9x9Panel.add(jTextField78);

        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField79.setText("0");
        grid9x9Panel.add(jTextField79);

        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField80.setText("0");
        grid9x9Panel.add(jTextField80);

        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField81.setText("0");
        grid9x9Panel.add(jTextField81);

        add(grid9x9Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 324, 324));

        grid4x4Panel.setLayout(new java.awt.GridLayout(4, 4));

        jTextField82.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField82.setText("0");
        grid4x4Panel.add(jTextField82);

        jTextField83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField83.setText("0");
        grid4x4Panel.add(jTextField83);

        jTextField84.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField84.setText("0");
        grid4x4Panel.add(jTextField84);

        jTextField85.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField85.setText("0");
        grid4x4Panel.add(jTextField85);

        jTextField86.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField86.setText("0");
        grid4x4Panel.add(jTextField86);

        jTextField87.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField87.setText("0");
        grid4x4Panel.add(jTextField87);

        jTextField88.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField88.setText("0");
        grid4x4Panel.add(jTextField88);

        jTextField89.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField89.setText("0");
        grid4x4Panel.add(jTextField89);

        jTextField90.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField90.setText("0");
        grid4x4Panel.add(jTextField90);

        jTextField91.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField91.setText("0");
        grid4x4Panel.add(jTextField91);

        jTextField92.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField92.setText("0");
        grid4x4Panel.add(jTextField92);

        jTextField93.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField93.setText("0");
        grid4x4Panel.add(jTextField93);

        jTextField94.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField94.setText("0");
        grid4x4Panel.add(jTextField94);

        jTextField95.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField95.setText("0");
        grid4x4Panel.add(jTextField95);

        jTextField96.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField96.setText("0");
        grid4x4Panel.add(jTextField96);

        jTextField97.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField97.setText("0");
        grid4x4Panel.add(jTextField97);

        add(grid4x4Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 324, 324));

        prompt.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        prompt.setForeground(new java.awt.Color(51, 51, 51));
        prompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(prompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 488, 330, 70));

        secText.setFont(new java.awt.Font("Joystix Monospace", 0, 48)); // NOI18N
        secText.setForeground(new java.awt.Color(51, 51, 51));
        secText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secText.setText("sEC");
        add(secText, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 190, -1));

        counterText.setFont(new java.awt.Font("Joystix Monospace", 0, 48)); // NOI18N
        counterText.setForeground(new java.awt.Color(51, 51, 51));
        counterText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterText.setText("0");
        add(counterText, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 200, -1));

        checkButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        checkButton.setForeground(new java.awt.Color(102, 102, 102));
        checkButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkButton.setText("Check");
        checkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkButtonMouseExited(evt);
            }
        });
        add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 200, 40));

        quitGameButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        quitGameButton.setForeground(new java.awt.Color(102, 102, 102));
        quitGameButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quitGameButton.setText("Quit Game");
        quitGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitGameButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quitGameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quitGameButtonMouseExited(evt);
            }
        });
        add(quitGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 200, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
        });
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked

        if (gameSettings.getGridSize() == 9) {

            unsolvedSudoku[0][0] = Integer.parseInt(jTextField1.getText());
            unsolvedSudoku[0][1] = Integer.parseInt(jTextField2.getText());
            unsolvedSudoku[0][2] = Integer.parseInt(jTextField3.getText());
            unsolvedSudoku[0][3] = Integer.parseInt(jTextField4.getText());
            unsolvedSudoku[0][4] = Integer.parseInt(jTextField5.getText());
            unsolvedSudoku[0][5] = Integer.parseInt(jTextField6.getText());
            unsolvedSudoku[0][6] = Integer.parseInt(jTextField7.getText());
            unsolvedSudoku[0][7] = Integer.parseInt(jTextField8.getText());
            unsolvedSudoku[0][8] = Integer.parseInt(jTextField9.getText());
            unsolvedSudoku[1][0] = Integer.parseInt(jTextField10.getText());
            unsolvedSudoku[1][1] = Integer.parseInt(jTextField11.getText());
            unsolvedSudoku[1][2] = Integer.parseInt(jTextField12.getText());
            unsolvedSudoku[1][3] = Integer.parseInt(jTextField13.getText());
            unsolvedSudoku[1][4] = Integer.parseInt(jTextField14.getText());
            unsolvedSudoku[1][5] = Integer.parseInt(jTextField15.getText());
            unsolvedSudoku[1][6] = Integer.parseInt(jTextField16.getText());
            unsolvedSudoku[1][7] = Integer.parseInt(jTextField17.getText());
            unsolvedSudoku[1][8] = Integer.parseInt(jTextField18.getText());
            unsolvedSudoku[2][0] = Integer.parseInt(jTextField19.getText());
            unsolvedSudoku[2][1] = Integer.parseInt(jTextField20.getText());
            unsolvedSudoku[2][2] = Integer.parseInt(jTextField21.getText());
            unsolvedSudoku[2][3] = Integer.parseInt(jTextField22.getText());
            unsolvedSudoku[2][4] = Integer.parseInt(jTextField23.getText());
            unsolvedSudoku[2][5] = Integer.parseInt(jTextField24.getText());
            unsolvedSudoku[2][6] = Integer.parseInt(jTextField25.getText());
            unsolvedSudoku[2][7] = Integer.parseInt(jTextField26.getText());
            unsolvedSudoku[2][8] = Integer.parseInt(jTextField27.getText());
            unsolvedSudoku[3][0] = Integer.parseInt(jTextField28.getText());
            unsolvedSudoku[3][1] = Integer.parseInt(jTextField29.getText());
            unsolvedSudoku[3][2] = Integer.parseInt(jTextField30.getText());
            unsolvedSudoku[3][3] = Integer.parseInt(jTextField31.getText());
            unsolvedSudoku[3][4] = Integer.parseInt(jTextField32.getText());
            unsolvedSudoku[3][5] = Integer.parseInt(jTextField33.getText());
            unsolvedSudoku[3][6] = Integer.parseInt(jTextField34.getText());
            unsolvedSudoku[3][7] = Integer.parseInt(jTextField35.getText());
            unsolvedSudoku[3][8] = Integer.parseInt(jTextField36.getText());
            unsolvedSudoku[4][0] = Integer.parseInt(jTextField37.getText());
            unsolvedSudoku[4][1] = Integer.parseInt(jTextField38.getText());
            unsolvedSudoku[4][2] = Integer.parseInt(jTextField39.getText());
            unsolvedSudoku[4][3] = Integer.parseInt(jTextField40.getText());
            unsolvedSudoku[4][4] = Integer.parseInt(jTextField41.getText());
            unsolvedSudoku[4][5] = Integer.parseInt(jTextField42.getText());
            unsolvedSudoku[4][6] = Integer.parseInt(jTextField43.getText());
            unsolvedSudoku[4][7] = Integer.parseInt(jTextField44.getText());
            unsolvedSudoku[4][8] = Integer.parseInt(jTextField45.getText());
            unsolvedSudoku[5][0] = Integer.parseInt(jTextField46.getText());
            unsolvedSudoku[5][1] = Integer.parseInt(jTextField47.getText());
            unsolvedSudoku[5][2] = Integer.parseInt(jTextField48.getText());
            unsolvedSudoku[5][3] = Integer.parseInt(jTextField49.getText());
            unsolvedSudoku[5][4] = Integer.parseInt(jTextField50.getText());
            unsolvedSudoku[5][5] = Integer.parseInt(jTextField51.getText());
            unsolvedSudoku[5][6] = Integer.parseInt(jTextField52.getText());
            unsolvedSudoku[5][7] = Integer.parseInt(jTextField53.getText());
            unsolvedSudoku[5][8] = Integer.parseInt(jTextField54.getText());
            unsolvedSudoku[6][0] = Integer.parseInt(jTextField55.getText());
            unsolvedSudoku[6][1] = Integer.parseInt(jTextField56.getText());
            unsolvedSudoku[6][2] = Integer.parseInt(jTextField57.getText());
            unsolvedSudoku[6][3] = Integer.parseInt(jTextField58.getText());
            unsolvedSudoku[6][4] = Integer.parseInt(jTextField59.getText());
            unsolvedSudoku[6][5] = Integer.parseInt(jTextField60.getText());
            unsolvedSudoku[6][6] = Integer.parseInt(jTextField61.getText());
            unsolvedSudoku[6][7] = Integer.parseInt(jTextField62.getText());
            unsolvedSudoku[6][8] = Integer.parseInt(jTextField63.getText());
            unsolvedSudoku[7][0] = Integer.parseInt(jTextField64.getText());
            unsolvedSudoku[7][1] = Integer.parseInt(jTextField65.getText());
            unsolvedSudoku[7][2] = Integer.parseInt(jTextField66.getText());
            unsolvedSudoku[7][3] = Integer.parseInt(jTextField67.getText());
            unsolvedSudoku[7][4] = Integer.parseInt(jTextField68.getText());
            unsolvedSudoku[7][5] = Integer.parseInt(jTextField69.getText());
            unsolvedSudoku[7][6] = Integer.parseInt(jTextField70.getText());
            unsolvedSudoku[7][7] = Integer.parseInt(jTextField71.getText());
            unsolvedSudoku[7][8] = Integer.parseInt(jTextField72.getText());
            unsolvedSudoku[8][0] = Integer.parseInt(jTextField73.getText());
            unsolvedSudoku[8][1] = Integer.parseInt(jTextField74.getText());
            unsolvedSudoku[8][2] = Integer.parseInt(jTextField75.getText());
            unsolvedSudoku[8][3] = Integer.parseInt(jTextField76.getText());
            unsolvedSudoku[8][4] = Integer.parseInt(jTextField77.getText());
            unsolvedSudoku[8][5] = Integer.parseInt(jTextField78.getText());
            unsolvedSudoku[8][6] = Integer.parseInt(jTextField79.getText());
            unsolvedSudoku[8][7] = Integer.parseInt(jTextField80.getText());
            unsolvedSudoku[8][8] = Integer.parseInt(jTextField81.getText());

        } else {
            unsolvedSudoku[0][0] = Integer.parseInt(jTextField82.getText());
            unsolvedSudoku[0][1] = Integer.parseInt(jTextField83.getText());
            unsolvedSudoku[0][2] = Integer.parseInt(jTextField84.getText());
            unsolvedSudoku[0][3] = Integer.parseInt(jTextField85.getText());
            unsolvedSudoku[1][0] = Integer.parseInt(jTextField86.getText());
            unsolvedSudoku[1][1] = Integer.parseInt(jTextField87.getText());
            unsolvedSudoku[1][2] = Integer.parseInt(jTextField88.getText());
            unsolvedSudoku[1][3] = Integer.parseInt(jTextField89.getText());
            unsolvedSudoku[2][0] = Integer.parseInt(jTextField90.getText());
            unsolvedSudoku[2][1] = Integer.parseInt(jTextField91.getText());
            unsolvedSudoku[2][2] = Integer.parseInt(jTextField92.getText());
            unsolvedSudoku[2][3] = Integer.parseInt(jTextField93.getText());
            unsolvedSudoku[3][0] = Integer.parseInt(jTextField94.getText());
            unsolvedSudoku[3][1] = Integer.parseInt(jTextField95.getText());
            unsolvedSudoku[3][2] = Integer.parseInt(jTextField96.getText());
            unsolvedSudoku[3][3] = Integer.parseInt(jTextField97.getText());
        }

        prompt.setText("Solved!");

        for (int row = 0; row < gameSettings.getGridSize(); ++row) {
            for (int col = 0; col < gameSettings.getGridSize(); ++col) {
                if (solvedSudoku[row][col] != unsolvedSudoku[row][col]) {
                    prompt.setText("Unsolved!");
                }
            }
        }

    }//GEN-LAST:event_checkButtonMouseClicked

    private void checkButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseEntered
        checkButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        checkButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_checkButtonMouseEntered

    private void checkButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseExited
        checkButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        checkButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_checkButtonMouseExited

    private void quitGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitGameButtonMouseClicked
        PanelSwap.getInstance().showMainMenu();
    }//GEN-LAST:event_quitGameButtonMouseClicked

    private void quitGameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitGameButtonMouseEntered
        quitGameButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        quitGameButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_quitGameButtonMouseEntered

    private void quitGameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitGameButtonMouseExited
        quitGameButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        quitGameButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_quitGameButtonMouseExited

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
        try {
            if (!start) {
                start = true;

                Instant start = Instant.now();
                new Timer(1000, (ActionEvent e) -> {
                    counterText.setText(Duration.between(start, Instant.now()).getSeconds() + "");
                }).start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (!start) {
            start = true;

            Instant start = Instant.now();
            new Timer(1000, (ActionEvent e) -> {
                counterText.setText(Duration.between(start, Instant.now()).getSeconds() + "");
            }).start();

        }

    }//GEN-LAST:event_backgroundMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel checkButton;
    private javax.swing.JLabel counterText;
    private javax.swing.JPanel grid4x4Panel;
    private javax.swing.JPanel grid9x9Panel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JLabel prompt;
    private javax.swing.JLabel quitGameButton;
    private javax.swing.JLabel secText;
    // End of variables declaration//GEN-END:variables
}

class GameBoardPanel extends JPanel {

    GameSettings gameSettings = GameSettings.getInstance();
    SudokuMaker sudoku = new SudokuMaker(gameSettings.getGridSize(), gameSettings.getGameMode());
    int[][] solvedSudoku = sudoku.getSolvedSudoku();
    int[][] unsolvedSudoku = sudoku.getUnsolvedSudoku();
    boolean[][] isGiven = sudoku.getGiven();

    private static final long serialVersionUID = 1L;  // to prevent serial warning

    public final int GRID_SIZE = gameSettings.getGridSize();
    public final int SUBGRID_SIZE = (int) sqrt(GRID_SIZE);

    public static final int BOARD_WIDTH = 324;
    public static final int BOARD_HEIGHT = 324;
    public final int CELL_SIZE = BOARD_WIDTH / GRID_SIZE;

    private final Cell[][] cells = new Cell[GRID_SIZE][GRID_SIZE];

    public GameBoardPanel() {
        super.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));  // JPanel

        for (int row = 0; row < GRID_SIZE; ++row) {
            for (int col = 0; col < GRID_SIZE; ++col) {
                cells[row][col] = new Cell(row, col);
                super.add(cells[row][col]);
            }
        }

        CellInputListener listener = new CellInputListener();

        for (int row = 0; row < GRID_SIZE; ++row) {
            for (int col = 0; col < GRID_SIZE; ++col) {
                if (cells[row][col].isEditable()) {
                    cells[row][col].addActionListener(listener);
                }
            }
        }
        super.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
    }

    public void newGame() {
        for (int row = 0; row < GRID_SIZE; ++row) {
            for (int col = 0; col < GRID_SIZE; ++col) {
                cells[row][col].newGame(solvedSudoku[row][col], isGiven[row][col]);
            }
        }
    }

    public boolean isSolved() {
        for (int row = 0; row < GRID_SIZE; ++row) {
            for (int col = 0; col < GRID_SIZE; ++col) {
                if (cells[row][col].status == CellStatus.TO_GUESS || cells[row][col].status == CellStatus.WRONG_GUESS) {
                    return false;
                }
            }
        }
        return true;
    }

    private class CellInputListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Cell sourceCell = (Cell) e.getSource();

            int numberIn = Integer.parseInt(sourceCell.getText());

            if (numberIn == sourceCell.number) {
                sourceCell.status = CellStatus.CORRECT_GUESS;
            } else {
                sourceCell.status = CellStatus.WRONG_GUESS;
            }
            sourceCell.paint();

        }
    }
}
