/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.Roles;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 14-ck0013lab
 */
public class ClsRoles {
    conexionBD conn = new conexionBD();
    Connection conect = conn.retornarConexion();
    
    public ArrayList<Roles> MostrarRoles (){
    ArrayList<Roles> Roll = new ArrayList<>();
    
        try {
          CallableStatement cs = conect.prepareCall("call SP_S_Roles ()");  
            ResultSet resultado = cs.executeQuery();
            while(resultado.next()){
            Roles Rol = new Roles();
          Rol.setIdRol(resultado.getInt("idRoles"));
          Rol.setUsuario(resultado.getString("Usuario"));
          Rol.setPasword(resultado.getString("Pasword"));
          Rol.setTipoRol(resultado.getInt("TipoRol"));
          Rol.setId_Persona(resultado.getInt("Id_Persona"));
          Rol.setEstado(resultado.getInt("Estado"));
          Roll.add(Rol);
       
            
            }
            
            conect.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    return Roll;
    }
}
