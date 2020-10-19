/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.Personas;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.Connection;
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
CallableStatement
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
return Personas;
    }
}
