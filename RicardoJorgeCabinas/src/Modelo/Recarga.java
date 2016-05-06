package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "recarga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recarga.findAll", query = "SELECT r FROM Recarga r"),
    @NamedQuery(name = "Recarga.findByCodigorecarga", query = "SELECT r FROM Recarga r WHERE r.codigorecarga = :codigorecarga"),
    @NamedQuery(name = "Recarga.findByFecharecarga", query = "SELECT r FROM Recarga r WHERE r.fecharecarga = :fecharecarga"),
    @NamedQuery(name = "Recarga.findByValorecarga", query = "SELECT r FROM Recarga r WHERE r.valorecarga = :valorecarga"),
    @NamedQuery(name = "Recarga.findByMinutos", query = "SELECT r FROM Recarga r WHERE r.minutos = :minutos")})
public class Recarga implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigorecarga")
    private Long codigorecarga;
    
    @Basic(optional = false)
    @Column(name = "fecharecarga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharecarga;
    
    @Basic(optional = false)
    @Column(name = "valorecarga")
    private int valorecarga;
    
    @Basic(optional = false)
    @Column(name = "minutos")
    private int minutos;
    
    @JoinColumn(name = "codigoplan", referencedColumnName = "codigoplan")
    @ManyToOne(optional = false)
    private PlanMinutos codigoplan;
    
    @JoinColumn(name = "cedulausuario", referencedColumnName = "cedulausuario")
    @ManyToOne(optional = false)
    private Usuario cedulausuario;

    public Recarga() {
    }

    public Recarga(Long codigorecarga) {
        this.codigorecarga = codigorecarga;
    }

    public Recarga(Long codigorecarga, Date fecharecarga, int valorecarga, int minutos) {
        this.codigorecarga = codigorecarga;
        this.fecharecarga = fecharecarga;
        this.valorecarga = valorecarga;
        this.minutos = minutos;
    }

    public Long getCodigorecarga() {
        return codigorecarga;
    }

    public void setCodigorecarga(Long codigorecarga) {
        this.codigorecarga = codigorecarga;
    }

    public Date getFecharecarga() {
        return fecharecarga;
    }

    public void setFecharecarga(Date fecharecarga) {
        this.fecharecarga = fecharecarga;
    }

    public int getValorecarga() {
        return valorecarga;
    }

    public void setValorecarga(int valorecarga) {
        this.valorecarga = valorecarga;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
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
