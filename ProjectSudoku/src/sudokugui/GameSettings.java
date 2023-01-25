package sudokugui;

import enums.GameModes;

/**
 *
 * @author Zed
 */
public class GameSettings {

    private final static GameSettings instance = new GameSettings();

    private GameModes gameMode = GameModes.NORMAL;
    private int gridSize = 9;

    private GameSettings() {

    }
    public static GameSettings getInstance(){
        return instance;
    }
    public GameModes getGameMode() {
        return gameMode;
    }
    public void setGameMode(GameModes gameMode) {
        this.gameMode = gameMode;
    }
    public int getGridSize() {
        return gridSize;
    }
    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }
}
