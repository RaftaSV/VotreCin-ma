/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import java.io.File;
import java.sql.Time;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Rafael
 */
@Data
public class Peliculas {

    private int idPelicula;
    private String Nombre;
    private byte[] Portada;
    private Date Year;
    private Time  Duracion;
    private String Sipnosis;
    private int Tipo;
    private int clasificacion;
    
    
}
