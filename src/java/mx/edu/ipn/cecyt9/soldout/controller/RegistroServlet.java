package mx.edu.ipn.cecyt9.soldout.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.soldout.utils.Conexion;

/**
 *
 * @author Sánchez Rosas Andrés
 */

public class RegistroServlet extends HttpServlet {

    private Connection conex;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
        String nombre;
        String apellido;
        String ape_mat;
        String escuela;
        String materia;
        String deporte;

        final String INSERT = "insert into users(nombre,apellido, apellido2,escuela,materia,deporte) values(?, ?,?,?,?,?);";

        nombre = request.getParameter("nombre");
        apellido = request.getParameter("apellido");
        ape_mat = request.getParameter("ape_mat");
        escuela = request.getParameter("escuela");
        materia = request.getParameter("materia");
        deporte = request.getParameter("deporte");
        

        PreparedStatement stmt = null;
        try {
            stmt = conex.prepareStatement(INSERT);
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, ape_mat);
            stmt.setString(4, escuela);
            stmt.setString(5, materia);
            stmt.setString(6, deporte);

            if (stmt.executeUpdate() == 0) {
                //algo paso
            }
            conex.close();
        } catch (Exception eee) {

        }
        response.sendRedirect("JSP/Registro.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
