/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.DetallesFacturas;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Rafael
 */
//pidProducto int,
//pCosto decimal(10,2),
//Pdiferenciador int
public class ClasDetallesFacturas {

    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();

    public void GuardarDetalle(DetallesFacturas det) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_I_DETALLEFACTURA(?,?,?)");
            call.setInt("pidProducto", det.getId_Producto());
            call.setDouble("pCosto", det.getCosto());
            call.setInt("Pdiferenciador ", det.getDiferenciador());
            call.executeQuery();
            conectar.close();
            System.out.println("Producto guardado");
        } catch (Exception e) {
        }

    }

}
