/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author Rafael
 */
@Data
public class Precios extends Peliculas{
    public int idprecio;
    public BigDecimal precios;
    public int tipo;
}
