<%-- 
    Document   : tablaProyectos
    Created on : 21 feb 2025, 16:06:23
    Author     : alumno
--%>

<%@page import="java.util.List"%>
<%@page import="jsp.proyectosjsp.entities.Proyectos"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Tabla de Proyectos</title>
    </head>
    <body>
        <form action="TablaProyectos" method="GET">
            <input type="radio" name="estado" value="en curso" id="en curso">
            <label for="en curso">en curso</label><br>
            <input type="radio" name="estado" value="completado" id="completado">
            <label for="completado">completado</label><br>
            <input type="submit" value="Hibernate"><br>
        </form>
        <table border="1">
            <% List<Proyectos> proyectos = (List<Proyectos>) request.getAttribute("proyectos");
                if(proyectos != null && !proyectos.isEmpty()){
                    for(Proyectos proyecto : proyectos){
            %>
                <tr>
                    <td><%= proyecto.getId() %></td>
                    <td><%= proyecto.getNombreProyecto()%></td>
                    <td><%= proyecto.getDescripcion()%></td>
                    <td><%= proyecto.getFechaInicio() %></td>
                    <td><%= proyecto.getFechaFin() %></td>
                    <td><%= proyecto.getEstado() %></td>
                </tr>
                <%}
                    }else{%>
                <tr>
                        <td>No hay proyectos disponibles</td>
                </tr>
            <%}%>
        </table>
    </body>
</html>
