package Vista;


public class VistaAdministrador extends javax.swing.JFrame{
      
    public VistaAdministrador()  
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ricardo Jorge Cabinas - Vendedor");
        this.setResizable(false);
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
        botonInactivarModem = new javax.swing.JButton();
        botonModificarModem = new javax.swing.JButton();
        botonAgregarModem = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaModems = new javax.swing.JTable();
        botonReservarModem = new javax.swing.JButton();
        botonDevolverModem = new javax.swing.JButton();
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
        botonInactivarCliente = new javax.swing.JButton();
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

        botonInactivarModem.setText("Inactivar");
        botonInactivarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarModemActionPerformed(evt);
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

        botonReservarModem.setText("Reservar");
        botonReservarModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarModemActionPerformed(evt);
            }
        });

        botonDevolverModem.setText("Devolver");
        botonDevolverModem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolverModemActionPerformed(evt);
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
                        .addComponent(botonInactivarModem)
                        .addGap(18, 18, 18)
                        .addComponent(botonReservarModem)
                        .addGap(18, 18, 18)
                        .addComponent(botonDevolverModem))
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
                    .addComponent(botonInactivarModem)
                    .addComponent(botonReservarModem)
                    .addComponent(botonDevolverModem))
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
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        botonInactivarCliente.setText("Inactivar");
        botonInactivarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonInactivarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        botonAgregarCliente.setText("Agregar");
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });
        panelClientesVendedor.add(botonAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

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

    }//GEN-LAST:event_botonAgregarPromocionActionPerformed

    private void botonInactivarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarPromocionActionPerformed

    }//GEN-LAST:event_botonInactivarPromocionActionPerformed

    private void botonConsultarPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarPromocionesActionPerformed

    }//GEN-LAST:event_botonConsultarPromocionesActionPerformed

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed

    }//GEN-LAST:event_botonAgregarClienteActionPerformed

    private void botonInactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarClienteActionPerformed

    }//GEN-LAST:event_botonInactivarClienteActionPerformed

    private void botonConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarClienteActionPerformed

    }//GEN-LAST:event_botonConsultarClienteActionPerformed

    private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarClienteActionPerformed

    }//GEN-LAST:event_botonModificarClienteActionPerformed

    private void botonConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarUsuarioActionPerformed

    }//GEN-LAST:event_botonConsultarUsuarioActionPerformed

    private void botonInactivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarUsuarioActionPerformed

    }//GEN-LAST:event_botonInactivarUsuarioActionPerformed

    private void botonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarUsuarioActionPerformed

    }//GEN-LAST:event_botonModificarUsuarioActionPerformed

    private void botonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarUsuarioActionPerformed

    }//GEN-LAST:event_botonAgregarUsuarioActionPerformed

    private void botonAgregarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarModemActionPerformed

    }//GEN-LAST:event_botonAgregarModemActionPerformed

    private void botonModificarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarModemActionPerformed

    }//GEN-LAST:event_botonModificarModemActionPerformed

    private void botonInactivarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarModemActionPerformed

    }//GEN-LAST:event_botonInactivarModemActionPerformed

    private void botonConsultarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarModemActionPerformed

    }//GEN-LAST:event_botonConsultarModemActionPerformed

    private void botonAgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPlanActionPerformed

    }//GEN-LAST:event_botonAgregarPlanActionPerformed

    private void botonModificarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPlanActionPerformed

    }//GEN-LAST:event_botonModificarPlanActionPerformed

    private void botonInactivarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarPlanActionPerformed

    }//GEN-LAST:event_botonInactivarPlanActionPerformed

    private void botonConsultarPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarPlanesActionPerformed

    }//GEN-LAST:event_botonConsultarPlanesActionPerformed

    private void botonReservarModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarModemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReservarModemActionPerformed

    private void botonDevolverModemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolverModemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDevolverModemActionPerformed

    private void botonRecargarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargarPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRecargarPlanActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonAgregarModem;
    private javax.swing.JButton botonAgregarPlan;
    private javax.swing.JButton botonAgregarPromocion;
    private javax.swing.JButton botonAgregarUsuario;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonConsultarCliente;
    private javax.swing.JButton botonConsultarModem;
    private javax.swing.JButton botonConsultarPlanes;
    private javax.swing.JButton botonConsultarPromociones;
    private javax.swing.JButton botonConsultarUsuario;
    private javax.swing.JButton botonDevolverModem;
    private javax.swing.JButton botonInactivarCliente;
    private javax.swing.JButton botonInactivarModem;
    private javax.swing.JButton botonInactivarPlan;
    private javax.swing.JButton botonInactivarPromocion;
    private javax.swing.JButton botonInactivarUsuario;
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JButton botonModificarModem;
    private javax.swing.JButton botonModificarPlan;
    private javax.swing.JButton botonModificarUsuario;
    private javax.swing.JButton botonRecargarPlan;
    private javax.swing.JButton botonReservarModem;
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
