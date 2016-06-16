package Vista;

import Logica.LogicaPlanMinutos;
import Modelo.PlanMinutos;
import javax.swing.JOptionPane;

/**
 *
 * @author ALVARO ANDRES
 */
public class ModificarPlan extends javax.swing.JFrame {

     private PlanMinutos elPlan;
     VistaAdministrador administrador;
    
    public ModificarPlan(PlanMinutos elPlan, VistaAdministrador administrador) {
        initComponents();
        this.setTitle("Modificar Plan Minutos");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.elPlan = elPlan;
        this.administrador=administrador;
        cargarDatos(elPlan);
        llenarFecha(elPlan);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAcomulable = new javax.swing.ButtonGroup();
        buttonGroupEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonModificar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jRadioButtonActivo = new javax.swing.JRadioButton();
        jRadioButtonInactivo = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        cantidadMinAlerta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        valorVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valorCompra = new javax.swing.JTextField();
        tiempoAlAire = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonSI = new javax.swing.JRadioButton();
        jRadioButtonNO = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxNombrePlan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelProximaRecarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonModificar.setBackground(new java.awt.Color(162, 146, 146));
        jButtonModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setOpaque(true);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
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

        buttonGroupEstado.add(jRadioButtonActivo);
        jRadioButtonActivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonActivo.setText("Activo");

        buttonGroupEstado.add(jRadioButtonInactivo);
        jRadioButtonInactivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonInactivo.setText("Inactivo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(162, 146, 146));
        jLabel9.setText("Estado");

        cantidadMinAlerta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(162, 146, 146));
        jLabel8.setText("Cantidad Minima Alerta");

        valorVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(162, 146, 146));
        jLabel7.setText("Valor Venta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(162, 146, 146));
        jLabel6.setText("Valor Compra");

        valorCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tiempoAlAire.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(162, 146, 146));
        jLabel5.setText("Tiempo al aire (Min)");

        buttonGroupAcomulable.add(jRadioButtonSI);
        jRadioButtonSI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonSI.setText("Sí");

        buttonGroupAcomulable.add(jRadioButtonNO);
        jRadioButtonNO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonNO.setText("No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 146, 146));
        jLabel4.setText("Acumulable");

        jComboBoxNombrePlan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxNombrePlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claro", "Movistar", "Tigo-Une", "Virgin Mobile", "Avantel", "Uff", "ETB", "Internacional" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 146, 146));
        jLabel3.setText("Nombre Plan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 146, 146));
        jLabel1.setText("Modificar Plan");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonActivo)
                                        .addGap(24, 24, 24)
                                        .addComponent(jRadioButtonInactivo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(cantidadMinAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonSI)
                                        .addGap(76, 76, 76)
                                        .addComponent(jRadioButtonNO))
                                    .addComponent(jComboBoxNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelProximaRecarga)
                                    .addComponent(tiempoAlAire, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSI)
                    .addComponent(jRadioButtonNO)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempoAlAire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelProximaRecarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonActivo)
                    .addComponent(jRadioButtonInactivo)
                    .addComponent(jLabel9))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Método para cerrar la ventana cuando el usuario ingresa cancelar
       Entrada: Evento del boton
       Salida: vacia
    */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    /* Metodo que me permite modificar los datos de un plan de minutos
       Entrada: evento del boton 
       Salida: vacia
    */
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        String nombrePlan = jComboBoxNombrePlan.getSelectedItem().toString();
        boolean acomulable = jRadioButtonSI.isSelected();
        String tiempoAire = tiempoAlAire.getText();
        String precioCompra = valorCompra.getText();
        String precioVenta = valorVenta.getText();
        String minutoAlerta = cantidadMinAlerta.getText();
        boolean estado = jRadioButtonActivo.isSelected();
        boolean seleccion = false;
        if(acomulable == true || estado == true || acomulable == false || estado == false){
          seleccion = true;  
        }
        if(isNumeric(tiempoAire) && isNumeric(precioCompra) && isNumeric(precioVenta) && isNumeric(minutoAlerta)){
            if(nombrePlan.isEmpty() || tiempoAire.isEmpty() || precioCompra.isEmpty() || precioVenta.isEmpty() || minutoAlerta.isEmpty() || seleccion == false){
            JOptionPane.showMessageDialog(null, "No se puede modificar con campos vacíos");
        }else{
            try {
                LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
                elPlan.setNombreplan(nombrePlan);
                elPlan.setMinutosacumulables(acomulable);
                elPlan.setCantidadminutosfijos(Integer.parseInt(tiempoAire));
                elPlan.setCostominuto(Integer.parseInt(precioCompra));
                elPlan.setPreciominuto(Integer.parseInt(precioVenta));
                elPlan.setCantidadminimaminutos(Integer.parseInt(minutoAlerta));
                elPlan.setEstadoplanminutos(estado);
                logicaPlanMinutos.modificarPlanMinutos(elPlan);
                JOptionPane.showMessageDialog(null, "El plan fue modificado exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, no se pudo modificar");
            } finally{
                administrador.llenarComboPlanesVenta();
                this.dispose();
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos Tiempo al Aire, Valor Compra, Valor Venta y Cantidad Minima Alerta deben ser numericos");
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /* Método para llenar los datos en el modulo de modificar y el usuario pueda ver los datos en el sistema
       Entrada: Objeto plan de minutos seleccionado 
       Salida: vacio
    */
    public void cargarDatos(PlanMinutos elPlan){
        jComboBoxNombrePlan.setSelectedItem(elPlan.getNombreplan());
        if(elPlan.getMinutosacumulables())
            jRadioButtonSI.setSelected(true);
        else
            jRadioButtonNO.setSelected(true);
        tiempoAlAire.setText(Integer.toString(elPlan.getCantidadminutos()));
        jLabelProximaRecarga.setText(llenarFecha(elPlan));
        valorCompra.setText(Integer.toString(elPlan.getCostominuto()));
        valorVenta.setText(Integer.toString(elPlan.getPreciominuto()));
        cantidadMinAlerta.setText(Integer.toString(elPlan.getCantidadminimaminutos()));
        if(elPlan.getEstadoplanminutos())
            jRadioButtonActivo.setSelected(true);
        else
            jRadioButtonInactivo.setSelected(true);
    }
    
    /* Método para llenar automaticament la fecha de próxima recarga, suma un mes a la fecha actual
       Entrada: Objeto Plan de Minutos seleccionado
       Salida: String en formato de fecha DD/MM/AAAA
    */
    public String llenarFecha(PlanMinutos elPlan){
         java.util.Date fechaRecarga = elPlan.getFechaproximarecarga();
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
        return laFecha;
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
    private javax.swing.JButton jButtonModificar;
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
