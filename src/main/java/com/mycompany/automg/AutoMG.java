package com.mycompany.automg;

import java.util.ArrayList;

public class AutoMG {

    public static void main(String[] args) {
        ArrayList autos = new ArrayList();
        
        autos.add(new Auto("Toyota", "Corolla", "Rojo", 20000, new Motor(50000, 1.8f, 140)));
        autos.add(new Auto("Ford", "Focus", "Azul", 22000, new Motor(30000, 2.0f, 170)));
        autos.add(new Auto("Chevrolet", "Cruze", "Blanco", 21000, new Motor(40000, 1.4f, 150)));
        
        
    }
}
