package Vista;

import Logica.LogicaUsbModem;
import Modelo.UsbModem;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author stefania
 */
public class ModificarModem extends javax.swing.JFrame {

    LogicaUsbModem lum = new LogicaUsbModem();
    
    public ModificarModem(Long cod) {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarCampos(cod);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        activoModem = new javax.swing.JRadioButton();
        inactivoModem = new javax.swing.JRadioButton();
        ProveedorModem = new javax.swing.JComboBox<>();
        NombreModem = new javax.swing.JTextField();
        GuardarModem = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        CostoModem = new javax.swing.JFormattedTextField();
        PrecioModem = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        CodigoModem = new javax.swing.JTextField();
        DisponibilidadModem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 530));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 146, 146));
        jLabel1.setText("Modificar Modem");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 146, 146));
        jLabel2.setText("Nombre Modem:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 146, 146));
        jLabel3.setText("Proveedor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 146, 146));
        jLabel4.setText("Disponibilidad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(162, 146, 146));
        jLabel5.setText("Costo por día:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(162, 146, 146));
        jLabel6.setText("Precio por día:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(162, 146, 146));
        jLabel7.setText("Estado:");

        buttonGroup1.add(activoModem);
        activoModem.setText("Activo");

        buttonGroup1.add(inactivoModem);
        inactivoModem.setText("Inactivo");

        ProveedorModem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claro", "Movistar", "Tigo", "Uff", "Virgin" }));

        GuardarModem.setBackground(new java.awt.Color(162, 146, 146));
        GuardarModem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GuardarModem.setForeground(new java.awt.Color(255, 255, 255));
        GuardarModem.setText("Guardar");
        GuardarModem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GuardarModem.setContentAreaFilled(false);
        GuardarModem.setOpaque(true);
        GuardarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarModemActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(162, 146, 146));
        Cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cancelar.setContentAreaFilled(false);
        Cancelar.setOpaque(true);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        CostoModem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        PrecioModem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(162, 146, 146));
        jLabel8.setText("Código Modem:");

        CodigoModem.setEnabled(false);

        DisponibilidadModem.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(GuardarModem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CodigoModem, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(activoModem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inactivoModem))
                            .addComponent(ProveedorModem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CostoModem)
                            .addComponent(PrecioModem)
                            .addComponent(NombreModem, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(DisponibilidadModem))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CodigoModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProveedorModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DisponibilidadModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CostoModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PrecioModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activoModem)
                    .addComponent(inactivoModem)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarModem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarModemActionPerformed
        long cod = Long.parseLong(CodigoModem.getText());
        UsbModem um = null;
        try {
            um = lum.consultarModemCodigo(cod);
        } catch (Exception ex) {
            Logger.getLogger(ModificarModem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(NombreModem.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
        }else{
            um.setNombremodem(NombreModem.getText());
            
            um.setProveedor(ProveedorModem.getSelectedItem().toString());
            um.setDisponibilidad("Disponible");

            if(CostoModem.getText().equals("")){
                um.setCostodia(0);
            }else{
                um.setCostodia(Integer.parseInt(CostoModem.getText()));
            }

            if(PrecioModem.getText().equals("")){
                um.setPreciodia(0);
            }else{
                um.setPreciodia(Integer.parseInt(PrecioModem.getText()));
            }


            if(activoModem.isSelected()){
                um.setEstadousbmodem(true);
            }else if(inactivoModem.isSelected()){
                um.setEstadousbmodem(false);
            }

            lum.modificarModem(um);
            JOptionPane.showMessageDialog(null, "El modem fue modificado exitosamente.");   
            dispose();          
        }
    }//GEN-LAST:event_GuardarModemActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void llenarCampos(Long cod){
        UsbModem um = null;
        try {
            um = lum.consultarModemCodigo(cod);
        } catch (Exception ex) {
            Logger.getLogger(ModificarModem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CodigoModem.setText(um.getCodigomodem()+"");
        
        NombreModem.setText(um.getNombremodem());
        
        for (int i = 0; i < ProveedorModem.getItemCount(); i++) {
            if(ProveedorModem.getItemAt(i).equals(um.getProveedor())){
                ProveedorModem.setSelectedIndex(i);
            }
        }
        
        DisponibilidadModem.setText(um.getDisponibilidad());
        
        CostoModem.setText(um.getCostodia()+"");
        PrecioModem.setText(um.getPreciodia()+"");
        
        if(um.getDisponibilidad().equals("Disponible")){
            if(um.getEstadousbmodem()){
                activoModem.setSelected(true);
            }else{
                inactivoModem.setSelected(true);
            }
        }else{
            if(um.getEstadousbmodem()){
                activoModem.setSelected(true);
            }else{
                inactivoModem.setSelected(true);
            }
            activoModem.setEnabled(false);
            inactivoModem.setEnabled(false);
        }       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField CodigoModem;
    private javax.swing.JFormattedTextField CostoModem;
    private javax.swing.JTextField DisponibilidadModem;
    private javax.swing.JButton GuardarModem;
    private javax.swing.JTextField NombreModem;
    private javax.swing.JFormattedTextField PrecioModem;
    private javax.swing.JComboBox<String> ProveedorModem;
    private javax.swing.JRadioButton activoModem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton inactivoModem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
