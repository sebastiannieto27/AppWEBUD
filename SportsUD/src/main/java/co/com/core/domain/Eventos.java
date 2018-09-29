package co.com.core.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "eventos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventos.findAll", query = "SELECT e FROM Eventos e")
    , @NamedQuery(name = "Eventos.findByIdEventos", query = "SELECT e FROM Eventos e WHERE e.idEventos = :idEventos")
    , @NamedQuery(name = "Eventos.findByNombreEvento", query = "SELECT e FROM Eventos e WHERE e.nombreEvento = :nombreEvento")
    , @NamedQuery(name = "Eventos.findByLimite", query = "SELECT e FROM Eventos e WHERE e.limite = :limite")
    , @NamedQuery(name = "Eventos.findByCupos", query = "SELECT e FROM Eventos e WHERE e.cupos = :cupos")
    , @NamedQuery(name = "Eventos.findByEventoscol", query = "SELECT e FROM Eventos e WHERE e.eventoscol = :eventoscol")})
public class Eventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEventos")
    private Integer idEventos;
    @Size(max = 150)
    @Column(name = "NombreEvento")
    private String nombreEvento;
    @Column(name = "limite")
    @Temporal(TemporalType.DATE)
    private Date limite;
    @Size(max = 45)
    @Column(name = "Cupos")
    private String cupos;
    @Column(name = "Eventoscol")
    private Integer eventoscol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventosidEventos")
    private Collection<Formulario> formularioCollection;

    public Eventos() {
    }

    public Eventos(Integer idEventos) {
        this.idEventos = idEventos;
    }

    public Integer getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(Integer idEventos) {
        this.idEventos = idEventos;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getLimite() {
        return limite;
    }

    public void setLimite(Date limite) {
        this.limite = limite;
    }

    public String getCupos() {
        return cupos;
    }

    public void setCupos(String cupos) {
        this.cupos = cupos;
    }

    public Integer getEventoscol() {
        return eventoscol;
    }

    public void setEventoscol(Integer eventoscol) {
        this.eventoscol = eventoscol;
    }

    @XmlTransient
    public Collection<Formulario> getFormularioCollection() {
        return formularioCollection;
    }

    public void setFormularioCollection(Collection<Formulario> formularioCollection) {
        this.formularioCollection = formularioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEventos != null ? idEventos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventos)) {
            return false;
        }
        Eventos other = (Eventos) object;
        if ((this.idEventos == null && other.idEventos != null) || (this.idEventos != null && !this.idEventos.equals(other.idEventos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Eventos[ idEventos=" + idEventos + " ]";
    }
    
}

