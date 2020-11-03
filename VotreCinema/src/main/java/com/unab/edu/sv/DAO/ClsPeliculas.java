/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import java.sql.*;
import java.util.*;
import com.unab.edu.sv.Entidades.Peliculas;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author 14-ck0013lab
 */
public class ClsPeliculas {
    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();
    
    public ArrayList<Peliculas> ListaPeliculas(){
    ArrayList<Peliculas> peliculas = new ArrayList<>();
        try {
            CallableStatement Cal = conectar.prepareCall("CALL SP_S_PELICULAS()");
            ResultSet resultado = Cal.executeQuery();
             while (resultado.next()) {
             Peliculas peli = new Peliculas();
             peli.setIdPelicula(resultado.getInt("idPeliculas"));
             peli.setNombre(resultado.getString("Nombre"));
             peli.setPortada(resultado.getBytes("Portada"));
             peli.setYear(resultado.getDate("Year"));
             peli.setDuracion(resultado.getDouble("Duracion"));
             peli.setSipnosis(resultado.getString("Sipnosis"));
             peli.setClasificacion(resultado.getInt("Clasificacion"));
             peli.setTipo(resultado.getInt("Tipo"));
             peliculas.add(peli);
             
             }
            
        } catch (Exception e) {
             System.out.println("Error" + e);
        }
        
        return peliculas;
    }
}
