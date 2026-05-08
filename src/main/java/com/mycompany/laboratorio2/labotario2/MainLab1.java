package com.mycompany.laboratorio2.labotario2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainLab1 {

    public static void main(String[] args) {
        //CREAMOS ARRAY DE AUTOS
        ArrayList<Auto> autos = new ArrayList();
        
        //METEMOS LOS AUTOS
        autos.add(new Auto("Toyota", "Corolla", "Rojo", 20000, new Motor(50000, 1.8f, 140)));
        autos.add(new Auto("Ford", "Focus", "Azul", 22000, new Motor(30000, 2.0f, 170)));
        autos.add(new Auto("Chevrolet", "Cruze", "Blanco", 21000, new Motor(40000, 1.4f, 150)));
        
        for (Auto auto: autos){
            //MOSTRAMOS
            auto.mostrarInfo();
            
            //USAMOS EL JOPTIONPANE PARA PEDIR KMS, Y UN INTEGER PARA PASARLO A INT, FINALMENTE, AVANZAMOS
            String lectura = JOptionPane.showInputDialog("¿Cuántos kilómetros quiere avanzar?");
            int distancia = Integer.parseInt(lectura);
            auto.avanzar(distancia);
            
            //SE MUESTRA CON EL CAMBIO HECHO, AHORA SI SE PASA DE 100000 NO SE PODRÁ AVANZAR
            auto.mostrarInfo();
        }
        
    }
}
