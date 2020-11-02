/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;


import com.unab.edu.sv.Entidades.Productos;
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

public class ClsProductos {
   conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();  
public ArrayList<Productos>MostrarProductos(){
ArrayList<Productos>lista = new ArrayList<>();
    try {
        CallableStatement call =  conectar.prepareCall("Call SP_S_PRODUCTOS()");
        ResultSet resultado = call.executeQuery();
        while (resultado.next()){
        Productos prod = new Productos();
        prod.setIdProductos(resultado.getInt("idProducto"));
        prod.setNombreprod(resultado.getString("Producto"));
        prod.setPrecio(resultado.getDouble("precio"));
        prod.setCantidad(resultado.getInt("Cantidad"));
        prod.setIdProveedor(resultado.getInt("idProveedor"));
        prod.setNombre(resultado.getString("Nombre"));
        lista.add(prod);
        }
    } catch (Exception e) {
           System.out.println("Error" + e);
    }

return lista;
}
public void GuardarProducto(Productos pro){
    try {
        CallableStatement call = conectar.prepareCall("call SP_I_PRODUCTOS(?,?,?,?)");
        call.setString( "pNombre",pro.getNombreprod());
        call.setDouble("pPrecio", pro.getPrecio());
        call.setInt("pCantidad", pro.getCantidad());
        call.setInt("pProveedor", pro.getIdProveedor());
        call.executeQuery();
        conectar.close();
        JOptionPane.showMessageDialog(null, "Guardado con exito");
    } catch (Exception e) {
        System.out.println(e);
    }

}
public void ActualiarProducto(Productos pro){
    try {
        CallableStatement call = conectar.prepareCall("call SP_U_PRODUCTOS(?,?,?,?,?)");
        call.setInt("pId", pro.getIdProductos());
        call.setString( "pNombre",pro.getNombreprod());
        call.setDouble("pPrecio", pro.getPrecio());
        call.setInt("pCantidad", pro.getCantidad());
        call.setInt("pProveedor", pro.getIdProveedor());
        call.executeQuery();
        conectar.close();
        JOptionPane.showMessageDialog(null, "Actualizado con exito");
    } catch (Exception e) {
        System.out.println(e);
    }
}
public void EliminarProducto(Productos pro){
    try {
        CallableStatement call = conectar.prepareCall("call SP_D_PRODUCTOS(?)");
        call.setInt("pId", pro.getIdProductos());
        call.executeQuery();
        conectar.close();
        JOptionPane.showMessageDialog(null, "Eliminado con exito");
    } catch (Exception e) {
        System.out.println(e);
    }
}
    
}
