
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
        campoNombre = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        botonGuardarUsuario = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        comboBoxTipoUsuario = new javax.swing.JComboBox<String>();
        labelTipo = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoContraseña = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        labelFonodo = new javax.swing.JLabel();
        campoCedulaUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 205, 30));

        labelCedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCedula.setText("Cedula * ");
        getContentPane().add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNombre.setText("Nombre *");
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        labelDireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDireccion.setText("Dirección");
        getContentPane().add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        labelContraseña.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelContraseña.setText("Contraseña *");
        getContentPane().add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        labelTelefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTelefono.setText("Teléfono");
        getContentPane().add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        botonGuardarUsuario.setText("Guardar");
        botonGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        comboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "vendedor", "administrador" }));
        getContentPane().add(comboBoxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 205, -1));

        labelTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTipo.setText("Tipo  *");
        getContentPane().add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        labelCorreo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCorreo.setText("E - Mail ");
        getContentPane().add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        labeltitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitulo.setText("MODIFICAR USUARIO");
        getContentPane().add(labeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, -1));
        getContentPane().add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 205, 30));
        getContentPane().add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 205, 30));
        getContentPane().add(campoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 205, 30));
        getContentPane().add(campoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 205, 30));
        getContentPane().add(labelFonodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 380));

        campoCedulaUsuario.setEditable(false);
        campoCedulaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(campoCedulaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 205, 30));

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
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFonodo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labeltitulo;
    // End of variables declaration//GEN-END:variables
}
