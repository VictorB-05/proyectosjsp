/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsp.proyectosjsp.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 *
 * @author alumno
 */
@Entity
public class proyectos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "nombre_proyecto")
    private String nombreProyecto;
    
    private String descripcion;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;
    
    @Column(name = "fecha_fin")
    private LocalDate fechaFin;
    
    @Enumerated(EnumType.STRING) // Almacena el nombre del enum en la base de datos
    @Column(nullable = false)
    private Estado estado;

    public proyectos() {
    }

    public proyectos(Integer id, String nombreProyecto, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Estado estado) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return id + " ]";
    }
    
}
