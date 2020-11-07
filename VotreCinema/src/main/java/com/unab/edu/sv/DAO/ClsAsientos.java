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
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ClsAsientos {
    
    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();  
    
    public ArrayList<Asientos> MostrarAsientos() {
        ArrayList<Asientos> lista = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("Call SP_S_Asientos()");
            ResultSet resultado = call.executeQuery();
            while (resultado.next()) {
                Asientos asi = new Asientos();
                asi.setId_Asiento(resultado.getInt("IdAsientos"));
                asi.setNumero(resultado.getInt("Numero"));
                asi.setId_Sala(resultado.getInt("IdSala"));                
                lista.add(asi);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return lista;
    }

    public void GuardarAsiento(Asientos asi) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_I_Asiento(?,?)");
            call.setInt("pNumero", asi.getNumero());
            call.setInt("pIdSala", asi.getId_Sala());                    
            call.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void ActualiarAsiento(Asientos asi) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_U_Asiento(?,?,?)");
            call.setInt("pIdAsiento", asi.getId_Asiento());
            call.setInt("pNumero", asi.getNumero());
            call.setInt("pIdSala", asi.getId_Sala());                 
            call.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void EliminarAsiento(Asientos asi) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_D_Asiento(?)");
            call.setInt("pIdAsiento", asi.getId_Asiento());
            call.executeQuery();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
