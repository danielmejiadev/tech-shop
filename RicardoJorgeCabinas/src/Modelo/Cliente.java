package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCedulacliente", query = "SELECT c FROM Cliente c WHERE c.cedulacliente = :cedulacliente"),
    @NamedQuery(name = "Cliente.findByFechanacimientocliente", query = "SELECT c FROM Cliente c WHERE c.fechanacimientocliente = :fechanacimientocliente"),
    @NamedQuery(name = "Cliente.findByEstadocliente", query = "SELECT c FROM Cliente c WHERE c.estadocliente = :estadocliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "cedulacliente")
    private String cedulacliente;
   
    @Basic(optional = false)
    @Lob
    @Column(name = "nombrecliente")
    private String nombrecliente;
   
    @Basic(optional = false)
    @Lob
    @Column(name = "telefonocliente")
    private String telefonocliente;
   
    @Basic(optional = false)
    @Lob
    @Column(name = "correocliente")
    private String correocliente;
   
    @Basic(optional = false)
    @Column(name = "fechanacimientocliente")
    @Temporal(TemporalType.DATE)
    private Date fechanacimientocliente;
   
    @Basic(optional = false)
    @Lob
    @Column(name = "direccioncliente")
    private String direccioncliente;
    
    @Basic(optional = false)
    @Column(name = "estadocliente")
    private boolean estadocliente;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cedulacliente")
    private List<VentaMinutos> ventaMinutosList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cedulacliente")
    private List<AlquilerModem> alquilerModemList;

    public Cliente() {
    }

    public Cliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public Cliente(String cedulacliente, String nombrecliente, String telefonocliente, String correocliente, Date fechanacimientocliente, String direccioncliente, boolean estadocliente) {
        this.cedulacliente = cedulacliente;
        this.nombrecliente = nombrecliente;
        this.telefonocliente = telefonocliente;
        this.correocliente = correocliente;
        this.fechanacimientocliente = fechanacimientocliente;
        this.direccioncliente = direccioncliente;
        this.estadocliente = estadocliente;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getTelefonocliente() {
        return telefonocliente;
    }

    public void setTelefonocliente(String telefonocliente) {
        this.telefonocliente = telefonocliente;
    }

    public String getCorreocliente() {
        return correocliente;
    }

    public void setCorreocliente(String correocliente) {
        this.correocliente = correocliente;
    }

    public Date getFechanacimientocliente() {
        return fechanacimientocliente;
    }

    public void setFechanacimientocliente(Date fechanacimientocliente) {
        this.fechanacimientocliente = fechanacimientocliente;
    }

    public String getDireccioncliente() {
        return direccioncliente;
    }

    public void setDireccioncliente(String direccioncliente) {
        this.direccioncliente = direccioncliente;
    }

    public boolean getEstadocliente() {
        return estadocliente;
    }

    public void setEstadocliente(boolean estadocliente) {
        this.estadocliente = estadocliente;
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
