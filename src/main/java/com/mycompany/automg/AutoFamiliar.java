/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automg;

/**
 *
 * @author Alumno
 */
public class AutoFamiliar extends Auto{
    private int cantidadPuertas;
    private int cantidadSillas;

    public AutoFamiliar(String marca, String modelo, String color, double precio, Motor motor, int cantidadPuertas, int cantidadSillas) {
        super(marca, modelo, color, precio, motor);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadSillas = cantidadSillas;
    }
    
    
}
