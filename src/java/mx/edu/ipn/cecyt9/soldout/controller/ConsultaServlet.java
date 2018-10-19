
package mx.edu.ipn.cecyt9.soldout.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.soldout.model.Registro;
import mx.edu.ipn.cecyt9.soldout.utils.Conexion;

/**
 *
 * @author Sánchez Rosas Andrés
 */
public class ConsultaServlet extends HttpServlet {

   private Connection conex;
   private ResultSet res = null;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
      
        
        final String sel = "select * from users; ";
        PreparedStatement stmt = null;

        try {
            stmt = conex.prepareStatement(sel);
            res =stmt.executeQuery();
            con.query(sel);
            
//            out.println("\tNombre "+"\tA. Paterno"+"\tA. Materno"+"\tEscuela \tMateria fav \tDeporte fav");
            
            while(res.next()) {
               
                String nom = res.getNString("nombre");
                String ape = res.getNString("apellido");
                String ape2 = res.getString("apellido2");
                
               String esc=  res.getString("escuela");
               String mat=  res.getString("materia");
               String dep = res.getNString("deporte");
                 
                out.print("\t       " + nom);
                out.print("\t       " + ape);
                out.print("\t       " + ape2);
                out.print("\t       " + esc);
                out.print("\t       " + mat);
                out.print("\t       " + dep);
                out.print("\n");
               
            }
            conex.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
