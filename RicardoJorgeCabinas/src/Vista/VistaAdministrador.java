    package Vista;

import Logica.LogicaAlquilerModem;
import Logica.LogicaCliente;
import Logica.LogicaPlanMinutos;
import Logica.LogicaPromocion;
import Logica.LogicaRecarga;
import Logica.LogicaUsuario;
import Modelo.Cliente;
import Modelo.PlanMinutos;
import Modelo.Promocion;
import Modelo.Usuario;
import Logica.LogicaUsbModem;
import Logica.LogicaVentaMinutos;
import Modelo.AlquilerModem;
import Modelo.Recarga;
import Modelo.UsbModem;
import Modelo.VentaMinutos;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Reportes.Reporte;


public class VistaAdministrador extends javax.swing.JFrame{
    private LogicaCliente lc = new LogicaCliente();
    private LogicaPromocion lp = new LogicaPromocion();
    public Usuario usuarioActivo;
    LogicaUsbModem lum = new LogicaUsbModem();
    List<UsbModem> modems = lum.consultarModems();
    Cliente clienteVenta;
    Cliente clienteAlquiler;
    PlanMinutos planVenta;
    int precioMinuto;
    int minutosVendidos;
    int minutosFacturados;
    static List<Promocion> promocionesGanadas = new ArrayList<>();
    
    public VistaAdministrador(Usuario usuarioActivo)  
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas - Administrador");
        this.setResizable(false);
        this.usuarioActivo=usuarioActivo;
        lp.consultarPromociones();
        llenarTablaModems(modems);
        llenarComboPlanesVenta();
        ActualizarFechaAlquiler();
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(true);
        alertaDevolucion();
        recargaAutomaticaPlan();
        jLabelSesion.setText("Sesión: "+usuarioActivo.getNombreusuario());  
        
