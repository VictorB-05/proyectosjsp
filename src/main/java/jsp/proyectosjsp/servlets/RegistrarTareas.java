/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package jsp.proyectosjsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jsp.proyectosjsp.DAO.IProyectos;
import jsp.proyectosjsp.DAO.IProyectosImpl;
import jsp.proyectosjsp.DAO.ITareas;
import jsp.proyectosjsp.DAO.ITareasImpl;
import jsp.proyectosjsp.entities.Proyectos;
import jsp.proyectosjsp.entities.Tareas;

/**
 *
 * @author alumno
 */
@WebServlet(name = "RegistrarTareas", urlPatterns = {"/RegistrarTareas"})
public class RegistrarTareas extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String descripcion = (String) request.getParameter("descripcion");
        String responsable = (String) request.getParameter("responsable");
        String fechaInicioDepre = (String) request.getParameter("fechaInicio");
        String fechaFinDepre = (String) request.getParameter("fechaFin");
        String idProyectoS = (String) request.getParameter("id");
        int idProyecto = Integer.parseInt(idProyectoS);
        String estado = request.getParameter("estado");
        LocalDate fechaInicio = LocalDate.parse(fechaInicioDepre);
        LocalDate fechaFin = LocalDate.parse(fechaFinDepre);
        IProyectos iProyectos = new IProyectosImpl();
        Proyectos proyectos = iProyectos.buscarProyectos(idProyecto);
        Tareas tareas = new Tareas(descripcion, responsable, fechaInicio, fechaFin, estado, proyectos);
        ITareas iTareas = new ITareasImpl();
        iTareas.registrarTareas(tareas);
    }
}
