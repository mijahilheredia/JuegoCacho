/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Heredia
 */
public class Modalidad extends javax.swing.JFrame {

    Inicio miInicio = new Inicio();

    
    public Modalidad() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAlalay = new javax.swing.JButton();
        botonTiroVolteado = new javax.swing.JToggleButton();
        AtrasDeModalidad = new javax.swing.JButton();
        FondoModalidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAlalay.setBackground(new java.awt.Color(51, 0, 0));
        botonAlalay.setFont(new java.awt.Font("xscale", 0, 24)); // NOI18N
        botonAlalay.setForeground(new java.awt.Color(255, 255, 255));
        botonAlalay.setText("Alalay");
        botonAlalay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAlalayMouseClicked(evt);
            }
        });
        botonAlalay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlalayActionPerformed(evt);
            }
        });
        getContentPane().add(botonAlalay, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 330, 70));

        botonTiroVolteado.setBackground(new java.awt.Color(51, 0, 0));
        botonTiroVolteado.setFont(new java.awt.Font("xscale", 0, 24)); // NOI18N
        botonTiroVolteado.setForeground(new java.awt.Color(255, 255, 255));
        botonTiroVolteado.setText("Tiro Volteado");
        botonTiroVolteado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTiroVolteadoActionPerformed(evt);
            }
        });
        getContentPane().add(botonTiroVolteado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 330, 70));

        AtrasDeModalidad.setBackground(java.awt.Color.red);
        AtrasDeModalidad.setFont(new java.awt.Font("xscale", 0, 18)); // NOI18N
        AtrasDeModalidad.setForeground(new java.awt.Color(255, 255, 255));
        AtrasDeModalidad.setText("ATRAS");
        AtrasDeModalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtrasDeModalidadMouseClicked(evt);
            }
        });
        getContentPane().add(AtrasDeModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 120, 40));

        FondoModalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/Modalidad.jpg"))); // NOI18N
        getContentPane().add(FondoModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTiroVolteadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTiroVolteadoActionPerformed
         CantidadJugadores miCantidad=new CantidadJugadores();//creamos un objeto tipo modalidad JFrame
         miCantidad.seDecideModalidad(2);
         miCantidad.setVisible(true);//se abre la nueva ventana
         this.dispose();//se cierra la ventana actual
    }//GEN-LAST:event_botonTiroVolteadoActionPerformed

    private void AtrasDeModalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtrasDeModalidadMouseClicked
       miInicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AtrasDeModalidadMouseClicked

    private void botonAlalayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAlalayMouseClicked
         
    }//GEN-LAST:event_botonAlalayMouseClicked

    private void botonAlalayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlalayActionPerformed
        CantidadJugadores miCantidad=new CantidadJugadores();//creamos un objeto tipo modalidad JFrame
         miCantidad.seDecideModalidad(1);
         miCantidad.setVisible(true);//se abre la nueva ventana
         this.dispose();//se cierra la ventana actual
    }//GEN-LAST:event_botonAlalayActionPerformed

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
            java.util.logging.Logger.getLogger(Modalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modalidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasDeModalidad;
    private javax.swing.JLabel FondoModalidad;
    private javax.swing.JButton botonAlalay;
    private javax.swing.JToggleButton botonTiroVolteado;
    // End of variables declaration//GEN-END:variables
 
}
