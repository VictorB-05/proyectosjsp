/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package jsp.proyectosjsp.servlets;

import java.io.IOException;
import java.util.List;
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

@WebServlet(name = "TablaTareas", urlPatterns = {"/TablaTareas"})
public class TablaTareas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IProyectos iProyectos = new IProyectosImpl();
        String idProyectoS = request.getParameter("id");
        int idProyectos = Integer.parseInt(idProyectoS);
        Proyectos proyecto = iProyectos.buscarProyectos(idProyectos);
        ITareas iTareas = new ITareasImpl();
        List<Tareas> tareas = iTareas.listarTareas(proyecto);
        request.setAttribute("tareas", tareas);
        request.getRequestDispatcher("tablaTareas.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
