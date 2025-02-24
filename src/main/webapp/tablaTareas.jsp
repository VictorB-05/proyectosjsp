<%-- 
    Document   : tablaProyectos
    Created on : 21 feb 2025, 16:06:23
    Author     : alumno
--%>

<%@page import="java.util.List"%>
<%@page import="jsp.proyectosjsp.entities.Tareas"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Tabla de Tareas</title>
    </head>
    <body>
        <form action="TablaTareas" method="GET">
            <input type="radio" name="estado" value="pendiente" id="pendiente">
            <label for="en curso">pendiente</label><br>
            <input type="radio" name="estado" value="en progreso" id="en progreso">
            <label for="completado">en progreso</label><br>
            <input type="radio" name="estado" value="completado" id="completado">
            <label for="completado">completado</label><br>
            <input type="submit" value="Buscar"><br>
            <label>Proyecto:
                <input type="text" name="id"><br/>
            </label>
        </form>
        <table border="1">
            <% List<Tareas> tareas = (List<Tareas>) request.getAttribute("tareas");
                if(tareas != null && !tareas.isEmpty()){
                    for(Tareas tarea : tareas){
            %>
                <tr>
                    <td><%= tarea.getId() %></td>
                    <td><%= tarea.getDescripcionTarea() %></td>
                    <td><%= tarea.getResponsable()%></td>
                    <td><%= tarea.getFechaInicio() %></td>
                    <td><%= tarea.getFechaFin() %></td>
                    <td><%= tarea.getEstado() %></td>
                </tr>
                <%}
                    }else{%>
                <tr>
                        <td>No hay tareas del proyecto disponibles</td>
                </tr>
            <%}%>
        </table>
    </body>
</html>
