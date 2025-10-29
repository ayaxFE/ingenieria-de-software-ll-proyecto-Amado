/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorturnos;

/**
 *
 * @author ayaxFE
 */
public class Paciente {
    
    private String nombreApellido;
    private String dni;
    private String obraSocial;
    private String horaTurno;
    private String diaMes;

    // Constructor
    public Paciente(String nombreApellido, String dni, String obraSocial, String horaTurno, String diaMes) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.obraSocial = obraSocial;
        this.horaTurno = horaTurno;
        this.diaMes = diaMes;
    }

    // Getters para acceder a los datos
    public String getNombreApellido() {
        return nombreApellido; 
    }
    
    public String getDni() { 
        return dni; 
    }
    
    public String getObraSocial() {
        return obraSocial; 
    }
    public String getHoraTurno() {
        return horaTurno; 
    }
    public String getDiaMes() {
        return diaMes; 
    }
    
    
    
}
