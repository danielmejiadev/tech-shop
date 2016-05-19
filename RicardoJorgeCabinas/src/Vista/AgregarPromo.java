
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
        Metodo Constructor del JDialog AgrearPromo
        Entrada: Objeto VistaAdministrador, Objeto Boolean, Objeto Promocion 
        Salida: --
    */ 
    public AgregarPromo(VistaAdministrador parent, boolean modal, Promocion promocion) {
        super(parent, modal);
        framePadre = parent;
        initComponents();
        promo = promocion;
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Promoción");
        this.setResizable(false);
        llenarCombos(promocion);
    }
    
    /*
        Metodo para diligenciar los JComboBox que contienen las posibles fechas
                a seleccionar y selecciona como dia inicial la fecha actual
                y la fecha final como un día después del día inicial.
        Entrada: -- 
        Salida: --
    */ 
    public void llenarCombos(){
        jLabelAgregarModificar.setText("CREAR PROMOCION");
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
    public void llenarCombos(Promocion promocion){
        jLabelAgregarModificar.setText("MODIFICAR PROMOCION");
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
        
        fechaActual.setTimeInMillis(promocion.getFechainiciopromocion().getTime());
        jComboBoxDiaInicial.setSelectedItem(fechaActual.get(Calendar.DAY_OF_MONTH)+"");
        jComboBoxMesInicial.setSelectedItem((fechaActual.get(Calendar.MONTH)+1)+"");
        jComboBoxAnioInicial.setSelectedItem(fechaActual.get(Calendar.YEAR)+"");
        
        fechaActual.setTimeInMillis(promocion.getFechafinpromocion().getTime());
        jComboBoxDiaFinal.setSelectedItem((fechaActual.get(Calendar.DAY_OF_MONTH)+1)+"");
        jComboBoxMesFinal.setSelectedItem((fechaActual.get(Calendar.MONTH)+1)+"");
        jComboBoxAnioFinal.setSelectedItem(fechaActual.get(Calendar.YEAR)+"");
        jTextFieldCondicion.setText(promocion.getCondicion()+"");
        jTextAreaDescripcion.setText(promocion.getDescripcion());
        jFormattedTextFieldBeneficio.setText(promocion.getBeneficio()+"");
        
        if(promocion.getTipopromocion().equals("Venta Minutos")){
            jRadioButtonVentaMinutos.doClick();
        }else{
            jRadioButtonAlquilerModem.doClick();
        }
        
        if(!promocion.getEstadopromocion()){
            jRadioButtonInactivo.doClick();
        }
        
        jLabelCodigo.setText("Cod: "+promocion.getCodigopromocion());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoPromo = new javax.swing.ButtonGroup();
        buttonGroupEstado = new javax.swing.ButtonGroup();
        jTextFieldCondicion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonGuardarPromocion = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelAgregarModificar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDiaInicial = new javax.swing.JComboBox<>();
        jComboBoxMesInicial = new javax.swing.JComboBox<>();
        jComboBoxAnioInicial = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDiaFinal = new javax.swing.JComboBox<>();
        jComboBoxMesFinal = new javax.swing.JComboBox<>();
        jComboBoxAnioFinal = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jFormattedTextFieldBeneficio = new javax.swing.JFormattedTextField();
        jRadioButtonVentaMinutos = new javax.swing.JRadioButton();
        jRadioButtonAlquilerModem = new javax.swing.JRadioButton();
        jRadioButtonActivo = new javax.swing.JRadioButton();
        jRadioButtonInactivo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha Inicio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Beneficio");

        jButtonGuardarPromocion.setText("Guardar");
        jButtonGuardarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPromocionActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelAgregarModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Condición");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha Fin");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        buttonGroupTipoPromo.add(jRadioButtonVentaMinutos);
        jRadioButtonVentaMinutos.setSelected(true);
        jRadioButtonVentaMinutos.setText("Venta Minutos");

        buttonGroupTipoPromo.add(jRadioButtonAlquilerModem);
        jRadioButtonAlquilerModem.setText("Alquiler Modem");

        buttonGroupEstado.add(jRadioButtonActivo);
        jRadioButtonActivo.setSelected(true);
        jRadioButtonActivo.setText("Activo");

        buttonGroupEstado.add(jRadioButtonInactivo);
        jRadioButtonInactivo.setText("Inactivo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButtonActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCondicion))
                        .addGap(55, 55, 55)
                        .addComponent(jRadioButtonInactivo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldBeneficio)
                                    .addComponent(jComboBoxDiaInicial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDiaFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonGuardarPromocion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBoxMesFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBoxAnioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBoxMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jComboBoxAnioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelAgregarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButtonVentaMinutos)
                        .addGap(17, 17, 17)
                        .addComponent(jRadioButtonAlquilerModem)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelAgregarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonVentaMinutos)
                    .addComponent(jRadioButtonAlquilerModem))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonActivo)
                    .addComponent(jRadioButtonInactivo))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBoxDiaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxMesInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonGuardarPromocion))
                .addGap(24, 24, 24))
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
            int mesInicial = Integer.parseInt(jComboBoxMesInicial.getSelectedItem().toString())-1;
            int anioInicial = Integer.parseInt(jComboBoxAnioInicial.getSelectedItem().toString());
        
            int diaFinal = Integer.parseInt(jComboBoxDiaFinal.getSelectedItem().toString());
            int mesFinal = Integer.parseInt(jComboBoxMesFinal.getSelectedItem().toString())-1;
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
            
            if(lp.validarPromocion(p) && !p.equals(promo) && 
               validarFechas(anioInicial, anioFinal, mesInicial, mesFinal, diaInicial, diaFinal)){
                if(!promo.getDescripcion().equals("-+empty")){
                    promo.setEstadopromocion(false);
                    lp.modificarPromocion(promo);
                }
                
                lp.registrar(p);
                System.out.println("Creando Promoción_ " + p.getDescripcion());
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
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JRadioButton jRadioButtonActivo;
    private javax.swing.JRadioButton jRadioButtonAlquilerModem;
    private javax.swing.JRadioButton jRadioButtonInactivo;
    private javax.swing.JRadioButton jRadioButtonVentaMinutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldCondicion;
    // End of variables declaration//GEN-END:variables
}


