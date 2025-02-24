/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package jsp.proyectosjsp.servlets;

import java.io.IOException;
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
@WebServlet(name = "EliminarProyectos", urlPatterns = {"/EliminarProyectos"})
public class EliminarProyectos extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IProyectos iProyectos = new IProyectosImpl();
        String idS = request.getParameter("nombre");
        try{
            int id = Integer.parseInt(idS);
            Proyectos proyecto = iProyectos.buscarProyectos(id);
            iProyectos.eliminarProyectos(proyecto);
        }catch(NumberFormatException ex){
            
        }

    }

}
