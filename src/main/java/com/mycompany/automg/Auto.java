package com.mycompany.automg;

import javax.swing.JOptionPane;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private Motor motor;

    public Auto(String marca, String modelo, String color, double precio, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
    }
    
    public void avanzar(int km){
        if(motor.requiereCambioAceite()){
            JOptionPane.showMessageDialog(null, "El auto necesita cambio de aceite.");
        }else{
           motor.sumarKms(km);
            System.out.println("El auto avanzo " + km + " kilometros");
        }
    }

    public void mostrarAuto(){
         JOptionPane.showMessageDialog(null, toString() + "\n" + motor.toString());
    }
    
    @Override
    public String toString() {
        return "Auto{" + "Marca= " + marca + ", Modelo= " + modelo + ", Color= " + color + ", Precio= " + precio + '}';
    }
    
    
}
