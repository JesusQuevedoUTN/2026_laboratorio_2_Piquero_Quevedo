package com.mycompany.laboratorio2.laboratorio4;

import com.mycompany.laboratorio2.laboratorio3.AutoDeportivo;
import com.mycompany.laboratorio2.laboratorio3.AutoFamiliar;
import com.mycompany.laboratorio2.laboratorio3.AutoUtilitario;
import com.mycompany.laboratorio2.labotario2.Auto;
import com.mycompany.laboratorio2.labotario2.Motor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainLab4 {

    public static void main(String[] args) {

        ArrayList<Auto> autosStock = new ArrayList();
        ArrayList<Auto> autosVendidos = new ArrayList();

        autosStock.add(new AutoFamiliar("Toyota", "Corolla", "Azul", 25000, new Motor(50000, 1.8f, 140), 4, 5));
        autosStock.add(new AutoDeportivo("Ford", "Mustang", "Rojo", 45000, new Motor(80000, 5.0f, 450), 15000, 2000));
        autosStock.add(new AutoUtilitario("Ford", "Transit", "Blanco", 32000, new Motor(60000, 2.0f, 170), 1500.0, 3.5));

        // 1. Crear las listas de empleados
        ArrayList<Administrativo> listaAdmin = new ArrayList<>();
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        Gerente jefe = new Gerente("Jefe", "Jefazo", 123456789, "jefecito@gmail.com", 1000000, 100000);

        // 2. Cargar 2 Administrativos
        Administrativo pedro = new Administrativo("Pedro", "Rodríguez", 32456789, "p.rodriguez@empresa.com", 420000.0, 5);
        Administrativo lucia = new Administrativo("Lucía", "Martínez", 35987654, "l.martinez@empresa.com", 480000.0, 12);
        listaAdmin.add(pedro);
        listaAdmin.add(lucia);

        // 3. Cargar 3 Vendedores
        Vendedor roberto = new Vendedor("Roberto", "Sánchez", 28111222, "roberto.s@ventas.com", 300000.0, 3);
        Vendedor marta = new Vendedor("Marta", "López", 40333444, "marta.l@ventas.com", 300000.0, 5);
        Vendedor sofia = new Vendedor("Sofía", "Díaz", 41777888, "s.diaz@ventas.com", 300000.0, 8);
        listaVendedores.add(roberto);
        listaVendedores.add(marta);
        listaVendedores.add(sofia);

        // Cargar
        jefe.agregarEmpleado(listaAdmin, listaVendedores);

        // Carga de autos y venta
        Auto autoAVender = new Auto();
        lucia.cargarAuto(autosStock, autoAVender);
        roberto.venderAuto(autosStock, autosVendidos, autoAVender);

        // Simular avance
        for (Auto stock : autosStock) {
            String lectura = JOptionPane.showInputDialog("¿Cuántos kilómetros quiere avanzar?");
            int distancia = Integer.parseInt(lectura);
            stock.avanzar(distancia);
        }

        // Mostrar sutos
        for (Auto stock : autosStock) {
            stock.mostrarInfo();
        }
        for (Auto vendidos : autosVendidos) {
            vendidos.mostrarInfo();
        }

        // Mostrar empleados
        jefe.mostrarInformacion();
        for (Administrativo administrativo : listaAdmin) {
            administrativo.mostrarInformacion();
        }
        for (Vendedor vendedor : listaVendedores) {
            vendedor.mostrarInformacion();
        }

    }
}
