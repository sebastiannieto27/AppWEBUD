package co.com.core.domain;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "dias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dias.findAll", query = "SELECT d FROM Dias d")
    , @NamedQuery(name = "Dias.findByIdDias", query = "SELECT d FROM Dias d WHERE d.idDias = :idDias")
    , @NamedQuery(name = "Dias.findByLunes", query = "SELECT d FROM Dias d WHERE d.lunes = :lunes")
    , @NamedQuery(name = "Dias.findByMartes", query = "SELECT d FROM Dias d WHERE d.martes = :martes")
    , @NamedQuery(name = "Dias.findByMiercoles", query = "SELECT d FROM Dias d WHERE d.miercoles = :miercoles")
    , @NamedQuery(name = "Dias.findByJueves", query = "SELECT d FROM Dias d WHERE d.jueves = :jueves")
    , @NamedQuery(name = "Dias.findByViernes", query = "SELECT d FROM Dias d WHERE d.viernes = :viernes")})
public class Dias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDias")
    private Integer idDias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lunes")
    private short lunes;
    @Column(name = "Martes")
    private Short martes;
    @Column(name = "Miercoles")
    private Short miercoles;
    @Column(name = "Jueves")
    private Short jueves;
    @Column(name = "Viernes")
    private Short viernes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diasidDias")
    private Collection<HorariosGym> horariosGymCollection;

    public Dias() {
    }

    public Dias(Integer idDias) {
        this.idDias = idDias;
    }

    public Dias(Integer idDias, short lunes) {
        this.idDias = idDias;
        this.lunes = lunes;
    }

    public Integer getIdDias() {
        return idDias;
    }

    public void setIdDias(Integer idDias) {
        this.idDias = idDias;
    }

    public short getLunes() {
        return lunes;
    }

    public void setLunes(short lunes) {
        this.lunes = lunes;
    }

    public Short getMartes() {
        return martes;
    }

    public void setMartes(Short martes) {
        this.martes = martes;
    }

    public Short getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(Short miercoles) {
        this.miercoles = miercoles;
    }

    public Short getJueves() {
        return jueves;
    }

    public void setJueves(Short jueves) {
        this.jueves = jueves;
    }

    public Short getViernes() {
        return viernes;
    }

    public void setViernes(Short viernes) {
        this.viernes = viernes;
    }

    @XmlTransient
    public Collection<HorariosGym> getHorariosGymCollection() {
        return horariosGymCollection;
    }

    public void setHorariosGymCollection(Collection<HorariosGym> horariosGymCollection) {
        this.horariosGymCollection = horariosGymCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDias != null ? idDias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dias)) {
            return false;
        }
        Dias other = (Dias) object;
        if ((this.idDias == null && other.idDias != null) || (this.idDias != null && !this.idDias.equals(other.idDias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Dias[ idDias=" + idDias + " ]";
    }
    
}
