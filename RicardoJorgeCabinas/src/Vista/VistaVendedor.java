package Vista;

import Logica.LogicaCliente;
import Logica.LogicaPlanMinutos;
import Logica.LogicaPromocion;
import Modelo.Cliente;
import Modelo.PlanMinutos;
import Logica.LogicaUsbModem;
import Modelo.Promocion;
import Modelo.UsbModem;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaVendedor extends javax.swing.JFrame{
    LogicaCliente lc = new LogicaCliente();
    LogicaPromocion lp = new LogicaPromocion();
    LogicaUsbModem lum = new LogicaUsbModem();
    List<UsbModem> modems = lum.consultarModems();

    public VistaVendedor()  
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas - Vendedor");
        this.setResizable(false);
        llenarTablaModems(modems);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPaneVistaVendedor = new javax.swing.JTabbedPane();
        panelRegistrarVenta = new javax.swing.JPanel();
        panelAlquilarModem = new javax.swing.JPanel();
        panelPlanes = new javax.swing.JPanel();
        labeltituloPlanes = new javax.swing.JLabel();
        campoConsultaPlanes = new javax.swing.JTextField();
        botonConsultarPlanes = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPlanes = new javax.swing.JTable();
        panelModems = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaModems = new javax.swing.JTable();
        labeltituloModems = new javax.swing.JLabel();
        campoConsultaModems = new javax.swing.JTextField();
        botonConsultarModem = new javax.swing.JButton();
        ActualizarTablaModems = new javax.swing.JButton();
        panelPromociones = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaPromociones = new javax.swing.JTable();
        botonConsultarPromociones = new javax.swing.JButton();
        campoConsultaPromociones = new javax.swing.JTextField();
        labeltituloPromociones = new javax.swing.JLabel();
        panelClientesVendedor = new javax.swing.JPanel();
        botonAgregarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        campoConsultaCliente = new javax.swing.JTextField();
        labeltitulo = new javax.swing.JLabel();
        botonConsultarCliente = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 500));

        panelRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPaneVistaVendedor.addTab("Venta Minutos", panelRegistrarVenta);
        jTabbedPaneVistaVendedor.addTab("Alquilar Modem", panelAlquilarModem);

        labeltituloPlanes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltituloPlanes.setForeground(new java.awt.Color(255, 255, 255));
        labeltituloPlanes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes.setText("PLANES");

        botonConsultarPlanes.setText("Consultar");
        botonConsultarPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarPlanesActionPerformed(evt);
            }
        });

        tablaPlanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaPlanes);

        javax.swing.GroupLayout panelPlanesLayout = new javax.swing.GroupLayout(panelPlanes);
        panelPlanes.setLayout(panelPlanesLayout);
        panelPlanesLayout.setHorizontalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanesLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(panelPlanesLayout.createSequentialGroup()
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(botonConsultarPlanes)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        panelPlanesLayout.setVerticalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultarPlanes))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPaneVistaVendedor.addTab("Planes", panelPlanes);

        tablaModems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaModems);

        labeltituloModems.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltituloModems.setForeground(new java.awt.Color(255, 255, 255));
        labeltituloModems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloModems.setText("MODEMS");

        botonConsultarModem.setText("Consultar");
        botonConsultarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarModemActionPerformed(evt);
            }
        });

        ActualizarTablaModems.setText("Actualizar");
        ActualizarTablaModems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaModemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModemsLayout = new javax.swing.GroupLayout(panelModems);
        panelModems.setLayout(panelModemsLayout);
        panelModemsLayout.setHorizontalGroup(
            panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModemsLayout.createSequentialGroup()
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(labeltituloModems, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelModemsLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(ActualizarTablaModems))
                            .addGroup(panelModemsLayout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(campoConsultaModems, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(botonConsultarModem)))
                .addGap(59, 59, 59))
        );
        panelModemsLayout.setVerticalGroup(
            panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModemsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labeltituloModems, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoConsultaModems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultarModem))
                .addGap(12, 12, 12)
                .addComponent(ActualizarTablaModems)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneVistaVendedor.addTab("Modems", panelModems);

        tablaPromociones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaPromociones);

        botonConsultarPromociones.setText("Consultar");
        botonConsultarPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarPromocionesActionPerformed(evt);
            }
        });

        labeltituloPromociones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltituloPromociones.setForeground(new java.awt.Color(255, 255, 255));
        labeltituloPromociones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPromociones.setText("PROMOCIONES");

        javax.swing.GroupLayout panelPromocionesLayout = new javax.swing.GroupLayout(panelPromociones);
        panelPromociones.setLayout(panelPromocionesLayout);
        panelPromocionesLayout.setHorizontalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonConsultarPromociones))
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPromocionesLayout.setVerticalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultarPromociones))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneVistaVendedor.addTab("Promociones", panelPromociones);

        panelClientesVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAgregarCliente.setText("Agregar");
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaClientes);

        panelClientesVendedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 603, 260));
        panelClientesVendedor.add(campoConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 180, -1));

        labeltitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(255, 255, 255));
        labeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitulo.setText("CLIENTES");
        panelClientesVendedor.add(labeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 150, 40));

        botonConsultarCliente.setText("Consultar");
        botonConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jTabbedPaneVistaVendedor.addTab(" Clientes", panelClientesVendedor);

        botonAtras.setText("Menu Inicio");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarClienteActionPerformed
        llenarTablaClientes(lc.consultarClientes(campoConsultaCliente.getText()));
    }//GEN-LAST:event_botonConsultarClienteActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked

    }//GEN-LAST:event_tablaClientesMouseClicked

    /*
        Metodo para crear una ventana que permite agrear un cliente
        Entrada: Evento del Botón
        Salida: --
    */ 
    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        AgregarCliente ac = new AgregarCliente(new VistaAdministrador(), true);
        ac.setVisible(true);
        llenarTablaClientes(lc.consultarClientes(campoConsultaCliente.getText()));
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        LoginInicio loginInicio = new LoginInicio();
        loginInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    /* Metodo para consultar un usbModem de la BD y mostrar el resultado en la tabla de
       modems. La consulta se realiza con el codigo del modem, todo o una parte del nombre.
       Entrada: evento del boton
       Salida: ---
    */
    private void botonConsultarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarModemActionPerformed
        UsbModem um = null;
        List<UsbModem> modems = new ArrayList<>();
        
        if(isNumeric(campoConsultaModems.getText())){
            try {
                um = lum.consultarModemCodigo(Long.parseLong(campoConsultaModems.getText()));
                modems.add(um);
                llenarTablaModems(modems);
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
            campoConsultaModems.setText("");
        }else {
            try {
                modems= lum.consultarModemsNombre(campoConsultaModems.getText());
                llenarTablaModems(modems);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
            campoConsultaModems.setText("");
        }
    }//GEN-LAST:event_botonConsultarModemActionPerformed

    /* Metodo para actualizar la tabla de modems consultando todos los registros de la BD
       Entrada: evento del boton
       Salida: ---
    */
    private void ActualizarTablaModemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaModemsActionPerformed
        List<UsbModem> modems = lum.consultarModems();
        llenarTablaModems(modems);
    }//GEN-LAST:event_ActualizarTablaModemsActionPerformed

    /*
        Metodo para consultar promociones
        Entrada: Evento del Botón
        Salida: --
    */ 
    private void botonConsultarPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarPromocionesActionPerformed
        llenarTablaPromociones(lp.consultarPromocion(campoConsultaPromociones.getText()));
    }//GEN-LAST:event_botonConsultarPromocionesActionPerformed

    private void botonConsultarPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarPlanesActionPerformed

        String texto = campoConsultaPlanes.getText();
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        List<PlanMinutos> planMinuto = logicaPlanMinutos.consultarPlanMinutosNombre(texto);
        if(texto.isEmpty()){
            planMinuto = logicaPlanMinutos.consultarPlanMinutos();
        }else{
            PlanMinutos planID = logicaPlanMinutos.consultarPlanMinutosID(Long.parseLong(texto));
        if(planID != null)
            planMinuto.add(planID);
        }
        llenarTablaPlanMinutos(planMinuto);
    }//GEN-LAST:event_botonConsultarPlanesActionPerformed

    public void llenarTablaPlanMinutos(List<PlanMinutos> listaPlanMinutos){
        DefaultTableModel dtm = new DefaultTableModel();
        tablaPlanes.setModel(dtm);
        dtm.addColumn("Codigo");
        dtm.addColumn("Nombre");
        dtm.addColumn("Tiempo aire");
        dtm.addColumn("Valor compra");
        dtm.addColumn("Valor venta");
        dtm.addColumn("Acomulable");
        dtm.addColumn("Minuto alerta");
        dtm.addColumn("Estado");
        
        if(listaPlanMinutos != null){
            String[] fila = new String[8];
            for(PlanMinutos listaPlanMinuto : listaPlanMinutos){
                fila[0] = String.valueOf(listaPlanMinuto.getCodigoplan());
                fila[1] = listaPlanMinuto.getNombreplan();
                fila[2] = String.valueOf(listaPlanMinuto.getCantidadminutos());
                fila[3] = String.valueOf(listaPlanMinuto.getCostominuto());
                fila[4] = String.valueOf(listaPlanMinuto.getPreciominuto());
                fila[5] = String.valueOf(listaPlanMinuto.getMinutosacumulables());
                fila[6] = String.valueOf(listaPlanMinuto.getCantidadminimaminutos());
                fila[7] = String.valueOf(listaPlanMinuto.getEstadoplanminutos());
                dtm.addRow(fila);
            }
        }
    }

  /* Metodo para llenar la tabla con los registros de la consulta que se haga a la BD.
       Entrada: lista de objetos de tipo UsbModems 
       Salida: ---
    */
    private void llenarTablaModems(List<UsbModem> modems){
        DefaultTableModel dtm = new DefaultTableModel();
        tablaModems.setModel(dtm);
         
        dtm.addColumn("Código");
        dtm.addColumn("Nombre ");
        dtm.addColumn("Proveedor");
        dtm.addColumn("Disponibilidad");
        dtm.addColumn("Costo Día");
        dtm.addColumn("Precio Día");
        dtm.addColumn("Estado");
         
        String[] fila = new String[7];
         
        for (int i = 0; i < modems.size(); i++) {
            fila[0] = modems.get(i).getCodigomodem()+"";
            fila[1] = modems.get(i).getNombremodem();
            fila[2] = modems.get(i).getProveedor();
            fila[3] = modems.get(i).getDisponibilidad();
            fila[4] = modems.get(i).getCostodia()+"";
            fila[5] = modems.get(i).getPreciodia()+"";
            
            if(modems.get(i).getEstadousbmodem()){
                fila[6] = "Activo";
            }else{
                fila[6] = "Inactivo";
            }
            
            dtm.addRow(fila);
        }
    }
    
    /*Método para verificar si un string empieza (o es) un numero que sera tomado
      como Long. El metodo se usa para realizar la consulta de modems por codigo 
      o nombre desde un mismo campo de texto.
      Entrada: String del campo de texto de consulta de modems
      Salida: True si es texto es un numero
              False si es texto solamente
    */
    public  boolean isNumeric(String str){  
        try{  
            Long cod = Long.parseLong(str);  
        }catch(NumberFormatException nfe){
            return false;
        }
        return true;  
    } 
   
    /*
        Metodo para mostrar clientes
        Entrada: lista de objetos Cliente
        Salida: --
    */
    public void llenarTablaClientes(List<Cliente> listaClientes){
        Calendar fecha = Calendar.getInstance();
        String estado, s = "";
        DefaultTableModel dtm = new DefaultTableModel();
        tablaClientes.setModel(dtm);
        dtm.addColumn("NOMBRE");
        dtm.addColumn("TELEFONO");
        dtm.addColumn("DIRECCION");
        dtm.addColumn("CORREO");
        dtm.addColumn("IDENTIFICACION");
        dtm.addColumn("FECHA_NAC");
        dtm.addColumn("ESTADO");
        String[] fila = new String[7];
        for (int i = 0; i < listaClientes.size(); i++) {
           fila[0]=listaClientes.get(i).getNombrecliente();
           fila[1]=listaClientes.get(i).getTelefonocliente();
           fila[2]=listaClientes.get(i).getDireccioncliente();
           fila[3]=listaClientes.get(i).getCorreocliente();
           fila[4]=listaClientes.get(i).getCedulacliente();
           fecha.setTimeInMillis(listaClientes.get(i).getFechanacimientocliente().getTime());
           s= fecha.get(Calendar.DAY_OF_MONTH) +"-"+ (fecha.get(Calendar.MONTH)+1) +"-"+fecha.get(Calendar.YEAR);
           fila[5]=s;
           if(listaClientes.get(i).getEstadocliente()){
               estado = "Activo";
           }else{
               estado="Inactivo";
           }
           fila[6]=estado;
           dtm.addRow(fila);
        }
    }

    /*
        Metodo para mostrar Promociones
        Entrada: lista de objetos Promocion
        Salida: --
    */
    public void llenarTablaPromociones(List<Promocion> listaPromociones){
        Calendar fecha = Calendar.getInstance();
        String estado, s = "";
        DefaultTableModel dtm = new DefaultTableModel();
        tablaPromociones.setModel(dtm);
        dtm.addColumn("CÓDIGO");
        dtm.addColumn("TIPO");
        dtm.addColumn("CONDICIÓN");
        dtm.addColumn("BENEFICIO");
        dtm.addColumn("DESCRIPCIÓN");
        dtm.addColumn("INICIA");
        dtm.addColumn("TERMINA");
        dtm.addColumn("ESTADO");
        String[] fila = new String[8];
        for (int i = 0; i < listaPromociones.size(); i++) {
           fila[0]=listaPromociones.get(i).getCodigopromocion()+"";
           fila[1]=listaPromociones.get(i).getTipopromocion();
           fila[2]=listaPromociones.get(i).getCondicion()+"";
           fila[3]=listaPromociones.get(i).getBeneficio()+"";
           fila[4]=listaPromociones.get(i).getDescripcion();
           fecha.setTimeInMillis(listaPromociones.get(i).getFechainiciopromocion().getTime());
           s= fecha.get(Calendar.DAY_OF_MONTH) +"-"+ (fecha.get(Calendar.MONTH)+1) +"-"+fecha.get(Calendar.YEAR);
           fila[5]=s;
           fecha.setTimeInMillis(listaPromociones.get(i).getFechafinpromocion().getTime());
           s= fecha.get(Calendar.DAY_OF_MONTH) +"-"+ (fecha.get(Calendar.MONTH)+1) +"-"+fecha.get(Calendar.YEAR);
           fila[6]=s;
           if(listaPromociones.get(i).getEstadopromocion()){
               estado = "Activa";
           }else{
               estado="Inactiva";
           }
           fila[7]=estado;
           dtm.addRow(fila);
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarTablaModems;
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonConsultarCliente;
    private javax.swing.JButton botonConsultarModem;
    private javax.swing.JButton botonConsultarPlanes;
    private javax.swing.JButton botonConsultarPromociones;
    private javax.swing.JTextField campoConsultaCliente;
    private javax.swing.JTextField campoConsultaModems;
    private javax.swing.JTextField campoConsultaPlanes;
    private javax.swing.JTextField campoConsultaPromociones;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPaneVistaVendedor;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JLabel labeltituloModems;
    private javax.swing.JLabel labeltituloPlanes;
    private javax.swing.JLabel labeltituloPromociones;
    private javax.swing.JPanel panelAlquilarModem;
    private javax.swing.JPanel panelClientesVendedor;
    private javax.swing.JPanel panelModems;
    private javax.swing.JPanel panelPlanes;
    private javax.swing.JPanel panelPromociones;
    private javax.swing.JPanel panelRegistrarVenta;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaModems;
    private javax.swing.JTable tablaPlanes;
    private javax.swing.JTable tablaPromociones;
    // End of variables declaration//GEN-END:variables

    
}
