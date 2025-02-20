/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jsp.proyectosjsp.DAO;

import java.util.List;
import jsp.proyectosjsp.entities.Proyectos;
import jsp.proyectosjsp.entities.Tareas;

/**
 *
 * @author alumno
 */
public interface ITareas {
    List<Tareas> listarTareas(Proyectos proyecto);
    void registrarTareas(Tareas tarea);
    void eliminarTareas(Tareas tarea);
}
