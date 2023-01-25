
package sudokugui;

import enums.GameModes;

/**
 *
 * @author Zed
 */
public class Options extends javax.swing.JPanel {

    GameSettings gameSettings = GameSettings.getInstance();
    GameModes tempGameMode = gameSettings.getGameMode();
    int tempGridSize = gameSettings.getGridSize();
    
    public Options() {
        initComponents();
        init();
    }

    private void init(){
        selectedGrid4x4.setVisible(false);
        selectedGrid9x9.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedGrid9x9 = new javax.swing.JLabel();
        txtGrid9x9 = new javax.swing.JLabel();
        imgGrid9x9 = new javax.swing.JLabel();
        selectedGrid4x4 = new javax.swing.JLabel();
        txtGrid4x4 = new javax.swing.JLabel();
        imgGrid4x4 = new javax.swing.JLabel();
        normalButton = new javax.swing.JLabel();
        hardButton = new javax.swing.JLabel();
        extremeButton = new javax.swing.JLabel();
        easyButton = new javax.swing.JLabel();
        gameModeTxt = new javax.swing.JLabel();
        saveButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectedGrid9x9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grid_selected.png"))); // NOI18N
        add(selectedGrid9x9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        txtGrid9x9.setFont(new java.awt.Font("Joystix Monospace", 0, 18)); // NOI18N
        txtGrid9x9.setForeground(new java.awt.Color(51, 51, 51));
        txtGrid9x9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGrid9x9.setText("9x9 Grid");
        add(txtGrid9x9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 200, 30));

        imgGrid9x9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grid9x9.jpg"))); // NOI18N
        imgGrid9x9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGrid9x9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgGrid9x9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgGrid9x9MouseExited(evt);
            }
        });
        add(imgGrid9x9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        selectedGrid4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grid_selected.png"))); // NOI18N
        add(selectedGrid4x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        txtGrid4x4.setFont(new java.awt.Font("Joystix Monospace", 0, 18)); // NOI18N
        txtGrid4x4.setForeground(new java.awt.Color(51, 51, 51));
        txtGrid4x4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGrid4x4.setText("4x4 Grid");
        add(txtGrid4x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 200, 30));

        imgGrid4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grid4x4.jpg"))); // NOI18N
        imgGrid4x4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGrid4x4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgGrid4x4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgGrid4x4MouseExited(evt);
            }
        });
        add(imgGrid4x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        normalButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        normalButton.setForeground(new java.awt.Color(102, 102, 102));
        normalButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normalButton.setText("Normal");
        normalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                normalButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                normalButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                normalButtonMouseExited(evt);
            }
        });
        add(normalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 140, 40));

        hardButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        hardButton.setForeground(new java.awt.Color(102, 102, 102));
        hardButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hardButton.setText("Hard");
        hardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hardButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hardButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hardButtonMouseExited(evt);
            }
        });
        add(hardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 140, 40));

        extremeButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        extremeButton.setForeground(new java.awt.Color(102, 102, 102));
        extremeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extremeButton.setText("Extreme");
        extremeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extremeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extremeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                extremeButtonMouseExited(evt);
            }
        });
        add(extremeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, 40));

        easyButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        easyButton.setForeground(new java.awt.Color(102, 102, 102));
        easyButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        easyButton.setText("Easy");
        easyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                easyButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                easyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                easyButtonMouseExited(evt);
            }
        });
        add(easyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 140, 40));

        gameModeTxt.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        gameModeTxt.setForeground(new java.awt.Color(51, 51, 51));
        gameModeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameModeTxt.setText("Game Mode:");
        add(gameModeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, 40));

        saveButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(102, 102, 102));
        saveButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 140, 40));

        backButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(102, 102, 102));
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 140, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void easyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyButtonMouseClicked
        uncheckGameModes();
        easyButton.setForeground(new java.awt.Color(51, 51, 51));
        tempGameMode = GameModes.EASY;
    }//GEN-LAST:event_easyButtonMouseClicked

    private void easyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyButtonMouseEntered
        easyButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        if(tempGameMode != GameModes.EASY)
            easyButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_easyButtonMouseEntered

    private void easyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyButtonMouseExited
        easyButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        if(tempGameMode != GameModes.EASY)
            easyButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_easyButtonMouseExited

    private void normalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalButtonMouseClicked
        uncheckGameModes();
        normalButton.setForeground(new java.awt.Color(51, 51, 51));
        tempGameMode = GameModes.NORMAL;
    }//GEN-LAST:event_normalButtonMouseClicked

    private void normalButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalButtonMouseEntered
        normalButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        if(tempGameMode != GameModes.NORMAL)
            normalButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_normalButtonMouseEntered

    private void normalButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalButtonMouseExited
        normalButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        if(tempGameMode != GameModes.NORMAL)
            normalButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_normalButtonMouseExited

    private void hardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardButtonMouseClicked
        uncheckGameModes();
        hardButton.setForeground(new java.awt.Color(51, 51, 51));
        tempGameMode = GameModes.HARD;
    }//GEN-LAST:event_hardButtonMouseClicked

    private void hardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardButtonMouseEntered
        hardButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        if(tempGameMode != GameModes.HARD)    
            hardButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_hardButtonMouseEntered

    private void hardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardButtonMouseExited
        hardButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        if(tempGameMode != GameModes.HARD)
            hardButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_hardButtonMouseExited

    private void extremeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extremeButtonMouseClicked
        uncheckGameModes();
        extremeButton.setForeground(new java.awt.Color(51, 51, 51));
        tempGameMode = GameModes.EXTREME;
    }//GEN-LAST:event_extremeButtonMouseClicked

    private void extremeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extremeButtonMouseEntered
        extremeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        if(tempGameMode != GameModes.EXTREME)
            extremeButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_extremeButtonMouseEntered

    private void extremeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extremeButtonMouseExited
        extremeButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        if(tempGameMode != GameModes.EXTREME)
            extremeButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_extremeButtonMouseExited

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        gameSettings.setGameMode(tempGameMode);
        gameSettings.setGridSize(tempGridSize);
    }//GEN-LAST:event_saveButtonMouseClicked

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        saveButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        saveButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        saveButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        saveButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_saveButtonMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        PanelSwap.getInstance().showMainMenu();
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        backButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_backButtonMouseExited

    private void imgGrid9x9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrid9x9MouseEntered
        txtGrid9x9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    }//GEN-LAST:event_imgGrid9x9MouseEntered

    private void imgGrid9x9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrid9x9MouseExited
        txtGrid9x9.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }//GEN-LAST:event_imgGrid9x9MouseExited

    private void imgGrid4x4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrid4x4MouseEntered
        txtGrid4x4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    }//GEN-LAST:event_imgGrid4x4MouseEntered

    private void imgGrid4x4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrid4x4MouseExited
        txtGrid4x4.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }//GEN-LAST:event_imgGrid4x4MouseExited

    private void imgGrid9x9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrid9x9MouseClicked
        uncheckGridSizes();
        selectedGrid9x9.setVisible(true);
        tempGridSize = 9;
    }//GEN-LAST:event_imgGrid9x9MouseClicked

    private void imgGrid4x4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrid4x4MouseClicked
        uncheckGridSizes();
        selectedGrid4x4.setVisible(true);
        tempGridSize = 4;
    }//GEN-LAST:event_imgGrid4x4MouseClicked

    private void uncheckGameModes(){
        easyButton.setForeground(new java.awt.Color(102, 102, 102));
        normalButton.setForeground(new java.awt.Color(102, 102, 102));
        hardButton.setForeground(new java.awt.Color(102, 102, 102));
        extremeButton.setForeground(new java.awt.Color(102, 102, 102));
    }
    
    private void uncheckGridSizes(){
        selectedGrid4x4.setVisible(false);
        selectedGrid9x9.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel easyButton;
    private javax.swing.JLabel extremeButton;
    private javax.swing.JLabel gameModeTxt;
    private javax.swing.JLabel hardButton;
    private javax.swing.JLabel imgGrid4x4;
    private javax.swing.JLabel imgGrid9x9;
    private javax.swing.JLabel normalButton;
    private javax.swing.JLabel saveButton;
    private javax.swing.JLabel selectedGrid4x4;
    private javax.swing.JLabel selectedGrid9x9;
    private javax.swing.JLabel txtGrid4x4;
    private javax.swing.JLabel txtGrid9x9;
    // End of variables declaration//GEN-END:variables
}
