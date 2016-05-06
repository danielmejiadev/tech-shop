package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "promocion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promocion.findAll", query = "SELECT p FROM Promocion p"),
    @NamedQuery(name = "Promocion.findByCodigopromocion", query = "SELECT p FROM Promocion p WHERE p.codigopromocion = :codigopromocion"),
    @NamedQuery(name = "Promocion.findByFechainiciopromocion", query = "SELECT p FROM Promocion p WHERE p.fechainiciopromocion = :fechainiciopromocion"),
    @NamedQuery(name = "Promocion.findByFechafinpromocion", query = "SELECT p FROM Promocion p WHERE p.fechafinpromocion = :fechafinpromocion"),
    @NamedQuery(name = "Promocion.findByTipopromocion", query = "SELECT p FROM Promocion p WHERE p.tipopromocion = :tipopromocion"),
    @NamedQuery(name = "Promocion.findByCondicion", query = "SELECT p FROM Promocion p WHERE p.condicion = :condicion"),
    @NamedQuery(name = "Promocion.findByBeneficio", query = "SELECT p FROM Promocion p WHERE p.beneficio = :beneficio"),
    @NamedQuery(name = "Promocion.findByEstadopromocion", query = "SELECT p FROM Promocion p WHERE p.estadopromocion = :estadopromocion")})
public class Promocion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigopromocion")
    private Long codigopromocion;
    
    @Basic(optional = false)
    @Column(name = "fechainiciopromocion")
    @Temporal(TemporalType.DATE)
    private Date fechainiciopromocion;
    
    @Basic(optional = false)
    @Column(name = "fechafinpromocion")
    @Temporal(TemporalType.DATE)
    private Date fechafinpromocion;
    
    @Basic(optional = false)
    @Column(name = "tipopromocion")
    private String tipopromocion;
    
    @Basic(optional = false)
    @Column(name = "condicion")
    private int condicion;
    
    @Basic(optional = false)
    @Column(name = "beneficio")
    private int beneficio;
    
    @Basic(optional = false)
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    
    @Basic(optional = false)
    @Column(name = "estadopromocion")
    private boolean estadopromocion;
    
    @JoinTable(name = "promocionventaminutos", joinColumns = {
        @JoinColumn(name = "codigopromocion", referencedColumnName = "codigopromocion")}, inverseJoinColumns = {
        @JoinColumn(name = "codigoventa", referencedColumnName = "codigoventa")})
    @ManyToMany
    private List<VentaMinutos> ventaMinutosList;
    @ManyToMany(mappedBy = "promocionList")
    private List<AlquilerModem> alquilerModemList;

    public Promocion() {
    }

    public Promocion(Long codigopromocion) {
        this.codigopromocion = codigopromocion;
    }

    public Promocion(Long codigopromocion, Date fechainiciopromocion, Date fechafinpromocion, String tipopromocion, int condicion, int beneficio, String descripcion, boolean estadopromocion) {
        this.codigopromocion = codigopromocion;
        this.fechainiciopromocion = fechainiciopromocion;
        this.fechafinpromocion = fechafinpromocion;
        this.tipopromocion = tipopromocion;
        this.condicion = condicion;
        this.beneficio = beneficio;
        this.descripcion = descripcion;
        this.estadopromocion = estadopromocion;
    }

    public Long getCodigopromocion() {
        return codigopromocion;
    }

    public void setCodigopromocion(Long codigopromocion) {
        this.codigopromocion = codigopromocion;
    }

    public Date getFechainiciopromocion() {
        return fechainiciopromocion;
    }

    public void setFechainiciopromocion(Date fechainiciopromocion) {
        this.fechainiciopromocion = fechainiciopromocion;
    }

    public Date getFechafinpromocion() {
        return fechafinpromocion;
    }

    public void setFechafinpromocion(Date fechafinpromocion) {
        this.fechafinpromocion = fechafinpromocion;
    }

    public String getTipopromocion() {
        return tipopromocion;
    }

    public void setTipopromocion(String tipopromocion) {
        this.tipopromocion = tipopromocion;
    }

    public int getCondicion() {
        return condicion;
    }

    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstadopromocion() {
        return estadopromocion;
    }

    public void setEstadopromocion(boolean estadopromocion) {
        this.estadopromocion = estadopromocion;
    }

    @XmlTransient
    public List<VentaMinutos> getVentaMinutosList() {
        return ventaMinutosList;
    }

    public void setVentaMinutosList(List<VentaMinutos> ventaMinutosList) {
        this.ventaMinutosList = ventaMinutosList;
    }

    @XmlTransient
    public List<AlquilerModem> getAlquilerModemList() {
        return alquilerModemList;
    }

    public void setAlquilerModemList(List<AlquilerModem> alquilerModemList) {
        this.alquilerModemList = alquilerModemList;
    }
}
