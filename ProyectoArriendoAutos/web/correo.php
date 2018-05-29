<?php

$destino = "dkd.ipchile2018@gmail.com";
$nombre = $_POST["nombre"];
$apellido = $_POST["apellido"];
$email = $_POST["email"];
$mensaje = $_POST["mensaje"];
$contenido = "Nombre: " . $nombre . "\nApellido: " . $apellido . "\nCorreo: " . $email . "\nMensaje: " . $mensaje;
mail($destino, "Contacto", $contenido);
header("Location:contacto.jsp")
?>