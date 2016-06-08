package Modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCedulausuario", query = "SELECT u FROM Usuario u WHERE u.cedulausuario = :cedulausuario"),
    @NamedQuery(name = "Usuario.findByTipousuario", query = "SELECT u FROM Usuario u WHERE u.tipousuario = :tipousuario"),
    @NamedQuery(name = "Usuario.findByEstadousuario", query = "SELECT u FROM Usuario u WHERE u.estadousuario = :estadousuario")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "cedulausuario")
    private String cedulausuario;
    
    @Basic(optional = false)
    @Lob
    @Column(name = "nombreusuario")
    private String nombreusuario;
    
    @Basic(optional = false)
    @Lob
    @Column(name = "contrasena")
    private String contrasena;
    
    @Basic(optional = false)
    @Column(name = "tipousuario")
    private String tipousuario;
    
    @Basic(optional = false)
    @Lob
    @Column(name = "telefonosuario")
    private String telefonosuario;
    
    @Basic(optional = false)
    @Lob
    @Column(name = "direccionusuario")
    private String direccionusuario;
    
    @Basic(optional = false)
    @Lob
    @Column(name = "correousuario")
    private String correousuario;
    
    @Basic(optional = false)
    @Column(name = "estadousuario")
    private boolean estadousuario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cedulausuario")
    private List<VentaMinutos> ventaMinutosList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cedulausuario")
    private List<AlquilerModem> alquilerModemList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cedulausuario")
    private List<Recarga> recargaList;

    public Usuario() {
    }

    public Usuario(String cedulausuario) {
        this.cedulausuario = cedulausuario;
    }

    public Usuario(String cedulausuario, String nombreusuario, String contrasena, String tipousuario, String telefonosuario, String direccionusuario, String correousuario, boolean estadousuario) {
        this.cedulausuario = cedulausuario;
        this.nombreusuario = nombreusuario;
        this.contrasena = contrasena;
        this.tipousuario = tipousuario;
        this.telefonosuario = telefonosuario;
        this.direccionusuario = direccionusuario;
        this.correousuario = correousuario;
        this.estadousuario = estadousuario;
    }

    public String getCedulausuario() {
        return cedulausuario;
    }

    public void setCedulausuario(String cedulausuario) {
        this.cedulausuario = cedulausuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public String getTelefonosuario() {
        return telefonosuario;
    }

    public void setTelefonosuario(String telefonosuario) {
        this.telefonosuario = telefonosuario;
    }

    public String getDireccionusuario() {
        return direccionusuario;
    }

    public void setDireccionusuario(String direccionusuario) {
        this.direccionusuario = direccionusuario;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public boolean getEstadousuario() {
        return estadousuario;
    }

    public void setEstadousuario(boolean estadousuario) {
        this.estadousuario = estadousuario;
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

    @XmlTransient
    public List<Recarga> getRecargaList() {
        return recargaList;
    }

    public void setRecargaList(List<Recarga> recargaList) {
        this.recargaList = recargaList;
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.cedulausuario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedulausuario, other.cedulausuario)) {
            return false;
        }
        return true;
    }
    
    
}
