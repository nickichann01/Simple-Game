package rock_raper_scissor;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Start extends javax.swing.JFrame {

    //Checker class
    Checker check = new Checker();
    String player, computer;

    char ch;
    
    public Start() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Player1 = new javax.swing.JLabel();
        Player2 = new javax.swing.JLabel();
        playerchoice = new javax.swing.JLabel();
        PlayerSide = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        randomcomp = new javax.swing.JLabel();
        CompSide = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ScoreP = new javax.swing.JLabel();
        colon = new javax.swing.JLabel();
        ScoreC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Rock = new javax.swing.JLabel();
        Paper = new javax.swing.JLabel();
        Scissor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rock Paper Scissor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Hypeblox", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rock Paper Scissor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 350, 50));

        Player1.setFont(new java.awt.Font("Hypeblox", 0, 24)); // NOI18N
        Player1.setForeground(new java.awt.Color(0, 102, 255));
        Player1.setText("Player");
        getContentPane().add(Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, 40));

        Player2.setFont(new java.awt.Font("Hypeblox", 0, 24)); // NOI18N
        Player2.setForeground(new java.awt.Color(204, 51, 0));
        Player2.setText("Computer ");
        getContentPane().add(Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, 40));
        getContentPane().add(playerchoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 160, 150));

        PlayerSide.setBackground(new java.awt.Color(153, 204, 255));
        PlayerSide.setOpaque(true);
        getContentPane().add(PlayerSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 180, 170));

        vs.setFont(new java.awt.Font("Hypeblox", 0, 60)); // NOI18N
        vs.setForeground(new java.awt.Color(255, 255, 255));
        vs.setText("VS");
        getContentPane().add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 80, 60));
        getContentPane().add(randomcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 160, 150));

        CompSide.setBackground(new java.awt.Color(255, 204, 204));
        CompSide.setOpaque(true);
        getContentPane().add(CompSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 180, 170));

        jLabel3.setFont(new java.awt.Font("Hypeblox", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rock Paper Scissor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 350, 50));

        ScoreP.setBackground(new java.awt.Color(255, 255, 255));
        ScoreP.setFont(new java.awt.Font("Hypeblox", 0, 48)); // NOI18N
        ScoreP.setForeground(new java.awt.Color(255, 255, 255));
        ScoreP.setText("0");
        getContentPane().add(ScoreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 40, 50));

        colon.setFont(new java.awt.Font("Hypeblox", 0, 60)); // NOI18N
        colon.setForeground(new java.awt.Color(255, 255, 255));
        colon.setText(":");
        getContentPane().add(colon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 30, 40));

        ScoreC.setFont(new java.awt.Font("Hypeblox", 0, 48)); // NOI18N
        ScoreC.setForeground(new java.awt.Color(255, 255, 255));
        ScoreC.setText("0");
        getContentPane().add(ScoreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 40, 60));

        jLabel4.setFont(new java.awt.Font("InaiMathi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Press 'R'                 Press 'P'             Press 'S'");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 340, 30));

        Rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RockRSmol.png"))); // NOI18N
        Rock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RockMouseClicked(evt);
            }
        });
        getContentPane().add(Rock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 90, 80));

        Paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PaperRSmol.png"))); // NOI18N
        Paper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaperMouseClicked(evt);
            }
        });
        getContentPane().add(Paper, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, 80));

        Scissor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScissorRSmol.png"))); // NOI18N
        Scissor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScissorMouseClicked(evt);
            }
        });
        getContentPane().add(Scissor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 90, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pre_rendered_3d_battle_background__tavern__by_eduardogaray_dee5jn6-pre.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 0, 1030, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RockMouseClicked
        // TODO add your handling code here:
        playerchoice.setIcon(new ImageIcon(getClass().getResource("/Images/RockR.png")));
        player = "Rock";
        computer();
    }//GEN-LAST:event_RockMouseClicked

    private void PaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaperMouseClicked
        // TODO add your handling code here:
        playerchoice.setIcon(new ImageIcon(getClass().getResource("/Images/PaperR_.png")));
        player = "Paper";
        computer();
    }//GEN-LAST:event_PaperMouseClicked

    private void ScissorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScissorMouseClicked
        // TODO add your handling code here:
        playerchoice.setIcon(new ImageIcon(getClass().getResource("/Images/ScissorR.png")));
        player = "Scissor";
        computer();
    }//GEN-LAST:event_ScissorMouseClicked

    //This method randomize the choice for computer player
    public void computer(){
        Random rand = new Random();
        int randNum = rand.nextInt(2 - 0 + 1) + 0;
        String randObj = new ChoiceSelection().randomChoice(randNum);
        randomcomp.setIcon(new javax.swing.ImageIcon(getClass().getResource(randObj)));
    
    if (randObj.equals("/Images/RockL.png")){
        computer = "Rock";
    } else if (randObj.equals("/Images/PaperL.png")){
        computer = "Paper";
    } else if (randObj.equals("/Images/ScissorL.png")){
        computer = "Scissor";
    }
    
    checkChoice();
    winner();

    }
    
    //For ChoiceSelection Class
    public void checkChoice(){
        check.check(player, computer, ScoreC, ScoreP);
    }
    
    //This method will show the winner
    public void winner() {
    if (check.getPlayerScore() == 5) {
        JOptionPane.showMessageDialog(this, "Player Win!");
        new Main().setVisible(true);
        this.dispose();
    }else if (check.getComputerScore() == 5) {
        JOptionPane.showMessageDialog(this, "Computer Win!");
        new Main().setVisible(true);
        this.dispose();
        }
    }       
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompSide;
    private javax.swing.JLabel Paper;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player2;
    private javax.swing.JLabel PlayerSide;
    private javax.swing.JLabel Rock;
    private javax.swing.JLabel Scissor;
    private javax.swing.JLabel ScoreC;
    private javax.swing.JLabel ScoreP;
    private javax.swing.JLabel colon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel playerchoice;
    private javax.swing.JLabel randomcomp;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables

}
