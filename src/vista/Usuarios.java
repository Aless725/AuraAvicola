/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Roberto
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form TUsuarios
     */
    public Usuarios() {
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

        TituloLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        ContraseñaLabel = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        ContraseñaTxt = new javax.swing.JTextField();
        RolLabel = new javax.swing.JLabel();
        RolSeleccion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloLabel.setText("Información de Usuarios");

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnActualizar.setText("Actualizar");

        BtnBorrar.setText("Borrar");

        BtnLimpiar.setText("Limpiar");

        NombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        NombreLabel.setText("Nombre");

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        EmailLabel.setText("Email");

        ApellidoLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ApellidoLabel.setText("Apellido");

        ContraseñaLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ContraseñaLabel.setText("Contraseña");

        RolLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        RolLabel.setText("Rol");

        RolSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "EMPLEADO" }));
        RolSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(TituloLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmailLabel)
                                .addGap(205, 205, 205)
                                .addComponent(ContraseñaLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RolLabel)
                                .addGap(48, 48, 48)
                                .addComponent(RolSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(EmailTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(NombreTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ApellidoTxt)
                                    .addComponent(ContraseñaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(ApellidoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(TituloLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBorrar)
                            .addComponent(BtnAgregar))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreLabel)
                            .addComponent(ApellidoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(ApellidoTxt))
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnActualizar)
                    .addComponent(BtnLimpiar)
                    .addComponent(ContraseñaLabel)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RolSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RolLabel))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void RolSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolSeleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RolSeleccionActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JTextField ApellidoTxt;
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JLabel ContraseñaLabel;
    private javax.swing.JTextField ContraseñaTxt;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel RolLabel;
    private javax.swing.JComboBox<String> RolSeleccion;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JLabel getApellidoLabel() {
        return ApellidoLabel;
    }

    public JTextField getApellidoTxt() {
        return ApellidoTxt;
    }

    public JButton getBtnActualizar() {
        return BtnActualizar;
    }

    public JButton getBtnAgregar() {
        return BtnAgregar;
    }

    public JButton getBtnBorrar() {
        return BtnBorrar;
    }

    public JButton getBtnLimpiar() {
        return BtnLimpiar;
    }

    public JLabel getContraseñaLabel() {
        return ContraseñaLabel;
    }

    public JTextField getContraseñaTxt() {
        return ContraseñaTxt;
    }

    public JLabel getEmailLabel() {
        return EmailLabel;
    }

    public JTextField getEmailTxt() {
        return EmailTxt;
    }

    public JLabel getNombreLabel() {
        return NombreLabel;
    }

    public JTextField getNombreTxt() {
        return NombreTxt;
    }

    public JLabel getRolLabel() {
        return RolLabel;
    }

    public JComboBox<String> getRolSeleccion() {
        return RolSeleccion;
    }

    public JTable getTablaDatos() {
        return TablaDatos;
    }

    public JLabel getTituloLabel() {
        return TituloLabel;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

}
