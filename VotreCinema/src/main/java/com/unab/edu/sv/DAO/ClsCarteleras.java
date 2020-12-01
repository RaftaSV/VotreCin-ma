/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import static com.mysql.cj.util.StringUtils.getBytes;
import com.unab.edu.sv.Entidades.Carteleras;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ClsCarteleras {
    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();

    public ArrayList<Carteleras> CargarDatos() {
        ArrayList<Carteleras> lista = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("call SP_S_CARTELERA()");
            ResultSet resultado = call.executeQuery();
            while(resultado.next()){
            Carteleras cart = new Carteleras();
            cart.setIdcartelera(resultado.getInt("idCarteleras"));
            cart.setPortada(resultado.getBytes("portada"));
            cart.setNombre(resultado.getString("Nombre"));
            cart.setFecha(resultado.getDate("Fecha"));
            cart.setHoraInicio(resultado.getTime("HoraInicio"));
            cart.setNumero_sala(resultado.getInt("Numero_Sala"));
            cart.setDuracion(resultado.getTime("Duracion"));
            cart.setPrecio(resultado.getDouble("Precio"));
            cart.setSipnosis(resultado.getString("Sipnosis"));
            cart.setTipo(resultado.getInt("tipo"));
            lista.add(cart);
            }
            conectar.close();
           
        } catch (Exception e) {
        }
        return lista;
    }
    public void InsertarCartelera (Carteleras Cartel){
        try {
            CallableStatement cs = conectar.prepareCall("call SP_I_CARTELERA (?,?,?,?)");
            cs.setInt("PId_Pelicula", Cartel.getIdPelicula());
            cs.setInt("PId_Horario",Cartel.getId_Horario());
            cs.setInt("PId_sala", Cartel.getId_Sala());
            cs.setDate("PFecha", new java.sql.Date(Cartel.getFecha().getTime()));
            cs.executeQuery();
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
            conectar.close();
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
    }

}
