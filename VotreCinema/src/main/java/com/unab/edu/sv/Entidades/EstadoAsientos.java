/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Entidades;

import java.util.HashSet;
import lombok.Data;

/**
 *
 * @author Rafael
 */
@Data
public class EstadoAsientos extends Asientos{
    private int idEstado;
    private int id_Horario;
    private int Id_Asiento;
    private int Estado;
    
}
