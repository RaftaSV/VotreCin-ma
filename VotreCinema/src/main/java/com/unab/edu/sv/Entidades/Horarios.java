/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import java.util.Date;
import lombok.*;

/**
 *
 * @author Rafael
 */
@Data
public class Horarios {
    private int idHorario;
    private Date HoraInicio;
    private Date HoraFin;
    private Date Fecha; 
}
