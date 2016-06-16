package Vista;

import Logica.LogicaPlanMinutos;
import Modelo.PlanMinutos;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ALVARO ANDRES
 */
public class AgregarPlan extends javax.swing.JFrame {


    private VistaAdministrador administrador;
    
    public AgregarPlan(VistaAdministrador administrador) {
        initComponents();
        this.setTitle("Agregar Plan Minutos");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.administrador=administrador;
        llenarFecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAcomulable = new javax.swing.ButtonGroup();
        buttonGroupEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jRadioButtonInactivo = new javax.swing.JRadioButton();
        jRadioButtonActivo = new javax.swing.JRadioButton();
        cantidadMinAlerta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        valorVenta = new javax.swing.JTextField();
        valorCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tiempoAlAire = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonNO = new javax.swing.JRadioButton();
        jRadioButtonSI = new javax.swing.JRadioButton();
        jComboBoxNombrePlan = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelProximaRecarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 530));

        jButtonGuardar.setBackground(new java.awt.Color(162, 146, 146));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGuardar.setContentAreaFilled(false);
        jButtonGuardar.setOpaque(true);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(162, 146, 146));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setOpaque(true);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        buttonGroupEstado.add(jRadioButtonInactivo);
        jRadioButtonInactivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonInactivo.setText("Inactivo");

        buttonGroupEstado.add(jRadioButtonActivo);
        jRadioButtonActivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonActivo.setSelected(true);
        jRadioButtonActivo.setText("Activo");

        cantidadMinAlerta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(162, 146, 146));
        jLabel9.setText("Estado");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(162, 146, 146));
        jLabel8.setText("Cantidad Minima Alerta");

        valorVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        valorCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(162, 146, 146));
        jLabel7.setText("Valor Venta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(162, 146, 146));
        jLabel6.setText("Valor Compra");

        tiempoAlAire.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(162, 146, 146));
        jLabel5.setText("Tiempo al aire (Min)");

        buttonGroupAcomulable.add(jRadioButtonNO);
        jRadioButtonNO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonNO.setText("No");

        buttonGroupAcomulable.add(jRadioButtonSI);
        jRadioButtonSI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonSI.setSelected(true);
        jRadioButtonSI.setText("Sí");

        jComboBoxNombrePlan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxNombrePlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Claro", "Movistar", "Tigo-Une", "Virgin Mobile", "Avantel", "Uff", "ETB", "Internacional" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 146, 146));
        jLabel4.setText("Acomulable");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 146, 146));
        jLabel3.setText("Proveedor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 146, 146));
        jLabel1.setText("Agregar Plan Minutos");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(162, 146, 146));
        jLabel10.setText("Fecha Próxima Recarga");

        jLabelProximaRecarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelProximaRecarga.setForeground(new java.awt.Color(162, 146, 146));
        jLabelProximaRecarga.setText("XX/XX/XXXX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(133, 133, 133)
                                    .addComponent(jRadioButtonActivo)
                                    .addGap(52, 52, 52)
                                    .addComponent(jRadioButtonInactivo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(32, 32, 32)
                                    .addComponent(cantidadMinAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonSI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButtonNO))
                                    .addComponent(jComboBoxNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(35, 35, 35)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelProximaRecarga)
                                    .addComponent(tiempoAlAire, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonNO)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonSI)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabelProximaRecarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempoAlAire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonInactivo)
                        .addComponent(jRadioButtonActivo)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Método para cerrar la ventana cuando el usuario ingresa cancelar
       Entrada: Evento del boton
       Salida: vacia
    */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /* Método para guardar y almacenar en la base de datos el plan de minutos creado
       Entrada: Evento del boton
       Salida: vacia
    */
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String nombrePlan = jComboBoxNombrePlan.getSelectedItem().toString();
        boolean acomulable = jRadioButtonSI.isSelected();
        String tiempoAire = tiempoAlAire.getText();
        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.MONTH, 1);
        Date fechaRecarga = new Date(calendario.getTimeInMillis());
        String precioCompra = valorCompra.getText();
        String precioVenta = valorVenta.getText();
        String minutoAlerta = cantidadMinAlerta.getText();
        boolean estado = jRadioButtonActivo.isSelected();
        boolean seleccion = false;
        if(acomulable == true || estado == true || acomulable == false || estado == false){
          seleccion = true;  
        }
        if (isNumeric(tiempoAire) && isNumeric(precioCompra) && isNumeric(precioVenta) && isNumeric(minutoAlerta)) {
            if(nombrePlan.isEmpty() || tiempoAire.isEmpty() || precioCompra.isEmpty() || precioVenta.isEmpty() || minutoAlerta.isEmpty() || seleccion == false){
            JOptionPane.showMessageDialog(null, "No se puede registrar con campos vacíos");
        }else{
            LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
            try {
                PlanMinutos elPlan = new PlanMinutos();
                elPlan.setNombreplan(nombrePlan);
                elPlan.setMinutosacumulables(acomulable);
                elPlan.setCantidadminutos(Integer.parseInt(tiempoAire));
                elPlan.setCantidadminutosfijos(Integer.parseInt(tiempoAire));
                elPlan.setFechaproximarecarga(fechaRecarga);
                elPlan.setCostominuto(Integer.parseInt(precioCompra));
                elPlan.setPreciominuto(Integer.parseInt(precioVenta));
                elPlan.setCantidadminimaminutos(Integer.parseInt(minutoAlerta));
                elPlan.setEstadoplanminutos(estado);
                logicaPlanMinutos.registrarPlanMinutos(elPlan);
                JOptionPane.showMessageDialog(null, "El plan fue registrado exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, no se pudo registrar");
            } finally{
                administrador.llenarComboPlanesVenta();
                this.dispose();
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos Tiempo al Aire, Valor Compra, Valor Venta y Cantidad Minima Alerta deben ser numericos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    /* Método para llenar automaticamente la fecha de próxima recarga, suma un mes a la fecha actual
       Entrada: vacía
       Salida: vacia
    */
    private void llenarFecha(){
        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.MONTH, 1);
        Date fechaRecarga = new Date(calendario.getTimeInMillis());
        int dia = fechaRecarga.getDate();
        int mes = fechaRecarga.getMonth();
        int anio = fechaRecarga.getYear();
        String elMes = "";
                switch(mes){
                    case 0:
                        elMes = "Enero";
                        break;
                    case 1:
                        elMes = "Febrero";
                        break;
                    case 2:
                        elMes = "Marzo";
                        break;
                    case 3:
                        elMes = "Abril";
                        break;
                    case 4:
                        elMes = "Mayo";
                        break;
                    case 5:
                        elMes = "Junio";
                        break;
                    case 6:
                        elMes = "Julio";
                        break;
                    case 7:
                        elMes = "Agosto";
                        break;
                    case 8:
                        elMes = "Septiembre";
                        break;
                    case 9:
                        elMes = "Octubre";
                        break;
                    case 10:
                        elMes = "Noviembre";
                        break;
                    case 11:
                        elMes = "Diciembre";
                        break;
                }
        String laFecha = dia+"/"+elMes+"/"+(anio+1900);
        jLabelProximaRecarga.setText(laFecha);
    }

    
    /*Método para verificar si un string empieza (o es) un numero que sera tomado como entero. El metodo se usa
    para validar los campos de texto (tiempo al aire, valor compra, valor venta, cantidad minima alerta) 
    sean numericos en el panel.
      Entrada: String del campo de texto
      Salida: True si es texto es un numero
              False si es texto solamente
    */
    private boolean isNumeric(String s) {
        try {
            int numero = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAcomulable;
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JTextField cantidadMinAlerta;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxNombrePlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelProximaRecarga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonActivo;
    private javax.swing.JRadioButton jRadioButtonInactivo;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonSI;
    private javax.swing.JTextField tiempoAlAire;
    private javax.swing.JTextField valorCompra;
    private javax.swing.JTextField valorVenta;
    // End of variables declaration//GEN-END:variables
}
