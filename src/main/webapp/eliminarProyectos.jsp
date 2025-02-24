<%-- 
    Document   : eliminarProyectos
    Created on : 24 feb 2025, 16:20:20
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eliminar Proyecto</h1>
        <form action="EliminarProyectos" method="POST">
            <label>ID:
                <input type="text" name="nombre"><br/>
            </label>
            <input type="submit" value="Eliminar">
        </form>
    </body>
</html>
