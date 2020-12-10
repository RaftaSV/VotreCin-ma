/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.Asientos;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ClsAsientos {

    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();

    public ArrayList<Asientos> CargarAsientos(Asientos a) {
        ArrayList<Asientos> lista = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("call SP_SELECCIONARASIENTO(?)");
            call.setInt("pCartelera", a.getIdcartelera());
            ResultSet res = call.executeQuery();
            while (res.next()) {
                Asientos asientos = new Asientos();
                asientos.setId_Asiento(res.getInt("idAsientos"));
                asientos.setNumero(res.getInt("Numero"));
                lista.add(asientos);
            }
            conectar.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

}
