package Modelo;

import Persistencia.VentaMinutosJpaController;
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "ventaminutos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VentaMinutos.findAll", query = "SELECT v FROM VentaMinutos v"),
    @NamedQuery(name = "VentaMinutos.findByCodigoventa", query = "SELECT v FROM VentaMinutos v WHERE v.codigoventa = :codigoventa"),
    @NamedQuery(name = "VentaMinutos.findByFechaventa", query = "SELECT v FROM VentaMinutos v WHERE v.fechaventa = :fechaventa"),
    @NamedQuery(name = "VentaMinutos.findByMinutosvendidos", query = "SELECT v FROM VentaMinutos v WHERE v.minutosvendidos = :minutosvendidos"),
    @NamedQuery(name = "VentaMinutos.findByMinutosfacturados", query = "SELECT v FROM VentaMinutos v WHERE v.minutosfacturados = :minutosfacturados"),
    @NamedQuery(name = "VentaMinutos.findByPreciominuto", query = "SELECT v FROM VentaMinutos v WHERE v.preciominuto = :preciominuto")})
public class VentaMinutos implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoventa")
    private Long codigoventa;
    
    @Basic(optional = false)
    @Column(name = "fechaventa")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaventa;
    
    @Basic(optional = false)
    @Column(name = "minutosvendidos")
    private int minutosvendidos;
    
    @Basic(optional = false)
    @Column(name = "minutosfacturados")
    private int minutosfacturados;
    
    @Basic(optional = false)
    @Column(name = "preciominuto")
    private int preciominuto;
    
    @ManyToMany(mappedBy = "ventaMinutosList")
    private List<Promocion> promocionList;
    
    @JoinColumn(name = "cedulacliente", referencedColumnName = "cedulacliente")
    @ManyToOne(optional = false)
    private Cliente cedulacliente;
    
    @JoinColumn(name = "codigoplan", referencedColumnName = "codigoplan")
    @ManyToOne(optional = false)
    private PlanMinutos codigoplan;
    
    @JoinColumn(name = "cedulausuario", referencedColumnName = "cedulausuario")
    @ManyToOne(optional = false)
    private Usuario cedulausuario;

    public VentaMinutos() {
    }

    public VentaMinutos(Long codigoventa) {
        this.codigoventa = codigoventa;
    }

    public VentaMinutos(Long codigoventa, Date fechaventa, int minutosvendidos, int minutosfacturados, int preciominuto) {
        this.codigoventa = codigoventa;
        this.fechaventa = fechaventa;
        this.minutosvendidos = minutosvendidos;
        this.minutosfacturados = minutosfacturados;
        this.preciominuto = preciominuto;
    }

    public Long getCodigoventa() {
        return codigoventa;
    }

    public void setCodigoventa(Long codigoventa) {
        this.codigoventa = codigoventa;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public int getMinutosvendidos() {
        return minutosvendidos;
    }

    public void setMinutosvendidos(int minutosvendidos) {
        this.minutosvendidos = minutosvendidos;
    }

    public int getMinutosfacturados() {
        return minutosfacturados;
    }

    public void setMinutosfacturados(int minutosfacturados) {
        this.minutosfacturados = minutosfacturados;
    }

    public int getPreciominuto() {
        return preciominuto;
    }

    public void setPreciominuto(int preciominuto) {
        this.preciominuto = preciominuto;
    }

    @XmlTransient
    public List<Promocion> getPromocionList() {
        return promocionList;
    }

    public void setPromocionList(List<Promocion> promocionList) {
        this.promocionList = promocionList;
    }

    public Cliente getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(Cliente cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public PlanMinutos getCodigoplan() {
        return codigoplan;
    }

    public void setCodigoplan(PlanMinutos codigoplan) {
        this.codigoplan = codigoplan;
    }

    public Usuario getCedulausuario() {
        return cedulausuario;
    }

    public void setCedulausuario(Usuario cedulausuario) {
        this.cedulausuario = cedulausuario;
    } 
}
