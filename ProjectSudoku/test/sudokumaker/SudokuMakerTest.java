/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokumaker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class SudokuMakerTest {
    
    public SudokuMakerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of fillValues method, of class SudokuMaker.
     */
    @Test
    public void testFillValues() {
        System.out.println("fillValues");
        SudokuMaker instance = null;
        instance.fillValues();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillDiagonal method, of class SudokuMaker.
     */
    @Test
    public void testFillDiagonal() {
        System.out.println("fillDiagonal");
        SudokuMaker instance = null;
        instance.fillDiagonal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unUsedInBox method, of class SudokuMaker.
     */
    @Test
    public void testUnUsedInBox() {
        System.out.println("unUsedInBox");
        int rowStart = 0;
        int colStart = 0;
        int num = 0;
        SudokuMaker instance = null;
        boolean expResult = false;
        boolean result = instance.unUsedInBox(rowStart, colStart, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillBox method, of class SudokuMaker.
     */
    @Test
    public void testFillBox() {
        System.out.println("fillBox");
        int row = 0;
        int col = 0;
        SudokuMaker instance = null;
        instance.fillBox(row, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randomGenerator method, of class SudokuMaker.
     */
    @Test
    public void testRandomGenerator() {
        System.out.println("randomGenerator");
        int num = 0;
        SudokuMaker instance = null;
        int expResult = 0;
        int result = instance.randomGenerator(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckIfSafe method, of class SudokuMaker.
     */
    @Test
    public void testCheckIfSafe() {
        System.out.println("CheckIfSafe");
        int i = 0;
        int j = 0;
        int num = 0;
        SudokuMaker instance = null;
        boolean expResult = false;
        boolean result = instance.CheckIfSafe(i, j, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unUsedInRow method, of class SudokuMaker.
     */
    @Test
    public void testUnUsedInRow() {
        System.out.println("unUsedInRow");
        int i = 0;
        int num = 0;
        SudokuMaker instance = null;
        boolean expResult = false;
        boolean result = instance.unUsedInRow(i, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unUsedInCol method, of class SudokuMaker.
     */
    @Test
    public void testUnUsedInCol() {
        System.out.println("unUsedInCol");
        int j = 0;
        int num = 0;
        SudokuMaker instance = null;
        boolean expResult = false;
        boolean result = instance.unUsedInCol(j, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillRemaining method, of class SudokuMaker.
     */
    @Test
    public void testFillRemaining() {
        System.out.println("fillRemaining");
        int i = 0;
        int j = 0;
        SudokuMaker instance = null;
        boolean expResult = false;
        boolean result = instance.fillRemaining(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeKDigits method, of class SudokuMaker.
     */
    @Test
    public void testRemoveKDigits() {
        System.out.println("removeKDigits");
        SudokuMaker instance = null;
        instance.removeKDigits();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolvedSudoku method, of class SudokuMaker.
     */
    @Test
    public void testGetSolvedSudoku() {
        System.out.println("getSolvedSudoku");
        SudokuMaker instance = null;
        int[][] expResult = null;
        int[][] result = instance.getSolvedSudoku();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnsolvedSudoku method, of class SudokuMaker.
     */
    @Test
    public void testGetUnsolvedSudoku() {
        System.out.println("getUnsolvedSudoku");
        SudokuMaker instance = null;
        int[][] expResult = null;
        int[][] result = instance.getUnsolvedSudoku();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSudoku method, of class SudokuMaker.
     */
    @Test
    public void testPrintSudoku() {
        System.out.println("printSudoku");
        SudokuMaker instance = null;
        instance.printSudoku();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
