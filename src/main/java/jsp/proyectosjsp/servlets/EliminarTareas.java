package jsp.proyectosjsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jsp.proyectosjsp.DAO.ITareas;
import jsp.proyectosjsp.DAO.ITareasImpl;
import jsp.proyectosjsp.entities.Tareas;


@WebServlet(name = "EliminarTareas", urlPatterns = {"/EliminarTareas"})
public class EliminarTareas extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String idS = (String) request.getParameter("id");
            int id = Integer.parseInt(idS);
            ITareas iTareas = new ITareasImpl();
            Tareas tarea = iTareas.buscarTareas(id);
            iTareas.eliminarTareas(tarea);
    }

}
