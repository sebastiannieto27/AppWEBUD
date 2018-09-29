package co.com.core.domain;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "cupos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cupos.findAll", query = "SELECT c FROM Cupos c")
    , @NamedQuery(name = "Cupos.findByIdCupos", query = "SELECT c FROM Cupos c WHERE c.idCupos = :idCupos")
    , @NamedQuery(name = "Cupos.findByCantidad", query = "SELECT c FROM Cupos c WHERE c.cantidad = :cantidad")})
public class Cupos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCupos")
    private Integer idCupos;
    @Column(name = "Cantidad")
    private Integer cantidad;
    @JoinColumn(name = "Horarios_Gym_idHorarios_Gym", referencedColumnName = "idHorarios_Gym")
    @ManyToOne(optional = false)
    private HorariosGym horariosGymidHorariosGym;

    public Cupos() {
    }

    public Cupos(Integer idCupos) {
        this.idCupos = idCupos;
    }

    public Integer getIdCupos() {
        return idCupos;
    }

    public void setIdCupos(Integer idCupos) {
        this.idCupos = idCupos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public HorariosGym getHorariosGymidHorariosGym() {
        return horariosGymidHorariosGym;
    }

    public void setHorariosGymidHorariosGym(HorariosGym horariosGymidHorariosGym) {
        this.horariosGymidHorariosGym = horariosGymidHorariosGym;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCupos != null ? idCupos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cupos)) {
            return false;
        }
        Cupos other = (Cupos) object;
        if ((this.idCupos == null && other.idCupos != null) || (this.idCupos != null && !this.idCupos.equals(other.idCupos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cupos[ idCupos=" + idCupos + " ]";
    }
    
}
