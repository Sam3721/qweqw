<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
<head>
<link href="estilos_pagina3.css" rel="stylesheet" type="text/css">
<script src="funciones.js" type="text/javascript"></script>
</head>
<body onload="obtenerTabla()">
<center>
<h1>
Formulario del directorio
</h1>
</center>
<div>
Tipo de persona

<select id="cosotabla" name="cosotabla " >
	<option>&nbsp</option>
	<option value="proveedor">Proveedor</option>
	<option value="cliente">Cliente</option>
</select>
</div>

<center>
	<form id="frmTest" method="get" action="pagina_2" enctype="multipart/form-data">
	<table border="2" id="tablaProveedor">
		<input type="hidden" id="tipo" name="tipo" value="proveedor">
		<tr>
			<td colspan="3"><center><h1>Informacion del proveedor</h1></center></td>
		</tr>
		<tr>
			<td><h3>Nombre del proveedor</h3></td>
			<td><input id="nombreP2" name="nombreP"></td>
		</tr>
		<tr>
			<td><h3>Correo del proveedor</h3></td>
			<td><input id="correoP2" name="correoP"></td>
		</tr>
		<tr>
			<td><h3>Cedula del proveedor</h3></td>
			<td><input id="cedula2" name="cedulaP"></td>
		</tr>
		<tr>
			<td><h3>Metodo de pago</h3></td>
			<td><select id="metodoP2" name="metodoP">
				<option>Credito</option>
				<option>Efectivo</option>
				</select>
			</td>
		</tr>
		<tr>
			<td><h3>Cobro por producto</h3></td>
			<td><input id="cobro2" name="cobroP"></td>
		</tr>
		<tr><td colspan="3"><button id="enviar" name="enviar" type="submit" onclick="validar()"style="width: 100%;"><h2>Enviar datos</h2></button></td></tr>

</table>
</form>
<form id="frmTest2" method="get" action="pagina_2" enctype="multipart/form-data">
<table border="2" id="tablaCliente">
	<input type="hidden" id="tipo" name="tipo" value="cliente">
		<tr>
			<td colspan="3"><center><h1>Informacion del cliente</h1></center>
		</td>
		</tr>
		<tr>
			<td><h3>Nombre del cliente</h3></td>
			<td><input id="nombre2" name="nombreP2"></td>
		</tr>
		<tr>
			<td><h3>Correo del cliente</h3></td>
			<td><input id="correo1" name="correoP2"></td>
		</tr>
		<tr>
			<td><h3>Documento del cliente</h3></td>
			<td><input id="cedula1" name="documentoP"></td>
		</tr>
		<tr>
			<td><h3>Metodo de pago</h3></td>
			<td><select id="metodo1" name="metodoP2">
				<option>Credito</option>
				<option>Efectivo</option>
				</select>
			</td>
		</tr>
		<tr>
			<td><h3>Pago por producto</h3></td>
			<td><input id="pago1" name="pago2"></td>
		</tr>
		<tr><td colspan="3"><button id="enviar" name="enviar" type="submit" style="width: 100%;"><h2>Enviar datos</button></h2></td></tr>
</table>
</form>
</center>

</body>
</html>


