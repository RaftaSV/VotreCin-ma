/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import java.util.Date;
import java.util.HashSet;
import lombok.Data;

/**
 *
 * @author Rafael
 */
@Data
public class Facturas {

    private int idFactura;
    private int Cajero;
    private Date Fecha;
    private int Cliente;
    private double Total;
    private int Estado;

    
    
}
