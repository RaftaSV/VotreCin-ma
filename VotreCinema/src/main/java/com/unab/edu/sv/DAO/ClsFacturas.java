/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.Facturas;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ClsFacturas {
    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();
    public void AgregarFactura(Facturas factura){
        try {
            CallableStatement call = conectar.prepareCall("call SP_I_FACTURAS(?,?,?)");
            call.setInt("pIdCliente", factura.getCliente());
            call.setInt("pidCajero", factura.getCajero());
            call.setDouble("pTotal", factura.getTotal());
            call.executeQuery();
            conectar.close();
        } catch (Exception e) {
            System.out.println("error"+e);
        } 
    }

}
