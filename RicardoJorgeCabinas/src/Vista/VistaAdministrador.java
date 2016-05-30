package Vista;

import Logica.LogicaCliente;
import Logica.LogicaPlanMinutos;
import Logica.LogicaPromocion;
import Logica.LogicaUsuario;
import Modelo.Cliente;
import Modelo.PlanMinutos;
import Modelo.Promocion;
import Modelo.Usuario;
import Logica.LogicaUsbModem;
import Modelo.UsbModem;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaAdministrador extends javax.swing.JFrame{
    private LogicaCliente lc = new LogicaCliente();
    private LogicaPromocion lp = new LogicaPromocion();
    public Usuario usuarioActivo;
    LogicaUsbModem lum = new LogicaUsbModem();
    List<UsbModem> modems = lum.consultarModems();
    
    public VistaAdministrador(Usuario usuarioActivo)  
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas - Vendedor");
        this.setResizable(false);
        this.usuarioActivo=usuarioActivo;
        llenarTablaClientes(lc.consultarClientes());
        lp.consultarPromociones();

        llenarTablaModems(modems);

    }
    public VistaAdministrador(){
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        jTabbedPaneVistaVendedor = new javax.swing.JTabbedPane();
        panelRegistrarVenta = new javax.swing.JPanel();
        panelAlquilarModem = new javax.swing.JPanel();
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
        panelReportes = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 560));
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

        panelRegistrarVenta.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPaneVistaVendedor.addTab("Venta Minutos", panelRegistrarVenta);

        panelAlquilarModem.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/ventas.png")), panelAlquilarModem); // NOI18N

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
                        .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabelBusqueda1)
                        .addGap(18, 18, 18)
                        .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonConsultarPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelPlanesLayout.setVerticalGroup(
            panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanesLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoConsultaPlanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBusqueda1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonConsultarPlanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(labeltituloPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(52, Short.MAX_VALUE))
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

        panelReportes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jTabbedPaneVistaVendedor.addTab("", new javax.swing.ImageIcon(getClass().getResource("/imgs/reporte.png")), panelReportes); // NOI18N

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
        botonInactivarUsuario.setText("Inactivar");
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
                .addContainerGap(53, Short.MAX_VALUE))
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
            .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        llenarTablaClientes(lc.consultarClientes(campoConsultaCliente.getText()));
        botonModificarCliente.setEnabled(false);
    }//GEN-LAST:event_botonConsultarClienteActionPerformed

     /*
        Metodo para abrir la ventana de modificación de cliente seleccionado
        Entrada: evento del boton
        Salida: --
    */
    private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarClienteActionPerformed
        String cedulaCliente = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 4).toString();
        ventanaModificarCliente(lc.consultarCliente(cedulaCliente));
        llenarTablaClientes(lc.consultarClientes());
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
                    List<Usuario> usuarios = new ArrayList<>();
                    usuarios.add(usuario);
                    llenarTablaUsuarios(usuarios);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error, no se puede inactivar el usuario activo");
                }
                
            } catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(null,"Error, no se pudo modificar el usuario");
            }
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
            llenarTablaUsuarios(null);
        }
    }//GEN-LAST:event_botonModificarUsuarioActionPerformed

    private void botonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarUsuarioActionPerformed
         RegistrarUsuario registro = new RegistrarUsuario(this,false);
        registro.setVisible(true);
        llenarTablaUsuarios(null);
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
                if(um.getEstadousbmodem()){
                um.setEstadousbmodem(false);
                lum.modificarModem(um);
                }else{
                    um.setEstadousbmodem(true);
                    lum.modificarModem(um);
                }
                List<UsbModem> modems = lum.consultarModems();
                llenarTablaModems(modems); 
                
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

    private void botonAgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPlanActionPerformed

        AgregarPlan agregarPlan = new AgregarPlan();
        agregarPlan.setVisible(true);
        llenarTablaPlanMinutos(null);
    }//GEN-LAST:event_botonAgregarPlanActionPerformed

    private void botonModificarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPlanActionPerformed

       int filaSeleccionada = tablaPlanes.getSelectedRow();
        if(filaSeleccionada != -1)
        {
            String codigoPlan = tablaPlanes.getValueAt(filaSeleccionada, 0).toString();
            LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
            PlanMinutos planMinutos =  logicaPlanMinutos.consultarPlanMinutosID(Long.parseLong(codigoPlan));
            ModificarPlan modificarPlan = new ModificarPlan(planMinutos);
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
    }//GEN-LAST:event_botonInactivarPlanActionPerformed

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

    /* Metodo para actualizar la tabla de modems consultando todos los registros de la BD
       Entrada: evento del boton
       Salida: ---
    */
    private void botonActualizarTablaModemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaModemsActionPerformed
       List<UsbModem> modems = lum.consultarModems();
       llenarTablaModems(modems);
    }//GEN-LAST:event_botonActualizarTablaModemsActionPerformed

    private void botonActualizarTablaPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTablaPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarTablaPlanActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        botonModificarCliente.setEnabled(true);
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
        
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCambiarEstadoModem;
    private javax.swing.JButton botonConsultarCliente;
    private javax.swing.JButton botonConsultarModem;
    private javax.swing.JButton botonConsultarPlanes;
    private javax.swing.JButton botonConsultarPromociones;
    private javax.swing.JButton botonConsultarUsuario;
    private javax.swing.JButton botonEstadoCliente;
    private javax.swing.JButton botonInactivarPlan;
    private javax.swing.JButton botonInactivarPromocion;
    private javax.swing.JButton botonInactivarUsuario;
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JButton botonModificarModem;
    private javax.swing.JButton botonModificarPlan;
    private javax.swing.JButton botonModificarUsuario;
    private javax.swing.JTextField campoConsultaCliente;
    private javax.swing.JTextField campoConsultaModems;
    private javax.swing.JTextField campoConsultaPlanes;
    private javax.swing.JTextField campoConsultaPromociones;
    private javax.swing.JTextField campoConsultaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelBusqueda2;
    private javax.swing.JLabel jLabelBusqueda3;
    private javax.swing.JLabel jLabelBusqueda4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPaneVistaVendedor;
    private javax.swing.JLabel labeltituloCliente1;
    private javax.swing.JLabel labeltituloModems;
    private javax.swing.JLabel labeltituloPlanes;
    private javax.swing.JLabel labeltituloPromociones;
    private javax.swing.JLabel labeltituloUsuario;
    private javax.swing.JPanel panelAlquilarModem;
    private javax.swing.JPanel panelClientesVendedor;
    private javax.swing.JPanel panelModems;
    private javax.swing.JPanel panelPlanes;
    private javax.swing.JPanel panelPromociones;
    private javax.swing.JPanel panelRegistrarVenta;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelUsurios;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaModems;
    private javax.swing.JTable tablaPlanes;
    private javax.swing.JTable tablaPromociones;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    
}
