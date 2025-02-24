<%-- 
    Document   : registrarFacturas
    Created on : 24 feb 2025, 16:48:35
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
        <h1>Registrar Tareas</h1>
            <form action="RegistrarTareas" method="POST">
            <label>Descripcion Tarea:
                <input type="text" name="descripcion"><br/>
            </label>
            <label>Responsable:
                <input type="text" name="responsable"><br/>
            </label>
            <label>Fecha Inicio:
                <input type="date" name="fechaInicio"><br/>
            </label>
            <label>Fecha Fin
                <input type="datependiente" name="fechaFin"><br/>
            </label>
            <label>Estado:
                <input type="radio" name="estado" value="pendiente" id="pendiente">
                <label for="en curso">pendiente</label><br>
                <input type="radio" name="estado" value="en progreso" id="en progreso">
                <label for="completado">en progreso</label><br>
                <input type="radio" name="estado" value="completado" id="completado">
                <label for="completado">completado</label><br>
                <input type="submit" value="Buscar"><br>
            </label>
            <label>Proyecto:
                <input type="text" name="id"><br/>
            </label>
            <input type="submit" value="Eliminar">
        </form>
    </body>
</html>
