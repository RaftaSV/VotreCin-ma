/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rafael
 */
public class conexionBD {

    private Connection conexion;

    public conexionBD() {

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/votrecinéma", "root", "root");
            System.out.println("Conexion exitosa");

        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }
    public Connection retornarConexion() {
        return conexion;
    }

}


