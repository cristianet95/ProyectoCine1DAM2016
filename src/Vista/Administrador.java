/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.*;

/**
 *
 * @author USUARIO
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        modificarPelicula = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        eliminarPelicula = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        crearSala = new javax.swing.JCheckBoxMenuItem();
        modificarSala = new javax.swing.JCheckBoxMenuItem();
        eliminarSala = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        crearSesion = new javax.swing.JCheckBoxMenuItem();
        modificarSesion = new javax.swing.JCheckBoxMenuItem();
        eliminarSesion = new javax.swing.JCheckBoxMenuItem();
        bd = new javax.swing.JMenu();
        importar = new javax.swing.JCheckBoxMenuItem();
        exportar = new javax.swing.JCheckBoxMenuItem();
        importar1V = new javax.swing.JCheckBoxMenuItem();

        jMenu3.setText("jMenu3");

        jMenu1.setText("Pelicula");

        modificarPelicula.setSelected(true);
        modificarPelicula.setText("Crear");
        modificarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPeliculaActionPerformed(evt);
            }
        });
        jMenu1.add(modificarPelicula);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Modificar");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        eliminarPelicula.setSelected(true);
        eliminarPelicula.setText("Eliminar");
        eliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPeliculaActionPerformed(evt);
            }
        });
        jMenu1.add(eliminarPelicula);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sala");

        crearSala.setSelected(true);
        crearSala.setText("Crear");
        crearSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSalaActionPerformed(evt);
            }
        });
        jMenu2.add(crearSala);

        modificarSala.setSelected(true);
        modificarSala.setText("Modificar");
        modificarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarSalaActionPerformed(evt);
            }
        });
        jMenu2.add(modificarSala);

        eliminarSala.setSelected(true);
        eliminarSala.setText("Eliminar");
        eliminarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSalaActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarSala);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Sesion");

        crearSesion.setSelected(true);
        crearSesion.setText("Crear");
        crearSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSesionActionPerformed(evt);
            }
        });
        jMenu4.add(crearSesion);

        modificarSesion.setSelected(true);
        modificarSesion.setText("Modificar");
        modificarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarSesionActionPerformed(evt);
            }
        });
        jMenu4.add(modificarSesion);

        eliminarSesion.setSelected(true);
        eliminarSesion.setText("Eliminar");
        eliminarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSesionActionPerformed(evt);
            }
        });
        jMenu4.add(eliminarSesion);

        jMenuBar1.add(jMenu4);

        bd.setText("BD");

        importar.setSelected(true);
        importar.setText("Importar");
        importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarActionPerformed(evt);
            }
        });
        bd.add(importar);

        exportar.setSelected(true);
        exportar.setText("Exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        bd.add(exportar);

        importar1V.setSelected(true);
        importar1V.setText("Cargar Ejemplos (Fase Prueba)");
        importar1V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importar1VActionPerformed(evt);
            }
        });
        bd.add(importar1V);

        jMenuBar1.add(bd);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPeliculaActionPerformed
        Vista.CrearPelicula alt_crearPelicula= new Vista.CrearPelicula();
        alt_crearPelicula.setVisible(true);
    }//GEN-LAST:event_modificarPeliculaActionPerformed

    private void eliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPeliculaActionPerformed
        Vista.EliminarPelicula alt_eliminarPelicula= new Vista.EliminarPelicula();
        alt_eliminarPelicula.setVisible(true);
    }//GEN-LAST:event_eliminarPeliculaActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        Vista.ModificarPelicula alt_modificarPelicula= new Vista.ModificarPelicula();
        alt_modificarPelicula.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void crearSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSalaActionPerformed
        Vista.CrearSala alt_crearSala= new Vista.CrearSala();
        alt_crearSala.setVisible(true);
    }//GEN-LAST:event_crearSalaActionPerformed

    private void modificarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarSalaActionPerformed
        Vista.ModificarSala alt_modificarSala= new Vista.ModificarSala();
        alt_modificarSala.setVisible(true);
    }//GEN-LAST:event_modificarSalaActionPerformed

    private void eliminarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSalaActionPerformed
        Vista.EliminarSala alt_eliminarSala= new Vista.EliminarSala();
        alt_eliminarSala.setVisible(true);
    }//GEN-LAST:event_eliminarSalaActionPerformed

    private void eliminarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSesionActionPerformed
        Vista.EliminarSesion alt_eliminarSesion= new Vista.EliminarSesion();
        alt_eliminarSesion.setVisible(true);
    }//GEN-LAST:event_eliminarSesionActionPerformed

    private void crearSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSesionActionPerformed
        Vista.CrearSesion alt_crearSesion= new Vista.CrearSesion();
        alt_crearSesion.setVisible(true);
    }//GEN-LAST:event_crearSesionActionPerformed

    private void modificarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarSesionActionPerformed
         Vista.ModificarSesion alt_modificarSesion= new Vista.ModificarSesion();
        alt_modificarSesion.setVisible(true);
    }//GEN-LAST:event_modificarSesionActionPerformed

    private void importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarActionPerformed
        GestionFicheros gf=new GestionFicheros();
        gf.importarBD();
    }//GEN-LAST:event_importarActionPerformed

    private void importar1VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importar1VActionPerformed
        GestionFicheros gf=new GestionFicheros();
        gf.importarBDInicial();
    }//GEN-LAST:event_importar1VActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        GestionFicheros gf=new GestionFicheros();
        gf.exportarBD();
    }//GEN-LAST:event_exportarActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bd;
    private javax.swing.JCheckBoxMenuItem crearSala;
    private javax.swing.JCheckBoxMenuItem crearSesion;
    private javax.swing.JCheckBoxMenuItem eliminarPelicula;
    private javax.swing.JCheckBoxMenuItem eliminarSala;
    private javax.swing.JCheckBoxMenuItem eliminarSesion;
    private javax.swing.JCheckBoxMenuItem exportar;
    private javax.swing.JCheckBoxMenuItem importar;
    private javax.swing.JCheckBoxMenuItem importar1V;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JCheckBoxMenuItem modificarPelicula;
    private javax.swing.JCheckBoxMenuItem modificarSala;
    private javax.swing.JCheckBoxMenuItem modificarSesion;
    // End of variables declaration//GEN-END:variables
}
