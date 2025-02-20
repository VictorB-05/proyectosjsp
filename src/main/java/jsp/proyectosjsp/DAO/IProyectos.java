/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jsp.proyectosjsp.DAO;

import java.util.List;
import jsp.proyectosjsp.entities.Proyectos;

/**
 *
 * @author alumno
 */
public interface IProyectos {
   List<Proyectos> listarProyectos(String estado);
   void registrarProyectos(Proyectos proyecto);
   void eliminarProyectos(Proyectos proyecto);   
}
