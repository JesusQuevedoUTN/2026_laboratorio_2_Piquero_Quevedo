package com.mycompany.laboratorio2.laboratorio3;

import com.mycompany.laboratorio2.Auto;
import com.mycompany.laboratorio2.Motor;
import javax.swing.JOptionPane;


public class AutoFamiliar extends Auto{
    private int cantidadPuertas;
    private int cantidadSillas;
    Auto auto = new Auto();

    public AutoFamiliar(String marca, String modelo, String color, double precio, Motor motor, int cantidadPuertas, int cantidadSillas) {
        super(marca, modelo, color, precio, motor);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadSillas = cantidadSillas;
    }
    
  @Override
  public void avanzar(int km){
      auto.avanzar(km);
  }  

    @Override
    public String toString() {
        return super.toString();
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public void setCantidadSillas(int cantidadSillas) {
        this.cantidadSillas = cantidadSillas;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void revisarCantidadPuertas(){
        if(cantidadPuertas < 2 || cantidadPuertas > 4){
            JOptionPane.showMessageDialog(null,"El auto tiene una cantidad de puertas invalida");
        }
    }
    
    public void revisarCantidadSillas(){
        if(cantidadSillas < 2 || cantidadSillas > 5){
            JOptionPane.showMessageDialog(null,"El auto tiene una cantidad de sillas invalida");
        }
    }
    
  
    
}
