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
public class DetallesFacturas {
    private int idDetalles;
    private int Id_Factura;
    private int Id_Producto;
    private int Id_Taquilla;
    private double  Costo;
    private int  Estado;
    private int diferenciador;
    
}
