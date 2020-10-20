/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.Personas;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class ClsPersona {

    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();

    public ArrayList<Personas> ListaPersonas() {
        ArrayList<Personas> Personas = new ArrayList<>();
        try {
            CallableStatement Cal = conectar.prepareCall("CALL SP_S_PERSONAS()");
            ResultSet resultado = Cal.executeQuery();
            while(resultado.next()){
            Personas p = new Personas();
            p.setIdPersona(resultado.getInt("idPersonas"));
            p.setNombres(resultado.getString("Nombres"));
            p.setApellidos(resultado.getString("Apellidos"));
            p.setDUI(resultado.getString("DUI"));
            p.setEstado(resultado.getInt("Estado"));
            Personas.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return Personas;
    }
}
