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
public class Roles extends Personas{
    protected int idRol;
    protected String Usuario;
    protected String Pasword;
    protected int  TipoRol;
    protected int Id_Persona;
    protected int Estado;
}
