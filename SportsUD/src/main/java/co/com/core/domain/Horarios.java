package co.com.core.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "horarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horarios.findAll", query = "SELECT h FROM Horarios h")
    , @NamedQuery(name = "Horarios.findByIdHorarios", query = "SELECT h FROM Horarios h WHERE h.idHorarios = :idHorarios")
    , @NamedQuery(name = "Horarios.findByNombre", query = "SELECT h FROM Horarios h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Horarios.findByDescripcion", query = "SELECT h FROM Horarios h WHERE h.descripcion = :descripcion")})
public class Horarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHorarios")
    private Integer idHorarios;
    @Size(max = 80)
    @Column(name = "Nombre")
    private String nombre;
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @Size(max = 200)
    @Column(name = "Descripcion")
    private String descripcion;

    public Horarios() {
    }

    public Horarios(Integer idHorarios) {
        this.idHorarios = idHorarios;
    }

    public Integer getIdHorarios() {
        return idHorarios;
    }

    public void setIdHorarios(Integer idHorarios) {
        this.idHorarios = idHorarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorarios != null ? idHorarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horarios)) {
            return false;
        }
        Horarios other = (Horarios) object;
        if ((this.idHorarios == null && other.idHorarios != null) || (this.idHorarios != null && !this.idHorarios.equals(other.idHorarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Horarios[ idHorarios=" + idHorarios + " ]";
    }
    
}

