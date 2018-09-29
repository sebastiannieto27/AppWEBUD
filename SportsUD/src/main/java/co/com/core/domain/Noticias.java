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
@Table(name = "noticias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Noticias.findAll", query = "SELECT n FROM Noticias n")
    , @NamedQuery(name = "Noticias.findByIdNoticias", query = "SELECT n FROM Noticias n WHERE n.idNoticias = :idNoticias")
    , @NamedQuery(name = "Noticias.findByNombre", query = "SELECT n FROM Noticias n WHERE n.nombre = :nombre")
    , @NamedQuery(name = "Noticias.findByDescripcion", query = "SELECT n FROM Noticias n WHERE n.descripcion = :descripcion")})
public class Noticias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNoticias")
    private Integer idNoticias;
    @Size(max = 200)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 1000)
    @Column(name = "Descripcion")
    private String descripcion;
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;

    public Noticias() {
    }

    public Noticias(Integer idNoticias) {
        this.idNoticias = idNoticias;
    }

    public Integer getIdNoticias() {
        return idNoticias;
    }

    public void setIdNoticias(Integer idNoticias) {
        this.idNoticias = idNoticias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNoticias != null ? idNoticias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Noticias)) {
            return false;
        }
        Noticias other = (Noticias) object;
        if ((this.idNoticias == null && other.idNoticias != null) || (this.idNoticias != null && !this.idNoticias.equals(other.idNoticias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Noticias[ idNoticias=" + idNoticias + " ]";
    }
    
}

