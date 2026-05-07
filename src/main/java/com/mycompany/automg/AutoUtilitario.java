package com.mycompany.automg;

import javax.swing.JOptionPane;


public class AutoUtilitario extends Auto{
    
    private final double MAXIMA_CARGA   = 4000;
    private final double MAXIMO_VOLUMEN = 20;
    
    private double capacidadDeCarga;
    private double volumenCarga;

    public AutoUtilitario(double capacidadDeCarga, double volumenCarga, String marca, String modelo, String color, double precio, Motor motor) {
        super(marca, modelo, color, precio, motor);
        this.capacidadDeCarga = capacidadDeCarga;
        this.volumenCarga = volumenCarga;
    }

    public AutoUtilitario(double capacidadDeCarga, double volumenCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
        this.volumenCarga = volumenCarga;
    }

    

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(double volumenCarga) {
        this.volumenCarga = volumenCarga;
    }

    @Override
    public void avanzar(int km){
        if(this.capacidadDeCarga >= MAXIMA_CARGA){
            JOptionPane.showMessageDialog(null, "El camión no puede llevar algo tan pesado." + "\n" + "PESO MÁXIMO: " + MAXIMA_CARGA);
        }else if (this.volumenCarga >= MAXIMO_VOLUMEN){
            JOptionPane.showMessageDialog(null, "El camión no puede llevar algo tan grande." + "\n" + "VOLUMEN MÁXIMO: " + MAXIMO_VOLUMEN);
        }else{
            super.avanzar(km);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ", AutoUtilitario{" + "capacidadDeCarga=" + capacidadDeCarga + ", volumenCarga=" + volumenCarga + '}';
    }
    
    
    
    
}
