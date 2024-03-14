/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package segunda_pagina;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Proveedor;

/**
 *
 * @author Estudiantes
 */
@WebServlet(name = "pagina_2", urlPatterns = {"/pagina_2"})
public class pagina_2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Cliente cliente=new Cliente();
            Proveedor proveedor=new Proveedor();
        response.setContentType("text/html;charset=UTF-8");
        cliente.setNombre(request.getParameter("nombreP2"));
        cliente.setCorreo(request.getParameter("correoP2"));
        cliente.setCedula(request.getParameter("documentoP"));
        cliente.setMetodo(request.getParameter("metodoP2"));
        cliente.setPago(request.getParameter("pago2"));
        proveedor.setNombre(request.getParameter("nombreP"));
        proveedor.setCorreo(request.getParameter("correoP"));
        proveedor.setMetodo(request.getParameter("metodoP"));
        proveedor.setCedula(request.getParameter("cedulaP"));
        proveedor.setCobro(request.getParameter("cobroP"));
        String tipo = request.getParameter("tipo");
               
        String html="";
        
        if("cliente".equals(tipo)){
            html = "<!DOCTYPE html>"
            +"<html>"
            +"<head>"
            +"<link href=\"estilos_pagina3.css\" rel=\"stylesheet\" type=\"text/css\">"
            +"</head>"
            +"<body"                
            +"<center>"
            +"<table border=\"2\" id=\"tabla2\">"
                +"<input type=\"hidden\" id=\"tipo\" name=\"tipo\" value=\"cliente\">"
                +"<tr>"
                +"<td colspan=\"3\"><center><h1>Informacion del cliente</h1></center></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Nombre del cliente</h3></td>"
                    +"<td><div id=\"nombreP2\" name=\"nombreP\">"+cliente.getNombre()+"</div></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Correo del cliente</h3></td>"
                    +"<td><div id=\"correoP2\" name=\"correoP\">"+cliente.getCorreo()+"</div></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Cedula del cliente</h3></td>"
                    +"<td><div id=\"documentoP\" name=\"documento\">"+cliente.getCedula()+"</div></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Metodo de pago</h3></td>"
                    +"<td><div id=\"metodoP2\" name=\"metodoP\">"+cliente.getMetodo()+"</td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Pago del producto</h3></td>"
                    +"<td><div id=\"pago2\" name=\"plataP\">"+cliente.getPago()+"</td>"
                +"</tr>"
                +"</table>"
                +"</body>"
                +"</html>";    
        }else if("proveedor".equals(tipo)){
            html = "<!DOCTYPE html>"
            +"<html>"
    +"<head>"
    +"<link href=\"estilos_pagina3.css\" rel=\"stylesheet\" type=\"text/css\">"
    +"</head>"
    +"<body"                
    +"<center>"
            +"<table border=\"2\" id=\"tabla2\">"
                +"<input type=\"hidden\" id=\"tipo\" name=\"tipo\" value=\"proveedor\">"
                +"<tr>"
                +"<td colspan=\"3\"><center><h1>Informacion del proveedor</h1></center></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Nombre del proveedor</h3></td>"
                    +"<td><div id=\"nombreP\" name=\"nombre\">"+proveedor.getNombre()+"</div></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Correo del proveedor</h3></td>"
                    +"<td><div id=\"correoP\" name=\"correo\">"+proveedor.getCorreo()+"</div></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Cedula del proveedor</h3></td>"
                    +"<td><div id=\"cedulaP\" name=\"cedula\">"+proveedor.getCedula()+"</div></td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Metodo de pago</h3></td>"
                    +"<td><div id=\"metodoP\" name=\"metodo\">"+proveedor.getMetodo()+"</td>"
                +"</tr>"
                +"<tr>"
                    +"<td><h3>Cobro por producto</h3></td>"
                    +"<td><div id=\"cobroP\" name=\"plata\">"+proveedor.getCobro()+"</td>"
                +"</tr>"
                +"</table>"
                +"</body>"
                +"</html>";    
                    }
        
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          out.println(html);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
