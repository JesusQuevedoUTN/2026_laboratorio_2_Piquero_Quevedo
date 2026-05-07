package com.mycompany.automg;

import javax.swing.JOptionPane;

public class AutoDeportivo extends Auto{
    private double velociadaMaxima;
    private double aceleracionACien;

    public AutoDeportivo(String marca, String modelo, String color, double precio, Motor motor, double velociadaMaxima, double aceleracionACien) {
        super(marca, modelo, color, precio, motor);
        this.velociadaMaxima = velociadaMaxima;
        this.aceleracionACien = aceleracionACien;
    }

    public double getVelociadaMaxima() {
        return velociadaMaxima;
    }

    public void setVelociadaMaxima(double velociadaMaxima) {
        this.velociadaMaxima = velociadaMaxima;
    }

    public double getAceleracionACien() {
        return aceleracionACien;
    }

    public void setAceleracionACien(double aceleracionACien) {
        this.aceleracionACien = aceleracionACien;
    }

    
    
    
    
    @Override
    public String toString() {
        return super.toString() + ", AutoDeportivo{" + "velociadaMaxima=" + velociadaMaxima + ", aceleracionACien=" + aceleracionACien + '}';
    }
    
    
}
