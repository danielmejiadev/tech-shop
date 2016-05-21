
package Vista;

import Logica.LogicaUsuario;
import Modelo.Usuario;

import javax.swing.JOptionPane;

public class ModificarUsuario extends javax.swing.JDialog {

    public Usuario usuario;
    
    public ModificarUsuario(VistaAdministrador parent, boolean modal,Usuario usuario) 
    {
        super(parent, modal); 
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas");
        this.setResizable(false);
        this.usuario=usuario;
        llenarCampos(usuario);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCedulaUsuario9 = new javax.swing.JTextField();
        labelFondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labeltitulo = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonGuardarUsuario = new javax.swing.JButton();
        comboBoxTipoUsuario = new javax.swing.JComboBox<>();
        labelTipo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoContraseña = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoCedulaUsuario = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 530));

        labeltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(162, 146, 146));
        labeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitulo.setText("Modificar Usuario");

        botonCancelar.setBackground(new java.awt.Color(162, 146, 146));
        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setOpaque(true);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonGuardarUsuario.setBackground(new java.awt.Color(162, 146, 146));
        botonGuardarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonGuardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarUsuario.setText("Guardar");
        botonGuardarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGuardarUsuario.setContentAreaFilled(false);
        botonGuardarUsuario.setOpaque(true);
        botonGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarUsuarioActionPerformed(evt);
            }
        });

        comboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Administrador" }));

        labelTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(162, 146, 146));
        labelTipo.setText("Tipo  *");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onPerformed(evt);
            }
        });

        campoCedulaUsuario.setEditable(false);
        campoCedulaUsuario.setForeground(new java.awt.Color(255, 255, 255));

        labelCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(162, 146, 146));
        labelCorreo.setText("E - Mail ");

        labelContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(162, 146, 146));
        labelContraseña.setText("Contraseña *");

        labelTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(162, 146, 146));
        labelTelefono.setText("Teléfono");

        labelDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(162, 146, 146));
        labelDireccion.setText("Dirección");

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(162, 146, 146));
        labelNombre.setText("Nombre *");

        labelCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCedula.setForeground(new java.awt.Color(162, 146, 146));
        labelCedula.setText("Cedula * ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(botonGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContraseña)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelTelefono)
                                .addComponent(labelCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelTipo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(labelDireccion)
                            .addComponent(labelNombre)
                            .addComponent(labelCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labeltitulo)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labeltitulo)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCedula))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDireccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContraseña))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarUsuarioActionPerformed
        String nombre=campoNombre.getText();
        String contraseña = campoContraseña.getText();
        String direccion = campoDireccion.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        String tipo=comboBoxTipoUsuario.getSelectedItem().toString().toLowerCase();
        if(nombre.isEmpty()||contraseña.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese los campos obligatorios");
        }
        else
        {
            try {
                LogicaUsuario logicaUsuario = new LogicaUsuario();
                usuario.setNombreusuario(nombre);
                usuario.setDireccionusuario(direccion);
                usuario.setContrasena(contraseña);
                usuario.setTelefonosuario(telefono);
                usuario.setCorreousuario(correo);
                usuario.setTipousuario(tipo);
                logicaUsuario.modificarUsuario(usuario);
                } catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null,"Error, no se pudo modificar el usuario");
                }
                finally
                {
                    this.dispose();
                }
        }   
    }//GEN-LAST:event_botonGuardarUsuarioActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void onPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onPerformed

    public void llenarCampos(Usuario usuario)
    {
        campoCedulaUsuario.setText(usuario.getCedulausuario());
        campoNombre.setText(usuario.getNombreusuario());
        campoDireccion.setText(usuario.getDireccionusuario());
        campoTelefono.setText(usuario.getTelefonosuario());
        campoCorreo.setText(usuario.getCorreousuario());
        campoContraseña.setText(usuario.getContrasena());
        comboBoxTipoUsuario.setSelectedItem(usuario.getTipousuario());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardarUsuario;
    private javax.swing.JTextField campoCedulaUsuario;
    private javax.swing.JTextField campoCedulaUsuario9;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JComboBox<String> comboBoxTipoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labeltitulo;
    // End of variables declaration//GEN-END:variables
}
