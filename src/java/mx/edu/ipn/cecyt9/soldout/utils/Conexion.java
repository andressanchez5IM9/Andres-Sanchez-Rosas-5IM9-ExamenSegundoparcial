package mx.edu.ipn.cecyt9.soldout.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {
    

    Connection con = null;
    Statement state;
    ResultSet res;
    
    public Conexion(){
        
    }
    public void conecta(){
        try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
//        con = DriverManager.getConnection("jdbc:mysql://localhost/Examen","root","n0m3l0");
        con = DriverManager.getConnection("jdbc:mysql://localhost/Examen","root","PIes3.1416");
        
        }catch(Exception eeee){
            System.out.print("No se pudo establecer conexion");
        }
    }
    public void cierra() throws SQLException{
        con.close();
    }
    public Connection getConnection(){
        return con;
    }
    
    public int update(String update) throws SQLException{
        state = con.createStatement();
        return state.executeUpdate(update);
    }
    public ResultSet query(String query) throws SQLException{
        state = con.createStatement();
        return state.executeQuery(query);
    }
}


