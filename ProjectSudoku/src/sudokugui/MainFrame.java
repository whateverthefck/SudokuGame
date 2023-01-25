
package sudokugui;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Zed
 */
public class MainFrame {
    
    private static final JFrame frame = new JFrame ("Sudoku - Advanced Game");
    
    public static void createFrame(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent contentPane = PanelSwap.getInstance();
        
        contentPane.setOpaque(true);
        frame.setContentPane(contentPane);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void disposeFrame(){
        frame.dispose();
    }
    
}
