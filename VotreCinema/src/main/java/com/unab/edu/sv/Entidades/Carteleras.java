/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import lombok.*;

/**
 *
 * @author Rafael
 */
@Data
public class Carteleras {
    private int idcartelera;
    private int Id_Pelicula;
    private int  Id_Sala;
    private int Id_Horario;
    private int Tipo;
    private double precio;
    private int estado;
    
}
