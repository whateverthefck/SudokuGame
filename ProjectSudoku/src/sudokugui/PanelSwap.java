package sudokugui;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Zed
 */
public class PanelSwap extends JPanel {

    private static final PanelSwap instance = new PanelSwap();
    
    private JPanel mainMenu;
    private JPanel options;
    private JPanel newGame;

    private PanelSwap() {
        super(new BorderLayout());
        showMainMenu();
    }

    public static PanelSwap getInstance() {
        return instance;
    }

    public final void showMainMenu(){
        removeAll();
        mainMenu = new MainMenu();
        add(mainMenu);
        
        repaint();
        revalidate();
    }
    
    public final void showNewGame(){
        removeAll();
        newGame = new NewGame();
        add(newGame);
        
        repaint();
        revalidate();
    }
    
    public final void showOptions(){
        removeAll();
        options = new Options();
        add(options);
        
        repaint();
        revalidate();
    }
}
