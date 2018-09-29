package co.com.core.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "formulario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formulario.findAll", query = "SELECT f FROM Formulario f")
    , @NamedQuery(name = "Formulario.findByIdFormulario", query = "SELECT f FROM Formulario f WHERE f.idFormulario = :idFormulario")
    , @NamedQuery(name = "Formulario.findByNombreUsuario", query = "SELECT f FROM Formulario f WHERE f.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Formulario.findByCorreoUsuario", query = "SELECT f FROM Formulario f WHERE f.correoUsuario = :correoUsuario")
    , @NamedQuery(name = "Formulario.findByCodigoUsuario", query = "SELECT f FROM Formulario f WHERE f.codigoUsuario = :codigoUsuario")
    , @NamedQuery(name = "Formulario.findByCarreraUsuario", query = "SELECT f FROM Formulario f WHERE f.carreraUsuario = :carreraUsuario")})
public class Formulario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFormulario")
    private Integer idFormulario;
    @Size(max = 80)
    @Column(name = "Nombre_Usuario")
    private String nombreUsuario;
    @Size(max = 45)
    @Column(name = "Correo_Usuario")
    private String correoUsuario;
    @Size(max = 45)
    @Column(name = "Codigo_Usuario")
    private String codigoUsuario;
    @Size(max = 45)
    @Column(name = "Carrera_Usuario")
    private String carreraUsuario;
    @Lob
    @Column(name = "Planilla")
    private byte[] planilla;
    @JoinColumn(name = "Eventos_idEventos", referencedColumnName = "idEventos")
    @ManyToOne(optional = false)
    private Eventos eventosidEventos;
    @JoinColumn(name = "User_idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User useridUser;

    public Formulario() {
    }

    public Formulario(Integer idFormulario) {
        this.idFormulario = idFormulario;
    }

    public Integer getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(Integer idFormulario) {
        this.idFormulario = idFormulario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getCarreraUsuario() {
        return carreraUsuario;
    }

    public void setCarreraUsuario(String carreraUsuario) {
        this.carreraUsuario = carreraUsuario;
    }

    public byte[] getPlanilla() {
        return planilla;
    }

    public void setPlanilla(byte[] planilla) {
        this.planilla = planilla;
    }

    public Eventos getEventosidEventos() {
        return eventosidEventos;
    }

    public void setEventosidEventos(Eventos eventosidEventos) {
        this.eventosidEventos = eventosidEventos;
    }

    public User getUseridUser() {
        return useridUser;
    }

    public void setUseridUser(User useridUser) {
        this.useridUser = useridUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormulario != null ? idFormulario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formulario)) {
            return false;
        }
        Formulario other = (Formulario) object;
        if ((this.idFormulario == null && other.idFormulario != null) || (this.idFormulario != null && !this.idFormulario.equals(other.idFormulario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Formulario[ idFormulario=" + idFormulario + " ]";
    }
    
}
