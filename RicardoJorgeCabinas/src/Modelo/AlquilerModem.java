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
@Table(name = "alquilermodem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlquilerModem.findAll", query = "SELECT a FROM AlquilerModem a"),
    @NamedQuery(name = "AlquilerModem.findByCodigoalquiler", query = "SELECT a FROM AlquilerModem a WHERE a.codigoalquiler = :codigoalquiler"),
    @NamedQuery(name = "AlquilerModem.findByFechainicioalquiler", query = "SELECT a FROM AlquilerModem a WHERE a.fechainicioalquiler = :fechainicioalquiler"),
    @NamedQuery(name = "AlquilerModem.findByFechafinalquiler", query = "SELECT a FROM AlquilerModem a WHERE a.fechafinalquiler = :fechafinalquiler"),
    @NamedQuery(name = "AlquilerModem.findByFechadevolucion", query = "SELECT a FROM AlquilerModem a WHERE a.fechadevolucion = :fechadevolucion"),
    @NamedQuery(name = "AlquilerModem.findByPreciodia", query = "SELECT a FROM AlquilerModem a WHERE a.preciodia = :preciodia"),
    @NamedQuery(name = "AlquilerModem.findByMulta", query = "SELECT a FROM AlquilerModem a WHERE a.multa = :multa")})
public class AlquilerModem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoalquiler")
    private Long codigoalquiler;
    
    @Basic(optional = false)
    @Column(name = "fechainicioalquiler")
    @Temporal(TemporalType.DATE)
    private Date fechainicioalquiler;
    
    @Basic(optional = false)
    @Column(name = "fechafinalquiler")
    @Temporal(TemporalType.DATE)
    private Date fechafinalquiler;
    
    @Basic(optional = false)
    @Column(name = "fechadevolucion")
    @Temporal(TemporalType.DATE)
    private Date fechadevolucion;
    
    @Basic(optional = false)
    @Column(name = "preciodia")
    private int preciodia;
   
    @Basic(optional = false)
    @Column(name = "multa")
    private int multa;
    
    @JoinTable(name = "promocionalquilermodem", joinColumns = {
        @JoinColumn(name = "codigoalquiler", referencedColumnName = "codigoalquiler")}, inverseJoinColumns = {
        @JoinColumn(name = "codigopromocion", referencedColumnName = "codigopromocion")})
    @ManyToMany
    private List<Promocion> promocionList;
    @JoinColumn(name = "cedulacliente", referencedColumnName = "cedulacliente")
    @ManyToOne(optional = false)
    private Cliente cedulacliente;
    @JoinColumn(name = "codigomodem", referencedColumnName = "codigomodem")
    @ManyToOne(optional = false)
    private UsbModem codigomodem;
    @JoinColumn(name = "cedulausuario", referencedColumnName = "cedulausuario")
    @ManyToOne(optional = false)
    private Usuario cedulausuario;

    public AlquilerModem() {
    }

    public AlquilerModem(Long codigoalquiler) {
        this.codigoalquiler = codigoalquiler;
    }

    public AlquilerModem(Long codigoalquiler, Date fechainicioalquiler, Date fechafinalquiler, Date fechadevolucion, int preciodia, int multa) {
        this.codigoalquiler = codigoalquiler;
        this.fechainicioalquiler = fechainicioalquiler;
        this.fechafinalquiler = fechafinalquiler;
        this.fechadevolucion = fechadevolucion;
        this.preciodia = preciodia;
        this.multa = multa;
    }

    public Long getCodigoalquiler() {
        return codigoalquiler;
    }

    public void setCodigoalquiler(Long codigoalquiler) {
        this.codigoalquiler = codigoalquiler;
    }

    public Date getFechainicioalquiler() {
        return fechainicioalquiler;
    }

    public void setFechainicioalquiler(Date fechainicioalquiler) {
        this.fechainicioalquiler = fechainicioalquiler;
    }

    public Date getFechafinalquiler() {
        return fechafinalquiler;
    }

    public void setFechafinalquiler(Date fechafinalquiler) {
        this.fechafinalquiler = fechafinalquiler;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public int getPreciodia() {
        return preciodia;
    }

    public void setPreciodia(int preciodia) {
        this.preciodia = preciodia;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
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

    public UsbModem getCodigomodem() {
        return codigomodem;
    }

    public void setCodigomodem(UsbModem codigomodem) {
        this.codigomodem = codigomodem;
    }

    public Usuario getCedulausuario() {
        return cedulausuario;
    }

    public void setCedulausuario(Usuario cedulausuario) {
        this.cedulausuario = cedulausuario;
    }
}
