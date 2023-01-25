/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokumaker;

import enums.GameModes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
     @Test
     public void testSudoku() {
         var obj = new SudokuMaker(9, GameModes.EASY);
         assertEquals(9, (obj.getSolvedSudoku()[0]).length);
     }
}
