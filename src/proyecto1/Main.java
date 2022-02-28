/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author giubo
 */
public class Main extends javax.swing.JFrame {

    Funciones a = new Funciones();

    /**
     * Creates new form Main
     */
    public Main() {
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

        cargar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        cantidad_islas = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        identificacion_puentes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cargar.setBackground(new java.awt.Color(255, 102, 0));
        cargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cargar.setText("Cargar archivo");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        actualizar.setBackground(new java.awt.Color(255, 102, 0));
        actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        actualizar.setText("Actualizar repositorio");
        actualizar.setEnabled(false);
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        mostrar.setBackground(new java.awt.Color(255, 102, 0));
        mostrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mostrar.setEnabled(false);
        mostrar.setText("Mostrar grafo");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        cantidad_islas.setBackground(new java.awt.Color(255, 102, 0));
        cantidad_islas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantidad_islas.setEnabled(false);
        cantidad_islas.setText("Mostrar cantidad de islas");
        cantidad_islas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_islasActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(255, 102, 0));
        modificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificar.setText("Modificar");
        modificar.setEnabled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        identificacion_puentes.setBackground(new java.awt.Color(255, 102, 0));
        identificacion_puentes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        identificacion_puentes.setText("Identificación de puentes");
        identificacion_puentes.setEnabled(false);
        identificacion_puentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacion_puentesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 148, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proyecto 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizar)
                            .addComponent(mostrar)
                            .addComponent(cantidad_islas)
                            .addComponent(cargar)
                            .addComponent(identificacion_puentes)
                            .addComponent(modificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(281, 281, 281)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargar)
                        .addGap(4, 4, 4)
                        .addComponent(actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad_islas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(identificacion_puentes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed

       this.repo = Funciones.extraerInf(jLabel1);
       if(this.repo != null){
        actualizar.setEnabled(true);
        mostrar.setEnabled(true);
        cantidad_islas.setEnabled(true);
        identificacion_puentes.setEnabled(true);
       }else{
           actualizar.setEnabled(false);
        mostrar.setEnabled(false);
        cantidad_islas.setEnabled(false);
        identificacion_puentes.setEnabled(false);
       }
    }//GEN-LAST:event_cargarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

//        JOptionPane.showOptionDialog(this, "Que accion deseas hacer ?", title, WIDTH, HEIGHT, icon, options, EXIT_ON_CLOSE)
        ActRepo ar = new ActRepo(this, true);

        ar.setVisible(true);

        //this.dispose();
    }//GEN-LAST:event_actualizarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        
//        Mostrar_Grafo newWin = new Mostrar_Grafo(this.a);
//        newWin.setVisible(true);
//        this.dispose();


    }//GEN-LAST:event_mostrarActionPerformed

    private void cantidad_islasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_islasActionPerformed
        Grafo grafito = new Grafo();
        grafito.crearMatrizAd();
    }//GEN-LAST:event_cantidad_islasActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

    }//GEN-LAST:event_modificarActionPerformed

    private void identificacion_puentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacion_puentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacion_puentesActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    static int[][] matrizAdy;
    static String rutaTxt;
    static Repositorio repo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton cantidad_islas;
    private javax.swing.JButton cargar;
    private javax.swing.JButton identificacion_puentes;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar;
    // End of variables declaration//GEN-END:variables
}
