/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.Productos;
import com.unab.edu.sv.Entidades.Proveedores;
import com.unab.edu.sv.Formularios.frmLogin;
import com.unab.edu.sv.Formularios.frmPrincipal;
import com.unab.edu.sv.mysql.conexionBD;
import java.lang.invoke.CallSite;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ClsProveedores {

    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();

    public ArrayList<Proveedores> ListaProveedores() {
        ArrayList<Proveedores> provee = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("call SP_S_PROVEEDORES()");
            ResultSet resultado = call.executeQuery();
            while (resultado.next()) {
                Proveedores pro = new Productos();
                pro.setIdProveedor(resultado.getInt("idProveedor"));
                pro.setNombre(resultado.getString("Nombre"));
                pro.setTelefono(resultado.getString("Telefono"));
                pro.setDirecion(resultado.getString("Direccion"));
                provee.add(pro);

            }
            conectar.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return provee;
    }

    public void GuardarProveedor(Proveedores pro) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_I_PROVEEDORES(?,?,?)");
            call.setString("pNombre", pro.getNombre());
            call.setString("pTelefono", pro.getTelefono());
            call.setString("pDireccion", pro.getDirecion());
            call.execute();
            conectar.close();
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public void ActualizarProveedor(Proveedores pro) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_U_PROVEEDORES(?,?,?,?)");
            call.setInt("pId", pro.getIdProveedor());
            call.setString("pNombre", pro.getNombre());
            call.setString("pTelefono", pro.getTelefono());
            call.setString("pDireccion", pro.getDirecion());
            int res = JOptionPane.showConfirmDialog(null, "¿Desea Actualizar este registro?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
                call.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
                frmLogin log = new frmLogin();
                log.principal.proveedor.Limpiar();
                conectar.close();

            } else {

            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void EliminarProveedor(Proveedores pro) {
        try {
            CallableStatement call = conectar.prepareCall("call SP_D_PROVEEDORES(?)");
            call.setInt("pId", pro.getIdProveedor());
            int res = JOptionPane.showConfirmDialog(null, "Desea ¿Eliminar este registro?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
                call.execute();
                JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
            } else {

            }
            conectar.close();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
