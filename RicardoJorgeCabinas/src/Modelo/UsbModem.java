package Modelo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "usbmodem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsbModem.findAll", query = "SELECT u FROM UsbModem u"),
    @NamedQuery(name = "UsbModem.findByCodigomodem", query = "SELECT u FROM UsbModem u WHERE u.codigomodem = :codigomodem"),
    @NamedQuery(name = "UsbModem.findByNombremodem", query = "SELECT u FROM UsbModem u WHERE u.nombremodem LIKE :nombremodem"),
    @NamedQuery(name = "UsbModem.findByProveedor", query = "SELECT u FROM UsbModem u WHERE u.proveedor = :proveedor"),
    @NamedQuery(name = "UsbModem.findByDisponibilidad", query = "SELECT u FROM UsbModem u WHERE u.disponibilidad = :disponibilidad"),
    @NamedQuery(name = "UsbModem.findByCostodia", query = "SELECT u FROM UsbModem u WHERE u.costodia = :costodia"),
    @NamedQuery(name = "UsbModem.findByPreciodia", query = "SELECT u FROM UsbModem u WHERE u.preciodia = :preciodia"),
    @NamedQuery(name = "UsbModem.findByEstadousbmodem", query = "SELECT u FROM UsbModem u WHERE u.estadousbmodem = :estadousbmodem")})
public class UsbModem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigomodem")
    private Long codigomodem;
    
    @Basic(optional = false)
    @Column(name = "nombremodem")
    private String nombremodem;
    
    @Basic(optional = false)
    @Column(name = "proveedor")
    private String proveedor;
    
    @Basic(optional = false)
    @Column(name = "disponibilidad")
    private String disponibilidad;
    
    @Basic(optional = false)
    @Column(name = "costodia")
    private int costodia;
    
    @Basic(optional = false)
    @Column(name = "preciodia")
    private int preciodia;
    
    @Basic(optional = false)
    @Column(name = "estadousbmodem")
    private boolean estadousbmodem;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigomodem")
    private List<AlquilerModem> alquilerModemList;

    public UsbModem() {
    }

    public UsbModem(Long codigomodem) {
        this.codigomodem = codigomodem;
    }

    public UsbModem(Long codigomodem, String nombremodem, String proveedor, String disponibilidad, int costodia, int preciodia, boolean estadousbmodem) {
        this.codigomodem = codigomodem;
        this.nombremodem = nombremodem;
        this.proveedor = proveedor;
        this.disponibilidad = disponibilidad;
        this.costodia = costodia;
        this.preciodia = preciodia;
        this.estadousbmodem = estadousbmodem;
    }

    public Long getCodigomodem() {
        return codigomodem;
    }

    public void setCodigomodem(Long codigomodem) {
        this.codigomodem = codigomodem;
    }

    public String getNombremodem() {
        return nombremodem;
    }

    public void setNombremodem(String nombremodem) {
        this.nombremodem = nombremodem;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCostodia() {
        return costodia;
    }

    public void setCostodia(int costodia) {
        this.costodia = costodia;
    }

    public int getPreciodia() {
        return preciodia;
    }

    public void setPreciodia(int preciodia) {
        this.preciodia = preciodia;
    }

    public boolean getEstadousbmodem() {
        return estadousbmodem;
    }

    public void setEstadousbmodem(boolean estadousbmodem) {
        this.estadousbmodem = estadousbmodem;
    }

    @XmlTransient
    public List<AlquilerModem> getAlquilerModemList() {
        return alquilerModemList;
    }

    public void setAlquilerModemList(List<AlquilerModem> alquilerModemList) {
        this.alquilerModemList = alquilerModemList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigomodem);
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
        final UsbModem other = (UsbModem) obj;
        if (!Objects.equals(this.codigomodem, other.codigomodem)) {
            return false;
        }
        return true;
    }
    
    
}
