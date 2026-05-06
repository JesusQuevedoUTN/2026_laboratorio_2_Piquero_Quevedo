package com.mycompany.automg;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoMG {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        autos.add(new Auto("Toyota", "Corolla", "Rojo", 20000, new Motor(50000, 1.8f, 140)));
        autos.add(new Auto("Ford", "Focus", "Azul", 22000, new Motor(30000, 2.0f, 170)));
        autos.add(new Auto("Chevrolet", "Cruze", "Blanco", 21000, new Motor(40000, 1.4f, 150)));
        
        for (int i = 0; i < autos.size(); i++) {
            autos.get(i).mostrarInfo();
        }
        
        System.out.println("Que auto quiere probar: ");
        int num = scan.nextInt();
        System.out.println("Cuanto quiere avanzar: ");
        int distancia = scan.nextInt();
        autos.get(num).avanzar(distancia);
        
    }
}
