/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorturnos;

/**
 *
 * @author ayaxFE
 */
public class Turno {
    private Paciente paciente;

    // Constructor
    public Turno(Paciente paciente) {
        this.paciente = paciente;
    }

    // Método Getter: Este es el que usa Turnos.java
    public Paciente getPaciente() {
        return this.paciente;
}
}