<%-- 
    Document   : index
    Created on : 19 feb 2025, 20:54:39
    Author     : alumno
--%>

<%@page import="jsp.proyectosjsp.entities.Proyectos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <form action = "index" method="get">
            <input type="submit" value="Hibernate">
        </form>
    </body>
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
</html>
