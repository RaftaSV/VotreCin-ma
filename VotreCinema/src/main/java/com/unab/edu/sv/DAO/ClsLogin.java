/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.DAO;

import com.unab.edu.sv.Entidades.Roles;
import com.unab.edu.sv.mysql.conexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ClsLogin {

    conexionBD con = new conexionBD();
    Connection conectar = con.retornarConexion();
    boolean res = false;
    public int rol=0;
    public boolean Rol(String usu, String pass) {
        ArrayList<Roles> listarUsuarioPass = new ArrayList<>();
        ArrayList<Roles> ListaPass = new ArrayList<>();
        try {
            CallableStatement call = conectar.prepareCall("call SP_S_LOGIN(?,?)");
            call.setString("pUsuario", usu);
            call.setString("pPass", pass);
            ResultSet resul = call.executeQuery();
           while(resul.next()){
           Roles rol = new Roles();
           rol.setUsuario(resul.getString("Usuario"));
           rol.setPasword(resul.getNString("Pasword"));
           rol.setTipoRol(resul.getInt("TipoRol"));
           listarUsuarioPass.add(rol);
           }
           String usubase="";
           String passbase=""; 
           for(var i:listarUsuarioPass){
           usubase=i.getUsuario();
           passbase= i.getPasword();
           rol = i.getTipoRol();
           }
           CallableStatement st2 = conectar.prepareCall("call SP_S_CRIP(?)");
            st2.setString("PcripPass", pass);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
               Roles escrip = new Roles();
                escrip.setPasword(rs2.getString("crip"));
                ListaPass.add(escrip);
            }
            String scrippass =null;
            for(var i:ListaPass ){
            scrippass = i.getPasword();
            pass = scrippass;
                
            }
         
               if (usubase != null && passbase != null) {
                if (usubase.equals(usu) && passbase.equals(pass)) {
                    res = true;
                } else {
                    res = false;
               
                }
            }
               
               
            conectar.close();
        } catch (Exception e) {
        }

        return res;
    }

}