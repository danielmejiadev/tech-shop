package Vista;

import Logica.LogicaCliente;
import Logica.LogicaPlanMinutos;
import Logica.LogicaPromocion;
import Modelo.Cliente;
import Modelo.PlanMinutos;
import Logica.LogicaUsbModem;
import Logica.LogicaVentaMinutos;
import Modelo.Promocion;
import Modelo.UsbModem;
import Modelo.Usuario;
import Modelo.VentaMinutos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaVendedor extends javax.swing.JFrame{
    LogicaCliente lc = new LogicaCliente();
    LogicaPromocion lp = new LogicaPromocion();
    LogicaUsbModem lum = new LogicaUsbModem();
    List<UsbModem> modems = lum.consultarModems();
    Usuario usuariActivo;
    Cliente clienteVenta;
    PlanMinutos planVenta;
    boolean ventaLista;
    int precioMinuto;
    int minutosVendidos;
    int minutosFacturados;
    int totalVenta;
    
    public VistaVendedor(Usuario usuarioActivo)  
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas - Vendedor");
        this.setResizable(false);
        this.usuariActivo=usuarioActivo;
        this.ventaLista=false;
        llenarTablaModems(modems);
        llenarComboPlanesVenta();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPaneVistaVendedor = new javax.swing.JTabbedPane();
        panelRegistrarVenta = new javax.swing.JPanel();
        campoConsultaClienteVenta = new javax.swing.JTextField();
        labeltituloPlanes1 = new javax.swing.JLabel();
        jLabelBusqueda4 = new javax.swing.JLabel();
        jLabelBusqueda5 = new javax.swing.JLabel();
        jLabelBusqueda6 = new javax.swing.JLabel();
        jLabelBusqueda7 = new javax.swing.JLabel();
        jLabelBusqueda8 = new javax.swing.JLabel();
        jLabelBusqueda9 = new javax.swing.JLabel();
        botonRegistrarVenta = new javax.swing.JButton();
        comboPlanesVenta = new javax.swing.JComboBox();
        campoTotalVenta = new javax.swing.JFormattedTextField();
        campoMinutosFacturados = new javax.swing.JFormattedTextField();
        campoMinutosVendidos = new javax.swing.JFormattedTextField();
        campoPrecioMinuto = new javax.swing.JFormattedTextField();
        botonCalcular = new javax.swing.JButton();
        panelAlquilarModem = new javax.swing.JPanel();
        panelClientesVendedor = new javax.swing.JPanel();
        botonAgregarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        labeltitulo = new javax.swing.JLabel();
        botonConsultarCliente = new javax.swing.JButton();
        botonActualizarTablaClientes = new javax.swing.JButton();
        jLabelBusqueda = new javax.swing.JLabel();
        campoConsultaCliente = new javax.swing.JTextField();
        panelPlanes = new javax.swing.JPanel();
        labeltituloPlanes = new javax.swing.JLabel();
        botonConsultarPlanes = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPlanes = new javax.swing.JTable();
        campoConsultaPlanes = new javax.swing.JTextField();
        jLabelBusqueda1 = new javax.swing.JLabel();
        botonActualizarTablaPlan = new javax.swing.JButton();
        panelModems = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaModems = new javax.swing.JTable();
        labeltituloModems = new javax.swing.JLabel();
        botonConsultarModem = new javax.swing.JButton();
        ActualizarTablaModems = new javax.swing.JButton();
        campoConsultaModems = new javax.swing.JTextField();
        jLabelBusqueda2 = new javax.swing.JLabel();
        panelPromociones = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaPromociones = new javax.swing.JTable();
        botonConsultarPromociones = new javax.swing.JButton();
        labeltituloPromociones = new javax.swing.JLabel();
        jLabelBusqueda3 = new javax.swing.JLabel();
        campoConsultaPromociones = new javax.swing.JTextField();
        botonActualizarTablaPromo = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 560));
        setSize(new java.awt.Dimension(900, 560));

        jTabbedPaneVistaVendedor.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneVistaVendedor.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneVistaVendedor.setOpaque(true);
        jTabbedPaneVistaVendedor.setPreferredSize(new java.awt.Dimension(900, 470));

        panelRegistrarVenta.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoConsultaClienteVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoMinutosVendidosFocusGained(evt);
            }
        });
        panelRegistrarVenta.add(campoConsultaClienteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 180, 25));

        labeltituloPlanes1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPlanes1.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPlanes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes1.setText("Venta Minutos");
        panelRegistrarVenta.add(labeltituloPlanes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabelBusqueda4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda4.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda4.setText("Cliente *");
        panelRegistrarVenta.add(jLabelBusqueda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabelBusqueda5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda5.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda5.setText("Precio Minuto $");
        panelRegistrarVenta.add(jLabelBusqueda5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabelBusqueda6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda6.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda6.setText("Plan");
        panelRegistrarVenta.add(jLabelBusqueda6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabelBusqueda7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda7.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda7.setText("Minutos Vendidos * ");
        panelRegistrarVenta.add(jLabelBusqueda7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabelBusqueda8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda8.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda8.setText("Minutos Facturados");
        panelRegistrarVenta.add(jLabelBusqueda8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabelBusqueda9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda9.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda9.setText("Total  Venta $");
        panelRegistrarVenta.add(jLabelBusqueda9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        botonRegistrarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonRegistrarVenta.setForeground(new java.awt.Color(162, 146, 146));
        botonRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro.png"))); // NOI18N
        botonRegistrarVenta.setText("Registrar");
        botonRegistrarVenta.setBorderPainted(false);
        botonRegistrarVenta.setContentAreaFilled(false);
        botonRegistrarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRegistrarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarVentaActionPerformed(evt);
            }
        });
        panelRegistrarVenta.add(botonRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        comboPlanesVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoMinutosVendidosFocusGained(evt);
            }
        });
        panelRegistrarVenta.add(comboPlanesVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 180, -1));

        campoTotalVenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoTotalVenta.setFocusable(false);
        panelRegistrarVenta.add(campoTotalVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 90, 25));

        campoMinutosFacturados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoMinutosFacturados.setFocusable(false);
        panelRegistrarVenta.add(campoMinutosFacturados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 90, 25));

        campoMinutosVendidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoMinutosVendidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoMinutosVendidosFocusGained(evt);
            }
        });
        panelRegistrarVenta.add(campoMinutosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 90, 25));

        campoPrecioMinuto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoPrecioMinuto.setFocusable(false);
        panelRegistrarVenta.add(campoPrecioMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, 25));

        botonCalcular.setText("Verificar");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });
        panelRegistrarVenta.add(botonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jTabbedPaneVistaVendedor.addTab("Venta Minutos", panelRegistrarVenta);
        jTabbedPaneVistaVendedor.addTab("Alquilar Modem", panelAlquilarModem);

        panelClientesVendedor.setBackground(new java.awt.Color(255, 255, 255));
        panelClientesVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAgregarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarCliente.setForeground(new java.awt.Color(162, 146, 146));
        botonAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro.png"))); // NOI18N
        botonAgregarCliente.setText("Registrar");
        botonAgregarCliente.setBorderPainted(false);
        botonAgregarCliente.setContentAreaFilled(false);
        botonAgregarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

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

        panelClientesVendedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 680, 150));

        labeltitulo.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(162, 146, 146));
        labeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitulo.setText("Clientes");
        panelClientesVendedor.add(labeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, 40));

        botonConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        botonConsultarCliente.setBorderPainted(false);
        botonConsultarCliente.setContentAreaFilled(false);
        botonConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 40, 40));

        botonActualizarTablaClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizarTablaClientes.setForeground(new java.awt.Color(162, 146, 146));
        botonActualizarTablaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        botonActualizarTablaClientes.setText("Actualizar");
        botonActualizarTablaClientes.setBorderPainted(false);
        botonActualizarTablaClientes.setContentAreaFilled(false);
        botonActualizarTablaClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarTablaClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizarTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarTablaClientesActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonActualizarTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jLabelBusqueda.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda.setText("Búsqueda:");
        panelClientesVendedor.add(jLabelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        panelClientesVendedor.add(campoConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 300, 25));

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/cliente.png")), panelClientesVendedor); // NOI18N

        panelPlanes.setBackground(new java.awt.Color(255, 255, 255));

        labeltituloPlanes.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPlanes.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPlanes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes.setText("Planes");

        botonConsultarPlanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        botonConsultarPlanes.setBorderPainted(false);
        botonConsultarPlanes.setContentAreaFilled(false);
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

        jLabelBusqueda1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda1.setText("Búsqueda:");

        botonActualizarTablaPlan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizarTablaPlan.setForeground(new java.awt.Color(162, 146, 146));
        botonActualizarTablaPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        botonActualizarTablaPlan.setText("Actualizar");
        botonActualizarTablaPlan.setBorderPainted(false);
        botonActualizarTablaPlan.setContentAreaFilled(false);
        botonActualizarTablaPlan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarTablaPlan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizarTablaPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarTablaPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPlanesLayout = new javax.swing.GroupLayout(panelPlanes);
        panelPlanes.setLayout(panelPlanesLayout);
        panelPlanesLayout.setHorizontalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanesLayout.createSequentialGroup()
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelBusqueda1)
                        .addGap(18, 18, 18)
                        .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultarPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(botonActualizarTablaPlan)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelPlanesLayout.setVerticalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanesLayout.createSequentialGroup()
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBusqueda1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonConsultarPlanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonActualizarTablaPlan)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/plan.png")), panelPlanes); // NOI18N

        panelModems.setBackground(new java.awt.Color(255, 255, 255));

        tablaModems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaModems);

        labeltituloModems.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloModems.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloModems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloModems.setText("Modems");

        botonConsultarModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        botonConsultarModem.setBorderPainted(false);
        botonConsultarModem.setContentAreaFilled(false);
        botonConsultarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarModemActionPerformed(evt);
            }
        });

        ActualizarTablaModems.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ActualizarTablaModems.setForeground(new java.awt.Color(162, 146, 146));
        ActualizarTablaModems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        ActualizarTablaModems.setText("Actualizar");
        ActualizarTablaModems.setBorderPainted(false);
        ActualizarTablaModems.setContentAreaFilled(false);
        ActualizarTablaModems.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ActualizarTablaModems.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ActualizarTablaModems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaModemsActionPerformed(evt);
            }
        });

        jLabelBusqueda2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda2.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda2.setText("Búsqueda:");

        javax.swing.GroupLayout panelModemsLayout = new javax.swing.GroupLayout(panelModems);
        panelModems.setLayout(panelModemsLayout);
        panelModemsLayout.setHorizontalGroup(
            panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModemsLayout.createSequentialGroup()
                .addComponent(ActualizarTablaModems)
                .addGap(353, 353, 353))
            .addGroup(panelModemsLayout.createSequentialGroup()
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabelBusqueda2)
                        .addGap(37, 37, 37)
                        .addComponent(campoConsultaModems, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultarModem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labeltituloModems, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelModemsLayout.setVerticalGroup(
            panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModemsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBusqueda2)
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoConsultaModems, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonConsultarModem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(35, 35, 35)
                .addComponent(labeltituloModems, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ActualizarTablaModems)
                .addContainerGap())
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/modem.png")), panelModems); // NOI18N

        panelPromociones.setBackground(new java.awt.Color(255, 255, 255));

        tablaPromociones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaPromociones);

        botonConsultarPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        botonConsultarPromociones.setBorderPainted(false);
        botonConsultarPromociones.setContentAreaFilled(false);
        botonConsultarPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarPromocionesActionPerformed(evt);
            }
        });

        labeltituloPromociones.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPromociones.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPromociones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPromociones.setText("Promociones");

        jLabelBusqueda3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda3.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda3.setText("Búsqueda:");

        botonActualizarTablaPromo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizarTablaPromo.setForeground(new java.awt.Color(162, 146, 146));
        botonActualizarTablaPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        botonActualizarTablaPromo.setText("Actualizar");
        botonActualizarTablaPromo.setBorderPainted(false);
        botonActualizarTablaPromo.setContentAreaFilled(false);
        botonActualizarTablaPromo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarTablaPromo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelPromocionesLayout = new javax.swing.GroupLayout(panelPromociones);
        panelPromociones.setLayout(panelPromocionesLayout);
        panelPromocionesLayout.setHorizontalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabelBusqueda3)
                        .addGap(29, 29, 29)
                        .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultarPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(botonActualizarTablaPromo)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelPromocionesLayout.setVerticalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBusqueda3)
                            .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPromocionesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botonConsultarPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botonActualizarTablaPromo)
                .addGap(29, 29, 29))
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/promo.png")), panelPromociones); // NOI18N

        botonAtras.setBackground(new java.awt.Color(255, 255, 255));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salir.png"))); // NOI18N
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setOpaque(true);
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 146, 146));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cabinas Ricardo Jorge");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void botonConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarClienteActionPerformed
        llenarTablaClientes(lc.consultarClientes(campoConsultaCliente.getText()));
    }//GEN-LAST:event_botonConsultarClienteActionPerformed

    private void botonRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarVentaActionPerformed
        if(ventaLista)
        {   
          VentaMinutos venta = new VentaMinutos();
          venta.setCedulacliente(clienteVenta);
          venta.setCedulausuario(usuariActivo);
          venta.setCodigoplan(planVenta);
          venta.setPreciominuto(precioMinuto);
          venta.setMinutosfacturados(minutosFacturados);
          venta.setMinutosvendidos(minutosVendidos);
          Date fechaActual = new Date();
          venta.setFechaventa(fechaActual);  
          
          int dialogButton = JOptionPane.YES_NO_OPTION;
          JOptionPane.showConfirmDialog (null, "¿Seguro desea guardar la venta?","Advertencia",dialogButton);

          if(dialogButton == JOptionPane.YES_OPTION)
          { 
            LogicaVentaMinutos logicaVenta = new LogicaVentaMinutos();
            logicaVenta.registrarVenta(venta);      
            ventaLista=false;
          } 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Por favor verificar para poder realizar la venta");
        }  
    }//GEN-LAST:event_botonRegistrarVentaActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        if(campoMinutosVendidos.getText().isEmpty() || campoConsultaClienteVenta.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese los campos obligatorios");
        }
        else
        {
            LogicaCliente logicaCliente = new LogicaCliente();
            clienteVenta=logicaCliente.consultarCliente(campoConsultaClienteVenta.getText());
            
            if(clienteVenta==null)
            {
              JOptionPane.showMessageDialog(null,"El cliente no existe, se coloco el cliente por defecto");
              clienteVenta=logicaCliente.consultarCliente("default");
              campoConsultaClienteVenta.setText(clienteVenta.getCedulacliente());
            }
            
            campoConsultaClienteVenta.setBackground(Color.LIGHT_GRAY);
            campoMinutosVendidos.setBackground(Color.LIGHT_GRAY);
            Long codigoPlan = Long.parseLong(comboPlanesVenta.getSelectedItem().toString().split(" ")[0]);
            LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
            planVenta = logicaPlanMinutos.consultarPlanMinutosID(codigoPlan);
            //Aqui deberia ir el codigo para calcular si cumple una promocion
            precioMinuto=planVenta.getPreciominuto();
            minutosVendidos=Integer.parseInt(campoMinutosVendidos.getText());
            minutosFacturados=minutosVendidos;
            totalVenta = minutosFacturados*precioMinuto;
            campoMinutosFacturados.setText(minutosFacturados+"");
            campoPrecioMinuto.setText(precioMinuto+"");
            campoTotalVenta.setText(totalVenta+"");
            ventaLista=true;   
    
        }   
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void botonActualizarTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarTablaClientesActionPerformed

    private void campoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoMinutosVendidosFocusGained
        campoConsultaClienteVenta.setBackground(Color.white);
        campoMinutosVendidos.setBackground(Color.white);
        clienteVenta=null;
        ventaLista=false;
    }//GEN-LAST:event_campoMinutosVendidosFocusGained

    private void botonActualizarTablaPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaPlanActionPerformed
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        List<PlanMinutos> losPlanes = logicaPlanMinutos.consultarPlanMinutos();
        llenarTablaPlanMinutos(losPlanes);
    }//GEN-LAST:event_botonActualizarTablaPlanActionPerformed
    
    public void llenarTablaPlanMinutos(List<PlanMinutos> listaPlanMinutos){
        DefaultTableModel dtm = new DefaultTableModel();
        tablaPlanes.setModel(dtm);
        Calendar fecha = Calendar.getInstance();
        String laFecha;
        dtm.addColumn("Codigo");
        dtm.addColumn("Nombre");
        dtm.addColumn("Tiempo aire");
        dtm.addColumn("Saldo");
        dtm.addColumn("Próxima Recarga");
        dtm.addColumn("Valor compra");
        dtm.addColumn("Valor venta");
        dtm.addColumn("Acomulable");
        dtm.addColumn("Minuto alerta");
        dtm.addColumn("Estado");
        
        if(listaPlanMinutos != null){
            String[] fila = new String[10];
            for(PlanMinutos listaPlanMinuto : listaPlanMinutos){
                fila[0] = String.valueOf(listaPlanMinuto.getCodigoplan());
                fila[1] = listaPlanMinuto.getNombreplan();
                fila[2] = String.valueOf(listaPlanMinuto.getCantidadminutosfijos());
                fila[3] = String.valueOf(listaPlanMinuto.getCantidadminutos());
                fecha.setTimeInMillis(listaPlanMinuto.getFechaproximarecarga().getTime());
                laFecha = fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR);
                fila[4] = laFecha;
                fila[5] = String.valueOf(listaPlanMinuto.getCostominuto());
                fila[6] = String.valueOf(listaPlanMinuto.getPreciominuto());
                fila[7] = String.valueOf(listaPlanMinuto.getMinutosacumulables());
                fila[8] = String.valueOf(listaPlanMinuto.getCantidadminimaminutos());
                fila[9] = String.valueOf(listaPlanMinuto.getEstadoplanminutos());
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
    
     private void llenarComboPlanesVenta()
    { 
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        List<PlanMinutos> planes = logicaPlanMinutos.consultarPlanMinutos();
        for(PlanMinutos plan : planes)
        {
            comboPlanesVenta.addItem(plan.getCodigoplan()+" "+plan.getNombreplan());
        }  
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarTablaModems;
    private javax.swing.JButton botonActualizarTablaClientes;
    private javax.swing.JButton botonActualizarTablaPlan;
    private javax.swing.JButton botonActualizarTablaPromo;
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonConsultarCliente;
    private javax.swing.JButton botonConsultarModem;
    private javax.swing.JButton botonConsultarPlanes;
    private javax.swing.JButton botonConsultarPromociones;
    private javax.swing.JButton botonRegistrarVenta;
    private javax.swing.JTextField campoConsultaCliente;
    private javax.swing.JTextField campoConsultaClienteVenta;
    private javax.swing.JTextField campoConsultaModems;
    private javax.swing.JTextField campoConsultaPlanes;
    private javax.swing.JTextField campoConsultaPromociones;
    private javax.swing.JFormattedTextField campoMinutosFacturados;
    private javax.swing.JFormattedTextField campoMinutosVendidos;
    private javax.swing.JFormattedTextField campoPrecioMinuto;
    private javax.swing.JFormattedTextField campoTotalVenta;
    private javax.swing.JComboBox comboPlanesVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelBusqueda2;
    private javax.swing.JLabel jLabelBusqueda3;
    private javax.swing.JLabel jLabelBusqueda4;
    private javax.swing.JLabel jLabelBusqueda5;
    private javax.swing.JLabel jLabelBusqueda6;
    private javax.swing.JLabel jLabelBusqueda7;
    private javax.swing.JLabel jLabelBusqueda8;
    private javax.swing.JLabel jLabelBusqueda9;
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
    private javax.swing.JLabel labeltituloPlanes1;
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
