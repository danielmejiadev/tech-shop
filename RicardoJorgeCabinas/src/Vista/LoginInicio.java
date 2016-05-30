package Vista;

import Logica.LogicaUsuario;
import Modelo.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class LoginInicio extends javax.swing.JFrame {

    public LoginInicio() 
    {
        initComponents();
        this.setTitle("Cabinas de Ricardo Jorge");
        this.setResizable(false);
        this.setLocationRelativeTo(null);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCedulaUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        campoCedulaUsuario = new javax.swing.JTextField();
        campoContraseñaUsuario = new javax.swing.JPasswordField();
        botonIngresar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 530));

        labelCedulaUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCedulaUsuario.setForeground(new java.awt.Color(162, 146, 146));
        labelCedulaUsuario.setText("Cedula Usuario");

        labelContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(162, 146, 146));
        labelContraseña.setText("Contraseña");

        campoCedulaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoContraseñaUsuarioKeyPressed(evt);
            }
        });

        campoContraseñaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoContraseñaUsuarioKeyPressed(evt);
            }
        });

        botonIngresar.setBackground(new java.awt.Color(162, 146, 146));
        botonIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Ingresar");
        botonIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar.setContentAreaFilled(false);
        botonIngresar.setOpaque(true);
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        botonIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoContraseñaUsuarioKeyPressed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(162, 146, 146));
        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.setContentAreaFilled(false);
        botonSalir.setOpaque(true);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 146, 146));
        jLabel1.setText("SIRJ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCedulaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoContraseñaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedulaUsuario)
                    .addComponent(campoCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContraseña))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        verificarIngreso();
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void campoContraseñaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoContraseñaUsuarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            verificarIngreso();
        }
    }//GEN-LAST:event_campoContraseñaUsuarioKeyPressed

    public void verificarIngreso()
    {
        String cedulaUsuario=campoCedulaUsuario.getText();
        String contraseña=campoContraseñaUsuario.getText();
        if(cedulaUsuario.isEmpty() || contraseña.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Campos obligatorios");
        }
        else
        {
            LogicaUsuario logicaUsuario = new LogicaUsuario();
            int valorVerificacion = logicaUsuario.validarUsuario(cedulaUsuario, contraseña);
            if(valorVerificacion==1)
            {
                JOptionPane.showMessageDialog(null,"El usuario no existe");
                campoCedulaUsuario.setText("");
                campoContraseñaUsuario.setText("");
            }
            else
            {
                if(valorVerificacion==2)
                {
                     JOptionPane.showMessageDialog(null,"La contraseña es incorrecta");
                     campoCedulaUsuario.setText("");
                     campoContraseñaUsuario.setText("");
                }
                else
                {
                     if(valorVerificacion==3)
                     {
                         JOptionPane.showMessageDialog(null,"El usuario no se encuentra activo en el sistema");
                         campoCedulaUsuario.setText("");
                         campoContraseñaUsuario.setText("");
                     }
                     else
                     {
                         if(valorVerificacion==4)
                         {
                             Usuario usuario= logicaUsuario.consultarUsuarioCedula(cedulaUsuario);
                             VistaAdministrador vistaAdministrador=new VistaAdministrador(usuario);
                             vistaAdministrador.setVisible(true);
                             this.dispose();
                         }
                         else
                         {
                             Usuario usuario= logicaUsuario.consultarUsuarioCedula(cedulaUsuario);
                             VistaVendedor vistaVendedor=new VistaVendedor(usuario);
                             vistaVendedor.setVisible(true);
                             this.dispose();
                         }
                     }
                }
            }
        }
    }
    
    public static void main(String args[]) 
    {
       new LoginInicio().setVisible(true); 
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoCedulaUsuario;
    private javax.swing.JPasswordField campoContraseñaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCedulaUsuario;
    private javax.swing.JLabel labelContraseña;
    // End of variables declaration//GEN-END:variables
}
