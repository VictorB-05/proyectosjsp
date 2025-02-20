/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsp.proyectosjsp.entities;

import java.io.Serializable;
import java.time.LocalDate;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "tareas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tareas.findAll", query = "SELECT t FROM Tareas t"),
    @NamedQuery(name = "Tareas.findById", query = "SELECT t FROM Tareas t WHERE t.id = :id"),
    @NamedQuery(name = "Tareas.findByResponsable", query = "SELECT t FROM Tareas t WHERE t.responsable = :responsable"),
    @NamedQuery(name = "Tareas.findByFechaInicio", query = "SELECT t FROM Tareas t WHERE t.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Tareas.findByFechaFin", query = "SELECT t FROM Tareas t WHERE t.fechaFin = :fechaFin"),
    @NamedQuery(name = "Tareas.findByEstado", query = "SELECT t FROM Tareas t WHERE t.estado = :estado")})
public class Tareas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Column(name = "descripcion_tarea")
    private String descripcionTarea;
    @Column(name = "responsable")
    private String responsable;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;
    @Column(name = "fecha_fin")
    private LocalDate fechaFin;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Proyectos idProyecto;

    public Tareas() {
    }

    public Tareas(Integer id) {
        this.id = id;
    }

    public Tareas(Integer id, LocalDate fechaInicio, String estado) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proyectos getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Proyectos idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tareas)) {
            return false;
        }
        Tareas other = (Tareas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jsp.proyectosjsp.entities.Tareas[ id=" + id + " ]";
    }
    
}
