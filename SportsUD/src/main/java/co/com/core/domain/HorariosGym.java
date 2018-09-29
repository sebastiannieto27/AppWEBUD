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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "horarios_gym")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HorariosGym.findAll", query = "SELECT h FROM HorariosGym h")
    , @NamedQuery(name = "HorariosGym.findByIdHorariosGym", query = "SELECT h FROM HorariosGym h WHERE h.idHorariosGym = :idHorariosGym")
    , @NamedQuery(name = "HorariosGym.findByPrimeroHorario", query = "SELECT h FROM HorariosGym h WHERE h.primeroHorario = :primeroHorario")
    , @NamedQuery(name = "HorariosGym.findBySegundoHorario", query = "SELECT h FROM HorariosGym h WHERE h.segundoHorario = :segundoHorario")
    , @NamedQuery(name = "HorariosGym.findByTercerHorario", query = "SELECT h FROM HorariosGym h WHERE h.tercerHorario = :tercerHorario")
    , @NamedQuery(name = "HorariosGym.findByCuartoHorario", query = "SELECT h FROM HorariosGym h WHERE h.cuartoHorario = :cuartoHorario")})
public class HorariosGym implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHorarios_Gym")
    private Integer idHorariosGym;
    @Size(max = 45)
    @Column(name = "Primero_Horario")
    private String primeroHorario;
    @Size(max = 45)
    @Column(name = "Segundo_Horario")
    private String segundoHorario;
    @Size(max = 45)
    @Column(name = "Tercer_Horario")
    private String tercerHorario;
    @Size(max = 45)
    @Column(name = "Cuarto_Horario")
    private String cuartoHorario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "horariosGymidHorariosGym")
    private Collection<Cupos> cuposCollection;
    @JoinColumn(name = "Dias_idDias", referencedColumnName = "idDias")
    @ManyToOne(optional = false)
    private Dias diasidDias;
    @JoinColumn(name = "User_idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User useridUser;

    public HorariosGym() {
    }

    public HorariosGym(Integer idHorariosGym) {
        this.idHorariosGym = idHorariosGym;
    }

    public Integer getIdHorariosGym() {
        return idHorariosGym;
    }

    public void setIdHorariosGym(Integer idHorariosGym) {
        this.idHorariosGym = idHorariosGym;
    }

    public String getPrimeroHorario() {
        return primeroHorario;
    }

    public void setPrimeroHorario(String primeroHorario) {
        this.primeroHorario = primeroHorario;
    }

    public String getSegundoHorario() {
        return segundoHorario;
    }

    public void setSegundoHorario(String segundoHorario) {
        this.segundoHorario = segundoHorario;
    }

    public String getTercerHorario() {
        return tercerHorario;
    }

    public void setTercerHorario(String tercerHorario) {
        this.tercerHorario = tercerHorario;
    }

    public String getCuartoHorario() {
        return cuartoHorario;
    }

    public void setCuartoHorario(String cuartoHorario) {
        this.cuartoHorario = cuartoHorario;
    }

    @XmlTransient
    public Collection<Cupos> getCuposCollection() {
        return cuposCollection;
    }

    public void setCuposCollection(Collection<Cupos> cuposCollection) {
        this.cuposCollection = cuposCollection;
    }

    public Dias getDiasidDias() {
        return diasidDias;
    }

    public void setDiasidDias(Dias diasidDias) {
        this.diasidDias = diasidDias;
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
        hash += (idHorariosGym != null ? idHorariosGym.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorariosGym)) {
            return false;
        }
        HorariosGym other = (HorariosGym) object;
        if ((this.idHorariosGym == null && other.idHorariosGym != null) || (this.idHorariosGym != null && !this.idHorariosGym.equals(other.idHorariosGym))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.HorariosGym[ idHorariosGym=" + idHorariosGym + " ]";
    }
    
}

