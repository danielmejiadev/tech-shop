package Vista;

import Logica.LogicaPlanMinutos;
import Logica.LogicaVentaMinutos;
import Modelo.PlanMinutos;
import Modelo.VentaMinutos;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Daniel
 */
public class RegistrarVenta extends javax.swing.JDialog {

    VentaMinutos venta;
    public RegistrarVenta(java.awt.Frame parent, boolean modal, VentaMinutos venta) 
    {
        super(parent, modal);
        initComponents();
        this.venta=venta;
        llenarCampos();
        this.setTitle("Registrar Venta");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoPlan = new javax.swing.JTextField();
        jLabelBusqueda5 = new javax.swing.JLabel();
        jLabelBusqueda6 = new javax.swing.JLabel();
        campoMinutosVendidos = new javax.swing.JFormattedTextField();
        jLabelBusqueda7 = new javax.swing.JLabel();
        jLabelBusqueda8 = new javax.swing.JLabel();
        campoMinutosFacturados = new javax.swing.JFormattedTextField();
        campoPrecioMinuto = new javax.swing.JFormattedTextField();
        jLabelBusqueda9 = new javax.swing.JLabel();
        jLabelBusqueda10 = new javax.swing.JLabel();
        campoTotalVenta = new javax.swing.JFormattedTextField();
        labeltituloRegistrar = new javax.swing.JLabel();
        campoCliente = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoPlan.setForeground(new java.awt.Color(162, 146, 146));
        campoPlan.setFocusable(false);

        jLabelBusqueda5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda5.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda5.setText("Cliente");

        jLabelBusqueda6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda6.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda6.setText("Plan");

        campoMinutosVendidos.setForeground(new java.awt.Color(162, 146, 146));
        campoMinutosVendidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoMinutosVendidos.setFocusable(false);

        jLabelBusqueda7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda7.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda7.setText("Minutos Vendidos");

        jLabelBusqueda8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda8.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda8.setText("Minutos Facturados");

        campoMinutosFacturados.setForeground(new java.awt.Color(162, 146, 146));
        campoMinutosFacturados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoMinutosFacturados.setFocusable(false);

        campoPrecioMinuto.setForeground(new java.awt.Color(162, 146, 146));
        campoPrecioMinuto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoPrecioMinuto.setFocusable(false);

        jLabelBusqueda9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda9.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda9.setText("Precio Minuto $");

        jLabelBusqueda10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda10.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda10.setText("Total  Venta $");

        campoTotalVenta.setForeground(new java.awt.Color(162, 146, 146));
        campoTotalVenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoTotalVenta.setFocusable(false);

        labeltituloRegistrar.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloRegistrar.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloRegistrar.setText("Registrar Venta");

        campoCliente.setForeground(new java.awt.Color(162, 146, 146));
        campoCliente.setFocusable(false);

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

        botonGuardar.setBackground(new java.awt.Color(162, 146, 146));
        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.setOpaque(true);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labeltituloRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabelBusqueda5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBusqueda10)
                            .addComponent(jLabelBusqueda9)
                            .addComponent(jLabelBusqueda8)
                            .addComponent(jLabelBusqueda6)
                            .addComponent(jLabelBusqueda7))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoMinutosFacturados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecioMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoMinutosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addComponent(campoCliente)
                    .addComponent(campoPlan))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltituloRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBusqueda5)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBusqueda6)
                    .addComponent(campoPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBusqueda7)
                    .addComponent(campoMinutosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMinutosFacturados, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBusqueda8))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPrecioMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBusqueda9))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBusqueda10))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        registrarVenta();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void llenarCampos()
    {
        campoCliente.setText(venta.getCedulacliente().getCedulacliente());
        campoPlan.setText(venta.getCodigoplan().getCodigoplan()+" " + venta.getCodigoplan().getNombreplan());
        campoMinutosVendidos.setText(venta.getMinutosvendidos()+"");
        campoMinutosFacturados.setText(venta.getMinutosfacturados()+"");
        campoPrecioMinuto.setText(venta.getCodigoplan().getPreciominuto()+"");
        campoTotalVenta.setText(venta.getCodigoplan().getPreciominuto()*venta.getMinutosfacturados()+"");
        
    }
    public void registrarVenta()
    {
        try {
            
            LogicaVentaMinutos logicaVentaMinutos = new LogicaVentaMinutos();
            logicaVentaMinutos.registrarVenta(venta);
            
            PlanMinutos plan = venta.getCodigoplan();
            plan.setCantidadminutos(plan.getCantidadminutos()-venta.getMinutosvendidos());
            LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
            logicaPlanMinutos.modificarPlanMinutos(plan);
            
        } catch (Exception ex) {
            Logger.getLogger(RegistrarVenta.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
            this.dispose();
        }
    }


 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCancelar1;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JFormattedTextField campoMinutosFacturados;
    private javax.swing.JFormattedTextField campoMinutosVendidos;
    private javax.swing.JTextField campoPlan;
    private javax.swing.JFormattedTextField campoPrecioMinuto;
    private javax.swing.JFormattedTextField campoTotalVenta;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelBusqueda10;
    private javax.swing.JLabel jLabelBusqueda5;
    private javax.swing.JLabel jLabelBusqueda6;
    private javax.swing.JLabel jLabelBusqueda7;
    private javax.swing.JLabel jLabelBusqueda8;
    private javax.swing.JLabel jLabelBusqueda9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labeltituloRegistrar;
    // End of variables declaration//GEN-END:variables
}
