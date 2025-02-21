/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package jsp.proyectosjsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jsp.proyectosjsp.DAO.IProyectos;
import jsp.proyectosjsp.DAO.IProyectosImpl;
import jsp.proyectosjsp.entities.Proyectos;

/**
 *
 * @author alumno
 */
@WebServlet(name = "RegistrarProyectos", urlPatterns = {"/RegistrarProyectos"})
public class RegistrarProyectos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = (String) request.getParameter("nombre");
        String descripcion = (String) request.getParameter("descripcion");
        String fechaInicioDepre = (String) request.getParameter("fechaInicio");
        String fechaFinDepre = (String) request.getParameter("fechaFin");
        LocalDate fechaInicio = LocalDate.parse(fechaInicioDepre);
        LocalDate fechaFin = LocalDate.parse(fechaFinDepre);
        Proyectos proyectos = new Proyectos(nombre, descripcion, fechaInicio, fechaFin, "en curso", new ArrayList<>());
        IProyectos iProyectos = new IProyectosImpl();
        iProyectos.registrarProyectos(proyectos);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
