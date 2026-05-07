package com.mycompany.laboratorio2;

import com.mycompany.laboratorio2.Auto;
import com.mycompany.laboratorio2.laboratorio3.AutoDeportivo;
import com.mycompany.laboratorio2.laboratorio3.AutoFamiliar;
import com.mycompany.laboratorio2.laboratorio3.AutoUtilitario;
import com.mycompany.laboratorio2.Motor;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLab234 {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        //Ejemplos Lab 3
        autos.add(new AutoFamiliar("Toyota","Corolla","Azul",25000,new Motor(50000, 1.8f, 140),4,5));
        autos.add(new AutoDeportivo("Ford", "Mustang", "Rojo", 45000, new Motor(80000, 5.0f, 450), 15000, 2000));
        autos.add(new AutoUtilitario(1500.0, 3.5, "Ford", "Transit", "Blanco", 32000, new Motor(60000, 2.0f, 170)));


        
        //Ejemplos Lab 2
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
