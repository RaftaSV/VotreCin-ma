/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import lombok.Data;

/**
 *
 * @author Rafael
 */
@Data
public class Proveedores {
    private int idProveedor;
    private String Nombre;
    private String Telefono;
    private String Direcion;
    private int estado;
    
}
