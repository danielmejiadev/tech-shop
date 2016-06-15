
package Vista;

import Logica.LogicaPromocion;
import Modelo.Promocion;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;



public class AgregarPromo extends javax.swing.JDialog {
    private Promocion promo=new Promocion();
    private VistaAdministrador framePadre;
    
    /*
        Metodo Constructor del JDialog AgrearPromo
        Entrada: Objeto VistaAdministrador, Objeto Boolean 
        Salida: --
    */ 
    public AgregarPromo(VistaAdministrador parent, boolean modal) {
        super(parent, modal);
        framePadre = parent;
        initComponents();
        promo.setDescripcion("-+empty");
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Promoción");
        this.setResizable(false);
        llenarCombos();
    }
    
    
    /*
        Metodo para diligenciar los JComboBox que contienen las posibles fechas
                a seleccionar y selecciona como dia inicial la fecha actual
                y la fecha final como un día después del día inicial.
        Entrada: -- 
        Salida: --
    */ 
    public void llenarCombos(){
        Calendar fechaActual = Calendar.getInstance();
        
        for (int i = fechaActual.get(Calendar.YEAR); i < fechaActual.get(Calendar.YEAR)+49 ; i++) {
            jComboBoxAnioInicial.addItem(i+"");
            jComboBoxAnioFinal.addItem(i+"");
            if(i <= fechaActual.get(Calendar.YEAR)+30){
                jComboBoxDiaInicial.addItem((i-2015)+"");
                jComboBoxDiaFinal.addItem((i-2015)+"");
            }
            if(i<=fechaActual.get(Calendar.YEAR)+11){
                jComboBoxMesInicial.addItem((i-2015)+"");
                jComboBoxMesFinal.addItem((i-2015)+"");
            }
        }
        
        jComboBoxDiaInicial.setSelectedItem(fechaActual.get(Calendar.DAY_OF_MONTH)+"");
        jComboBoxMesInicial.setSelectedItem((fechaActual.get(Calendar.MONTH)+1)+"");
        jComboBoxAnioInicial.setSelectedItem(fechaActual.get(Calendar.YEAR)+"");
        jComboBoxDiaFinal.setSelectedItem((fechaActual.get(Calendar.DAY_OF_MONTH)+1)+"");
        jComboBoxMesFinal.setSelectedItem((fechaActual.get(Calendar.MONTH)+1)+"");
        jComboBoxAnioFinal.setSelectedItem(fechaActual.get(Calendar.YEAR)+"");
    }
    
