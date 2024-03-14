
	function obtenerTabla(){
		var select = document.getElementById('cosotabla');
		select.addEventListener('change',
  function(){
    var selectedOption = this.options[select.selectedIndex];
    console.log(selectedOption.value + ': ' + selectedOption.text);
	if(selectedOption.value === "cliente"){
		document.getElementById("tablaCliente").style.display='block';
		document.getElementById("tablaProveedor").style.display='none';	
	}else if(selectedOption.value === "proveedor"){
		document.getElementById("tablaCliente").style.display='none';
		document.getElementById("tablaProveedor").style.display='block';	
	}else{
		document.getElementById("tablaCliente").style.display='none';
		document.getElementById("tablaProveedor").style.display='none';
	}
  });

		

	}
        /* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


