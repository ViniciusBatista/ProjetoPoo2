/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1.Interface;


/**
 *
 * @author batista
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuForncedor = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jMenuItemEmpregados = new javax.swing.JMenuItem();
        jMenuItemContasPagar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJETO POO2");

        jMenu1.setText("Cadastro");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuForncedor.setText("Fornecedor");
        jMenuForncedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuForncedorMousePressed(evt);
            }
        });
        jMenuBar1.add(jMenuForncedor);

        jMenu2.setText("Relatorio");

        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAluno);

        jMenuItemEmpregados.setText("Empregados");
        jMenuItemEmpregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpregadosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEmpregados);

        jMenuItemContasPagar.setText("Relatório de contas");
        jMenuItemContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContasPagarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemContasPagar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(740, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        // TODO add your handling code here:
        FrameCad cad = new FrameCad();
        cad.setVisible(true);
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenuForncedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuForncedorMousePressed
        // TODO add your handling code here:
        FrameFornecedor frameFor = new FrameFornecedor();
        frameFor.setVisible(true);
    }//GEN-LAST:event_jMenuForncedorMousePressed

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        // TODO add your handling code here:
        FrameListarAluno frameListaAluno = new FrameListarAluno();
        frameListaAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jMenuItemEmpregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpregadosActionPerformed
        // TODO add your handling code here:
        FrameListarEmpregado frameEmpregado = new FrameListarEmpregado();
        frameEmpregado.setVisible(true);
    }//GEN-LAST:event_jMenuItemEmpregadosActionPerformed

    private void jMenuItemContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContasPagarActionPerformed
        // TODO add your handling code here:
        FrameRelatorios framerelatorios = new FrameRelatorios();
        framerelatorios.setVisible(true);
    }//GEN-LAST:event_jMenuItemContasPagarActionPerformed

 

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuForncedor;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemContasPagar;
    private javax.swing.JMenuItem jMenuItemEmpregados;
    // End of variables declaration//GEN-END:variables
}
