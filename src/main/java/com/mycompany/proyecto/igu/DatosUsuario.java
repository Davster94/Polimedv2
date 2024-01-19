/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto.igu;


public class DatosUsuario extends javax.swing.JFrame {

    
    public DatosUsuario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardarUsu = new javax.swing.JButton();
        btnCancelarUsu = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApeUsuario = new javax.swing.JTextField();
        txtEmailUsuario = new javax.swing.JTextField();
        txtAliasUsuario = new javax.swing.JTextField();
        txtContraUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        btnGuardarUsu.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarUsu.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarUsu.setText("GUARDAR");
        btnGuardarUsu.setBorder(null);
        btnGuardarUsu.setBorderPainted(false);
        btnGuardarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 120, 50));

        btnCancelarUsu.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarUsu.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarUsu.setText("CANCELAR");
        btnCancelarUsu.setBorder(null);
        btnCancelarUsu.setBorderPainted(false);
        btnCancelarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 120, 50));

        txtNombreUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombreUsuario.setBorder(null);
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 30));

        txtApeUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApeUsuario.setBorder(null);
        jPanel1.add(txtApeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 210, 30));

        txtEmailUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmailUsuario.setBorder(null);
        jPanel1.add(txtEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 30));

        txtAliasUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAliasUsuario.setBorder(null);
        jPanel1.add(txtAliasUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 210, 30));

        txtContraUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtContraUsuario.setBorder(null);
        jPanel1.add(txtContraUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\OneDrive\\Documents\\NetBeansProjects\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\igu\\img\\Frame 3.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 567));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void btnGuardarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuActionPerformed
        String nombusu = txtNombreUsuario.getText();
        String apeusu = txtApeUsuario.getText();
        String emailusu = txtEmailUsuario.getText();
        String aliusu = txtAliasUsuario.getText();
        String conusu = txtContraUsuario.getText();
        
        
    }//GEN-LAST:event_btnGuardarUsuActionPerformed

    private void btnCancelarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuActionPerformed
       dispose();
    }//GEN-LAST:event_btnCancelarUsuActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarUsu;
    private javax.swing.JButton btnGuardarUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAliasUsuario;
    private javax.swing.JTextField txtApeUsuario;
    private javax.swing.JTextField txtContraUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
