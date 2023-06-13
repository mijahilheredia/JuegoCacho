/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;
public class CantidadJugadores extends javax.swing.JFrame {
   private String nombre;
   private String nombre2;
   int tipoModalidad;
   Modalidad miModalidad=new Modalidad();
    public CantidadJugadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        nombre="";
        nombre2="";
    }
    public void seDecideModalidad(int a)//escoje la modalidad dependiendo el tipo de numero que se mande
    {
        tipoModalidad=a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonJug1 = new javax.swing.JButton();
        botonJug2 = new javax.swing.JButton();
        botonAtrasDeCantJug = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        botonJug1.setBackground(new java.awt.Color(51, 0, 0));
        botonJug1.setFont(new java.awt.Font("xscale", 1, 36)); // NOI18N
        botonJug1.setForeground(new java.awt.Color(255, 255, 255));
        botonJug1.setText("1 JUGADOR");
        botonJug1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonJug1MouseClicked(evt);
            }
        });
        botonJug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJug1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 270, 220));

        botonJug2.setBackground(new java.awt.Color(51, 0, 0));
        botonJug2.setFont(new java.awt.Font("xscale", 1, 36)); // NOI18N
        botonJug2.setForeground(new java.awt.Color(255, 255, 255));
        botonJug2.setText("2 JUGADORES");
        botonJug2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonJug2MouseClicked(evt);
            }
        });
        botonJug2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJug2ActionPerformed(evt);
            }
        });
        getContentPane().add(botonJug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 260, 220));

        botonAtrasDeCantJug.setBackground(java.awt.Color.red);
        botonAtrasDeCantJug.setFont(new java.awt.Font("xscale", 1, 24)); // NOI18N
        botonAtrasDeCantJug.setForeground(new java.awt.Color(255, 255, 255));
        botonAtrasDeCantJug.setText("ATRAS");
        botonAtrasDeCantJug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtrasDeCantJugMouseClicked(evt);
            }
        });
        getContentPane().add(botonAtrasDeCantJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 130, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/74183.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasDeCantJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasDeCantJugMouseClicked
        //este metodo hace una accion cuando se da click al boton atras
        miModalidad.setVisible(true);//abre la anterior ventana
        this.dispose();//cierra ventana actual
    }//GEN-LAST:event_botonAtrasDeCantJugMouseClicked

    private void botonJug1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJug1MouseClicked
        if(tipoModalidad==1)
        {
            nombre=JOptionPane.showInputDialog("Ingrese su nombre");//ingresamos nombre desde teclado
            cachoJuegoAlalay miTablero=new cachoJuegoAlalay(nombre);//creamos un objeto tipo modalidad JFrame
            miTablero.setVisible(true);//se abre la nueva ventana
            this.dispose();//se cierra la ventana actual
        }
        else
        {nombre=JOptionPane.showInputDialog("Ingrese su nombre");//ingresamos nombre desde teclado
        cachoJuegoTiroVolteo miTablero=new cachoJuegoTiroVolteo(nombre);//creamos un objeto tipo modalidad JFrame
        miTablero.setVisible(true);//se abre la nueva ventana
         this.dispose();//se cierra la ventana actual
        }
        
    }//GEN-LAST:event_botonJug1MouseClicked

    private void botonJug2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJug2MouseClicked
       if(tipoModalidad==1)
       {
            nombre=JOptionPane.showInputDialog("Ingrese su nombreJugador1");//ingresamos nombre desde teclado
            nombre2=JOptionPane.showInputDialog("Ingrese su nombre Jugador2");//ingresamos nombre2 desde teclado
            cachoJuegoAlalay miTablero=new cachoJuegoAlalay(2,nombre,nombre2);//creamos un objeto tipo modalidad JFrame
            miTablero.setVisible(true);//se abre la nueva ventana
            this.dispose();//se cierra la ventana actual
       }
       else
       {    
        nombre=JOptionPane.showInputDialog("Ingrese su nombreJugador1");//ingresamos nombre desde teclado
        nombre2=JOptionPane.showInputDialog("Ingrese su nombre Jugador2");//ingresamos nombre2 desde teclado
        cachoJuegoTiroVolteo miTablero=new cachoJuegoTiroVolteo(2,nombre,nombre2);//creamos un objeto tipo modalidad JFrame
        miTablero.setVisible(true);//se abre la nueva ventana
         this.dispose();//se cierra la ventana actual
       }
    }//GEN-LAST:event_botonJug2MouseClicked

    private void botonJug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJug1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJug1ActionPerformed

    private void botonJug2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJug2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJug2ActionPerformed

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
            java.util.logging.Logger.getLogger(CantidadJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CantidadJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CantidadJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CantidadJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CantidadJugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasDeCantJug;
    private javax.swing.JButton botonJug1;
    private javax.swing.JButton botonJug2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
