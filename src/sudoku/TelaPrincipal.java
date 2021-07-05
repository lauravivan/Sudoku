/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javax.swing.JOptionPane;

/**
 *
 * @author laura
 */
public class TelaPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form telaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        btnIndividual = new javax.swing.JButton();
        btnDesafio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setPreferredSize(new java.awt.Dimension(400, 310));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Snap ITC", 1, 70)); // NOI18N
        jLabelTitulo.setText("SUDOKU");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnIndividual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnIndividual.setText("INDIVIDUAL");
        btnIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndividualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, 70));

        btnDesafio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDesafio.setText("DESAFIO");
        btnDesafio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesafioActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesafio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 190, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/sudoku (4).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesafioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesafioActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(null, "Bem-vinda(o)! Vamos começar?");
        JOptionPane.showMessageDialog(null, "Você está na 1ª fase e para "
                + "desbloquear a 2ª fase, será necessário passar pelos três primeiros jogos!");
        new NivelFacil1("desafio").setVisible(true);
    }//GEN-LAST:event_btnDesafioActionPerformed

    private void btnIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndividualActionPerformed
        this.dispose();
        new TelaOpcoes().setVisible(true);
    }//GEN-LAST:event_btnIndividualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(
                javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesafio;
    private javax.swing.JButton btnIndividual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}