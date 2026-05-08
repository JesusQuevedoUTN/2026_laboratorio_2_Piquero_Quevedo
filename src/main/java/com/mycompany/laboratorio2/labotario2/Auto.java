package com.mycompany.laboratorio2.labotario2;

import javax.swing.JOptionPane;

public class Auto {

    private String marca;
    private String modelo;
    private String color;
    private Motor motor;
    private double precio;

    public Auto(String marca, String modelo, String color, double precio, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.motor = motor;
    }

    public Auto() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precio = 0;
        this.motor = new Motor(0, 0, 0);
    }

    public void avanzar(int km) {
        if (motor.requiereCambioAceite()) {
            JOptionPane.showMessageDialog(null, "El auto necesita cambio de aceite.");
        } else {
            motor.setKilometrosRecorridos(km);
            JOptionPane.showMessageDialog(null, "El auto avanzo " + km + " kilometros");
        }
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, toString() + "\n" + motor.toString());
    }

    @Override
    public String toString() {
        return "Auto{" + "Marca= " + marca + ", Modelo= " + modelo + ", Color= " + color + ", Precio= " + precio + '}';
    }

}
