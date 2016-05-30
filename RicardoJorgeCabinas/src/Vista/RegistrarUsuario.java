
package Vista;

import Logica.LogicaUsuario;
import Modelo.Usuario;
import javax.swing.JOptionPane;


public class RegistrarUsuario extends javax.swing.JDialog {

    
    public RegistrarUsuario(VistaAdministrador parent, boolean modal) 
    {
        super(parent, modal); 
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas");
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCedulaUsuario9 = new javax.swing.JTextField();
        labelFondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        botonAgregarUsuario = new javax.swing.JButton();
        labelTipo = new javax.swing.JLabel();
        comboBoxTipoUsuario = new javax.swing.JComboBox<>();
        combobEstadoUsuario = new javax.swing.JComboBox<>();
        labelEstado = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        campoContraseña = new javax.swing.JTextField();
        labeltitulo = new javax.swing.JLabel();
        campoCedulaUsuario = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 530));

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

        botonAgregarUsuario.setBackground(new java.awt.Color(162, 146, 146));
        botonAgregarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarUsuario.setText("Guardar");
        botonAgregarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregarUsuario.setContentAreaFilled(false);
        botonAgregarUsuario.setOpaque(true);
        botonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarUsuarioActionPerformed(evt);
            }
        });

        labelTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(162, 146, 146));
        labelTipo.setText("Tipo  *");

        comboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Administrador" }));

        combobEstadoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        labelEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(162, 146, 146));
        labelEstado.setText("Estado:  ");

        labelCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(162, 146, 146));
        labelCorreo.setText("E - Mail ");

        labelTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(162, 146, 146));
        labelTelefono.setText("Teléfono");

        labelContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(162, 146, 146));
        labelContraseña.setText("Contraseña *");

        labeltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(162, 146, 146));
        labeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitulo.setText("Registrar Usuario");

        labelCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCedula.setForeground(new java.awt.Color(162, 146, 146));
        labelCedula.setText("Cedula * ");

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(162, 146, 146));
        labelNombre.setText("Nombre *");

        labelDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(162, 146, 146));
        labelDireccion.setText("Dirección");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEstado)
                            .addComponent(labelTipo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(comboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combobEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCedula)
                            .addComponent(labelNombre)
                            .addComponent(labelTelefono)
                            .addComponent(labelContraseña)
                            .addComponent(labelDireccion)
                            .addComponent(labelCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCedulaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labeltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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
                    .addComponent(combobEstadoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstado))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipo))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarUsuarioActionPerformed
        String cedula=campoCedulaUsuario.getText();
        String nombre=campoNombre.getText();
        String contraseña = campoContraseña.getText();
        String direccion = campoDireccion.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        String estado=combobEstadoUsuario.getSelectedItem().toString();
        boolean valorEstado=true;
        if(estado.equalsIgnoreCase("inactivo"))
        {
            valorEstado=false;
        }
        String tipo=comboBoxTipoUsuario.getSelectedItem().toString().toLowerCase();
        if(cedula.isEmpty()||nombre.isEmpty()||contraseña.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese los campos obligatorios");
        }
        else
        {
            LogicaUsuario logicaUsuario = new LogicaUsuario();
            Usuario usuarioVerificacion= logicaUsuario.consultarUsuarioCedula(cedula);
            if(usuarioVerificacion!=null)
            {
                JOptionPane.showMessageDialog(null,"El usuario ingresado ya existe");
            }
            else
            {
                try {
                    Usuario usuario = new Usuario();
                    usuario.setCedulausuario(cedula);
                    usuario.setNombreusuario(nombre);
                    usuario.setDireccionusuario(direccion);
                    usuario.setContrasena(contraseña);
                    usuario.setTelefonosuario(telefono);
                    usuario.setCorreousuario(correo);
                    usuario.setEstadousuario(valorEstado);
                    usuario.setTipousuario(tipo);
                    logicaUsuario.registrarUsuario(usuario);
                } catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null,"Error, no se pudo registrar el usuario");
                }
                finally
                {
                    this.dispose();
                }
            }
    
        }   
    }//GEN-LAST:event_botonAgregarUsuarioActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarUsuario;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField campoCedulaUsuario;
    private javax.swing.JTextField campoCedulaUsuario9;
    private javax.swing.JTextField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JComboBox<String> comboBoxTipoUsuario;
    private javax.swing.JComboBox<String> combobEstadoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labeltitulo;
    // End of variables declaration//GEN-END:variables
}