    /*
        Metodo para diligenciar los JComboBox que contienen las posibles fechas
                a seleccionar y selecciona como dia inicial la fecha actual
                y la fecha final como un día después del día inicial.
        Entrada: Objeto Promocion 
        Salida: --
    */ 
//    public void llenarCombos(Promocion promocion){
//        jLabelAgregarModificar.setText("MODIFICAR PROMOCION");
//        Calendar fechaActual = Calendar.getInstance();
//        
//        for (int i = fechaActual.get(Calendar.YEAR); i < fechaActual.get(Calendar.YEAR)+49 ; i++) {
//            jComboBoxAnioInicial.addItem(i+"");
//            jComboBoxAnioFinal.addItem(i+"");
//            if(i <= fechaActual.get(Calendar.YEAR)+30){
//                jComboBoxDiaInicial.addItem((i-2015)+"");
//                jComboBoxDiaFinal.addItem((i-2015)+"");
//            }
//            if(i<=fechaActual.get(Calendar.YEAR)+11){
//                jComboBoxMesInicial.addItem((i-2015)+"");
//                jComboBoxMesFinal.addItem((i-2015)+"");
//            }
//        }
//        
//        fechaActual.setTimeInMillis(promocion.getFechainiciopromocion().getTime());
//        jComboBoxDiaInicial.setSelectedItem(fechaActual.get(Calendar.DAY_OF_MONTH)+"");
//        jComboBoxMesInicial.setSelectedItem((fechaActual.get(Calendar.MONTH)+1)+"");
//        jComboBoxAnioInicial.setSelectedItem(fechaActual.get(Calendar.YEAR)+"");
//        
//        fechaActual.setTimeInMillis(promocion.getFechafinpromocion().getTime());
//        jComboBoxDiaFinal.setSelectedItem((fechaActual.get(Calendar.DAY_OF_MONTH)+1)+"");
//        jComboBoxMesFinal.setSelectedItem((fechaActual.get(Calendar.MONTH)+1)+"");
//        jComboBoxAnioFinal.setSelectedItem(fechaActual.get(Calendar.YEAR)+"");
//        jTextFieldCondicion.setText(promocion.getCondicion()+"");
//        jTextAreaDescripcion.setText(promocion.getDescripcion());
//        jFormattedTextFieldBeneficio.setText(promocion.getBeneficio()+"");
//        
//        if(promocion.getTipopromocion().equals("Venta Minutos")){
//            jRadioButtonVentaMinutos.doClick();
//        }else{
//            jRadioButtonAlquilerModem.doClick();
//        }
//        
//        if(!promocion.getEstadopromocion()){
//            jRadioButtonInactivo.doClick();
//        }
//        
//        jLabelCodigo.setText("Cod: "+promocion.getCodigopromocion());
//    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoPromo = new javax.swing.ButtonGroup();
        buttonGroupEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelAgregarModificar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonVentaMinutos = new javax.swing.JRadioButton();
        jRadioButtonAlquilerModem = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonActivo = new javax.swing.JRadioButton();
        jRadioButtonInactivo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCondicion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxDiaInicial = new javax.swing.JComboBox<>();
        jComboBoxMesInicial = new javax.swing.JComboBox<>();
        jComboBoxAnioInicial = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDiaFinal = new javax.swing.JComboBox<>();
        jComboBoxMesFinal = new javax.swing.JComboBox<>();
        jComboBoxAnioFinal = new javax.swing.JComboBox<>();
        jButtonGuardarPromocion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldBeneficio = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 530));

        jLabelAgregarModificar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelAgregarModificar.setForeground(new java.awt.Color(162, 146, 146));
        jLabelAgregarModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarModificar.setText("Registrar Promoción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 146, 146));
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 146, 146));
        jLabel3.setText("Tipo");

        buttonGroupTipoPromo.add(jRadioButtonVentaMinutos);
        jRadioButtonVentaMinutos.setSelected(true);
        jRadioButtonVentaMinutos.setText("Venta Minutos");

        buttonGroupTipoPromo.add(jRadioButtonAlquilerModem);
        jRadioButtonAlquilerModem.setText("Alquiler Modem");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 146, 146));
        jLabel1.setText("Estado");

        buttonGroupEstado.add(jRadioButtonActivo);
        jRadioButtonActivo.setSelected(true);
        jRadioButtonActivo.setText("Activo");

        buttonGroupEstado.add(jRadioButtonInactivo);
        jRadioButtonInactivo.setText("Inactivo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(162, 146, 146));
        jLabel7.setText("Condición");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 146, 146));
        jLabel4.setText("Fecha Inicio");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(162, 146, 146));
        jLabel9.setText("Fecha Fin");

        jButtonGuardarPromocion.setBackground(new java.awt.Color(162, 146, 146));
        jButtonGuardarPromocion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardarPromocion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardarPromocion.setText("Guardar");
        jButtonGuardarPromocion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGuardarPromocion.setContentAreaFilled(false);
        jButtonGuardarPromocion.setOpaque(true);
        jButtonGuardarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPromocionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(162, 146, 146));
        jLabel5.setText("Beneficio");

        jButton2.setBackground(new java.awt.Color(162, 146, 146));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAgregarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonActivo)
                                    .addComponent(jTextFieldCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxDiaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxAnioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jFormattedTextFieldBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxAnioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 68, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonVentaMinutos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButtonAlquilerModem))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonInactivo)
                                .addGap(32, 32, 32)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButtonGuardarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelAgregarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAlquilerModem)
                    .addComponent(jRadioButtonVentaMinutos)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonActivo)
                    .addComponent(jRadioButtonInactivo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDiaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Metodo para guardar los cambios de una promocion que se desea ingresar
        Entrada: Evento del botón
        Salida: --
    */ 
    private void jButtonGuardarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPromocionActionPerformed
        
        try {
            LogicaPromocion lp = new LogicaPromocion();
            Promocion p = new Promocion();
            p.setDescripcion(jTextAreaDescripcion.getText());
            p.setBeneficio(Integer.parseInt(jFormattedTextFieldBeneficio.getText()));
            p.setCondicion(Integer.parseInt(jTextFieldCondicion.getText()));
        
            //Creando fecha Inicial / Fecha Final---------------------
            int diaInicial = Integer.parseInt(jComboBoxDiaInicial.getSelectedItem().toString());
            int mesInicial = Integer.parseInt(jComboBoxMesInicial.getSelectedItem().toString());
            int anioInicial = Integer.parseInt(jComboBoxAnioInicial.getSelectedItem().toString());
        
            int diaFinal = Integer.parseInt(jComboBoxDiaFinal.getSelectedItem().toString());
            int mesFinal = Integer.parseInt(jComboBoxMesFinal.getSelectedItem().toString());
            int anioFinal = Integer.parseInt(jComboBoxAnioFinal.getSelectedItem().toString());
        
            Calendar calendario = Calendar.getInstance();
            calendario.set(anioInicial, mesInicial-1, diaInicial);
            Date fechaInicial = new Date(calendario.getTimeInMillis());
            p.setFechainiciopromocion(fechaInicial);
        
            calendario.set(anioFinal, mesFinal-1, diaFinal);
            Date fechaFinal = new Date(calendario.getTimeInMillis());
            p.setFechafinpromocion(fechaFinal);
       //---------------------------------------------------------------
       
             p.setEstadopromocion(jRadioButtonActivo.isSelected());
       
           if(jRadioButtonVentaMinutos.isSelected()){
               p.setTipopromocion("Venta Minutos");
           }else{
               p.setTipopromocion("Alquiler Modem");
           }
           
           if(lp.validarPromocion(p) && validarFechas(anioInicial, anioFinal, mesInicial, mesFinal, diaInicial, diaFinal)){
               lp.registrar(p);
               JOptionPane.showMessageDialog(rootPane, "Promoción creada con éxito:\n" + p.getDescripcion());
               this.setVisible(false);
           }else{
               JOptionPane.showMessageDialog(rootPane, "Por favor diligencie bien los campos");
           }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Error al Diligenciar los campos");
           // Logger.getLogger(AgregarPromocion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGuardarPromocionActionPerformed

    /*
        Metodo para validar si una fecha es menor que otra
        Entrada: Fecha 1: Int(Año, Mes, Dia)
                 Fecha 2: Int(Año, Mes, Dia)
        Salida: True si Fecha 1 < Fecha 2
                False si Fecha 1 > Fecha 2
    */ 
    public boolean validarFechas(int yInicio,int yFin, int mInicio, int mFin, int dInicio, int dFin){
        boolean b=false;
        if(yInicio < yFin){
            b= true;
        }else{
            if(yInicio == yFin && mFin > mInicio){
                b=true;
            }else{
                if(yInicio == yFin && mFin == mInicio && dFin > dInicio){
                    b=true;
                }
            }
        }
        if(!b){
            System.out.println("La promoción termina antes de empezar"); 
        }
        
        return b;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.ButtonGroup buttonGroupTipoPromo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGuardarPromocion;
    private javax.swing.JComboBox<String> jComboBoxAnioFinal;
    private javax.swing.JComboBox<String> jComboBoxAnioInicial;
    private javax.swing.JComboBox<String> jComboBoxDiaFinal;
    private javax.swing.JComboBox<String> jComboBoxDiaInicial;
    private javax.swing.JComboBox<String> jComboBoxMesFinal;
    private javax.swing.JComboBox<String> jComboBoxMesInicial;
    private javax.swing.JFormattedTextField jFormattedTextFieldBeneficio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAgregarModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonActivo;
    private javax.swing.JRadioButton jRadioButtonAlquilerModem;
    private javax.swing.JRadioButton jRadioButtonInactivo;
    private javax.swing.JRadioButton jRadioButtonVentaMinutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldCondicion;
    // End of variables declaration//GEN-END:variables
}


