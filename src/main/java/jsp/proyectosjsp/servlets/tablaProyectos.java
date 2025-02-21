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
import jsp.proyectosjsp.entities.Proyectos;


/**
 *
 * @author alumno
 */
@WebServlet(name= "TablaProyectos", urlPatterns = {"/TablaProyectos"})
public class TablaProyectos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IProyectos iProyectos = new IProyectosImpl();
        String estado = request.getParameter("estado");
        System.out.println(estado);
        List<Proyectos> proyectos = iProyectos.listarProyectos(estado);
        request.setAttribute("proyectos", proyectos);
        request.getRequestDispatcher("tablaProyectos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
