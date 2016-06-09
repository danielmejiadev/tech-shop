/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reportes;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class Reporte {
    public static void abrirReporte(String ruta, Map parametros,String titulo){
        if(Persistencia.conectar()){
            try {
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                JasperPrint jp = JasperFillManager.fillReport(jr,parametros,Persistencia.con);
                JasperViewer jv = new JasperViewer(jp);
                jv.setAlwaysOnTop(true);
               // jv.setDefaultCloseOperation(operation);
                jv.setVisible(true);
                jv.setTitle(titulo);
            } catch (JRException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void abrirReporteListado(String ruta, JRBeanCollectionDataSource lista,String titulo){
        if(Persistencia.conectar()){
            try {
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                JasperPrint jp = JasperFillManager.fillReport(jr,null,lista);
                JasperViewer jv = new JasperViewer(jp);
                jv.setAlwaysOnTop(true);
               // jv.setDefaultCloseOperation(operation);
                jv.setVisible(true);
                jv.setTitle(titulo);
            } catch (JRException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void exportarReporte(String ruta, Map parametros, String nuevoNombre){
        if(Persistencia.conectar()){
            try {
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                JasperPrint jp = JasperFillManager.fillReport(jr,parametros,Persistencia.con);
                JRExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT,jp); 
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE,new java.io.File(nuevoNombre+".pdf"));
                exporter.exportReport();
            } catch (JRException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
