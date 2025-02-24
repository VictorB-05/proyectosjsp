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
        <form action = "tablaProyectos.jsp" method="get">
            <input type="submit" value="Tabla Proyectos">
        </form>
        <form action = "registrarProyectos.jsp" method="get">
            <input type="submit" value="Registrar Proyectos">
        </form>
        <form action = "eliminarProyectos.jsp" method="get">
            <input type="submit" value="Eliminar Proyectos">
        </form>
        <form action = "registrarTareas.jsp" method="get">
            <input type="submit" value="Registrar Tareas">
        </form>
        <form action = "tablaTareas.jsp" method="get">
            <input type="submit" value="Listar Tareas">
        </form>
        <form action = "eliminarTareas.jsp" method="get">
            <input type="submit" value="Listar Tareas">
        </form>
    </body>
</html>
