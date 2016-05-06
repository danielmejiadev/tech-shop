package Vista;

import Logica.LogicaUsuario;
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

        labelCedulaUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        campoCedulaUsuario = new javax.swing.JTextField();
        campoContraseñaUsuario = new javax.swing.JPasswordField();
        botonIngresar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCedulaUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelCedulaUsuario.setText("Cedula Usuario");
        getContentPane().add(labelCedulaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 100, -1));

        labelContraseña.setForeground(new java.awt.Color(0, 0, 0));
        labelContraseña.setText("Contraseña");
        getContentPane().add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 120, -1));

        campoCedulaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoContraseñaUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(campoCedulaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 210, 25));

        campoContraseñaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoContraseñaUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(campoContraseñaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 210, 25));

        botonIngresar.setText("Ingresar");
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
        getContentPane().add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 100, -1));

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 100, -1));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

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
                             VistaAdministrador vistaAdministrador=new VistaAdministrador();
                             vistaAdministrador.setVisible(true);
                             this.dispose();
                         }
                         else
                         {
                             VistaVendedor vistaVendedor=new VistaVendedor();
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
    private javax.swing.JLabel labelCedulaUsuario;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables
}
