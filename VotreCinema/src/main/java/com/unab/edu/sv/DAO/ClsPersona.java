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
import javax.swing.JOptionPane;

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
            while (resultado.next()) {
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

    public void AgregarPersona(Personas p) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_I_PERSONAS(?,?,?)");
            call.setString("pNombres", p.getNombres());
            call.setString("pApellidos", p.getApellidos());
            call.setString("pDUI", p.getDUI());
            call.execute();
            JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public void ActualizarPersona(Personas p) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_U_PERSONAS(?,?,?,?)");
            call.setInt("pId", p.getIdPersona());
            call.setString("pNombres", p.getNombres());
            call.setString("pApellidos", p.getApellidos());
            call.setString("pDUI", p.getDUI());
            call.execute();
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void EliminarPersonas(Personas per) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_D_PERSONAS(?)");
            call.setInt("pId", per.idPersona);
            call.execute();
            JOptionPane.showMessageDialog(null, "Eliminacion Exitosa");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
