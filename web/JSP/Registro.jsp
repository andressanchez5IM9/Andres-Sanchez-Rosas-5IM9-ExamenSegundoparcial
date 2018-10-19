

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
    </head>
    <body>
        <h1>Registro</h1>
        <form method="POST" action="../RegistroServlet">
            Nombre <input type="text" name="nombre" id="nombre" class="validate"> <BR><BR>
            Apellido paterno <input type="text" name="apellido" id="apellido" class="validate"><BR><BR>
            Apellido materno  <input type="text" name="ape_mat" id="ape_mat" class="validate"><BR><BR>
            Escuela <input type="text" name="escuela" id="escuela" class="validate"><BR><BR>
            Materia Favorita  <input type="text" name="materia" id="materia" class="validate"><BR><BR>
            Deporte  <input type="text" name="deporte" id="deporte" class="validate"><BR><BR>
            <input type="submit" value="ENVIAR">
        </form>
                            
</body>
</html>












