package com.mycompany.laboratorio2.laboratorio3;

import com.mycompany.laboratorio2.labotario2.Auto;
import com.mycompany.laboratorio2.labotario2.Motor;
import java.util.ArrayList;

public class MainLab3 {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList();

        //Ejemplos Lab 3
        autos.add(new AutoFamiliar("Toyota", "Corolla", "Azul", 25000, new Motor(50000, 1.8f, 140), 4, 5));
        autos.add(new AutoDeportivo("Ford", "Mustang", "Rojo", 45000, new Motor(80000, 5.0f, 450), 15000, 2000));
        autos.add(new AutoUtilitario("Ford", "Transit", "Blanco", 32000, new Motor(60000, 2.0f, 170), 1500.0, 3.5));

        for (Auto auto : autos) {
            auto.mostrarInfo();
        }

    }
}
