package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "planminutos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanMinutos.findAll", query = "SELECT p FROM PlanMinutos p"),
    @NamedQuery(name = "PlanMinutos.findByCodigoplan", query = "SELECT p FROM PlanMinutos p WHERE p.codigoplan = :codigoplan"),
    @NamedQuery(name = "PlanMinutos.findByNombreplan", query = "SELECT p FROM PlanMinutos p WHERE p.nombreplan LIKE :nombreplan"),
    @NamedQuery(name = "PlanMinutos.findByCantidadminutos", query = "SELECT p FROM PlanMinutos p WHERE p.cantidadminutos = :cantidadminutos"),
    @NamedQuery(name = "PlanMinutos.findByCostominuto", query = "SELECT p FROM PlanMinutos p WHERE p.costominuto = :costominuto"),
    @NamedQuery(name = "PlanMinutos.findByPreciominuto", query = "SELECT p FROM PlanMinutos p WHERE p.preciominuto = :preciominuto"),
    @NamedQuery(name = "PlanMinutos.findByMinutosacumulables", query = "SELECT p FROM PlanMinutos p WHERE p.minutosacumulables = :minutosacumulables"),
    @NamedQuery(name = "PlanMinutos.findByCantidadminimaminutos", query = "SELECT p FROM PlanMinutos p WHERE p.cantidadminimaminutos = :cantidadminimaminutos"),
    @NamedQuery(name = "PlanMinutos.findByEstadoplanminutos", query = "SELECT p FROM PlanMinutos p WHERE p.estadoplanminutos = :estadoplanminutos")})
public class PlanMinutos implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoplan")
    private Long codigoplan;
    
    @Basic(optional = false)
    @Column(name = "nombreplan")
    private String nombreplan;
    
    @Basic(optional = false)
    @Column(name = "cantidadminutos")
    private int cantidadminutos;
    
    @Basic(optional = false)
    @Column(name = "cantidadminutosfijos")
    private int cantidadminutosfijos;
    
    @Basic(optional = false)
    @Column(name = "fechaproximarecarga")
    @Temporal(TemporalType.DATE)
    private Date fechaproximarecarga;
    
    @Basic(optional = false)
    @Column(name = "costominuto")
    private int costominuto;
    
    @Basic(optional = false)
    @Column(name = "preciominuto")
    private int preciominuto;
    
    @Basic(optional = false)
    @Column(name = "minutosacumulables")
    private boolean minutosacumulables;
    
    @Basic(optional = false)
    @Column(name = "cantidadminimaminutos")
    private int cantidadminimaminutos;
    
    @Basic(optional = false)
    @Column(name = "estadoplanminutos")
    private boolean estadoplanminutos;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoplan")
    private List<VentaMinutos> ventaMinutosList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoplan")
    private List<Recarga> recargaList;

    public PlanMinutos() {
    }

    public PlanMinutos(Long codigoplan) {
        this.codigoplan = codigoplan;
    }

    public PlanMinutos(Long codigoplan, String nombreplan, int cantidadminutos, int costominuto, int preciominuto, boolean minutosacumulables, int cantidadminimaminutos, boolean estadoplanminutos) {
        this.codigoplan = codigoplan;
        this.nombreplan = nombreplan;
        this.cantidadminutos = cantidadminutos;
        this.costominuto = costominuto;
        this.preciominuto = preciominuto;
        this.minutosacumulables = minutosacumulables;
        this.cantidadminimaminutos = cantidadminimaminutos;
        this.estadoplanminutos = estadoplanminutos;
    }

    public Long getCodigoplan() {
        return codigoplan;
    }

    public void setCodigoplan(Long codigoplan) {
        this.codigoplan = codigoplan;
    }

    public String getNombreplan() {
        return nombreplan;
    }

    public void setNombreplan(String nombreplan) {
        this.nombreplan = nombreplan;
    }

    public int getCantidadminutos() {
        return cantidadminutos;
    }

    public void setCantidadminutos(int cantidadminutos) {
        this.cantidadminutos = cantidadminutos;
    }

    public int getCostominuto() {
        return costominuto;
    }

    public void setCostominuto(int costominuto) {
        this.costominuto = costominuto;
    }

    public int getPreciominuto() {
        return preciominuto;
    }

    public void setPreciominuto(int preciominuto) {
        this.preciominuto = preciominuto;
    }

    public boolean getMinutosacumulables() {
        return minutosacumulables;
    }

    public void setMinutosacumulables(boolean minutosacumulables) {
        this.minutosacumulables = minutosacumulables;
    }

    public int getCantidadminimaminutos() {
        return cantidadminimaminutos;
    }

    public void setCantidadminimaminutos(int cantidadminimaminutos) {
        this.cantidadminimaminutos = cantidadminimaminutos;
    }

    public boolean getEstadoplanminutos() {
        return estadoplanminutos;
    }

    public void setEstadoplanminutos(boolean estadoplanminutos) {
        this.estadoplanminutos = estadoplanminutos;
    }

    @XmlTransient
    public List<VentaMinutos> getVentaMinutosList() {
        return ventaMinutosList;
    }

    public void setVentaMinutosList(List<VentaMinutos> ventaMinutosList) {
        this.ventaMinutosList = ventaMinutosList;
    }

    @XmlTransient
    public List<Recarga> getRecargaList() {
        return recargaList;
    }

    public void setRecargaList(List<Recarga> recargaList) {
        this.recargaList = recargaList;
    }  

    public int getCantidadminutosfijos() {
        return cantidadminutosfijos;
    }

    public void setCantidadminutosfijos(int cantidadminutosfijos) {
        this.cantidadminutosfijos = cantidadminutosfijos;
    }

    public Date getFechaproximarecarga() {
        return fechaproximarecarga;
    }

    public void setFechaproximarecarga(Date fechaproximarecarga) {
        this.fechaproximarecarga = fechaproximarecarga;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.codigoplan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlanMinutos other = (PlanMinutos) obj;
        if (!Objects.equals(this.codigoplan, other.codigoplan)) {
            return false;
        }
        return true;
    }
    
    
}
