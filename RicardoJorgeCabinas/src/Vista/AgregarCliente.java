
package Vista;

import Logica.LogicaCliente;
import Modelo.Cliente;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class AgregarCliente extends javax.swing.JDialog {

    private VistaAdministrador framePadre;
    
    public AgregarCliente(VistaAdministrador parent, boolean modal) {
        super(parent, modal);
        framePadre = parent;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Cliente");
        this.setResizable(false);
        llenarCombos();
    }
    
    /*
        Metodo para diligenciar los jComboBox que contienen las opciones de 
                selección de fechas.
        Entrada: --
        Salida: --
    */ 
    public void llenarCombos(){
        Calendar fechaActual = Calendar.getInstance();
        for (int i = fechaActual.get(Calendar.YEAR); i > 1900 ; i--) {
            jComboBoxAnio.addItem(i+"");
            if(i<=1931){
                jComboBoxDia.addItem((i-1900)+"");
            }
            if(i<=1912){
                jComboBoxMes.addItem((i-1900)+"");
            }
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldDireccionCliente = new javax.swing.JTextField();
        jFormattedTextFieldIdCliente = new javax.swing.JFormattedTextField();
        jTextFieldCorreoCliente = new javax.swing.JTextField();
        jFormattedTextFieldTelefonoCliente = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonGuardarCliente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAnio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 205, -1));
        getContentPane().add(jTextFieldDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 205, -1));

        jFormattedTextFieldIdCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, 205, -1));
        getContentPane().add(jTextFieldCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 205, -1));

        jFormattedTextFieldTelefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 191, 205, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha Nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 194, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Identificación  ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 220, -1, -1));

        jButtonGuardarCliente.setText("Guardar");
        jButtonGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("AGREGAR CLIENTE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("E-mail  ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        getContentPane().add(jComboBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 40, -1));

        getContentPane().add(jComboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        getContentPane().add(jComboBoxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Metodo para registrar el nuevo Cliente
        Entrada: Evento del boton
        Salida: --
    */ 
    private void jButtonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarClienteActionPerformed
        try {
            Cliente c = new Cliente();
            c.setNombrecliente(jTextFieldNombreCliente.getText());
            c.setCorreocliente(jTextFieldCorreoCliente.getText());
            c.setDireccioncliente(jTextFieldDireccionCliente.getText());
            c.setTelefonocliente(jFormattedTextFieldTelefonoCliente.getText());
            c.setCedulacliente(jFormattedTextFieldIdCliente.getText());
        
            int dia = Integer.parseInt(jComboBoxDia.getSelectedItem().toString());
            int mes = Integer.parseInt(jComboBoxMes.getSelectedItem().toString());
            int anio = Integer.parseInt(jComboBoxAnio.getSelectedItem().toString());
            Calendar calendar = Calendar.getInstance();
            calendar.set(anio, mes-1, dia);
            Date f = new Date(calendar.getTimeInMillis());
            c.setFechanacimientocliente(f);
       
            LogicaCliente lc = new LogicaCliente();
       
            
                if(lc.validarCliente(c)){
                    lc.registrar(c);
                    JOptionPane.showMessageDialog(rootPane, "Cliente creado:"
                    + "\nNombre: " + jTextFieldNombreCliente.getText()
                    + "\nIdentificacion:  " + jFormattedTextFieldIdCliente.getText()
                    + "\nTelefono:  " + jFormattedTextFieldTelefonoCliente.getText()
                    + "\nDireccion:  " + jTextFieldDireccionCliente.getText()
                    + "\nFecha Nacimiento:  " + c.getFechanacimientocliente().toString()
                    + "\nCorreo:  " + jTextFieldCorreoCliente.getText());
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Por favor diligencie bien los datos");
                }
            } catch (Exception ex) {
            
                JOptionPane.showMessageDialog(rootPane, "Por favor diligencie bien los datos");
                //Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButtonGuardarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGuardarCliente;
    private javax.swing.JComboBox<String> jComboBoxAnio;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefonoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldCorreoCliente;
    private javax.swing.JTextField jTextFieldDireccionCliente;
    private javax.swing.JTextField jTextFieldNombreCliente;
    // End of variables declaration//GEN-END:variables
}


