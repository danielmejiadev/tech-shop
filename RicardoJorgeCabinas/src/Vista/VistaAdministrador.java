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
        jTabbedPaneVistaVendedor = new javax.swing.JTabbedPane();
        panelRegistrarVenta = new javax.swing.JPanel();
        panelAlquilarModem = new javax.swing.JPanel();
        panelPlanes = new javax.swing.JPanel();
        labeltituloPlanes = new javax.swing.JLabel();
        campoConsultaPlanes = new javax.swing.JTextField();
        botonConsultarPlanes = new javax.swing.JButton();
        botonInactivarPlan = new javax.swing.JButton();
        botonModificarPlan = new javax.swing.JButton();
        botonAgregarPlan = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPlanes = new javax.swing.JTable();
        botonRecargarPlan = new javax.swing.JButton();
        panelModems = new javax.swing.JPanel();
        labeltituloModems = new javax.swing.JLabel();
        campoConsultaModems = new javax.swing.JTextField();
        botonConsultarModem = new javax.swing.JButton();
        botonCambiarEstadoModem = new javax.swing.JButton();
        botonModificarModem = new javax.swing.JButton();
        botonAgregarModem = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaModems = new javax.swing.JTable();
        ActualizarTablaModems = new javax.swing.JButton();
        panelUsurios = new javax.swing.JPanel();
        botonAgregarUsuario = new javax.swing.JButton();
        botonModificarUsuario = new javax.swing.JButton();
        botonInactivarUsuario = new javax.swing.JButton();
        botonConsultarUsuario = new javax.swing.JButton();
        campoConsultaUsuario = new javax.swing.JTextField();
        labeltituloUsuario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        panelClientesVendedor = new javax.swing.JPanel();
        botonModificarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        campoConsultaCliente = new javax.swing.JTextField();
        labeltituloCliente = new javax.swing.JLabel();
        botonConsultarCliente = new javax.swing.JButton();
        botonAgregarCliente = new javax.swing.JButton();
        panelPromociones = new javax.swing.JPanel();
        labeltituloPromociones = new javax.swing.JLabel();
        campoConsultaPromociones = new javax.swing.JTextField();
        botonConsultarPromociones = new javax.swing.JButton();
        botonInactivarPromocion = new javax.swing.JButton();
        botonAgregarPromocion = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaPromociones = new javax.swing.JTable();
        panelReportes = new javax.swing.JPanel();
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

        botonInactivarPlan.setText("Inactivar");
        botonInactivarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarPlanActionPerformed(evt);
            }
        });

        botonModificarPlan.setText("Modificar");
        botonModificarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPlanActionPerformed(evt);
            }
        });

        botonAgregarPlan.setText("Agregar");
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

        botonRecargarPlan.setText("Recargar");
        botonRecargarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargarPlanActionPerformed(evt);
            }
        });

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
                        .addComponent(botonConsultarPlanes))
                    .addGroup(panelPlanesLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(botonAgregarPlan)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarPlan)
                        .addGap(18, 18, 18)
                        .addComponent(botonInactivarPlan)
                        .addGap(18, 18, 18)
                        .addComponent(botonRecargarPlan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(12, 12, 12)
                .addGroup(panelPlanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarPlan)
                    .addComponent(botonModificarPlan)
                    .addComponent(botonInactivarPlan)
                    .addComponent(botonRecargarPlan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPaneVistaVendedor.addTab("Planes", panelPlanes);

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

        botonCambiarEstadoModem.setText("Cambiar Estado");
        botonCambiarEstadoModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarEstadoModemActionPerformed(evt);
            }
        });

        botonModificarModem.setText("Modificar");
        botonModificarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarModemActionPerformed(evt);
            }
        });

        botonAgregarModem.setText("Agregar");
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
                        .addGap(268, 268, 268)
                        .addComponent(labeltituloModems, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(campoConsultaModems, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(botonConsultarModem))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(botonAgregarModem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificarModem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCambiarEstadoModem)
                        .addGap(113, 113, 113)
                        .addComponent(ActualizarTablaModems))
                    .addGroup(panelModemsLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
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
                .addGroup(panelModemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarModem)
                    .addComponent(botonAgregarModem)
                    .addComponent(botonCambiarEstadoModem)
                    .addComponent(ActualizarTablaModems))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneVistaVendedor.addTab("Modems", panelModems);

        botonAgregarUsuario.setText("Agregar");
        botonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarUsuarioActionPerformed(evt);
            }
        });

        botonModificarUsuario.setText("Modificar");
        botonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarUsuarioActionPerformed(evt);
            }
        });

        botonInactivarUsuario.setText("Inactivar");
        botonInactivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarUsuarioActionPerformed(evt);
            }
        });

        botonConsultarUsuario.setText("Consultar");
        botonConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarUsuarioActionPerformed(evt);
            }
        });

        labeltituloUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltituloUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labeltituloUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloUsuario.setText("USUARIOS");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout panelUsuriosLayout = new javax.swing.GroupLayout(panelUsurios);
        panelUsurios.setLayout(panelUsuriosLayout);
        panelUsuriosLayout.setHorizontalGroup(
            panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuriosLayout.createSequentialGroup()
                .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuriosLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(labeltituloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUsuriosLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(campoConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(botonConsultarUsuario))
                    .addGroup(panelUsuriosLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(botonAgregarUsuario)
                        .addGap(11, 11, 11)
                        .addComponent(botonModificarUsuario)
                        .addGap(13, 13, 13)
                        .addComponent(botonInactivarUsuario))
                    .addGroup(panelUsuriosLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        panelUsuriosLayout.setVerticalGroup(
            panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuriosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labeltituloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultarUsuario))
                .addGap(12, 12, 12)
                .addGroup(panelUsuriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarUsuario)
                    .addComponent(botonModificarUsuario)
                    .addComponent(botonInactivarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneVistaVendedor.addTab("Usuarios", panelUsurios);

        panelClientesVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonModificarCliente.setText("Modificar");
        botonModificarCliente.setEnabled(false);
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

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

        labeltituloCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltituloCliente.setForeground(new java.awt.Color(255, 255, 255));
        labeltituloCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloCliente.setText("CLIENTES");
        panelClientesVendedor.add(labeltituloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 150, 40));

        botonConsultarCliente.setText("Consultar");
        botonConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        botonAgregarCliente.setText("Agregar");
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jTabbedPaneVistaVendedor.addTab(" Clientes", panelClientesVendedor);

        labeltituloPromociones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labeltituloPromociones.setForeground(new java.awt.Color(255, 255, 255));
        labeltituloPromociones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltituloPromociones.setText("PROMOCIONES");

        botonConsultarPromociones.setText("Consultar");
        botonConsultarPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarPromocionesActionPerformed(evt);
            }
        });

        botonInactivarPromocion.setText("Inactivar");
        botonInactivarPromocion.setEnabled(false);
        botonInactivarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarPromocionActionPerformed(evt);
            }
        });

        botonAgregarPromocion.setText("Agregar");
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

        javax.swing.GroupLayout panelPromocionesLayout = new javax.swing.GroupLayout(panelPromociones);
        panelPromociones.setLayout(panelPromocionesLayout);
        panelPromocionesLayout.setHorizontalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelPromocionesLayout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(botonAgregarPromocion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonInactivarPromocion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPromocionesLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(botonConsultarPromociones))
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPromocionesLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        panelPromocionesLayout.setVerticalGroup(
            panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPromocionesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labeltituloPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoConsultaPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultarPromociones))
                .addGap(12, 12, 12)
                .addGroup(panelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonInactivarPromocion)
                    .addComponent(botonAgregarPromocion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPaneVistaVendedor.addTab("Promociones", panelPromociones);

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jTabbedPaneVistaVendedor.addTab("Reportes", panelReportes);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAtras)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneVistaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private void ActualizarTablaModemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaModemsActionPerformed
       List<UsbModem> modems = lum.consultarModems();
       llenarTablaModems(modems);
    }//GEN-LAST:event_ActualizarTablaModemsActionPerformed

    private void botonRecargarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargarPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRecargarPlanActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        botonModificarCliente.setEnabled(true);
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void tablaPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPromocionesMouseClicked
        botonInactivarPromocion.setEnabled(true);
    }//GEN-LAST:event_tablaPromocionesMouseClicked
 
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
    private javax.swing.JButton ActualizarTablaModems;
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
    private javax.swing.JButton botonInactivarPlan;
    private javax.swing.JButton botonInactivarPromocion;
    private javax.swing.JButton botonInactivarUsuario;
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JButton botonModificarModem;
    private javax.swing.JButton botonModificarPlan;
    private javax.swing.JButton botonModificarUsuario;
    private javax.swing.JButton botonRecargarPlan;
    private javax.swing.JTextField campoConsultaCliente;
    private javax.swing.JTextField campoConsultaModems;
    private javax.swing.JTextField campoConsultaPlanes;
    private javax.swing.JTextField campoConsultaPromociones;
    private javax.swing.JTextField campoConsultaUsuario;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPaneVistaVendedor;
    private javax.swing.JLabel labeltituloCliente;
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
