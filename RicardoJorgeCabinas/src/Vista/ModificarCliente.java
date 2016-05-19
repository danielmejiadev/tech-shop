
package Vista;

import Logica.LogicaCliente;
import Modelo.Cliente;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class ModificarCliente extends javax.swing.JDialog {
    private Calendar fechaActual = Calendar.getInstance();
    private VistaAdministrador framePadre;
    private LogicaCliente lc = new LogicaCliente();
    private Cliente clienteModif;
    public ModificarCliente(VistaAdministrador parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        framePadre = parent;
        clienteModif = cliente;
        initComponents();
        this.setTitle("Modificar Cliente");
        this.setLocationRelativeTo(null);
        llenarCampos(cliente);
        this.setResizable(false);
        llenarCombos(cliente);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldDireccionCliente = new javax.swing.JTextField();
        jFormattedTextFieldIdCliente = new javax.swing.JFormattedTextField();
        jTextFieldCorreoCliente = new javax.swing.JTextField();
        jFormattedTextFieldTelefonoCliente = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAnio = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 205, -1));
        getContentPane().add(jTextFieldDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 141, 205, -1));

        try {
            jFormattedTextFieldIdCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldIdCliente.setFocusable(false);
        getContentPane().add(jFormattedTextFieldIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, 205, -1));
        getContentPane().add(jTextFieldCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 165, 205, -1));

        jFormattedTextFieldTelefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 191, 205, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha Nac");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 168, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 194, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Identificación");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 220, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("MODIFICAR CLIENTE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 118, -1, -1));

        getContentPane().add(jComboBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, -1));

        getContentPane().add(jComboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, -1));

        getContentPane().add(jComboBoxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Activo");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Inactivo");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Metodo para llamar la función de Modificar un cliente
        Entrada: Evento del Botón
        Salida: --
    */ 
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if(modificar(this.clienteModif)){
            JOptionPane.showMessageDialog(rootPane, "Se ha modificado el Cliente con Exito.");
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se ha modificado el Cliente, verifique los valores ingresados");
        }
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /*
        Metodo para mostrar los datos del cliente en sus respecivos espacios (JtextField, JRadioButton, etc.)
        Entrada: Objeto Cliente
        Salida: --
    */ 
    public void llenarCampos(Cliente cliente){
        jTextFieldNombreCliente.setText(cliente.getNombrecliente());
        jTextFieldDireccionCliente.setText(cliente.getDireccioncliente());
        jTextFieldCorreoCliente.setText(cliente.getCorreocliente());
        jFormattedTextFieldTelefonoCliente.setText(cliente.getTelefonocliente());
        jFormattedTextFieldIdCliente.setText(cliente.getCedulacliente());
        if(cliente.getEstadocliente()){
            jRadioButton1.doClick();
            System.out.println("Activo");
        }else{
            jRadioButton2.doClick();
            System.out.println("Inactivo");
        }
    }
    
    /*
        Metodo para Modificar un cliente
        Entrada: Objeto Cliente
        Salida: True: si la modificación fue exitosa
                False: si la modificación no fue exitosa
    */ 
    public boolean modificar(Cliente cliente){
        boolean b=false;
         try{
            cliente.setNombrecliente(jTextFieldNombreCliente.getText());
            cliente.setCorreocliente(jTextFieldCorreoCliente.getText());
            cliente.setDireccioncliente(jTextFieldDireccionCliente.getText());
            cliente.setTelefonocliente(jFormattedTextFieldTelefonoCliente.getText());
            
            int dia = Integer.parseInt(jComboBoxDia.getSelectedItem().toString());
            int mes = Integer.parseInt(jComboBoxMes.getSelectedItem().toString());
            int anio = Integer.parseInt(jComboBoxAnio.getSelectedItem().toString());
            Calendar calendar = Calendar.getInstance();
            calendar.set(anio, mes-1, dia);
            Date f = new Date(calendar.getTimeInMillis());
            cliente.setFechanacimientocliente(f);
            
            if(jRadioButton1.isSelected()){
                cliente.setEstadocliente(true);
                System.out.println("queda Activo");
            }else{
                cliente.setEstadocliente(false);
                System.out.println("queda Inactivo");
            }
       
                if(lc.validarCliente(cliente)){
                    lc.modificarCliente(cliente);
                    b=true;
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Errores al modificar el cliente");
            }
        return b;
    }
    
    /*
        Metodo para diligenciar los JComboBox que contienen las posibles fechas
                a seleccionar.
        Entrada: Objeto Cliente 
        Salida: --
    */ 
    public void llenarCombos(Cliente cliente){
        for (int i = fechaActual.get(Calendar.YEAR); i > 1900 ; i--) {
            jComboBoxAnio.addItem(i+"");
            if(i<=1931){
                jComboBoxDia.addItem((i-1900)+"");
            }
            if(i<=1912){
                jComboBoxMes.addItem((i-1900)+"");
            }
        }
        fechaActual.setTimeInMillis(cliente.getFechanacimientocliente().getTime());
        jComboBoxAnio.setSelectedItem(fechaActual.get(Calendar.YEAR)+"");
        jComboBoxMes.setSelectedItem(fechaActual.get(Calendar.MONTH)+1+"");
        jComboBoxDia.setSelectedItem(fechaActual.get(Calendar.DAY_OF_MONTH)+"");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxAnio;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefonoCliente;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextFieldCorreoCliente;
    private javax.swing.JTextField jTextFieldDireccionCliente;
    private javax.swing.JTextField jTextFieldNombreCliente;
    // End of variables declaration//GEN-END:variables
}
