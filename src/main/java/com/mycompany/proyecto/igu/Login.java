package com.mycompany.proyecto.igu;

import com.mycompany.proyecto.logica.Controladora;


public class Login extends javax.swing.JFrame {
    Controladora control;

    public Login() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BtnCcuenta = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("No tienes una cuenta?");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        BtnCcuenta.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        BtnCcuenta.setForeground(new java.awt.Color(0, 0, 0));
        BtnCcuenta.setText("Crear cuenta");
        BtnCcuenta.setBorder(null);
        BtnCcuenta.setBorderPainted(false);
        BtnCcuenta.setContentAreaFilled(false);
        BtnCcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCcuentaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        BtnIniciar.setBackground(new java.awt.Color(25, 121, 187));
        BtnIniciar.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        BtnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIniciar.setText("Iniciar sesion");
        BtnIniciar.setBorder(null);
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 310, 30));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(null);
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 300, 30));

        txtMensaje.setEditable(false);
        txtMensaje.setBackground(new java.awt.Color(246, 246, 246));
        txtMensaje.setForeground(new java.awt.Color(255, 0, 51));
        txtMensaje.setBorder(null);
        jPanel2.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 320, 30));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 300, 30));

        txtContra.setBackground(new java.awt.Color(255, 255, 255));
        txtContra.setForeground(new java.awt.Color(0, 0, 0));
        txtContra.setBorder(null);
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 30));

        jLabel11.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Contraseña");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\OneDrive\\Documents\\NetBeansProjects\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\igu\\img\\Group 41.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\Downloads\\app\\Login.png")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\OneDrive\\Documents\\NetBeansProjects\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\igu\\img\\Rectangle 1.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 490));

        jLabel10.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Usuario");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 510, 490));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\OneDrive\\Documents\\NetBeansProjects\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\igu\\img\\form 2.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\OneDrive\\Documents\\NetBeansProjects\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\igu\\img\\3161253 1.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\OneDrive\\Documents\\NetBeansProjects\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\igu\\img\\form 1.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dalej\\OneDrive\\Documents\\NetBeansProjects\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\igu\\img\\Frame 3.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -60, 1390, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCcuentaActionPerformed
        DatosUsuario datusu= new DatosUsuario();
        datusu.setVisible(true);
        datusu.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnCcuentaActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed

        String user = txtUsuario.getText();
        String contra = txtContra.getText();
        String mensaje = control.validarUsuario(user,contra);
        txtMensaje.setText(mensaje);   
        txtUsuario.setText("");
        txtContra.setText("");
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCcuenta;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
