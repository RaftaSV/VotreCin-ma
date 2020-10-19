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
public class Productos {
    private int IidProductos;
    private String  Nombre;
    private double precio;
    private int Cantidad;
    private int Id_Proveedor;
    private int Estado;
}
