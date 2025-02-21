<%-- 
    Document   : registrarProyectos
    Created on : 21 feb 2025, 17:34:35
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
        <form action="RegistrarProyectos" method="GET">
            <label>Nombre:
                <input type="text" name="nombre"><br />
            </label>
            <label>Descripcion:
                <input type="text" name="descripcion"><br /><!-- textArea mejor -->
            </label>
            <label>Fecha inicio:
                <input type="date" name="fechaInicio"><br />
            </label>
            <label>Fecha fin:
                <input type="date" name="fechaFin"><br />
            </label>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>
