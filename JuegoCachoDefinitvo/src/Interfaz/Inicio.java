
package Interfaz;


public class Inicio extends javax.swing.JFrame {

 
    public Inicio() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonIniJuego = new javax.swing.JButton();
        botonIniSalir = new javax.swing.JButton();
        FondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIniJuego.setBackground(new java.awt.Color(51, 0, 0));
        botonIniJuego.setFont(new java.awt.Font("xscale", 0, 36)); // NOI18N
        botonIniJuego.setForeground(new java.awt.Color(255, 255, 255));
        botonIniJuego.setText("Jugar");
        botonIniJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIniJuegoMouseClicked(evt);
            }
        });
        botonIniJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 300, 50));

        botonIniSalir.setBackground(new java.awt.Color(51, 0, 0));
        botonIniSalir.setFont(new java.awt.Font("xscale", 0, 36)); // NOI18N
        botonIniSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonIniSalir.setText("Salir");
        botonIniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 300, 50));

        FondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/imagenInicio2_1.jpg"))); // NOI18N
        getContentPane().add(FondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIniJuegoActionPerformed

    private void botonIniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonIniSalirActionPerformed

    private void botonIniJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniJuegoMouseClicked
    Modalidad miModalidad=new Modalidad();//creamos un objeto tipo modalidad JFrame
    miModalidad.setVisible(true);//se abre la nueva ventana
    this.dispose();//se cierra la ventana actual
            
    }//GEN-LAST:event_botonIniJuegoMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoInicio;
    private javax.swing.JButton botonIniJuego;
    private javax.swing.JButton botonIniSalir;
    // End of variables declaration//GEN-END:variables
}
