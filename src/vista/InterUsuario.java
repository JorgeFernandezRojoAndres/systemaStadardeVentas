package vista;

import controlador.Ctrl_Usuario;
import java.awt.Dimension;

import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Jorge
 */
public class InterUsuario extends javax.swing.JInternalFrame {

    public InterUsuario() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Usuario");
        
        txt_passwprd.setVisible(true);
        txt_password_visible.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        jButton1_Guardar = new javax.swing.JButton();
        txt_Telefono = new javax.swing.JTextField();
        txt_passwprd = new javax.swing.JPasswordField();
        jCheckBox1_verClave = new javax.swing.JCheckBox();
        txt_password_visible = new javax.swing.JTextField();
        jLabel1_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 30));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        jButton1_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton1_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_Guardar.setText("Guardar");
        jButton1_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 30));

        txt_Telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        txt_passwprd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_passwprd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwprdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_passwprd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 142, 170, 20));

        jCheckBox1_verClave.setFocusable(false);
        jCheckBox1_verClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1_verClaveMouseClicked(evt);
            }
        });
        jCheckBox1_verClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1_verClaveActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1_verClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        txt_password_visible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_password_visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password_visibleActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        jLabel1_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        jLabel1_wallpaper.setText("Nuevo Cliente");
        getContentPane().add(jLabel1_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void jButton1_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_GuardarActionPerformed

        if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty()
                || txt_usuario.getText().isEmpty() || txt_passwprd.getText().isEmpty()
                || txt_Telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuario ya esta registrado
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            if (!controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                //enviamos datos del usuario
                usuario.setNombre(txt_nombre.getText().trim());
                usuario.setApellido(txt_apellido.getText().trim());
                usuario.setUsuario(txt_usuario.getText().trim());
                usuario.setPassword(txt_passwprd.getText().trim());
                usuario.setTelefono(txt_Telefono.getText().trim());
                usuario.setEstado(1);

                if (controlUsuario.guardar(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el Usuario ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya esta registrado, ingrese otro");
            }

        }
        this.Limpiar();


    }//GEN-LAST:event_jButton1_GuardarActionPerformed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void txt_passwprdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwprdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwprdActionPerformed

    private void jCheckBox1_verClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1_verClaveMouseClicked
        if (jCheckBox1_verClave.isSelected() == true) {
            String pass = "";
            char[] passIngresado = txt_passwprd.getPassword();
            for (int i = 0; i < passIngresado.length;i++) {
                pass += passIngresado[i];
            }
            txt_password_visible.setText(pass);
            txt_passwprd.setVisible(false);
            txt_password_visible.setVisible(true);
        } else {
            String passIngresado = txt_password_visible.getText().trim();
            txt_passwprd.setText(passIngresado);
            txt_passwprd.setVisible(true);
            txt_password_visible.setVisible(false);            
        }
    }//GEN-LAST:event_jCheckBox1_verClaveMouseClicked

    private void txt_password_visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password_visibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_password_visibleActionPerformed

    private void jCheckBox1_verClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1_verClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1_verClaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Guardar;
    private javax.swing.JCheckBox jCheckBox1_verClave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_wallpaper;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JPasswordField txt_passwprd;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    /*
    metodo para Limpiar campos
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_passwprd.setText("");
        txt_usuario.setText("");
        txt_Telefono.setText("");
    }

}
