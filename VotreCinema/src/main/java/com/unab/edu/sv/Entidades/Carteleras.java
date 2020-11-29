/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import java.sql.Time;
import java.util.Date;
import lombok.*;

/**
 *
 * @author Rafael
 */
@Data
public class Carteleras extends Peliculas {
    private int Idcartelera;
    private int  Id_Sala;
    private int numero_sala;
    private int Id_Horario;
    private Date fecha;
    private Time horaInicio;
    private double precio;
    private int estado;
    
}
