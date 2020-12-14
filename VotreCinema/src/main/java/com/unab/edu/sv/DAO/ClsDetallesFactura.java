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
public class ClsDetallesFactura {

    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();

    public void insertarDetalle(DetallesFacturas detalle) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_I_DETALLEFACTURA(?,?,?)");
            call.setDouble("pCosto", detalle.getCosto());
            call.setInt("pidProducto", detalle.getId_Producto());
            call.setInt("Pdiferenciador", detalle.getDiferenciador());
            call.executeQuery();
            conectar.close();
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

}
