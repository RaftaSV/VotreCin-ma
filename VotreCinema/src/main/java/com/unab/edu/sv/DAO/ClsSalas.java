/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;


import com.unab.edu.sv.Entidades.Salas;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class ClsSalas {
    
    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();  
    
    public ArrayList<Salas> MostrarSalas() {
        ArrayList<Salas> lista = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("Call SP_S_Sala()");
            ResultSet resultado = call.executeQuery();
            while (resultado.next()) {
                Salas sal = new Salas();
                sal.setIdSala(resultado.getInt("IdSala"));
                sal.setCapacidad(resultado.getInt("capacidad"));
                sal.setNumero_Sala(resultado.getInt("Numero_Sala"));
                sal.setEstado(resultado.getInt("Estado"));
                lista.add(sal);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }

    public void GuardarSala(Salas sal) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_I_Sala(?,?,?)");
            call.setInt("pCapacidad", sal.getCapacidad());
            call.setInt("pNumero_Sala", sal.getNumero_Sala());
            call.setInt("pEstado", sal.Estado());            
            call.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void ActualiarSala(Salas sal) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_U_Sala(?,?,?,?)");
            call.setInt("pIdSala", sal.getIdSala());
            call.setInt("pCapacidad", sal.getCapacidad());
            call.setInt("pNumero_Sala", sal.getNumero_Sala());
            call.setInt("pEstado", sal.Estado());            
            call.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void EliminarSala(Salas sal) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_D_Sala(?)");
            call.setInt("pIdSala", sal.getIdSala());
            call.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