        LogicaCliente logicaCliente = new LogicaCliente();
        clienteVenta=logicaCliente.consultarCliente("default");
        campoConsultaClienteVenta.setText(clienteVenta.getCedulacliente());
    }
    public VistaAdministrador(){
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtras = new javax.swing.JButton();
        jTabbedPaneVistaVendedor = new javax.swing.JTabbedPane();
        panelRegistrarVenta = new javax.swing.JPanel();
        labeltituloPlanes1 = new javax.swing.JLabel();
        campoConsultaClienteVenta = new javax.swing.JTextField();
        jLabelBusqueda5 = new javax.swing.JLabel();
        jLabelBusqueda6 = new javax.swing.JLabel();
        comboPlanesVenta = new javax.swing.JComboBox();
        campoMinutosVendidos = new javax.swing.JFormattedTextField();
        jLabelBusqueda7 = new javax.swing.JLabel();
        botonRegistrarVenta = new javax.swing.JButton();
        panelMovimientosModem = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelSeleccionModem = new javax.swing.JPanel();
        botonAlquilerModem = new javax.swing.JButton();
        botonDevolucionModem = new javax.swing.JButton();
        labeltituloCliente2 = new javax.swing.JLabel();
        panelAlquilarModem = new javax.swing.JPanel();
        jLabelModem = new javax.swing.JLabel();
        campoDisponibildadModem = new javax.swing.JTextField();
        labeltituloPlanes3 = new javax.swing.JLabel();
        jLabelMulta = new javax.swing.JLabel();
        jComboBoxModem = new javax.swing.JComboBox<String>();
        jLabelFechaEntrega = new javax.swing.JLabel();
        campoConsultaClienteAlquiler = new javax.swing.JTextField();
        jLabelDisponibilidad = new javax.swing.JLabel();
        campoCantidadDias = new javax.swing.JTextField();
        botonRegistrarAlquilerModem = new javax.swing.JButton();
        jLabelFechaEntrega1 = new javax.swing.JLabel();
        jLabelClienteAlquiler1 = new javax.swing.JLabel();
        jLabelEntregaAlquiler = new javax.swing.JLabel();
        campoPrecioMulta1 = new javax.swing.JTextField();
        campoPrecioAlquiler1 = new javax.swing.JTextField();
        jLabelPrecio1 = new javax.swing.JLabel();
        botonAtrasAlquiler1 = new javax.swing.JButton();
        panelDevolucionModem = new javax.swing.JPanel();
        BuscarClienteAlquiler = new javax.swing.JButton();
        botonDevolverModem = new javax.swing.JButton();
        jTextFieldClienteAlquiler = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labeltituloPlanes4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModemsAlquilados = new javax.swing.JTable();
        botonAtrasAlquiler = new javax.swing.JButton();
        actualizarTablaModemsAlquilados = new javax.swing.JButton();
        panelClientesVendedor = new javax.swing.JPanel();
        botonModificarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        campoConsultaCliente = new javax.swing.JTextField();
        botonConsultarCliente = new javax.swing.JButton();
        botonAgregarCliente = new javax.swing.JButton();
        botonEstadoCliente = new javax.swing.JButton();
        botonActualizarTablaClientes = new javax.swing.JButton();
        jLabelBusqueda = new javax.swing.JLabel();
        labeltituloCliente1 = new javax.swing.JLabel();
        panelPlanes = new javax.swing.JPanel();
        labeltituloPlanes = new javax.swing.JLabel();
        botonConsultarPlanes = new javax.swing.JButton();
        botonInactivarPlan = new javax.swing.JButton();
        botonModificarPlan = new javax.swing.JButton();
        botonAgregarPlan = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPlanes = new javax.swing.JTable();
        botonActualizarTablaPlan = new javax.swing.JButton();
        jLabelBusqueda1 = new javax.swing.JLabel();
        campoConsultaPlanes = new javax.swing.JTextField();
        jButtonRecargar = new javax.swing.JButton();
        panelModems = new javax.swing.JPanel();
        labeltituloModems = new javax.swing.JLabel();
        botonConsultarModem = new javax.swing.JButton();
        botonCambiarEstadoModem = new javax.swing.JButton();
        botonModificarModem = new javax.swing.JButton();
        botonAgregarModem = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaModems = new javax.swing.JTable();
        botonActualizarTablaModems = new javax.swing.JButton();
        jLabelBusqueda2 = new javax.swing.JLabel();
        campoConsultaModems = new javax.swing.JTextField();
        panelPromociones = new javax.swing.JPanel();
        labeltituloPromociones = new javax.swing.JLabel();
        botonConsultarPromociones = new javax.swing.JButton();
        botonInactivarPromocion = new javax.swing.JButton();
        botonAgregarPromocion = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaPromociones = new javax.swing.JTable();
        jLabelBusqueda3 = new javax.swing.JLabel();
        botonActualizarTablaPromo = new javax.swing.JButton();
        campoConsultaPromociones = new javax.swing.JTextField();
        panelUsurios = new javax.swing.JPanel();
        botonAgregarUsuario = new javax.swing.JButton();
        botonModificarUsuario = new javax.swing.JButton();
        botonInactivarUsuario = new javax.swing.JButton();
        botonConsultarUsuario = new javax.swing.JButton();
        labeltituloUsuario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabelBusqueda4 = new javax.swing.JLabel();
        botonActualizarTablaUsuarios = new javax.swing.JButton();
        campoConsultaUsuario = new javax.swing.JTextField();
        panelReportes = new javax.swing.JPanel();
        jTextFieldReporteCedulaMinutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonGenerarReporte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldReporteCedulaAlquiler = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fechaInicioMinutosReporte = new javax.swing.JFormattedTextField();
        fechaFinMinutosReporte = new javax.swing.JFormattedTextField();
        fechaInicioAlquilerReportes = new javax.swing.JFormattedTextField();
        fechaFinAlquilerReportes = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 560));

        botonAtras.setBackground(new java.awt.Color(255, 255, 255));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salir.png"))); // NOI18N
        botonAtras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setOpaque(true);
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jTabbedPaneVistaVendedor.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneVistaVendedor.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPaneVistaVendedor.setOpaque(true);
        jTabbedPaneVistaVendedor.setPreferredSize(new java.awt.Dimension(900, 470));
        jTabbedPaneVistaVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneVistaVendedorMouseClicked(evt);
            }
        });

        panelRegistrarVenta.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeltituloPlanes1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPlanes1.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPlanes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes1.setText("Venta Minutos");
        panelRegistrarVenta.add(labeltituloPlanes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));
        panelRegistrarVenta.add(campoConsultaClienteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 180, 25));

        jLabelBusqueda5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda5.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda5.setText("Cliente *");
        panelRegistrarVenta.add(jLabelBusqueda5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabelBusqueda6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda6.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda6.setText("Plan");
        panelRegistrarVenta.add(jLabelBusqueda6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        panelRegistrarVenta.add(comboPlanesVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 180, -1));

        campoMinutosVendidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        panelRegistrarVenta.add(campoMinutosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 90, 25));

        jLabelBusqueda7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda7.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda7.setText("Minutos Vendidos * ");
        panelRegistrarVenta.add(jLabelBusqueda7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        botonRegistrarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonRegistrarVenta.setForeground(new java.awt.Color(162, 146, 146));
        botonRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ventas.png"))); // NOI18N
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
        panelRegistrarVenta.add(botonRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/ventas.png")), panelRegistrarVenta); // NOI18N

        panelMovimientosModem.setPreferredSize(new java.awt.Dimension(770, 490));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(818, 490));

        panelSeleccionModem.setBackground(new java.awt.Color(255, 255, 255));
        panelSeleccionModem.setPreferredSize(new java.awt.Dimension(818, 490));

        botonAlquilerModem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAlquilerModem.setForeground(new java.awt.Color(162, 146, 146));
        botonAlquilerModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/alquilar.png"))); // NOI18N
        botonAlquilerModem.setText("Alquiler Modem");
        botonAlquilerModem.setBorderPainted(false);
        botonAlquilerModem.setContentAreaFilled(false);
        botonAlquilerModem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAlquilerModem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAlquilerModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlquilerModemActionPerformed(evt);
            }
        });

        botonDevolucionModem.setBackground(new java.awt.Color(255, 255, 255));
        botonDevolucionModem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonDevolucionModem.setForeground(new java.awt.Color(162, 146, 146));
        botonDevolucionModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devolver.png"))); // NOI18N
        botonDevolucionModem.setText("Devolución Modem");
        botonDevolucionModem.setBorderPainted(false);
        botonDevolucionModem.setContentAreaFilled(false);
        botonDevolucionModem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDevolucionModem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDevolucionModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolucionModemActionPerformed(evt);
            }
        });

        labeltituloCliente2.setBackground(new java.awt.Color(254, 254, 254));
        labeltituloCliente2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labeltituloCliente2.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloCliente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloCliente2.setText("Movimientos Usb-Modem");

        javax.swing.GroupLayout panelSeleccionModemLayout = new javax.swing.GroupLayout(panelSeleccionModem);
        panelSeleccionModem.setLayout(panelSeleccionModemLayout);
        panelSeleccionModemLayout.setHorizontalGroup(
            panelSeleccionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionModemLayout.createSequentialGroup()
                .addGroup(panelSeleccionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeleccionModemLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(botonAlquilerModem, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(botonDevolucionModem, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSeleccionModemLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(labeltituloCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        panelSeleccionModemLayout.setVerticalGroup(
            panelSeleccionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionModemLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(labeltituloCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(panelSeleccionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAlquilerModem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDevolucionModem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        panelAlquilarModem.setBackground(new java.awt.Color(255, 255, 255));
        panelAlquilarModem.setPreferredSize(new java.awt.Dimension(818, 490));

        jLabelModem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelModem.setForeground(new java.awt.Color(162, 146, 146));
        jLabelModem.setText("Modem");

        campoDisponibildadModem.setEditable(false);
        campoDisponibildadModem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDisponibildadModemcampoMinutosVendidosFocusGained(evt);
            }
        });

        labeltituloPlanes3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPlanes3.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPlanes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes3.setText("Alquiler USB-Modem");

        jLabelMulta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelMulta.setForeground(new java.awt.Color(162, 146, 146));
        jLabelMulta.setText("Multa $");

        jComboBoxModem.setToolTipText("");
        jComboBoxModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModemActionPerformed(evt);
            }
        });

        jLabelFechaEntrega.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelFechaEntrega.setForeground(new java.awt.Color(162, 146, 146));
        jLabelFechaEntrega.setText("Fecha Entrega");

        campoConsultaClienteAlquiler.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoConsultaClienteAlquilercampoMinutosVendidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoConsultaClienteAlquilerFocusLost(evt);
            }
        });

        jLabelDisponibilidad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelDisponibilidad.setForeground(new java.awt.Color(162, 146, 146));
        jLabelDisponibilidad.setText("Disponibilidad");

        campoCantidadDias.setText("0");
        campoCantidadDias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCantidadDiascampoMinutosVendidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCantidadDiasFocusLost(evt);
            }
        });

        botonRegistrarAlquilerModem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonRegistrarAlquilerModem.setForeground(new java.awt.Color(162, 146, 146));
        botonRegistrarAlquilerModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/alquilar.png"))); // NOI18N
        botonRegistrarAlquilerModem.setText("Registrar");
        botonRegistrarAlquilerModem.setBorderPainted(false);
        botonRegistrarAlquilerModem.setContentAreaFilled(false);
        botonRegistrarAlquilerModem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRegistrarAlquilerModem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRegistrarAlquilerModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarAlquilerModemActionPerformed(evt);
            }
        });

        jLabelFechaEntrega1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelFechaEntrega1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelFechaEntrega1.setText("Días Alquiler");

        jLabelClienteAlquiler1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelClienteAlquiler1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelClienteAlquiler1.setText("Cliente");

        jLabelEntregaAlquiler.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelEntregaAlquiler.setForeground(new java.awt.Color(162, 146, 146));
        jLabelEntregaAlquiler.setText("XX/XX/XXXX");

        campoPrecioMulta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPrecioMulta1campoMinutosVendidosFocusGained(evt);
            }
        });

        campoPrecioAlquiler1.setEditable(false);
        campoPrecioAlquiler1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPrecioAlquiler1campoMinutosVendidosFocusGained(evt);
            }
        });
        campoPrecioAlquiler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecioAlquiler1ActionPerformed(evt);
            }
        });

        jLabelPrecio1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelPrecio1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelPrecio1.setText("Precio día $");

        botonAtrasAlquiler1.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasAlquiler1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAtrasAlquiler1.setForeground(new java.awt.Color(162, 146, 146));
        botonAtrasAlquiler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/atras.png"))); // NOI18N
        botonAtrasAlquiler1.setText("Atrás");
        botonAtrasAlquiler1.setBorderPainted(false);
        botonAtrasAlquiler1.setContentAreaFilled(false);
        botonAtrasAlquiler1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasAlquiler1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAtrasAlquiler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasAlquiler1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAlquilarModemLayout = new javax.swing.GroupLayout(panelAlquilarModem);
        panelAlquilarModem.setLayout(panelAlquilarModemLayout);
        panelAlquilarModemLayout.setHorizontalGroup(
            panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(botonRegistrarAlquilerModem)
                        .addGap(54, 54, 54)
                        .addComponent(botonAtrasAlquiler1))
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(labeltituloPlanes3))
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelDisponibilidad)
                                .addComponent(jLabelFechaEntrega1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecio1)
                                    .addComponent(jLabelFechaEntrega)
                                    .addComponent(jLabelMulta)))
                            .addComponent(jLabelClienteAlquiler1)
                            .addComponent(jLabelModem))
                        .addGap(66, 66, 66)
                        .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPrecioMulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoConsultaClienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxModem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoDisponibildadModem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEntregaAlquiler)
                                .addComponent(campoPrecioAlquiler1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelAlquilarModemLayout.setVerticalGroup(
            panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labeltituloPlanes3)
                .addGap(18, 18, 18)
                .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addComponent(campoConsultaClienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoDisponibildadModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEntregaAlquiler)
                        .addGap(18, 18, 18)
                        .addComponent(campoPrecioAlquiler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(campoPrecioMulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addComponent(jLabelClienteAlquiler1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelModem)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDisponibilidad)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFechaEntrega1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFechaEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrecio1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMulta)))
                .addGap(18, 18, 18)
                .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonRegistrarAlquilerModem)
                    .addComponent(botonAtrasAlquiler1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDevolucionModem.setBackground(new java.awt.Color(255, 255, 255));
        panelDevolucionModem.setPreferredSize(new java.awt.Dimension(818, 490));

        BuscarClienteAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        BuscarClienteAlquiler.setBorderPainted(false);
        BuscarClienteAlquiler.setContentAreaFilled(false);
        BuscarClienteAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteAlquilerActionPerformed(evt);
            }
        });

        botonDevolverModem.setBackground(new java.awt.Color(255, 255, 255));
        botonDevolverModem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonDevolverModem.setForeground(new java.awt.Color(162, 146, 146));
        botonDevolverModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/devolver.png"))); // NOI18N
        botonDevolverModem.setText("Devolver");
        botonDevolverModem.setBorderPainted(false);
        botonDevolverModem.setContentAreaFilled(false);
        botonDevolverModem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDevolverModem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDevolverModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolverModemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 146, 146));
        jLabel2.setText("Cliente");

        labeltituloPlanes4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPlanes4.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPlanes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes4.setText("Devolución USB-Modem");

        tablaModemsAlquilados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaModemsAlquilados);

        botonAtrasAlquiler.setBackground(new java.awt.Color(255, 255, 255));
        botonAtrasAlquiler.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAtrasAlquiler.setForeground(new java.awt.Color(162, 146, 146));
        botonAtrasAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/atras.png"))); // NOI18N
        botonAtrasAlquiler.setText("Atrás");
        botonAtrasAlquiler.setBorderPainted(false);
        botonAtrasAlquiler.setContentAreaFilled(false);
        botonAtrasAlquiler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtrasAlquiler.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAtrasAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasAlquilerActionPerformed(evt);
            }
        });

        actualizarTablaModemsAlquilados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizarTablaModemsAlquilados.setForeground(new java.awt.Color(162, 146, 146));
        actualizarTablaModemsAlquilados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        actualizarTablaModemsAlquilados.setText("Actualizar");
        actualizarTablaModemsAlquilados.setBorderPainted(false);
        actualizarTablaModemsAlquilados.setContentAreaFilled(false);
        actualizarTablaModemsAlquilados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizarTablaModemsAlquilados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizarTablaModemsAlquilados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarTablaModemsAlquiladosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDevolucionModemLayout = new javax.swing.GroupLayout(panelDevolucionModem);
        panelDevolucionModem.setLayout(panelDevolucionModemLayout);
        panelDevolucionModemLayout.setHorizontalGroup(
            panelDevolucionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevolucionModemLayout.createSequentialGroup()
                .addGroup(panelDevolucionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDevolucionModemLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(labeltituloPlanes4))
                    .addGroup(panelDevolucionModemLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldClienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BuscarClienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDevolucionModemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(panelDevolucionModemLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(botonDevolverModem)
                .addGap(70, 70, 70)
                .addComponent(actualizarTablaModemsAlquilados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAtrasAlquiler)
                .addGap(169, 169, 169))
        );
        panelDevolucionModemLayout.setVerticalGroup(
            panelDevolucionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDevolucionModemLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labeltituloPlanes4)
                .addGap(41, 41, 41)
                .addGroup(panelDevolucionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BuscarClienteAlquiler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDevolucionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldClienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelDevolucionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonDevolverModem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDevolucionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(actualizarTablaModemsAlquilados)
                        .addComponent(botonAtrasAlquiler)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSeleccionModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAlquilarModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDevolucionModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(panelSeleccionModem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelAlquilarModem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDevolucionModem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jLayeredPane1.setLayer(panelSeleccionModem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelAlquilarModem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelDevolucionModem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMovimientosModemLayout = new javax.swing.GroupLayout(panelMovimientosModem);
        panelMovimientosModem.setLayout(panelMovimientosModemLayout);
        panelMovimientosModemLayout.setHorizontalGroup(
            panelMovimientosModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMovimientosModemLayout.setVerticalGroup(
            panelMovimientosModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/alquiler.png")), panelMovimientosModem); // NOI18N

        panelClientesVendedor.setBackground(new java.awt.Color(255, 255, 255));
        panelClientesVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonModificarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonModificarCliente.setForeground(new java.awt.Color(162, 146, 146));
        botonModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/editar.png"))); // NOI18N
        botonModificarCliente.setText("Modificar");
        botonModificarCliente.setBorderPainted(false);
        botonModificarCliente.setContentAreaFilled(false);
        botonModificarCliente.setEnabled(false);
        botonModificarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonModificarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        tablaClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        panelClientesVendedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 700, 170));
        panelClientesVendedor.add(campoConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 300, 25));

        botonConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        botonConsultarCliente.setBorderPainted(false);
        botonConsultarCliente.setContentAreaFilled(false);
        botonConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 40, 40));

        botonAgregarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarCliente.setForeground(new java.awt.Color(162, 146, 146));
        botonAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro.png"))); // NOI18N
        botonAgregarCliente.setText("Registrar");
        botonAgregarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonAgregarCliente.setBorderPainted(false);
        botonAgregarCliente.setContentAreaFilled(false);
        botonAgregarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarCliente.setMaximumSize(new java.awt.Dimension(61, 75));
        botonAgregarCliente.setMinimumSize(new java.awt.Dimension(61, 75));
        botonAgregarCliente.setPreferredSize(new java.awt.Dimension(80, 75));
        botonAgregarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 90, -1));

        botonEstadoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonEstadoCliente.setForeground(new java.awt.Color(162, 146, 146));
        botonEstadoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/inactivar.png"))); // NOI18N
        botonEstadoCliente.setText("Cambiar Estado");
        botonEstadoCliente.setBorderPainted(false);
        botonEstadoCliente.setContentAreaFilled(false);
        botonEstadoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEstadoCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEstadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadoClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonEstadoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        botonActualizarTablaClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizarTablaClientes.setForeground(new java.awt.Color(162, 146, 146));
        botonActualizarTablaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        botonActualizarTablaClientes.setText("Actualizar");
        botonActualizarTablaClientes.setBorderPainted(false);
        botonActualizarTablaClientes.setContentAreaFilled(false);
        botonActualizarTablaClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarTablaClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelClientesVendedor.add(botonActualizarTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        jLabelBusqueda.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda.setText("Búsqueda:");
        panelClientesVendedor.add(jLabelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        labeltituloCliente1.setBackground(new java.awt.Color(254, 254, 254));
        labeltituloCliente1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloCliente1.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloCliente1.setText("Clientes");
        panelClientesVendedor.add(labeltituloCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, 40));

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

        botonInactivarPlan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInactivarPlan.setForeground(new java.awt.Color(162, 146, 146));
        botonInactivarPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/inactivar.png"))); // NOI18N
        botonInactivarPlan.setText("Cambiar Estado");
        botonInactivarPlan.setBorderPainted(false);
        botonInactivarPlan.setContentAreaFilled(false);
        botonInactivarPlan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonInactivarPlan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonInactivarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarPlanActionPerformed(evt);
            }
        });

        botonModificarPlan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonModificarPlan.setForeground(new java.awt.Color(162, 146, 146));
        botonModificarPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/editar.png"))); // NOI18N
        botonModificarPlan.setText("Modificar");
        botonModificarPlan.setBorderPainted(false);
        botonModificarPlan.setContentAreaFilled(false);
        botonModificarPlan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonModificarPlan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonModificarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPlanActionPerformed(evt);
            }
        });

        botonAgregarPlan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarPlan.setForeground(new java.awt.Color(162, 146, 146));
        botonAgregarPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro.png"))); // NOI18N
        botonAgregarPlan.setText("Registrar");
        botonAgregarPlan.setBorderPainted(false);
        botonAgregarPlan.setContentAreaFilled(false);
        botonAgregarPlan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarPlan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPlanActionPerformed(evt);
            }
        });

        tablaPlanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaPlanes);

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

        jLabelBusqueda1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda1.setText("Búsqueda");

        jButtonRecargar.setBackground(new java.awt.Color(162, 146, 146));
        jButtonRecargar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRecargar.setText("Recargar Plan");
        jButtonRecargar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonRecargar.setBorderPainted(false);
        jButtonRecargar.setContentAreaFilled(false);
        jButtonRecargar.setOpaque(true);
        jButtonRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPlanesLayout = new javax.swing.GroupLayout(panelPlanes);
        panelPlanes.setLayout(panelPlanesLayout);
        panelPlanesLayout.setHorizontalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanesLayout.createSequentialGroup()
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(botonAgregarPlan)
                        .addGap(72, 72, 72)
                        .addComponent(botonModificarPlan)
                        .addGap(64, 64, 64)
                        .addComponent(botonInactivarPlan)
                        .addGap(59, 59, 59)
                        .addComponent(botonActualizarTablaPlan))
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPlanesLayout.createSequentialGroup()
                                .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelBusqueda1)
                        .addGap(18, 18, 18)
                        .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultarPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPlanesLayout.setVerticalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanesLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBusqueda1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonConsultarPlanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificarPlan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregarPlan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonInactivarPlan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonActualizarTablaPlan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/plan.png")), panelPlanes); // NOI18N

        panelModems.setBackground(new java.awt.Color(255, 255, 255));
        panelModems.setPreferredSize(new java.awt.Dimension(767, 487));

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

        botonCambiarEstadoModem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCambiarEstadoModem.setForeground(new java.awt.Color(162, 146, 146));
        botonCambiarEstadoModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/inactivar.png"))); // NOI18N
        botonCambiarEstadoModem.setText("Cambiar Estado");
        botonCambiarEstadoModem.setBorderPainted(false);
        botonCambiarEstadoModem.setContentAreaFilled(false);
        botonCambiarEstadoModem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCambiarEstadoModem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCambiarEstadoModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarEstadoModemActionPerformed(evt);
            }
        });

        botonModificarModem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonModificarModem.setForeground(new java.awt.Color(162, 146, 146));
        botonModificarModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/editar.png"))); // NOI18N
        botonModificarModem.setText("Modificar");
        botonModificarModem.setBorderPainted(false);
        botonModificarModem.setContentAreaFilled(false);
        botonModificarModem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonModificarModem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonModificarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarModemActionPerformed(evt);
            }
        });

        botonAgregarModem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarModem.setForeground(new java.awt.Color(162, 146, 146));
        botonAgregarModem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro.png"))); // NOI18N
        botonAgregarModem.setText("Registrar");
        botonAgregarModem.setBorderPainted(false);
        botonAgregarModem.setContentAreaFilled(false);
        botonAgregarModem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarModem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarModemActionPerformed(evt);
            }
        });

        tablaModems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaModems);

        botonActualizarTablaModems.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizarTablaModems.setForeground(new java.awt.Color(162, 146, 146));
        botonActualizarTablaModems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        botonActualizarTablaModems.setText("Actualizar");
        botonActualizarTablaModems.setBorderPainted(false);
        botonActualizarTablaModems.setContentAreaFilled(false);
        botonActualizarTablaModems.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarTablaModems.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizarTablaModems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarTablaModemsActionPerformed(evt);
            }
        });

        jLabelBusqueda2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda2.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda2.setText("Búsqueda");

        javax.swing.GroupLayout panelModemsLayout = new javax.swing.GroupLayout(panelModems);
        panelModems.setLayout(panelModemsLayout);
        panelModemsLayout.setHorizontalGroup(
            panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModemsLayout.createSequentialGroup()
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(botonAgregarModem)
                        .addGap(74, 74, 74)
                        .addComponent(botonModificarModem)
                        .addGap(62, 62, 62)
                        .addComponent(botonCambiarEstadoModem)
                        .addGap(61, 61, 61)
                        .addComponent(botonActualizarTablaModems))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabelBusqueda2)
                        .addGap(18, 18, 18)
                        .addComponent(campoConsultaModems, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultarModem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeltituloModems, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelModemsLayout.setVerticalGroup(
            panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModemsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoConsultaModems, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBusqueda2)
                    .addComponent(botonConsultarModem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(labeltituloModems, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonActualizarTablaModems, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonModificarModem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregarModem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCambiarEstadoModem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/modem.png")), panelModems); // NOI18N

        panelPromociones.setBackground(new java.awt.Color(255, 255, 255));

        labeltituloPromociones.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPromociones.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPromociones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPromociones.setText("Promociones");

        botonConsultarPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        botonConsultarPromociones.setBorderPainted(false);
        botonConsultarPromociones.setContentAreaFilled(false);
        botonConsultarPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarPromocionesActionPerformed(evt);
            }
        });

        botonInactivarPromocion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInactivarPromocion.setForeground(new java.awt.Color(162, 146, 146));
        botonInactivarPromocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/inactivar.png"))); // NOI18N
        botonInactivarPromocion.setText("Inactivar");
        botonInactivarPromocion.setBorderPainted(false);
        botonInactivarPromocion.setContentAreaFilled(false);
        botonInactivarPromocion.setEnabled(false);
        botonInactivarPromocion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonInactivarPromocion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonInactivarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarPromocionActionPerformed(evt);
            }
        });

        botonAgregarPromocion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarPromocion.setForeground(new java.awt.Color(162, 146, 146));
        botonAgregarPromocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro.png"))); // NOI18N
        botonAgregarPromocion.setText("Agregar");
        botonAgregarPromocion.setBorderPainted(false);
        botonAgregarPromocion.setContentAreaFilled(false);
        botonAgregarPromocion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarPromocion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPromocionActionPerformed(evt);
            }
        });

        tablaPromociones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPromocionesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaPromociones);

        jLabelBusqueda3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda3.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda3.setText("Búsqueda");

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
                        .addGap(151, 151, 151)
                        .addComponent(botonAgregarPromocion)
                        .addGap(90, 90, 90)
                        .addComponent(botonInactivarPromocion)
                        .addGap(90, 90, 90)
                        .addComponent(botonActualizarTablaPromo))
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPromocionesLayout.createSequentialGroup()
                                .addComponent(jLabelBusqueda3)
                                .addGap(31, 31, 31)
                                .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonConsultarPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPromocionesLayout.setVerticalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(botonConsultarPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPromocionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBusqueda3)
                            .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonInactivarPromocion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregarPromocion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonActualizarTablaPromo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/promo.png")), panelPromociones); // NOI18N

        panelUsurios.setBackground(new java.awt.Color(255, 255, 255));

        botonAgregarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregarUsuario.setForeground(new java.awt.Color(162, 146, 146));
        botonAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/registro.png"))); // NOI18N
        botonAgregarUsuario.setText("Agregar");
        botonAgregarUsuario.setBorderPainted(false);
        botonAgregarUsuario.setContentAreaFilled(false);
        botonAgregarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarUsuarioActionPerformed(evt);
            }
        });

        botonModificarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonModificarUsuario.setForeground(new java.awt.Color(162, 146, 146));
        botonModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/editar.png"))); // NOI18N
        botonModificarUsuario.setText("Modificar");
        botonModificarUsuario.setBorderPainted(false);
        botonModificarUsuario.setContentAreaFilled(false);
        botonModificarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonModificarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarUsuarioActionPerformed(evt);
            }
        });

        botonInactivarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInactivarUsuario.setForeground(new java.awt.Color(162, 146, 146));
        botonInactivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/inactivar.png"))); // NOI18N
        botonInactivarUsuario.setText("Cambiar Estado");
        botonInactivarUsuario.setBorderPainted(false);
        botonInactivarUsuario.setContentAreaFilled(false);
        botonInactivarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonInactivarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonInactivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarUsuarioActionPerformed(evt);
            }
        });

        botonConsultarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/buscar.png"))); // NOI18N
        botonConsultarUsuario.setBorderPainted(false);
        botonConsultarUsuario.setContentAreaFilled(false);
        botonConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarUsuarioActionPerformed(evt);
            }
        });

        labeltituloUsuario.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloUsuario.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloUsuario.setText("Usuarios");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaUsuarios);

        jLabelBusqueda4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda4.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda4.setText("Búsqueda");

        botonActualizarTablaUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonActualizarTablaUsuarios.setForeground(new java.awt.Color(162, 146, 146));
        botonActualizarTablaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/actualizar.png"))); // NOI18N
        botonActualizarTablaUsuarios.setText("Actualizar");
        botonActualizarTablaUsuarios.setBorderPainted(false);
        botonActualizarTablaUsuarios.setContentAreaFilled(false);
        botonActualizarTablaUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarTablaUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizarTablaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarTablaUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUsuriosLayout = new javax.swing.GroupLayout(panelUsurios);
        panelUsurios.setLayout(panelUsuriosLayout);
        panelUsuriosLayout.setHorizontalGroup(
            panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuriosLayout.createSequentialGroup()
                .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuriosLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeltituloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelUsuriosLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabelBusqueda4)
                        .addGap(32, 32, 32)
                        .addComponent(campoConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUsuriosLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(botonAgregarUsuario)
                        .addGap(67, 67, 67)
                        .addComponent(botonModificarUsuario)
                        .addGap(79, 79, 79)
                        .addComponent(botonInactivarUsuario)
                        .addGap(67, 67, 67)
                        .addComponent(botonActualizarTablaUsuarios)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUsuriosLayout.setVerticalGroup(
            panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuriosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBusqueda4)
                        .addComponent(campoConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(labeltituloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificarUsuario)
                    .addComponent(botonAgregarUsuario)
                    .addComponent(botonInactivarUsuario)
                    .addComponent(botonActualizarTablaUsuarios))
                .addGap(392, 392, 392))
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/usuario.png")), panelUsurios); // NOI18N

        panelReportes.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldReporteCedulaMinutos.setEnabled(false);
        jTextFieldReporteCedulaMinutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldReporteCedulaMinutosMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cédula:");

        jButtonGenerarReporte.setBackground(new java.awt.Color(162, 146, 146));
        jButtonGenerarReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGenerarReporte.setText("Generar Reporte");
        jButtonGenerarReporte.setBorderPainted(false);
        jButtonGenerarReporte.setContentAreaFilled(false);
        jButtonGenerarReporte.setOpaque(true);
        jButtonGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarReporteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cédula:");

        jTextFieldReporteCedulaAlquiler.setEnabled(false);
        jTextFieldReporteCedulaAlquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldReporteCedulaAlquilerMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 146, 146));
        jLabel4.setText("Venta Minutos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(162, 146, 146));
        jLabel5.setText("Alquiler Usb-Modem");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(162, 146, 146));
        jLabel6.setText("Movimientos Cliente");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(162, 146, 146));
        jLabel7.setText("Movimientos Negocio");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(162, 146, 146));
        jLabel8.setText("Venta Minutos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(162, 146, 146));
        jLabel9.setText("Alquiler Usb-Modem");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        fechaInicioMinutosReporte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fechaInicioMinutosReporte.setToolTipText("d/mm/yyyy");
        fechaInicioMinutosReporte.setEnabled(false);
        fechaInicioMinutosReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaInicioMinutosReporteMouseClicked(evt);
            }
        });

        fechaFinMinutosReporte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fechaFinMinutosReporte.setToolTipText("d/mm/yyyy");
        fechaFinMinutosReporte.setEnabled(false);
        fechaFinMinutosReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaFinMinutosReporteMouseClicked(evt);
            }
        });

        fechaInicioAlquilerReportes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fechaInicioAlquilerReportes.setToolTipText("d/mm/yyyy");
        fechaInicioAlquilerReportes.setEnabled(false);
        fechaInicioAlquilerReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaInicioAlquilerReportesMouseClicked(evt);
            }
        });

        fechaFinAlquilerReportes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        fechaFinAlquilerReportes.setToolTipText("d/mm/yyyy");
        fechaFinAlquilerReportes.setEnabled(false);
        fechaFinAlquilerReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaFinAlquilerReportesMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha Inicio:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Fecha Fin:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Fecha Fin:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Fecha Inicio:");

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jButtonGenerarReporte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelReportesLayout.createSequentialGroup()
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelReportesLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(55, 55, 55))
                                        .addGroup(panelReportesLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(41, 41, 41)))
                                    .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addGroup(panelReportesLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(11, 11, 11))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaFinMinutosReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaInicioMinutosReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaInicioAlquilerReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaFinAlquilerReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9))
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelReportesLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldReporteCedulaMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelReportesLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(36, 36, 36)
                                    .addComponent(jTextFieldReporteCedulaAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)))
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(156, 156, 156))
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldReporteCedulaMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldReporteCedulaAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelReportesLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelReportesLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fechaInicioMinutosReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fechaFinMinutosReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(fechaInicioAlquilerReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(fechaFinAlquilerReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))))
                .addComponent(jButtonGenerarReporte)
                .addGap(30, 30, 30))
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/reporte.png")), panelReportes); // NOI18N

        jLabelSesion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSesion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelSesion.setForeground(new java.awt.Color(162, 146, 146));
        jLabelSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSesion.setText("Cabinas Ricardo Jorge");
        jLabelSesion.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        LoginInicio loginInicio = new LoginInicio();
        loginInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    
    private void botonAgregarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPromocionActionPerformed
        AgregarPromo ap = new AgregarPromo(this, true);
        ap.setVisible(true);
        llenarTablaPromociones(lp.consultarPromociones());
        botonInactivarPromocion.setEnabled(false);
    }//GEN-LAST:event_botonAgregarPromocionActionPerformed

    /*
        Metodo para inactivar una promoción 
        Entrada: evento del boton junto al objeto promoción seleccionado
        Salida: --
    */
    private void botonInactivarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarPromocionActionPerformed
        long codigoPromocion = Long.parseLong(tablaPromociones.getValueAt(tablaPromociones.getSelectedRow(), 0).toString());
        Promocion p = lp.consultarPromocion(codigoPromocion);
        p.setEstadopromocion(false);
        try {
            lp.modificarPromocion(p);
        } catch (Exception ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        llenarTablaPromociones(lp.consultarPromociones());
    }//GEN-LAST:event_botonInactivarPromocionActionPerformed

    /*
        Metodo para buscar promociones
        Entrada: evento del boton
        Salida: --
    */
    private void botonConsultarPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarPromocionesActionPerformed
        llenarTablaPromociones(lp.consultarPromocion(campoConsultaPromociones.getText()));
        botonInactivarPromocion.setEnabled(false);
    }//GEN-LAST:event_botonConsultarPromocionesActionPerformed

    /*
        Metodo para buscar clientes
        Entrada: evento del boton 
        Salida: --
    */
    private void botonConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarClienteActionPerformed
        LogicaCliente lc = new LogicaCliente();
        llenarTablaClientes(lc.consultarClientes(campoConsultaCliente.getText()));
        botonModificarCliente.setEnabled(false);
    }//GEN-LAST:event_botonConsultarClienteActionPerformed

     /*
        Metodo para abrir la ventana de modificación de cliente seleccionado
        Entrada: evento del boton
        Salida: --
    */
    private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarClienteActionPerformed
         LogicaCliente lc = new LogicaCliente();
        String cedulaCliente = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 4).toString();
        if (!cedulaCliente.equals("default")) {
            ventanaModificarCliente(lc.consultarCliente(cedulaCliente));
            llenarTablaClientes(lc.consultarClientes());
            botonModificarCliente.setEnabled(false);
            botonEstadoCliente.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(panelModems, "No se puede modificar el cliente default");
        }
    }//GEN-LAST:event_botonModificarClienteActionPerformed

    private void botonConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarUsuarioActionPerformed
        String texto = campoConsultaUsuario.getText();
        LogicaUsuario logicaUsuario = new LogicaUsuario();
        List<Usuario> usuarios = logicaUsuario.consultarUsuarioNombre(texto);
        Usuario usuarioCedula = logicaUsuario.consultarUsuarioCedula(texto);
        if(usuarioCedula!=null)
        {
            usuarios.add(usuarioCedula);
        }
                
        llenarTablaUsuarios(usuarios);
    }//GEN-LAST:event_botonConsultarUsuarioActionPerformed

    private void botonInactivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarUsuarioActionPerformed
        int filaSeleccionada= tablaUsuarios.getSelectedRow();
        if(filaSeleccionada!= -1)
        {
            try {
                String cedulaUsuario = tablaUsuarios.getValueAt(filaSeleccionada, 0).toString();
                LogicaUsuario logicaUsuario = new LogicaUsuario();
                Usuario usuario =  logicaUsuario.consultarUsuarioCedula(cedulaUsuario);
                boolean estado = usuario.getEstadousuario();
                if(estado)
                {
                     usuario.setEstadousuario(false);
                }
                else
                {
                     usuario.setEstadousuario(true);
                }
                
                if(!usuario.getCedulausuario().equals(usuarioActivo.getCedulausuario()))
                {
                    logicaUsuario.modificarUsuario(usuario);
                    List<Usuario> usuarios = logicaUsuario.consultarUsuarios();
                    llenarTablaUsuarios(usuarios);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error, no se puede inactivar el usuario que esta actualmente en el sistema");
                }
                
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(null,"Error, no se pudo modificar el usuario");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Ningun usuario ha sido seleccionado");
        }
    }//GEN-LAST:event_botonInactivarUsuarioActionPerformed

    private void botonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarUsuarioActionPerformed
        int filaSeleccionada= tablaUsuarios.getSelectedRow();
        if(filaSeleccionada!= -1)
        {
            String cedulaUsuario = tablaUsuarios.getValueAt(filaSeleccionada, 0).toString();
            LogicaUsuario logicaUsuario = new LogicaUsuario();
            Usuario usuario =  logicaUsuario.consultarUsuarioCedula(cedulaUsuario);
            ModificarUsuario modificarUsuario = new ModificarUsuario(this,false,usuario);
            modificarUsuario.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Ningun usuario ha sido seleccionado");
        }
    }//GEN-LAST:event_botonModificarUsuarioActionPerformed

    private void botonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarUsuarioActionPerformed
        AgregarUsuario registro = new AgregarUsuario(this,false);
        registro.setVisible(true);
    }//GEN-LAST:event_botonAgregarUsuarioActionPerformed

    /*Metodo para abrir la ventana de registro de modems
      Entrada: evento del boton
      Salida: ---
    */
    private void botonAgregarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarModemActionPerformed
        AgregarModem agM = new AgregarModem();
        agM.setVisible(true);
    }//GEN-LAST:event_botonAgregarModemActionPerformed

    /* Metodo para abrir la ventana de modificacion habiendo seleccionado un modem
       de la tabla
       Entrada: evento del boton
       Salida: ---
    */
    private void botonModificarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarModemActionPerformed
        if(tablaModems.getSelectedRow()<0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un modem de la tabla");
        }else{
            Long cod = Long.parseLong(tablaModems.getValueAt(tablaModems.getSelectedRow(),0).toString());
            ModificarModem moM = new ModificarModem(cod);
            moM.setVisible(true);
        }
    }//GEN-LAST:event_botonModificarModemActionPerformed
    
    /* Metodo para modificar el estado (activo o inactivo) de un registro UsbModem de la BD
       siendo seleccionado de la tabla y mostrando el cambio de inmediato en la tabla y en la BD.
       Entrada: evento del boton
       Salida: ---
    */
    private void botonCambiarEstadoModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarEstadoModemActionPerformed
        if(tablaModems.getSelectedRow()<0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un modem de la tabla");
        }else{
            Long cod = Long.parseLong(tablaModems.getValueAt(tablaModems.getSelectedRow(),0).toString());
            UsbModem um=null;
            try {
                um = lum.consultarModemCodigo(cod);
                if(um.getDisponibilidad().equals("Disponible")){
                    if(um.getEstadousbmodem()){
                    um.setEstadousbmodem(false);
                    lum.modificarModem(um);
                    }else{
                        um.setEstadousbmodem(true);
                        lum.modificarModem(um);
                    }
                    List<UsbModem> modems = lum.consultarModems();
                    llenarTablaModems(modems);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No puede cambiar el estado a un modem no disponible");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_botonCambiarEstadoModemActionPerformed

    /* Metodo para consultar un usbModem de la BD y mostrar el resultado en la tabla de
       modems. La consulta se realiza con el codigo del modem, todo o una parte del nombre.
       Entrada: evento del boton
       Salida: ---
    */
    private void botonConsultarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarModemActionPerformed
        UsbModem um = null;
        List<UsbModem> modems = new ArrayList<>();
        
        if(!campoConsultaModems.getText().isEmpty()){
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
        }else{
            JOptionPane.showMessageDialog(panelModems, "Ingrese un modem en el campo");
        }
        
    }//GEN-LAST:event_botonConsultarModemActionPerformed

    private void botonAgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPlanActionPerformed
        AgregarPlan agregarPlan = new AgregarPlan(this);
        agregarPlan.setVisible(true);
        llenarTablaPlanMinutos(null);
    }//GEN-LAST:event_botonAgregarPlanActionPerformed

    private void botonModificarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPlanActionPerformed
        int filaSeleccionada = tablaPlanes.getSelectedRow();
        if(filaSeleccionada != -1)
        {
            String codigoPlan = tablaPlanes.getValueAt(filaSeleccionada, 0).toString();
            LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
            PlanMinutos planMinutos = null;
           try {
               planMinutos = logicaPlanMinutos.consultarPlanMinutosID(Long.parseLong(codigoPlan));
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(rootPane, ex.getMessage());
           }
            ModificarPlan modificarPlan = new ModificarPlan(planMinutos,this);
            modificarPlan.setVisible(true);
        } 
        
    }//GEN-LAST:event_botonModificarPlanActionPerformed

    private void botonInactivarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarPlanActionPerformed

        int filaSeleccionada= tablaPlanes.getSelectedRow();
        if(filaSeleccionada!= -1)
        {
            try {
                String codigoPlan = tablaPlanes.getValueAt(filaSeleccionada, 0).toString();
                LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
                PlanMinutos planMinutos =  logicaPlanMinutos.consultarPlanMinutosID(Long.parseLong(codigoPlan));
                boolean estado = planMinutos.getEstadoplanminutos();
                if(estado)
                     planMinutos.setEstadoplanminutos(false);
                else
                     planMinutos.setEstadoplanminutos(true);
                logicaPlanMinutos.modificarPlanMinutos(planMinutos);
                List<PlanMinutos> planMinuto = logicaPlanMinutos.consultarPlanMinutos();
                llenarTablaPlanMinutos(planMinuto);                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error, no se pudo modificar el plan");
            }
        }
        llenarComboPlanesVenta();
    }//GEN-LAST:event_botonInactivarPlanActionPerformed

    private void botonConsultarPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarPlanesActionPerformed

        PlanMinutos planMinutos = null;
        List<PlanMinutos> planes = new ArrayList<>();
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        String texto = campoConsultaPlanes.getText();
        if(isNumeric(texto)){
            try {
                planMinutos = logicaPlanMinutos.consultarPlanMinutosID(Long.parseLong(texto));
                planes.add(planMinutos);
                llenarTablaPlanMinutos(planes);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
            campoConsultaPlanes.setText("");
        }else{
            try {
                planes = logicaPlanMinutos.consultarPlanMinutosNombre(texto);
                llenarTablaPlanMinutos(planes);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            campoConsultaPlanes.setText("");
        }
    }//GEN-LAST:event_botonConsultarPlanesActionPerformed

    /* Metodo para actualizar la tabla de modems consultando todos los registros de la BD
       Entrada: evento del boton
       Salida: ---
    */
    private void botonActualizarTablaModemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaModemsActionPerformed
       List<UsbModem> modems = lum.consultarModems();
       llenarTablaModems(modems);
    }//GEN-LAST:event_botonActualizarTablaModemsActionPerformed

    private void botonActualizarTablaPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaPlanActionPerformed
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        List<PlanMinutos> losPlanes = logicaPlanMinutos.consultarPlanMinutos();
        llenarTablaPlanMinutos(losPlanes);
    }//GEN-LAST:event_botonActualizarTablaPlanActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        botonModificarCliente.setEnabled(true);
        botonEstadoCliente.setEnabled(true);
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void tablaPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPromocionesMouseClicked
        botonInactivarPromocion.setEnabled(true);
    }//GEN-LAST:event_tablaPromocionesMouseClicked

    /*
        Metodo para buscar mostrar la venana de agregar cliente
        Entrada: evento del boton
        Salida: --
    */
    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        AgregarCliente ac = new AgregarCliente(this, true);
        ac.setVisible(true);
        llenarTablaClientes(lc.consultarClientes());
        botonModificarCliente.setEnabled(false);
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarVentaActionPerformed
        if(campoMinutosVendidos.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese la cantidad de minutos");
        }
        else
        {
            LogicaCliente logicaCliente = new LogicaCliente();
            Cliente clienteVentaAuxiliar=logicaCliente.consultarCliente(campoConsultaClienteVenta.getText());
            int seleccion=JOptionPane.YES_OPTION;
            if(clienteVentaAuxiliar==null)
            {
                seleccion = JOptionPane.showOptionDialog(
                                null,
                                "El cliente no existe, ¿Desea elegir el cliente default?", 
                                "Cliente Invalido",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                null,
                                null);
            }
            else
            { 
                clienteVenta=clienteVentaAuxiliar;
                campoConsultaClienteVenta.setText(clienteVentaAuxiliar.getCedulacliente());
            }
           
            if(seleccion==JOptionPane.YES_OPTION)
            {
                minutosVendidos=Integer.parseInt(campoMinutosVendidos.getText());
                if(minutosVendidos<=0)
                {
                    JOptionPane.showMessageDialog(null,"La cantidad de minutos es invalida");
                }
                else
                {
                    Long codigoPlan = Long.parseLong(comboPlanesVenta.getSelectedItem().toString().split(" ")[0]);
                    LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
                    try {
                        planVenta = logicaPlanMinutos.consultarPlanMinutosID(codigoPlan);
                    } catch (Exception ex) {
                        Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if(planVenta.getCantidadminutos()-minutosVendidos<0)
                    {
                        JOptionPane.showMessageDialog(null,"El plan no tiene minutos suficientes para la venta");
                    }
                    else
                    {
                        precioMinuto=planVenta.getPreciominuto();
                 
                        if (!clienteVenta.getCedulacliente().equals("default")) {
                            validarPromocion(clienteVenta.getCedulacliente(), minutosVendidos);
                        } else {
                        }

                        if(!promocionesGanadas.isEmpty()){
                            if(JOptionPane.showConfirmDialog(panelModems, mostrarPromocionesGanadas(promocionesGanadas)+""
                                    + "\nDesea Gastar la promoción?")==JOptionPane.YES_OPTION){

                                    int totalBeneficios=0;
                                    for (int i = 0; i < promocionesGanadas.size(); i++) {
                                        totalBeneficios += promocionesGanadas.get(i).getBeneficio();
                                    }

                                if (minutosVendidos >= totalBeneficios) {
                                    minutosFacturados=minutosVendidos-totalBeneficios;
                                } else {
                                    minutosVendidos = totalBeneficios;
                                    minutosFacturados=0;
                                }
                            }else{
                                minutosFacturados=minutosVendidos;
                            }
                        }else{
                           minutosFacturados=minutosVendidos; 
                        }

                        VentaMinutos venta = new VentaMinutos();
                        if(!promocionesGanadas.isEmpty()){
                             venta.setPromocionList(promocionesGanadas);
                        }else{
                            //No hay promociones para esta venta
                        }
                        venta.setCedulacliente(clienteVenta);
                        venta.setCedulausuario(usuarioActivo);
                        venta.setCodigoplan(planVenta);
                        venta.setPreciominuto(precioMinuto);
                        venta.setMinutosfacturados(minutosFacturados);
                        venta.setMinutosvendidos(minutosVendidos);
                        venta.setFechaventa(new Date());

                        RegistrarVenta registroVenta = new RegistrarVenta(this,false, venta);
                        registroVenta.setVisible(true);
                    }
                }
            }
        }       
    }//GEN-LAST:event_botonRegistrarVentaActionPerformed

    private void campoDisponibildadModemcampoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDisponibildadModemcampoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDisponibildadModemcampoMinutosVendidosFocusGained

    private void campoConsultaClienteAlquilercampoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoConsultaClienteAlquilercampoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConsultaClienteAlquilercampoMinutosVendidosFocusGained

    private void campoCantidadDiascampoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCantidadDiascampoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadDiascampoMinutosVendidosFocusGained

    private void jComboBoxModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModemActionPerformed
        LogicaUsbModem logicaUsbModem = new LogicaUsbModem();
        UsbModem usbModem = new UsbModem();
        Long codigoModem = null;
        if(jComboBoxModem.getItemCount() == 0){
         codigoModem = Long.parseLong("1");
        }else{
            codigoModem = Long.parseLong(jComboBoxModem.getSelectedItem().toString().split(" ")[0]);
        }
        try {
            usbModem = logicaUsbModem.consultarModemCodigo(codigoModem);
        } catch (Exception ex) {
            Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        campoPrecioAlquiler1.setText(""+usbModem.getPreciodia());
        campoDisponibildadModem.setText(usbModem.getDisponibilidad());
    }//GEN-LAST:event_jComboBoxModemActionPerformed

    private void campoConsultaClienteAlquilerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoConsultaClienteAlquilerFocusLost
            LogicaCliente logicaCliente = new LogicaCliente();
            clienteAlquiler = logicaCliente.consultarCliente(campoConsultaClienteAlquiler.getText());
            if(clienteAlquiler==null){
                Color rojo = new Color(255, 170, 170);
                campoConsultaClienteAlquiler.setBackground(rojo);
                clienteAlquiler = logicaCliente.consultarCliente("default");
                campoConsultaClienteAlquiler.setText(clienteAlquiler.getCedulacliente());      
            }else{
                Color verde = new Color(170, 255, 170);
            campoConsultaClienteAlquiler.setBackground(verde);
            //JOptionPane.showMessageDialog(null, "Cliente verificado");
            campoConsultaClienteAlquiler.setEditable(false);
            }
    }//GEN-LAST:event_campoConsultaClienteAlquilerFocusLost

    private void campoPrecioMulta1campoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPrecioMulta1campoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioMulta1campoMinutosVendidosFocusGained

    private void campoCantidadDiasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCantidadDiasFocusLost
        // TODO add your handling code here:
        int cantidadDias = Integer.parseInt(campoCantidadDias.getText());
        Calendar calendario = Calendar.getInstance();
                calendario.add(Calendar.DAY_OF_MONTH, cantidadDias);
                Date fechaEntrega = new Date(calendario.getTimeInMillis());
                int dia = fechaEntrega.getDate();
                int mes = fechaEntrega.getMonth();
                int anio = fechaEntrega.getYear();
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
                jLabelEntregaAlquiler.setText(laFecha);
    }//GEN-LAST:event_campoCantidadDiasFocusLost

    /* Método para recargar un plan, es decir, agregar minutos al 'inventario' desde el módulo de planes de minutos
       Entrada: evento del botón de recarga
       Salida: ---
    */
    private void jButtonRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecargarActionPerformed
        if(tablaPlanes.getSelectedRow()<0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un plan de la tabla");
        }else{
            Long cod = Long.parseLong(tablaPlanes.getValueAt(tablaPlanes.getSelectedRow(),0).toString());
            LogicaPlanMinutos lpm = new LogicaPlanMinutos();
            PlanMinutos pm = null;
            try {
                pm = lpm.consultarPlanMinutosID(cod);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());;
            }
            if(pm.getEstadoplanminutos()){
                RecargarPlan recargar = new RecargarPlan(cod, usuarioActivo);
                recargar.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "No puede recargar un plan inactivo");
            }
        }
    }//GEN-LAST:event_jButtonRecargarActionPerformed

    private void campoPrecioAlquiler1campoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPrecioAlquiler1campoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioAlquiler1campoMinutosVendidosFocusGained

    private void campoPrecioAlquiler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioAlquiler1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioAlquiler1ActionPerformed

    /* Método de alquiler (o reserva) de modems
    
    */
    private void botonRegistrarAlquilerModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarAlquilerModemActionPerformed
        if(campoConsultaClienteAlquiler.getText().isEmpty() || campoCantidadDias.getText().isEmpty() || campoPrecioAlquiler1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay campos vacíos");
        }else{
            try {
                int cantidadDias = Integer.parseInt(campoCantidadDias.getText());
                int preciodia = Integer.parseInt(campoPrecioAlquiler1.getText());
                int totalPagar = preciodia*cantidadDias;
                AlquilerModem alquilerModem = new AlquilerModem();
                UsbModem usbModem = new UsbModem();
                Cliente clienteAlquiler = new Cliente();
                LogicaCliente logicaCliente = new LogicaCliente();
                clienteAlquiler = logicaCliente.consultarCliente(campoConsultaClienteAlquiler.getText());
                alquilerModem.setCedulacliente(clienteAlquiler);
                alquilerModem.setCedulausuario(usuarioActivo);
                Long codigoModem = Long.parseLong(jComboBoxModem.getSelectedItem().toString().split(" ")[0]);
                usbModem = lum.consultarModemCodigo(codigoModem);
                alquilerModem.setCodigomodem(usbModem);
                Date fechaActual = new Date();
                alquilerModem.setFechainicioalquiler(fechaActual);
                Calendar calendario = Calendar.getInstance();
                calendario.add(Calendar.DAY_OF_MONTH, cantidadDias);
                Date fechaEntrega = new Date(calendario.getTimeInMillis());
                int dia = fechaEntrega.getDate();
                int mes = fechaEntrega.getMonth();
                int anio = fechaEntrega.getYear();
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
                jLabelEntregaAlquiler.setText(laFecha);
                alquilerModem.setFechafinalquiler(fechaEntrega);
                int multa = Integer.parseInt(campoPrecioMulta1.getText());
                alquilerModem.setMulta(multa);
                alquilerModem.setPreciodia(preciodia);
                Date fechaDevolucion = new Date();
                fechaDevolucion.setDate(0);
                fechaDevolucion.setMonth(0);
                fechaDevolucion.setYear(0);
                alquilerModem.setFechadevolucion(fechaDevolucion);

                if(campoDisponibildadModem.getText().equals("Disponible") || campoDisponibildadModem.getText().equals("Reservado")){
                    int opcion = JOptionPane.showConfirmDialog(null, "Datos registro alquiler\n"
                        + "Cliente: "+clienteAlquiler.getCedulacliente()+"\n"
                        + "Modem: "+usbModem.getNombremodem()+"\n"
                        + "Días alquiler: "+cantidadDias+"\n"
                        + "Fecha Entrega: "+fechaEntrega.getDate()+" "+(fechaEntrega.getMonth()+1)+" "+(fechaEntrega.getYear()+1900)+"\n"
                        + "Precio por día: "+preciodia+"\n"
                        + "Multa: "+multa+"\n"
                        + "Total a pagar: "+totalPagar+"\n"
                        + "¿Son correctos los datos?");

                    if(opcion==0){
                        JOptionPane.showMessageDialog(null, "El valor a pagar es: "+totalPagar);
                        LogicaAlquilerModem logicaAlquilerModem = new LogicaAlquilerModem();
                        logicaAlquilerModem.registrarAlquilerModem(alquilerModem);
                        codigoModem = Long.parseLong(jComboBoxModem.getSelectedItem().toString().split(" ")[0]);
                        //UsbModem modemReserva = lum.consultarModemCodigo(codigoModem);
                        usbModem.setDisponibilidad("Alquilado");
                        lum.modificarModem(usbModem);

                        campoConsultaClienteAlquiler.setText("");
                        campoConsultaClienteAlquiler.setEditable(true);
                        campoConsultaClienteAlquiler.setBackground(Color.white);
                        campoCantidadDias.setText("");
                        panelDevolucionModem.setVisible(false);
                        panelAlquilarModem.setVisible(false);
                        panelSeleccionModem.setVisible(true);
                    }else if(opcion ==1){
                        JOptionPane.showMessageDialog(null, "Por favor, verifique los datos para registro del alquiler");
                    }
                }else if(campoDisponibildadModem.getText().equals("Alquilado")){
                    int opcion = JOptionPane.showConfirmDialog(null, "El modem se encuentra alquilado \n"
                        + "¿Desea reservarlo?");
                    if(opcion ==0){
                        //                        codigoModem = Long.parseLong(jComboBoxModem.getSelectedItem().toString().split(" ")[0]);
                        //                        UsbModem modemReserva = lum.consultarModemCodigo(codigoModem);
                        usbModem.setDisponibilidad("Alquilado-Reservado");
                        lum.modificarModem(usbModem);

                        campoConsultaClienteAlquiler.setText("");
                        campoConsultaClienteAlquiler.setEditable(true);
                        campoConsultaClienteAlquiler.setBackground(Color.white);
                        campoDisponibildadModem.setText("");
                        campoCantidadDias.setText("");
                        campoPrecioAlquiler1.setText("");
                        campoPrecioMulta1.setText("");
                    }else if(opcion ==1){
                        JOptionPane.showMessageDialog(null, "Por favor, verifique los datos para registro del alquiler");
                    }
                }else if(campoDisponibildadModem.getText().equals("Alquilado-Reservado")){
                    JOptionPane.showMessageDialog(null, "El modem ya se encuentra reservado, por favor seleccione otro modem");
                }
                llenarTablaModemsAlquilados();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, "No se pudo registrar alquiler \n-Hay campos vacíos\n-Error de sistema\nIntentar de nuevo");
            }
        }
    }//GEN-LAST:event_botonRegistrarAlquilerModemActionPerformed

    /*Método para manejar la visibilidad de los paneles en el módulo de alquiler de modems
      Entrada: evento del botón
      Salida: ---
    */
    private void botonAlquilerModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlquilerModemActionPerformed
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(true);
        panelSeleccionModem.setVisible(false);
    }//GEN-LAST:event_botonAlquilerModemActionPerformed

    /*Método para manejar la visibilidad de los paneles en el módulo de alquiler de modems
      Entrada: evento del botón
      Salida: ---
    */
    private void botonDevolucionModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolucionModemActionPerformed
        panelDevolucionModem.setVisible(true);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(false);
        llenarTablaModemsAlquilados();
    }//GEN-LAST:event_botonDevolucionModemActionPerformed

    /* Método para realizar una devolución de modem en el módulo de alquiler
       Entrada: evento del botón
       Salida: Tabla de modems alquilado modificada, disponibilidad del modem seleccionado modificada
    */
    private void botonDevolverModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolverModemActionPerformed
        if(tablaModemsAlquilados.getSelectedRow()<0){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un modem de la tabla");
        }else{
            Long cod = Long.parseLong(tablaModemsAlquilados.getValueAt(tablaModemsAlquilados.getSelectedRow(),0).toString());
            LogicaAlquilerModem lam = new LogicaAlquilerModem();
            AlquilerModem alquilerDev = lam.consultaAlquilerModemCod(cod);
            
            int opcion = JOptionPane.showConfirmDialog(panelModems, "¿Desea realizar la devolución del modem \n"+
                            alquilerDev.getCodigomodem().getNombremodem()+
                            " alquilado por el cliente"+alquilerDev.getCedulacliente().getNombrecliente()+"?");
            
            if(opcion==0){
                try {
                    Date fechaActual = new Date();
                    alquilerDev.setFechadevolucion(fechaActual);
                    alquilerDev.setMulta(Integer.parseInt(tablaModemsAlquilados.getValueAt(tablaModemsAlquilados.getSelectedRow(),5).toString()));
                   
                    lam.modificarAlquilerModem(alquilerDev);
                    
                    UsbModem modemDevolucion = alquilerDev.getCodigomodem(); 
                    switch (modemDevolucion.getDisponibilidad()) {
                        case "Alquilado":
                            modemDevolucion.setDisponibilidad("Disponible");
                            break;
                        case "Alquilado-Reservado":
                            modemDevolucion.setDisponibilidad("Reservado");
                            break;
                    }
                      
                    lum.modificarModem(modemDevolucion);
                    llenarTablaModemsAlquilados();
                } catch (Exception ex) {
                    Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_botonDevolverModemActionPerformed

    /*Método para manejar la visibilidad de los paneles en el módulo de alquiler de modems
      Entrada: evento del botón
      Salida: ---
    */
    private void botonAtrasAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAlquilerActionPerformed
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(true);
    }//GEN-LAST:event_botonAtrasAlquilerActionPerformed

    /*Método para manejar la visibilidad de los paneles en el módulo de alquiler de modems
      Entrada: evento del botón
      Salida: ---
    */
    private void botonAtrasAlquiler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAlquiler1ActionPerformed
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(true);
    }//GEN-LAST:event_botonAtrasAlquiler1ActionPerformed

    private void jTabbedPaneVistaVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneVistaVendedorMouseClicked
        llenarJComboBoxModemAlquiler();
    }//GEN-LAST:event_jTabbedPaneVistaVendedorMouseClicked

    /*Método para consultar si un cliente tiene un modem alquilado
      Entrada: evento del botón
      Salida: ---
    */
    private void BuscarClienteAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteAlquilerActionPerformed
        String cliente = jTextFieldClienteAlquiler.getText();
        
        LogicaAlquilerModem lam = new LogicaAlquilerModem();
        LogicaCliente lc = new LogicaCliente();
        AlquilerModem alquiler = null;
        if(isNumeric(cliente)){
            Cliente clienteAlquila = lc.consultarCliente(cliente);
            alquiler = lam.consultaAlquilerModemCliente(clienteAlquila);
        }else{
            //Cliente clienteAlquila = lc.consultarCliente(cliente);
            //AlquilerModem alquiler = lam.consultaAlquilerModemCliente(clienteAlquila);
        }
               
        DefaultTableModel dtm = new DefaultTableModel();
        tablaModemsAlquilados.setModel(dtm);
         
        dtm.addColumn("Código");
        dtm.addColumn("Cliente ");
        dtm.addColumn("Modem");
        dtm.addColumn("Fecha Final");
        dtm.addColumn("Precio Día");
        dtm.addColumn("Multa");
        dtm.addColumn("Disponibilidad");
         
        String[] fila = new String[7];
        
        fila[0] = alquiler.getCodigoalquiler()+"";
        fila[1] = alquiler.getCedulacliente().getNombrecliente();
        fila[2] = alquiler.getCodigomodem().getNombremodem();

        Date fecha = alquiler.getFechafinalquiler();
        String fechaD = ""+fecha.getDate()+"/"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900);

        fila[3] = fechaD;

        fila[4] = alquiler.getPreciodia()+"";

        Date fechaActual = new Date();
        Date fechaDevolucion = alquiler.getFechadevolucion();
        if(!fechaDevolucion.toString().equals(fechaActual.toString())){
            long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
            long diferencia = ( fecha.getTime() - fechaActual.getTime())/MILLSECS_PER_DAY;
            if(diferencia<0){
                int diaMulta = alquiler.getMulta();
                fila[5] = diferencia*diaMulta*(-1)+"";
            }
        else{
            fila[5] = 0+"";
        }}

        fila[6] = alquiler.getCodigomodem().getDisponibilidad();

        if(fila[6].equals("Alquilado") || fila[6].equals("Alquilado-Reservado")){
            dtm.addRow(fila);
        }else{
            JOptionPane.showMessageDialog(panelModems, "El cliente no tiene ningún modem alquilado");
        }
        
    }//GEN-LAST:event_BuscarClienteAlquilerActionPerformed

    /* Método para llenar la tabla en el módulo de devolución con los modems que se encuentra alquilados
       Entrada: evento del botón
       Salida: tabla de modems alquilados actualizada
    */
    private void actualizarTablaModemsAlquiladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarTablaModemsAlquiladosActionPerformed
        llenarTablaModemsAlquilados();
    }//GEN-LAST:event_actualizarTablaModemsAlquiladosActionPerformed

    /*Método para generar un reporte dependiendo de la información ingresada en el módulo de reportes
      Entrada: evento del botón
      Salida: reporte generado y exportado en pdf
    */
    private void jButtonGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarReporteActionPerformed
        Reporte rep = new Reporte();
        if(jTextFieldReporteCedulaMinutos.isEnabled()){
            String cedula = jTextFieldReporteCedulaMinutos.getText();
            String ruta = System.getProperty("user.dir") + "/src/Reportes/reporteClienteMinutos.jasper";
            Map param = new HashMap();
            param.put("cedulaC", cedula);

            Reporte.exportarReporte(ruta, param, "Reporte de Venta Minutos Cliente");
            File path = new File ("Reporte de Venta Minutos Cliente.pdf");
            try {
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
            path.deleteOnExit();
        }else if(jTextFieldReporteCedulaAlquiler.isEnabled()){
            String cedula = jTextFieldReporteCedulaAlquiler.getText();
            String ruta = System.getProperty("user.dir") + "/src/Reportes/reporteClienteAlquiler.jasper";
            Map param = new HashMap();
            param.put("cedulaC", cedula);
            Reporte.exportarReporte(ruta, param, "Reporte de Alquiler Usb-Modem Cliente");
            File path = new File ("Reporte de Alquiler Usb-Modem Cliente.pdf");
            try {
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
            path.deleteOnExit();
        }else if(fechaInicioMinutosReporte.isEnabled() && fechaFinMinutosReporte.isEnabled())
        {
            Date fechaInicio = (Date)fechaInicioMinutosReporte.getValue();
            Date fechaFin = (Date)fechaFinMinutosReporte.getValue();
            String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteVentas.jasper";
            Map param = new HashMap();
            param.put("fechaInicio", fechaInicio);
            param.put("fechaFin", fechaFin);
            Reporte.exportarReporte(ruta, param, "Reporte Ventas");
            File path = new File ("Reporte Ventas.pdf");
            try {
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
            path.deleteOnExit();       
        }
        else if(fechaInicioAlquilerReportes.isEnabled() && fechaFinAlquilerReportes.isEditable())
        {
            Date fechaInicio = (Date)fechaInicioAlquilerReportes.getValue();
            Date fechaFin = (Date)fechaFinAlquilerReportes.getValue();
            String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteAlquiler.jasper";
            Map param = new HashMap();
            param.put("fechaInicio", fechaInicio);
            param.put("fechaFin", fechaFin);
            Reporte.exportarReporte(ruta, param, "Reporte Alquileres");
            File path = new File ("Reporte Alquileres.pdf");
            try {
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
            path.deleteOnExit();    
        }
        
        
        jTextFieldReporteCedulaAlquiler.setText("");
        jTextFieldReporteCedulaMinutos.setText("");
        jTextFieldReporteCedulaMinutos.setText("");
        jTextFieldReporteCedulaAlquiler.setText("");
        fechaFinAlquilerReportes.setText("");
        fechaFinMinutosReporte.setText("");
        fechaInicioAlquilerReportes.setText("");
        fechaInicioMinutosReporte.setText("");
        
    }//GEN-LAST:event_jButtonGenerarReporteActionPerformed

    /*Método para manejar (habilitar o deshabilitar) los campos de texto en el módulo de reportes
      Entrada: evento del botón
      Salida: campo clickeado habilitado
    */
    private void jTextFieldReporteCedulaMinutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldReporteCedulaMinutosMouseClicked
        jTextFieldReporteCedulaMinutos.setEnabled(true);
        jTextFieldReporteCedulaAlquiler.setEnabled(false);
        fechaFinAlquilerReportes.setEnabled(false);
        fechaFinMinutosReporte.setEnabled(false);
        fechaInicioAlquilerReportes.setEnabled(false);
        fechaInicioMinutosReporte.setEnabled(false);
    }//GEN-LAST:event_jTextFieldReporteCedulaMinutosMouseClicked

    /*Método para manejar (habilitar o deshabilitar) los campos de texto en el módulo de reportes
      Entrada: evento del botón
      Salida: campo clickeado habilitado
    */
    private void jTextFieldReporteCedulaAlquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldReporteCedulaAlquilerMouseClicked
        jTextFieldReporteCedulaMinutos.setEnabled(false);
        jTextFieldReporteCedulaAlquiler.setEnabled(true);
        fechaFinAlquilerReportes.setEnabled(false);
        fechaFinMinutosReporte.setEnabled(false);
        fechaInicioAlquilerReportes.setEnabled(false);
        fechaInicioMinutosReporte.setEnabled(false);
    }//GEN-LAST:event_jTextFieldReporteCedulaAlquilerMouseClicked

    /*Método para manejar (habilitar o deshabilitar) los campos de texto en el módulo de reportes
      Entrada: evento del botón
      Salida: campo clickeado habilitado
    */
    private void fechaInicioMinutosReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaInicioMinutosReporteMouseClicked
        jTextFieldReporteCedulaMinutos.setEnabled(false);
        jTextFieldReporteCedulaAlquiler.setEnabled(false);
        fechaFinAlquilerReportes.setEnabled(false);
        fechaInicioAlquilerReportes.setEnabled(false);
        fechaInicioMinutosReporte.setEnabled(true);
    }//GEN-LAST:event_fechaInicioMinutosReporteMouseClicked

    /*Método para manejar (habilitar o deshabilitar) los campos de texto en el módulo de reportes
      Entrada: evento del botón
      Salida: campo clickeado habilitado
    */
    private void fechaFinMinutosReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaFinMinutosReporteMouseClicked
        jTextFieldReporteCedulaMinutos.setEnabled(false);
        jTextFieldReporteCedulaAlquiler.setEnabled(false);
        fechaFinAlquilerReportes.setEnabled(false);
        fechaFinMinutosReporte.setEnabled(true);
        fechaInicioAlquilerReportes.setEnabled(false);
    }//GEN-LAST:event_fechaFinMinutosReporteMouseClicked

    /*Método para manejar (habilitar o deshabilitar) los campos de texto en el módulo de reportes
      Entrada: evento del botón
      Salida: campo clickeado habilitado
    */
    private void fechaInicioAlquilerReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaInicioAlquilerReportesMouseClicked
        jTextFieldReporteCedulaMinutos.setEnabled(false);
        jTextFieldReporteCedulaAlquiler.setEnabled(false);
        fechaFinMinutosReporte.setEnabled(false);
        fechaInicioAlquilerReportes.setEnabled(true);
        fechaInicioMinutosReporte.setEnabled(false);
    }//GEN-LAST:event_fechaInicioAlquilerReportesMouseClicked

    /*Método para manejar (habilitar o deshabilitar) los campos de texto en el módulo de reportes
      Entrada: evento del botón
      Salida: campo clickeado habilitado
    */
    private void fechaFinAlquilerReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaFinAlquilerReportesMouseClicked
        jTextFieldReporteCedulaMinutos.setEnabled(false);
        jTextFieldReporteCedulaAlquiler.setEnabled(false);
        fechaFinAlquilerReportes.setEnabled(true);
        fechaFinMinutosReporte.setEnabled(false);
        fechaInicioMinutosReporte.setEnabled(false);
    }//GEN-LAST:event_fechaFinAlquilerReportesMouseClicked
    
    private void botonActualizarTablaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaUsuariosActionPerformed
        LogicaUsuario logicaUsuario = new LogicaUsuario();
        List<Usuario> usuarios = logicaUsuario.consultarUsuarios();
        llenarTablaUsuarios(usuarios);
    }//GEN-LAST:event_botonActualizarTablaUsuariosActionPerformed

    private void botonEstadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadoClienteActionPerformed
       LogicaCliente lc = new LogicaCliente();
       String cedulaCliente = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 4).toString();
       Cliente cliente = lc.consultarCliente(cedulaCliente);
       if(cliente.getEstadocliente() && !cliente.getNombrecliente().equals("default")){
           cliente.setEstadocliente(false);
       }else{
           cliente.setEstadocliente(true);
       }
       try {
           lc.modificarCliente(cliente);
       } catch (Exception ex) {
           Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
       }
       llenarTablaClientes(lc.consultarClientes());
       botonModificarCliente.setEnabled(false);
       botonEstadoCliente.setEnabled(false);
    }//GEN-LAST:event_botonEstadoClienteActionPerformed
 
    public void llenarTablaUsuarios(List<Usuario> listaUsuarios)
     {
        DefaultTableModel dtm = new DefaultTableModel();
        tablaUsuarios.setModel(dtm);
        dtm.addColumn("Cedula");
        dtm.addColumn("Nombre");
        dtm.addColumn("Telefono");
        dtm.addColumn("Direccion");
        dtm.addColumn("E-Mail");
        dtm.addColumn("Tipo");
        dtm.addColumn("Estado");
        
        if(listaUsuarios!=null)
        {
            String[] fila = new String[7];
            for (Usuario listaUsuario : listaUsuarios) 
            {
                fila[0] = listaUsuario.getCedulausuario();
                fila[1] = listaUsuario.getNombreusuario();
                fila[2] = listaUsuario.getTelefonosuario();
                fila[3] = listaUsuario.getDireccionusuario();
                fila[4] = listaUsuario.getCorreousuario();
                fila[5] = listaUsuario.getTipousuario();
                String estado= "Inactivo";
                if (listaUsuario.getEstadousuario()) {
                    estado= "Activo";
                }
                fila[6]=estado;
                dtm.addRow(fila);
            }
        }
    }
    
    /*
        Metodo para mostrar clientes
        Entrada: lista de objetos Cliente
        Salida: --
    */ 
    private void llenarTablaClientes(List<Cliente> listaClientes){
        Calendar fecha = Calendar.getInstance();
        String estado, s = "";
        DefaultTableModel dtm = new DefaultTableModel();
        tablaClientes.setModel(dtm);
        dtm.addColumn("Nombre");
        dtm.addColumn("Teléfono");
        dtm.addColumn("Dirección");
        dtm.addColumn("Correo");
        dtm.addColumn("Identificación");
        dtm.addColumn("Fecha_nac");
        dtm.addColumn("Estado");
        String[] fila = new String[7];
        for (int i = 0; i < listaClientes.size(); i++) {
           fila[0]=listaClientes.get(i).getNombrecliente();
           fila[1]=listaClientes.get(i).getTelefonocliente();
           fila[2]=listaClientes.get(i).getDireccioncliente();
           fila[3]=listaClientes.get(i).getCorreocliente();
           fila[4]=listaClientes.get(i).getCedulacliente();
           try {
                fecha.setTimeInMillis(listaClientes.get(i).getFechanacimientocliente().getTime());
                s= fecha.get(Calendar.DAY_OF_MONTH) +"-"+ (fecha.get(Calendar.MONTH)+1) +"-"+fecha.get(Calendar.YEAR);
            } catch (java.lang.NullPointerException e) {
                s="";
            }
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

    /*
        Metodo para abrir la ventana de modificación de clientes
        Entrada: objeto Cliente
        Salida: --
    */ 
    public void ventanaModificarCliente(Cliente cliente){
        ModificarCliente mc = new ModificarCliente(this, true, cliente);
        mc.setVisible(true);
    }
    /* Método para llenar la tabla con los registros de la consulta que se haga a la BD.
       Entrada: lista de objetos de tipo planes minutos 
       Salida: vacía
    */
    private void llenarTablaPlanMinutos(List<PlanMinutos> listaPlanMinutos){
        DefaultTableModel dtm = new DefaultTableModel();
        tablaPlanes.setModel(dtm);
        Calendar fecha = Calendar.getInstance();
        String laFecha;
        dtm.addColumn("Codigo");
        dtm.addColumn("Nombre");
        dtm.addColumn("Min. fijos");
        dtm.addColumn("Cant. Actual");
        dtm.addColumn("Próxima Recarga");
        dtm.addColumn("Valor compra");
        dtm.addColumn("Valor venta");
        dtm.addColumn("Acumulable");
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
    
    public void llenarComboPlanesVenta()
    { 
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        List<PlanMinutos> planes = logicaPlanMinutos.consultarPlanMinutos();
        comboPlanesVenta.removeAllItems();
        for(PlanMinutos plan : planes)
        {
            if(plan.getEstadoplanminutos())
            {
                comboPlanesVenta.addItem(plan.getCodigoplan()+" "+plan.getNombreplan());
            }
        }  
    }
     
    private void llenarJComboBoxModemAlquiler(){
        LogicaUsbModem logicaUsbModem = new LogicaUsbModem();
         List<UsbModem> usbModems = logicaUsbModem.consultarModems();
         jComboBoxModem.removeAllItems();
         for (UsbModem usbModem : usbModems) {
             if(usbModem.getEstadousbmodem()){
                jComboBoxModem.addItem(usbModem.getCodigomodem()+" "+usbModem.getNombremodem());
             }
         }
    }
     
     private void ActualizarFechaAlquiler(){
        //Calendar fechaHoy = Calendar.getInstance();
        Date fechaActual = new Date();
        int dia = fechaActual.getDate();
        int mes = fechaActual.getMonth();
        int anio = fechaActual.getYear();
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
        jLabelEntregaAlquiler.setText(laFecha);
    }
     
    /* Método para llenar la tabla con los modems que se encuentran alquilados en el módulo de devolución de modems
       Entrada: ---
       Salida: tabla actualizada
     */
    public void llenarTablaModemsAlquilados(){
        LogicaAlquilerModem lam = new LogicaAlquilerModem();
        List<AlquilerModem> modemsAlquiler = lam.consultarAlquilerModem();
        
        DefaultTableModel dtm = new DefaultTableModel();
        tablaModemsAlquilados.setModel(dtm);
         
        dtm.addColumn("Código");
        dtm.addColumn("Cliente ");
        dtm.addColumn("Modem");
        dtm.addColumn("Fecha Final");
        dtm.addColumn("Precio Día");
        dtm.addColumn("Multa");
        dtm.addColumn("Disponibilidad");
         
        String[] fila = new String[7];
         
        for (int i = 0; i < modemsAlquiler.size(); i++) {
            fila[0] = modemsAlquiler.get(i).getCodigoalquiler()+"";
            fila[1] = modemsAlquiler.get(i).getCedulacliente().getNombrecliente();
            fila[2] = modemsAlquiler.get(i).getCodigomodem().getNombremodem();
            
            Date fecha = modemsAlquiler.get(i).getFechafinalquiler();
            String fechaD = ""+fecha.getDate()+"/"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900);
            
            fila[3] = fechaD;
            
            fila[4] = modemsAlquiler.get(i).getPreciodia()+"";
            
            Date fechaActual = new Date();
            Date fechaFinal = modemsAlquiler.get(i).getFechafinalquiler();
            if(!fechaFinal.toString().equals(fechaActual.toString())){
                long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
                long diferencia = ( fecha.getTime() - fechaActual.getTime())/MILLSECS_PER_DAY;
                if(diferencia<0){
                    int diaMulta = modemsAlquiler.get(i).getMulta();
                    fila[5] = diferencia*diaMulta*(-1)+"";
                }
            else{
                fila[5] = 0+"";
            }}
            
            fila[6] = modemsAlquiler.get(i).getCodigomodem().getDisponibilidad();
            
            Date fechaNula = new Date();
            fechaNula.setDate(0);
            fechaNula.setMonth(0);
            fechaNula.setYear(0);
            String fechaN = fechaNula.getDate()+"/"+(fechaNula.getMonth()+1)+"/"+(fechaNula.getYear()+1900);
            Date fechaDev =modemsAlquiler.get(i).getFechadevolucion();
            String fechaDevo = fechaDev.getDate()+"/"+(fechaDev.getMonth()+1)+"/"+(fechaDev.getYear()+1900);
            
            if(fechaN.equals(fechaDevo)){
                dtm.addRow(fila);
            }  
        }
     }
    
    /* Método que alerta al usuario al ingresar al sistema si un cliente se encuentra retrasado
       en la devolución de un modem
       Entrada: ---
       Salida: mensaje de advertencia en la pantalla con información relevante del cliente
    */
    public void alertaDevolucion(){
        Date hoy = new Date();
        String fechaHoy= hoy.getDate()+"/"+(hoy.getMonth()+1)+"/"+(hoy.getYear()+1900);
        
        LogicaAlquilerModem lam = new LogicaAlquilerModem();
        List<AlquilerModem> alquilados = lam.consultarAlquilerModem();
        
        for (int i = 0; i < alquilados.size(); i++) 
        {
            Date fechaF = alquilados.get(i).getFechafinalquiler();
            String fechaFinal= fechaF.getDate()+"/"+(fechaF.getMonth()+1)+"/"+(fechaF.getYear()+1900);
            Date fechaD = alquilados.get(i).getFechadevolucion();
            String fechaDevol = fechaD.getDate()+"/"+(fechaD.getMonth()+1)+"/"+(fechaD.getYear()+1900);
            
            long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
            long diferencia = ( hoy.getTime() - fechaF.getTime())/MILLSECS_PER_DAY;
            if(diferencia>0 && (!fechaDevol.equals("31/12/1899"))){
                JOptionPane.showMessageDialog(panelModems, "El cliente "+alquilados.get(i).getCedulacliente().getNombrecliente()
                    +" no ha retornado el modem "+alquilados.get(i).getCodigomodem().getNombremodem()+".\n"+
                    "Puede contactarlo al número "+alquilados.get(i).getCedulacliente().getTelefonocliente());
            }
        }
    }
    
    /*Método para realizar la recarga automática mensual de los planes activos en el sistema
      Entrada:---
      Salida: planes modificados (minutos para consumir) cuya fecha de recarga sea el día actual
    */
    public void recargaAutomaticaPlan(){
        LogicaPlanMinutos lp = new LogicaPlanMinutos();
        List<PlanMinutos> planes = lp.consultarPlanMinutos();
        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.DAY_OF_MONTH, 30);
        Date hoy = new Date();
        
        String fechaHoy= hoy.getDate()+"/"+(hoy.getMonth()+1)+"/"+(hoy.getYear()+1900);
        
        for (int i = 0; i < planes.size(); i++) {
            
            Date fecha = planes.get(i).getFechaproximarecarga();
            String fechaRecarga = fecha.getDate()+"/"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900);
            
            if(planes.get(i).getEstadoplanminutos()){
                if(fechaHoy.equals(fechaRecarga)){
                    if(planes.get(i).getMinutosacumulables()){
                        try {
                            int minActual = planes.get(i).getCantidadminutos();
                            planes.get(i).setCantidadminutos(minActual+planes.get(i).getCantidadminutosfijos());

                            fecha = new Date(calendario.getTimeInMillis());
                            planes.get(i).setFechaproximarecarga(fecha);
                            lp.modificarPlanMinutos(planes.get(i));

                            Recarga recargaAuto = new Recarga();
                            recargaAuto.setFecharecarga(hoy);
                            recargaAuto.setCodigoplan(planes.get(i));
                            recargaAuto.setCedulausuario(usuarioActivo);
                            recargaAuto.setMinutos(planes.get(i).getCantidadminutosfijos());
                            recargaAuto.setValorecarga(planes.get(i).getCostominuto());

                            LogicaRecarga lr = new LogicaRecarga();
                            lr.registrarRecarga(recargaAuto);
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }else{
                        try {
                            planes.get(i).setCantidadminutos(planes.get(i).getCantidadminutosfijos());

                            fecha = new Date(calendario.getTimeInMillis());
                            planes.get(i).setFechaproximarecarga(fecha);
                            lp.modificarPlanMinutos(planes.get(i));

                            Recarga recargaAuto = new Recarga();
                            recargaAuto.setFecharecarga(hoy);
                            recargaAuto.setCodigoplan(planes.get(i));
                            recargaAuto.setCedulausuario(usuarioActivo);
                            recargaAuto.setMinutos(planes.get(i).getCantidadminutosfijos());
                            recargaAuto.setValorecarga(planes.get(i).getCostominuto());

                            LogicaRecarga lr = new LogicaRecarga();
                            lr.registrarRecarga(recargaAuto);
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            }
        }
    }
    
    public  void validarPromocion(String cedulaCliente, int minutosVendidos){
        LogicaPromocion lp = new LogicaPromocion();
        LogicaVentaMinutos lvm = new LogicaVentaMinutos();
        List<Promocion> promocionesActivas = lp.consultarPromocionesActivas(); //Lista de promociones activas
        
        
        for (int i = 0; i < promocionesActivas.size(); i++) {
            int condicion = promocionesActivas.get(i).getCondicion() - minutosVendidos;
            int codigoPromo = Integer.parseInt(promocionesActivas.get(i).getCodigopromocion()+"");
            String fechaInicioPromo = calcularFechaPromo(promocionesActivas.get(i)); //Fecha inicial de la promoción i
            
            //Lista que trae la última venta en la que se ha ganado la promoción i
            List<VentaMinutos> ventaConPromoGanada = lvm.consultaVentaConPromo(cedulaCliente, fechaInicioPromo, codigoPromo);
           
           
            
            //Si se encuentra una promoción que ya ha sido ganada, se cuentan los minutos a partir de la última venta que tuvo la promoción
            if(!ventaConPromoGanada.isEmpty()){
                promocionesActivas.get(i).setFechainiciopromocion(ventaConPromoGanada.get(0).getFechaventa());
                fechaInicioPromo = calcularFechaPromoPost(promocionesActivas.get(i));//Recalculando la fecha a partir de la cual se empiezan a contar los minutos para ganar promoción
//                System.out.println("Ya se ganó esa promoción, nueva fecha = "+ fechaInicioPromo);
            }else{
//                System.out.println("No se ha ganado la promoción anteriormente");
            }
            //Lista que trae la venta que cumpla con la condición de la promoción i
            List<VentaMinutos> estaVenta = lvm.consultarVentasGanadoras(condicion, cedulaCliente, fechaInicioPromo);
            if(!estaVenta.isEmpty()){
                if(!promocionesGanadas.contains(promocionesActivas.get(i))){
                    promocionesGanadas.add(promocionesActivas.get(i));
                }else{
                    //La promoción ya está contenida en la lista de promocionesGanadas
                }
            }else{
                List<VentaMinutos> comprasCliente = lvm.consultaVentasCliente(cedulaCliente);
                if (comprasCliente.isEmpty() && minutosVendidos >= promocionesActivas.get(i).getCondicion()) {
//                    System.out.println("El cliente cumple la condición en su primera venta");
                    promocionesGanadas.add(promocionesActivas.get(i));
                } else {
//                    System.out.println("No cumple la condición para ganar la promoción I");
                }
//                System.out.println("No cumple la condición para ganar la promoción II");
                //No cumple la condición para ganar la promoción
            }
        }
        
    }
    
    public String mostrarPromocionesGanadas(List<Promocion> listaPromo){
        String s ="PROMOCIONES GANADAS!!\n";
        int totalBeneficios =0;
        for (int i = 0; i < listaPromo.size(); i++) {
            s += listaPromo.get(i).getDescripcion()+" Beneficio: "+listaPromo.get(i).getBeneficio()+" minutos GRATIS!\n";
            totalBeneficios += listaPromo.get(i).getBeneficio();
        }
        s+="Total Minutos de Promociones = "+ totalBeneficios;
        return s;
    }
    
    //Actualiza el estado de las promociones a inactivas cuando han caducado.
    public void actualizarPromociones(){
        LogicaPromocion lp = new LogicaPromocion();
        List<Promocion> promocionesActivas = lp.consultarPromocionesActivas();
        Calendar fechaHoy = Calendar.getInstance();
        Date date = fechaHoy.getTime();
        for (int i = 0; i < promocionesActivas.size(); i++) {
            if(promocionesActivas.get(i).getFechafinpromocion().before(date)){
                promocionesActivas.get(i).setEstadopromocion(false);
                try {
                    lp.modificarPromocion(promocionesActivas.get(i));
                } catch (Exception ex) {
                    Logger.getLogger(VistaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                //La promoción no ha caducado
            }
        }
    }
    
    public String calcularFechaPromo(Promocion promocion){
        int dia,mes,anio;
        String fechaPromocion="";
        Calendar calendario = Calendar.getInstance();
        
        calendario.setTime(promocion.getFechainiciopromocion());
        dia=calendario.get(Calendar.DAY_OF_MONTH);
        mes=calendario.get(Calendar.MONTH);
        anio=calendario.get(Calendar.YEAR);
        fechaPromocion = anio+"-"+mes+"-"+dia;
        
//        System.out.print(fechaPromocion+"\n");
        return fechaPromocion;
    }
    
    public String calcularFechaPromoPost(Promocion promocion){
        int dia,mes,anio;
        String fechaPromocion="";
        Calendar calendario = Calendar.getInstance();
        
        calendario.setTime(promocion.getFechainiciopromocion());
        dia=calendario.get((Calendar.DAY_OF_MONTH+1));
        mes=calendario.get(Calendar.MONTH);
        anio=calendario.get(Calendar.YEAR);
        fechaPromocion = anio+"-"+mes+"-"+dia;
        
//        System.out.print("Fecha modificada pal otro día: "+fechaPromocion+"\n");
        return fechaPromocion;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarClienteAlquiler;
    private javax.swing.JButton actualizarTablaModemsAlquilados;
    private javax.swing.JButton botonActualizarTablaClientes;
    private javax.swing.JButton botonActualizarTablaModems;
    private javax.swing.JButton botonActualizarTablaPlan;
    private javax.swing.JButton botonActualizarTablaPromo;
    private javax.swing.JButton botonActualizarTablaUsuarios;
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonAgregarModem;
    private javax.swing.JButton botonAgregarPlan;
    private javax.swing.JButton botonAgregarPromocion;
    private javax.swing.JButton botonAgregarUsuario;
    private javax.swing.JButton botonAlquilerModem;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonAtrasAlquiler;
    private javax.swing.JButton botonAtrasAlquiler1;
    private javax.swing.JButton botonCambiarEstadoModem;
    private javax.swing.JButton botonConsultarCliente;
    private javax.swing.JButton botonConsultarModem;
    private javax.swing.JButton botonConsultarPlanes;
    private javax.swing.JButton botonConsultarPromociones;
    private javax.swing.JButton botonConsultarUsuario;
    private javax.swing.JButton botonDevolucionModem;
    private javax.swing.JButton botonDevolverModem;
    private javax.swing.JButton botonEstadoCliente;
    private javax.swing.JButton botonInactivarPlan;
    private javax.swing.JButton botonInactivarPromocion;
    private javax.swing.JButton botonInactivarUsuario;
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JButton botonModificarModem;
    private javax.swing.JButton botonModificarPlan;
    private javax.swing.JButton botonModificarUsuario;
    private javax.swing.JButton botonRegistrarAlquilerModem;
    private javax.swing.JButton botonRegistrarVenta;
    private javax.swing.JTextField campoCantidadDias;
    private javax.swing.JTextField campoConsultaCliente;
    private javax.swing.JTextField campoConsultaClienteAlquiler;
    private javax.swing.JTextField campoConsultaClienteVenta;
    private javax.swing.JTextField campoConsultaModems;
    private javax.swing.JTextField campoConsultaPlanes;
    private javax.swing.JTextField campoConsultaPromociones;
    private javax.swing.JTextField campoConsultaUsuario;
    private javax.swing.JTextField campoDisponibildadModem;
    private javax.swing.JFormattedTextField campoMinutosVendidos;
    private javax.swing.JTextField campoPrecioAlquiler1;
    private javax.swing.JTextField campoPrecioMulta1;
    private javax.swing.JComboBox comboPlanesVenta;
    private javax.swing.JFormattedTextField fechaFinAlquilerReportes;
    private javax.swing.JFormattedTextField fechaFinMinutosReporte;
    private javax.swing.JFormattedTextField fechaInicioAlquilerReportes;
    private javax.swing.JFormattedTextField fechaInicioMinutosReporte;
    private javax.swing.JButton jButtonGenerarReporte;
    private javax.swing.JButton jButtonRecargar;
    private javax.swing.JComboBox<String> jComboBoxModem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelBusqueda2;
    private javax.swing.JLabel jLabelBusqueda3;
    private javax.swing.JLabel jLabelBusqueda4;
    private javax.swing.JLabel jLabelBusqueda5;
    private javax.swing.JLabel jLabelBusqueda6;
    private javax.swing.JLabel jLabelBusqueda7;
    private javax.swing.JLabel jLabelClienteAlquiler1;
    private javax.swing.JLabel jLabelDisponibilidad;
    private javax.swing.JLabel jLabelEntregaAlquiler;
    private javax.swing.JLabel jLabelFechaEntrega;
    private javax.swing.JLabel jLabelFechaEntrega1;
    private javax.swing.JLabel jLabelModem;
    private javax.swing.JLabel jLabelMulta;
    private javax.swing.JLabel jLabelPrecio1;
    private javax.swing.JLabel jLabelSesion;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneVistaVendedor;
    private javax.swing.JTextField jTextFieldClienteAlquiler;
    private javax.swing.JTextField jTextFieldReporteCedulaAlquiler;
    private javax.swing.JTextField jTextFieldReporteCedulaMinutos;
    private javax.swing.JLabel labeltituloCliente1;
    private javax.swing.JLabel labeltituloCliente2;
    private javax.swing.JLabel labeltituloModems;
    private javax.swing.JLabel labeltituloPlanes;
    private javax.swing.JLabel labeltituloPlanes1;
    private javax.swing.JLabel labeltituloPlanes3;
    private javax.swing.JLabel labeltituloPlanes4;
    private javax.swing.JLabel labeltituloPromociones;
    private javax.swing.JLabel labeltituloUsuario;
    private javax.swing.JPanel panelAlquilarModem;
    private javax.swing.JPanel panelClientesVendedor;
    private javax.swing.JPanel panelDevolucionModem;
    private javax.swing.JPanel panelModems;
    private javax.swing.JPanel panelMovimientosModem;
    private javax.swing.JPanel panelPlanes;
    private javax.swing.JPanel panelPromociones;
    private javax.swing.JPanel panelRegistrarVenta;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelSeleccionModem;
    private javax.swing.JPanel panelUsurios;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaModems;
    private javax.swing.JTable tablaModemsAlquilados;
    private javax.swing.JTable tablaPlanes;
    private javax.swing.JTable tablaPromociones;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    
}
