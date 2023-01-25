package sudokumaker;

import enums.GameModes;

/**
 *
 * @author Zed
 */
public class SudokuMaker {

    int[] matrix[];
    int[] matrix1[];
    int size;
    int sqrtSize;
    int missingDigits;

    public SudokuMaker(int gridSize, GameModes gameMode) {
        this.size = gridSize;

        setMissingDigits(gameMode);

        Double SRNd = Math.sqrt(size);
        sqrtSize = SRNd.intValue();

        matrix = new int[size][size];
        
        matrix1 = new int[size][size];
    }

    private void setMissingDigits(GameModes gameMode) {
        switch (gameMode) {
            case EASY ->
                missingDigits = (size * size) / 5;
            case NORMAL ->
                missingDigits = (size * size) / 4;
            case HARD ->
                missingDigits = (size * size) / 3;
            case EXTREME ->
                missingDigits = (size * size) / 2;
        }
    }

    public void fillValues() {

        fillDiagonal();
        fillRemaining(0, sqrtSize);
    }

    void fillDiagonal() {

        for (int i = 0; i < size; i = i + sqrtSize) {
            fillBox(i, i);
        }
    }

    boolean unUsedInBox(int rowStart, int colStart, int num) {
        for (int i = 0; i < sqrtSize; i++) {
            for (int j = 0; j < sqrtSize; j++) {
                if (matrix[rowStart + i][colStart + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    void fillBox(int row, int col) {
        int num;
        for (int i = 0; i < sqrtSize; i++) {
            for (int j = 0; j < sqrtSize; j++) {
                do {
                    num = randomGenerator(size);
                } while (!unUsedInBox(row, col, num));

                matrix[row + i][col + j] = num;
            }
        }
    }

    int randomGenerator(int num) {
        return (int) Math.floor((Math.random() * num + 1));
    }

    boolean CheckIfSafe(int i, int j, int num) {
        return (unUsedInRow(i, num)
                && unUsedInCol(j, num)
                && unUsedInBox(i - i % sqrtSize, j - j % sqrtSize, num));
    }

    boolean unUsedInRow(int i, int num) {
        for (int j = 0; j < size; j++) {
            if (matrix[i][j] == num) {
                return false;
            }
        }
        return true;
    }

    boolean unUsedInCol(int j, int num) {
        for (int i = 0; i < size; i++) {
            if (matrix[i][j] == num) {
                return false;
            }
        }
        return true;
    }

    boolean fillRemaining(int i, int j) {
        //  System.out.println(i+" "+j);
        if (j >= size && i < size - 1) {
            i = i + 1;
            j = 0;
        }
        if (i >= size && j >= size) {
            return true;
        }

        if (i < sqrtSize) {
            if (j < sqrtSize) {
                j = sqrtSize;
            }
        } else if (i < size - sqrtSize) {
            if (j == (int) (i / sqrtSize) * sqrtSize) {
                j = j + sqrtSize;
            }
        } else {
            if (j == size - sqrtSize) {
                i = i + 1;
                j = 0;
                if (i >= size) {
                    return true;
                }
            }
        }

        for (int num = 1; num <= size; num++) {
            if (CheckIfSafe(i, j, num)) {
                matrix[i][j] = num;
                if (fillRemaining(i, j + 1)) {
                    return true;
                }

                matrix[i][j] = 0;
            }
        }
        return false;
    }

    public void removeKDigits() {
        int count = missingDigits;
        while (count != 0) {
            int cellId = randomGenerator(size * size) - 1;
            int i = (cellId / size);
            int j = cellId % size;
            if (j != 0) {
                j = j - 1;
            }

            if (matrix[i][j] != 0) {
                count--;
                matrix[i][j] = 0;
            }
        }
    }

    public int[][] getSolvedSudoku() {
        while (matrix[0][3] == 0) {
            fillValues();
        }
        
        
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = matrix[i][j];
            }
            
        }
        
        
        return matrix1;
    }

    public int[][] getUnsolvedSudoku() {
        removeKDigits();
        return matrix;
    }

    public boolean[][] getGiven() {
        
        boolean[][] isGiven = new boolean[size][size];
        
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                isGiven[row][col] = matrix[row][col] != 0;
            }
        }
        return isGiven;
    }

    // Print sudoku
    public void printSudoku() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
