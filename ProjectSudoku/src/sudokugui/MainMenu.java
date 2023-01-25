/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokugui;

/**
 *
 * @author Zed
 */
public class MainMenu extends javax.swing.JPanel {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitGameButton = new javax.swing.JLabel();
        optionsButton = new javax.swing.JLabel();
        newGameButton = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitGameButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        exitGameButton.setForeground(new java.awt.Color(102, 102, 102));
        exitGameButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitGameButton.setText("Exit Game");
        exitGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitGameButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitGameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitGameButtonMouseExited(evt);
            }
        });
        add(exitGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 230, 40));

        optionsButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        optionsButton.setForeground(new java.awt.Color(102, 102, 102));
        optionsButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optionsButton.setText("Options");
        optionsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionsButtonMouseExited(evt);
            }
        });
        add(optionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 190, 40));

        newGameButton.setFont(new java.awt.Font("Joystix Monospace", 0, 24)); // NOI18N
        newGameButton.setForeground(new java.awt.Color(102, 102, 102));
        newGameButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGameButton.setText("New Game");
        newGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGameButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newGameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newGameButtonMouseExited(evt);
            }
        });
        add(newGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 190, 40));

        titleText.setFont(new java.awt.Font("Joystix Monospace", 0, 48)); // NOI18N
        titleText.setForeground(new java.awt.Color(51, 51, 51));
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleText.setText("Sudoku Game");
        add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 510, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameButtonMouseEntered
        newGameButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        newGameButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_newGameButtonMouseEntered

    private void newGameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameButtonMouseExited
        newGameButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        newGameButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_newGameButtonMouseExited

    private void optionsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsButtonMouseEntered
        optionsButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        optionsButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_optionsButtonMouseEntered

    private void optionsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsButtonMouseExited
        optionsButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        optionsButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_optionsButtonMouseExited

    private void exitGameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameButtonMouseEntered
        exitGameButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exitGameButton.setForeground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_exitGameButtonMouseEntered

    private void exitGameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameButtonMouseExited
        exitGameButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        exitGameButton.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_exitGameButtonMouseExited

    private void newGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameButtonMouseClicked
        PanelSwap.getInstance().showNewGame();
    }//GEN-LAST:event_newGameButtonMouseClicked

    private void optionsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsButtonMouseClicked
        PanelSwap.getInstance().showOptions();
    }//GEN-LAST:event_optionsButtonMouseClicked

    private void exitGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitGameButtonMouseClicked
        MainFrame.disposeFrame();
    }//GEN-LAST:event_exitGameButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel exitGameButton;
    private javax.swing.JLabel newGameButton;
    private javax.swing.JLabel optionsButton;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
