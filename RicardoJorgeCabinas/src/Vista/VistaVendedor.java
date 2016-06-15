package Vista;

import Logica.LogicaAlquilerModem;
import Logica.LogicaCliente;
import Logica.LogicaPlanMinutos;
import Logica.LogicaPromocion;
import Logica.LogicaRecarga;
import Modelo.Cliente;
import Modelo.PlanMinutos;
import Logica.LogicaUsbModem;
import Logica.LogicaVentaMinutos;
import Modelo.AlquilerModem;
import Modelo.Promocion;
import Modelo.Recarga;
import Modelo.UsbModem;
import Modelo.Usuario;
import Modelo.VentaMinutos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaVendedor extends javax.swing.JFrame{
    LogicaCliente lc = new LogicaCliente();
    LogicaPromocion lp = new LogicaPromocion();
    LogicaUsbModem lum = new LogicaUsbModem();
    List<UsbModem> modems = lum.consultarModems();
    Usuario usuarioActivo;
    Cliente clienteVenta;
    Cliente clienteAlquiler;
    PlanMinutos planVenta;
    int precioMinuto;
    int minutosVendidos;
    int minutosFacturados;
    int cantidadDiasAlquilados;
    
    static List<Promocion> promocionesGanadas = new ArrayList<>();
    
    public VistaVendedor(Usuario usuarioActivo)  
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas - Vendedor");
        this.setResizable(false);
        this.usuarioActivo=usuarioActivo;
        llenarTablaModems(modems);
        llenarComboPlanesVenta();
        ActualizarFechaAlquiler();
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(true);
        alertaDevolucion();
        recargaAutomaticaPlan();
        actualizarPromociones();
        jLabelSesion.setText("Sesión: "+usuarioActivo.getNombreusuario());
        
        LogicaCliente logicaCliente = new LogicaCliente();
        clienteVenta=logicaCliente.consultarCliente("default");
        campoConsultaClienteVenta.setText(clienteVenta.getCedulacliente());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPaneVistaVendedor = new javax.swing.JTabbedPane();
        panelRegistrarVenta = new javax.swing.JPanel();
        labeltituloPlanes1 = new javax.swing.JLabel();
        jLabelBusqueda5 = new javax.swing.JLabel();
        jLabelBusqueda6 = new javax.swing.JLabel();
        jLabelBusqueda7 = new javax.swing.JLabel();
        botonRegistrarVenta = new javax.swing.JButton();
        campoMinutosVendidos = new javax.swing.JFormattedTextField();
        comboPlanesVenta = new javax.swing.JComboBox();
        campoConsultaClienteVenta = new javax.swing.JTextField();
        panelMovimientosModem = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelSeleccionModem = new javax.swing.JPanel();
        botonAlquilerModem = new javax.swing.JButton();
        botonDevolucionModem = new javax.swing.JButton();
        labeltituloCliente2 = new javax.swing.JLabel();
        panelAlquilarModem = new javax.swing.JPanel();
        jLabelModem1 = new javax.swing.JLabel();
        campoDisponibildadModem = new javax.swing.JTextField();
        labeltituloPlanes4 = new javax.swing.JLabel();
        jLabelMulta1 = new javax.swing.JLabel();
        jComboBoxModem = new javax.swing.JComboBox<>();
        jLabelFechaEntrega2 = new javax.swing.JLabel();
        campoConsultaClienteAlquiler = new javax.swing.JTextField();
        jLabelDisponibilidad = new javax.swing.JLabel();
        campoCantidadDias = new javax.swing.JTextField();
        botonRegistrarAlquilerModem1 = new javax.swing.JButton();
        jLabelFechaEntrega3 = new javax.swing.JLabel();
        jLabelClienteAlquiler2 = new javax.swing.JLabel();
        jLabelEntregaAlquiler1 = new javax.swing.JLabel();
        campoPrecioMulta1 = new javax.swing.JTextField();
        campoPrecioAlquiler = new javax.swing.JTextField();
        jLabelPrecio1 = new javax.swing.JLabel();
        botonAtrasAlquiler1 = new javax.swing.JButton();
        panelDevolucionModem = new javax.swing.JPanel();
        BuscarClienteAlquiler = new javax.swing.JButton();
        botonDevolverModem = new javax.swing.JButton();
        jTextFieldClienteAlquiler = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labeltituloPlanes5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModemsAlquilados = new javax.swing.JTable();
        botonAtrasAlquiler = new javax.swing.JButton();
        actualizarTablaModemsAlquilados = new javax.swing.JButton();
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
        jLabelSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 560));

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

        jLabelBusqueda5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda5.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda5.setText("Cliente *");
        panelRegistrarVenta.add(jLabelBusqueda5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabelBusqueda6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelBusqueda6.setForeground(new java.awt.Color(162, 146, 146));
        jLabelBusqueda6.setText("Plan");
        panelRegistrarVenta.add(jLabelBusqueda6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

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

        campoMinutosVendidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        panelRegistrarVenta.add(campoMinutosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 90, 25));
        panelRegistrarVenta.add(comboPlanesVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 180, -1));
        panelRegistrarVenta.add(campoConsultaClienteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 180, 25));

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
                .addGap(115, 115, 115)
                .addGroup(panelSeleccionModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAlquilerModem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDevolucionModem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        panelAlquilarModem.setBackground(new java.awt.Color(255, 255, 255));
        panelAlquilarModem.setPreferredSize(new java.awt.Dimension(818, 490));

        jLabelModem1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelModem1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelModem1.setText("Modem");

        campoDisponibildadModem.setEditable(false);
        campoDisponibildadModem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDisponibildadModemcampoMinutosVendidosFocusGained(evt);
            }
        });

        labeltituloPlanes4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPlanes4.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPlanes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes4.setText("Alquiler USB-Modem");

        jLabelMulta1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelMulta1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelMulta1.setText("Multa $");

        jComboBoxModem.setToolTipText("");
        jComboBoxModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModemActionPerformed(evt);
            }
        });

        jLabelFechaEntrega2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelFechaEntrega2.setForeground(new java.awt.Color(162, 146, 146));
        jLabelFechaEntrega2.setText("Fecha Entrega");

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

        botonRegistrarAlquilerModem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonRegistrarAlquilerModem1.setForeground(new java.awt.Color(162, 146, 146));
        botonRegistrarAlquilerModem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/alquilar.png"))); // NOI18N
        botonRegistrarAlquilerModem1.setText("Registrar");
        botonRegistrarAlquilerModem1.setBorderPainted(false);
        botonRegistrarAlquilerModem1.setContentAreaFilled(false);
        botonRegistrarAlquilerModem1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRegistrarAlquilerModem1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRegistrarAlquilerModem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarAlquilerModem1ActionPerformed(evt);
            }
        });

        jLabelFechaEntrega3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelFechaEntrega3.setForeground(new java.awt.Color(162, 146, 146));
        jLabelFechaEntrega3.setText("Días Alquiler");

        jLabelClienteAlquiler2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelClienteAlquiler2.setForeground(new java.awt.Color(162, 146, 146));
        jLabelClienteAlquiler2.setText("Cliente");

        jLabelEntregaAlquiler1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelEntregaAlquiler1.setForeground(new java.awt.Color(162, 146, 146));
        jLabelEntregaAlquiler1.setText("XX/XX/XXXX");

        campoPrecioMulta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPrecioMulta1campoMinutosVendidosFocusGained(evt);
            }
        });

        campoPrecioAlquiler.setEditable(false);
        campoPrecioAlquiler.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPrecioAlquilercampoMinutosVendidosFocusGained(evt);
            }
        });
        campoPrecioAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecioAlquilerActionPerformed(evt);
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
                        .addComponent(botonRegistrarAlquilerModem1)
                        .addGap(54, 54, 54)
                        .addComponent(botonAtrasAlquiler1))
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(labeltituloPlanes4))
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelDisponibilidad)
                                .addComponent(jLabelFechaEntrega3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecio1)
                                    .addComponent(jLabelFechaEntrega2)
                                    .addComponent(jLabelMulta1)))
                            .addComponent(jLabelClienteAlquiler2)
                            .addComponent(jLabelModem1))
                        .addGap(66, 66, 66)
                        .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPrecioMulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoConsultaClienteAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxModem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoDisponibildadModem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEntregaAlquiler1)
                                .addComponent(campoPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelAlquilarModemLayout.setVerticalGroup(
            panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labeltituloPlanes4)
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
                        .addComponent(jLabelEntregaAlquiler1)
                        .addGap(18, 18, 18)
                        .addComponent(campoPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(campoPrecioMulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlquilarModemLayout.createSequentialGroup()
                        .addComponent(jLabelClienteAlquiler2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelModem1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDisponibilidad)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFechaEntrega3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFechaEntrega2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrecio1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMulta1)))
                .addGap(18, 18, 18)
                .addGroup(panelAlquilarModemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonRegistrarAlquilerModem1)
                    .addComponent(botonAtrasAlquiler1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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

        labeltituloPlanes5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labeltituloPlanes5.setForeground(new java.awt.Color(162, 146, 146));
        labeltituloPlanes5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPlanes5.setText("Devolución USB-Modem");

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
                        .addComponent(labeltituloPlanes5))
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
                .addComponent(labeltituloPlanes5)
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

        jLayeredPane1.setLayer(panelSeleccionModem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelAlquilarModem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelDevolucionModem, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        botonActualizarTablaPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarTablaPromoActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        llenarTablaClientes(lc.consultarClientes());
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
        LogicaPromocion lp = new LogicaPromocion();
        if(isNumeric(campoConsultaPromociones.getText())){
            Promocion p = lp.consultarPromocion(Long.parseLong(campoConsultaPromociones.getText()));
            List<Promocion> promociones = new ArrayList<>();
            promociones.add(p);
            llenarTablaPromociones(promociones);
        }else{
            llenarTablaPromociones(lp.consultarPromocion(campoConsultaPromociones.getText()));
        }
        campoConsultaPromociones.setText("");
    }//GEN-LAST:event_botonConsultarPromocionesActionPerformed

    /* Metodo para consultar un Plan de minutos de la BD y mostrar el resultado en la tabla de
       Planes de minutos. La consulta se realiza con el codigo del Plan de minutos, todo o una parte del nombre.
       Entrada: Evento del boton
       Salida: Ninguna
    */
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

    private void botonConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarClienteActionPerformed
        LogicaCliente lc = new LogicaCliente();
        String campoCOnsultaCliente = campoConsultaCliente.getText();
        
        if(isNumeric(campoCOnsultaCliente)){
            llenarTablaClientes(lc.consultarClientes("",campoConsultaCliente.getText()));

        }else{
            llenarTablaClientes(lc.consultarClientes(campoConsultaCliente.getText(), ""));
        }
        campoConsultaCliente.setText("");
    }//GEN-LAST:event_botonConsultarClienteActionPerformed

    private void botonActualizarTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaClientesActionPerformed
       LogicaCliente lc = new LogicaCliente();
       llenarTablaClientes(lc.consultarClientes());
    }//GEN-LAST:event_botonActualizarTablaClientesActionPerformed

    private void campoDisponibildadModemcampoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {                                                                        
        // TODO add your handling code here:
    } 
    
    /*
    Metodo para actualizar la tabla de planes de minutos
    Entrada: Evento del boton actualizar
    Salida: Ninguna
    */
    private void botonActualizarTablaPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaPlanActionPerformed
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        List<PlanMinutos> losPlanes = logicaPlanMinutos.consultarPlanMinutos();
        llenarTablaPlanMinutos(losPlanes);
    }//GEN-LAST:event_botonActualizarTablaPlanActionPerformed

    private void campoConsultaClienteAlquilercampoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoConsultaClienteAlquilercampoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConsultaClienteAlquilercampoMinutosVendidosFocusGained

    /*
    Metodo para activar el panel de alquiler de modem
    Entrada: Evento del Boton
    Salida: Ninguna
    */
    private void botonAlquilerModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlquilerModemActionPerformed
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(true);
        panelSeleccionModem.setVisible(false);
    }//GEN-LAST:event_botonAlquilerModemActionPerformed

    private void botonDevolucionModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolucionModemActionPerformed
        panelDevolucionModem.setVisible(true);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(false);
        llenarTablaModemsAlquilados();
    }//GEN-LAST:event_botonDevolucionModemActionPerformed

    /*
    Metodo para llenar el JComboBox de modem para el modulo de alquiler de modems
    Entrasa: Evento del boton
    Salida: Ninguna    
    */
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
        campoPrecioAlquiler.setText(""+usbModem.getPreciodia());
        campoDisponibildadModem.setText(usbModem.getDisponibilidad());
    }//GEN-LAST:event_jComboBoxModemActionPerformed

    private void campoCantidadDiascampoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCantidadDiascampoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadDiascampoMinutosVendidosFocusGained

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
            //campoConsultaClienteAlquiler.setEditable(false);
        }
    }//GEN-LAST:event_campoConsultaClienteAlquilerFocusLost

    private void campoPrecioMulta1campoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {                                                                  
        // TODO add your handling code here:
    } 
    
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
        jLabelEntregaAlquiler1.setText(laFecha);
    }//GEN-LAST:event_campoCantidadDiasFocusLost

    private void campoPrecioAlquilercampoMinutosVendidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPrecioAlquilercampoMinutosVendidosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioAlquilercampoMinutosVendidosFocusGained

    private void campoPrecioAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioAlquilerActionPerformed
                                                  
    private void campoPrecioMulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioMulta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioMulta1ActionPerformed

    private void botonRegistrarAlquilerModem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarAlquilerModem1ActionPerformed
        String textoCantidadDias = campoCantidadDias.getText();
        String textoPrecioMulta = campoPrecioMulta1.getText();
        if(isNumeric(textoCantidadDias) || isNumeric(textoPrecioMulta)){
           int cantidadDias = Integer.parseInt(campoCantidadDias.getText());
        if(campoConsultaClienteAlquiler.getText().isEmpty() || campoCantidadDias.getText().isEmpty() || campoPrecioAlquiler.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Hay campos vacíos");
        }else if(cantidadDias == 0){
            JOptionPane.showMessageDialog(null, "Cantidad días no puede ser cero");
        }else{
            try {
                //int cantidadDias = Integer.parseInt(campoCantidadDias.getText());
                int preciodia = Integer.parseInt(campoPrecioAlquiler.getText());
                int totalPagar = preciodia*cantidadDias;
                cantidadDiasAlquilados = cantidadDias;
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
                jLabelEntregaAlquiler1.setText(laFecha);
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
                        + "Fecha Entrega: "+fechaEntrega.getDate()+"/"+(fechaEntrega.getMonth()+1)+"/"+(fechaEntrega.getYear()+1900)+"\n"
                        + "Precio por día: "+preciodia+"\n"
                        + "Multa: "+multa+"\n"
                        + "Total a pagar: "+totalPagar+"\n"
                        + "¿Son correctos los datos?");

                    if(opcion==0){
                        
                        validarPromocionAlquiler(clienteAlquiler.getCedulacliente());
                        if(!promocionesGanadas.isEmpty()){
                            if(JOptionPane.showConfirmDialog(panelModems, mostrarPromocionesGanadasAlquiler(promocionesGanadas)+""
                                    + "\nDesea Gastar la promoción?")==JOptionPane.YES_OPTION){

                                    int totalBeneficios=0;
                                    for (int i = 0; i < promocionesGanadas.size(); i++) {
                                        totalBeneficios += promocionesGanadas.get(i).getBeneficio();
                                    }

                                if (cantidadDiasAlquilados >= totalBeneficios) {
                                    totalPagar -= preciodia * totalBeneficios;
                                } else {
                                    totalPagar = 0;
                                }
                                if(!promocionesGanadas.isEmpty()){
                                     alquilerModem.setPromocionList(promocionesGanadas);
                                }else{
                                    //No hay promociones para esta venta
                                } 
                            }else{
                                //No gastó la promoción
                            }
                        }else{
                           //No ha ganado promociones
                        }
                        
                        JOptionPane.showMessageDialog(null, "El valor a pagar es: "+totalPagar);
                        LogicaAlquilerModem logicaAlquilerModem = new LogicaAlquilerModem();
                        logicaAlquilerModem.registrarAlquilerModem(alquilerModem);
                        promocionesGanadas.clear();
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
                        campoPrecioAlquiler.setText("");
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
        }else{
            JOptionPane.showMessageDialog(null, "Los campos cantidad días y multa deben ser numéricos");
        }
    }//GEN-LAST:event_botonRegistrarAlquilerModem1ActionPerformed

    /*
    Metodo para regresar al panel principal de alquiler
    Entrada: Evento del Botón
    Salida: Ninguna
    */
    private void botonAtrasAlquiler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAlquiler1ActionPerformed
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(true);
    }//GEN-LAST:event_botonAtrasAlquiler1ActionPerformed

    private void BuscarClienteAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteAlquilerActionPerformed
        String cedula = jTextFieldClienteAlquiler.getText();

        LogicaAlquilerModem lam = new LogicaAlquilerModem();
        LogicaCliente lc = new LogicaCliente();
        Cliente clienteAlquila = lc.consultarCliente(cedula);
        AlquilerModem alquiler = lam.consultaAlquilerModemCliente(clienteAlquila);

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
                Date fechaActual = new Date();
                alquilerDev.setFechadevolucion(fechaActual);
                alquilerDev.setMulta(Integer.parseInt(tablaModemsAlquilados.getValueAt(tablaModemsAlquilados.getSelectedRow(),5).toString()));

                try {
                    lam.modificarAlquilerModem(alquilerDev);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

                UsbModem modemDevolucion = alquilerDev.getCodigomodem();
                if(modemDevolucion.getDisponibilidad().equals("Alquilado")){
                    modemDevolucion.setDisponibilidad("Disponible");
                }else if(modemDevolucion.getDisponibilidad().equals("Alquilado-Reservado")){
                    modemDevolucion.setDisponibilidad("Reservado");
                }

                lum.modificarModem(modemDevolucion);
                llenarTablaModemsAlquilados();
            }
        }
    }//GEN-LAST:event_botonDevolverModemActionPerformed

    /*
    Metodo para regresar al panel principal de alquiler
    Entrada: Evento del Botón
    Salida: Ninguna
    */
    private void botonAtrasAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasAlquilerActionPerformed
        panelDevolucionModem.setVisible(false);
        panelAlquilarModem.setVisible(false);
        panelSeleccionModem.setVisible(true);
    }//GEN-LAST:event_botonAtrasAlquilerActionPerformed

    private void actualizarTablaModemsAlquiladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarTablaModemsAlquiladosActionPerformed
        llenarTablaModemsAlquilados();
    }//GEN-LAST:event_actualizarTablaModemsAlquiladosActionPerformed

    private void jTabbedPaneVistaVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneVistaVendedorMouseClicked
        llenarJComboBoxModemAlquiler();
    }//GEN-LAST:event_jTabbedPaneVistaVendedorMouseClicked

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
                        VentaMinutos venta = new VentaMinutos();   
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
                                
                                if(!promocionesGanadas.isEmpty()){
                                     venta.setPromocionList(promocionesGanadas);
                                }else{
                                    //No hay promociones para esta venta
                                }
                            }else{
                                minutosFacturados=minutosVendidos;
                            }
                        }else{
                           minutosFacturados=minutosVendidos; 
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

    private void botonActualizarTablaPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaPromoActionPerformed
        LogicaPromocion lp = new LogicaPromocion();
        llenarTablaPromociones(lp.consultarPromociones());
        campoConsultaPromociones.setText("");
    }//GEN-LAST:event_botonActualizarTablaPromoActionPerformed
    
    /* Método para llenar la tabla con los registros de la consulta que se haga a la BD.
       Entrada: lista de objetos de tipo planes minutos 
       Salida: Ninguna
    */
    public void llenarTablaPlanMinutos(List<PlanMinutos> listaPlanMinutos){
        DefaultTableModel dtm = new DefaultTableModel();
        tablaPlanes.setModel(dtm);
        Calendar fecha = Calendar.getInstance();
        String laFecha;
        dtm.addColumn("Codigo");
        dtm.addColumn("Proveedor");
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
                boolean minutosAcomulables = listaPlanMinuto.getMinutosacumulables();
                if(minutosAcomulables == true){
                    fila[7] = "Si";
                }else{
                    fila[7] = "No";
                }    
                //fila[7] = String.valueOf(listaPlanMinuto.getMinutosacumulables());
                fila[8] = String.valueOf(listaPlanMinuto.getCantidadminimaminutos());
                boolean estado = listaPlanMinuto.getEstadoplanminutos();
                if(estado == true){
                    fila[9] = "Activo";
                }else{
                    fila[9] = "Inactivo";
                }
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
    
    private void llenarComboPlanesVenta()
    { 
        LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
        List<PlanMinutos> planes = logicaPlanMinutos.consultarPlanMinutos();
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
        jLabelEntregaAlquiler1.setText(laFecha);
    }
     

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
    
    public void alertaDevolucion(){
        Date hoy = new Date();
        String fechaHoy= hoy.getDate()+"/"+(hoy.getMonth()+1)+"/"+(hoy.getYear()+1900);
        
        LogicaAlquilerModem lam = new LogicaAlquilerModem();
        List<AlquilerModem> alquilados = lam.consultarAlquilerModem();
        
        for (int i = 0; i < alquilados.size(); i++) {
            Date fechaF = alquilados.get(i).getFechafinalquiler();
            String fechaFinal= fechaF.getDate()+"/"+(fechaF.getMonth()+1)+"/"+(fechaF.getYear()+1900);
            
            long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
            long diferencia = ( hoy.getTime() - fechaF.getTime())/MILLSECS_PER_DAY;
            if(diferencia>0){
                JOptionPane.showMessageDialog(panelModems, "El cliente "+alquilados.get(i).getCedulacliente().getNombrecliente()
                    +" no ha retornado el modem "+alquilados.get(i).getCodigomodem().getNombremodem()+".\n"+
                    "Puede contactarlo al número "+alquilados.get(i).getCedulacliente().getTelefonocliente());
            }
        }
    }
    
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
        List<Promocion> promocionesActivas = lp.consultarPromocionesActivas("Venta Minutos"); //Lista de promociones activas
        
        
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
    
    public void validarPromocionAlquiler(String cedulaCliente){
        LogicaPromocion lp = new LogicaPromocion();
        LogicaAlquilerModem lam = new LogicaAlquilerModem();
        List<Promocion> promocionesActivas = lp.consultarPromocionesActivas("Alquiler Modem"); //Lista de promociones activas
        
        
        for (int i = 0; i < promocionesActivas.size(); i++) {
            int condicion = promocionesActivas.get(i).getCondicion() - cantidadDiasAlquilados;
            int codigoPromo = Integer.parseInt(promocionesActivas.get(i).getCodigopromocion()+"");
            String fechaInicioPromo = calcularFechaPromo(promocionesActivas.get(i)); //Fecha inicial de la promoción i
            
            //Lista que trae el último alquiler en el que se ganó una promoción
            List<AlquilerModem> alquilerConPromoGanada = lam.consultarAlquilerPromo(cedulaCliente, fechaInicioPromo, codigoPromo);

            
            List<AlquilerModem> alquileresDelCliente = lam.consultarAlquilerCliente(cedulaCliente);
            //Si se encuentra una promoción que ya ha sido ganada, se cuentan los días a partir del último alquiler que tuvo la promoción
           
            if(!alquilerConPromoGanada.isEmpty()){
                promocionesActivas.get(i).setFechainiciopromocion(alquilerConPromoGanada.get(0).getFechainicioalquiler());
                fechaInicioPromo = calcularFechaPromoPost(promocionesActivas.get(i));//Recalculando la fecha a partir de la cual se empiezan a contar los minutos para ganar promoción
//                System.out.println("Ya se ganó esa promoción, nueva fecha = "+ fechaInicioPromo);
                alquileresDelCliente.clear();
            }else{
//                System.out.println("No se ha ganado la promoción anteriormente");
            }
            
            //Se calcúla si las alquiladas de ese cliente cumplen con la condición de la promoción
            if(alquilerGanador(alquileresDelCliente, condicion)){
                if(!promocionesGanadas.contains(promocionesActivas.get(i))){
                    promocionesGanadas.add(promocionesActivas.get(i));
                }else{
//                    System.out.println("La promoción ya está contenida en la lista de promocionesGanadas");
                    //La promoción ya está contenida en la lista de promocionesGanadas
                }
                
            }else{
                List<AlquilerModem> alquilerCliente = lam.consultarAlquilerCliente(cedulaCliente);
                if (alquilerCliente.isEmpty() && cantidadDiasAlquilados >= promocionesActivas.get(i).getCondicion()) {
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
        String s ="PROMOCIONES GANADAS \n\n";
        int totalBeneficios =0;
        for (int i = 0; i < listaPromo.size(); i++) {
            s +="->"+ listaPromo.get(i).getDescripcion()+" ("+listaPromo.get(i).getBeneficio()+")\n";
            totalBeneficios += listaPromo.get(i).getBeneficio();
        }
        s+="\nTotal minutos gratis = " + totalBeneficios+"\n";
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
    
    public boolean alquilerGanador(List<AlquilerModem> listaAlquileres, int condicionPromo){
        boolean b=false;
        int acumulado=0;
        Date fechaInicioALquiler, fechaFinAlquiler;

        for (int i = 0; i < listaAlquileres.size(); i++) {
            fechaInicioALquiler = listaAlquileres.get(i).getFechainicioalquiler();
            fechaFinAlquiler = listaAlquileres.get(i).getFechadevolucion();
            Date diferencia = new Date(fechaFinAlquiler.getTime()-fechaInicioALquiler.getTime());
            acumulado += diferencia.getDay();

            if(acumulado>=condicionPromo){
                b = true;
                i=listaAlquileres.size();
            }else{
                //No cumple con la condición.
            }
        }
        return b;
    }
    
    public String mostrarPromocionesGanadasAlquiler(List<Promocion> listaPromo){
        String s ="PROMOCIONES GANADAS \n\n";
        int totalBeneficios =0;
        for (int i = 0; i < listaPromo.size(); i++) {
            s +="->"+ listaPromo.get(i).getDescripcion()+" ("+listaPromo.get(i).getBeneficio()+")\n";
            totalBeneficios += listaPromo.get(i).getBeneficio();
        }
        s+="\nTotal días gratis = " + totalBeneficios+"\n";
        return s;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarTablaModems;
    private javax.swing.JButton BuscarClienteAlquiler;
    private javax.swing.JButton actualizarTablaModemsAlquilados;
    private javax.swing.JButton botonActualizarTablaClientes;
    private javax.swing.JButton botonActualizarTablaPlan;
    private javax.swing.JButton botonActualizarTablaPromo;
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonAlquilerModem;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonAtrasAlquiler;
    private javax.swing.JButton botonAtrasAlquiler1;
    private javax.swing.JButton botonConsultarCliente;
    private javax.swing.JButton botonConsultarModem;
    private javax.swing.JButton botonConsultarPlanes;
    private javax.swing.JButton botonConsultarPromociones;
    private javax.swing.JButton botonDevolucionModem;
    private javax.swing.JButton botonDevolverModem;
    private javax.swing.JButton botonRegistrarAlquilerModem1;
    private javax.swing.JButton botonRegistrarVenta;
    private javax.swing.JTextField campoCantidadDias;
    private javax.swing.JTextField campoConsultaCliente;
    private javax.swing.JTextField campoConsultaClienteAlquiler;
    private javax.swing.JTextField campoConsultaClienteVenta;
    private javax.swing.JTextField campoConsultaModems;
    private javax.swing.JTextField campoConsultaPlanes;
    private javax.swing.JTextField campoConsultaPromociones;
    private javax.swing.JTextField campoDisponibildadModem;
    private javax.swing.JFormattedTextField campoMinutosVendidos;
    private javax.swing.JTextField campoPrecioAlquiler;
    private javax.swing.JTextField campoPrecioMulta1;
    private javax.swing.JComboBox comboPlanesVenta;
    private javax.swing.JComboBox<String> jComboBoxModem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelBusqueda2;
    private javax.swing.JLabel jLabelBusqueda3;
    private javax.swing.JLabel jLabelBusqueda5;
    private javax.swing.JLabel jLabelBusqueda6;
    private javax.swing.JLabel jLabelBusqueda7;
    private javax.swing.JLabel jLabelClienteAlquiler2;
    private javax.swing.JLabel jLabelDisponibilidad;
    private javax.swing.JLabel jLabelEntregaAlquiler1;
    private javax.swing.JLabel jLabelFechaEntrega2;
    private javax.swing.JLabel jLabelFechaEntrega3;
    private javax.swing.JLabel jLabelModem1;
    private javax.swing.JLabel jLabelMulta1;
    private javax.swing.JLabel jLabelPrecio1;
    private javax.swing.JLabel jLabelSesion;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPaneVistaVendedor;
    private javax.swing.JTextField jTextFieldClienteAlquiler;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JLabel labeltituloCliente2;
    private javax.swing.JLabel labeltituloModems;
    private javax.swing.JLabel labeltituloPlanes;
    private javax.swing.JLabel labeltituloPlanes1;
    private javax.swing.JLabel labeltituloPlanes4;
    private javax.swing.JLabel labeltituloPlanes5;
    private javax.swing.JLabel labeltituloPromociones;
    private javax.swing.JPanel panelAlquilarModem;
    private javax.swing.JPanel panelClientesVendedor;
    private javax.swing.JPanel panelDevolucionModem;
    private javax.swing.JPanel panelModems;
    private javax.swing.JPanel panelMovimientosModem;
    private javax.swing.JPanel panelPlanes;
    private javax.swing.JPanel panelPromociones;
    private javax.swing.JPanel panelRegistrarVenta;
    private javax.swing.JPanel panelSeleccionModem;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaModems;
    private javax.swing.JTable tablaModemsAlquilados;
    private javax.swing.JTable tablaPlanes;
    private javax.swing.JTable tablaPromociones;
    // End of variables declaration//GEN-END:variables

    
}
