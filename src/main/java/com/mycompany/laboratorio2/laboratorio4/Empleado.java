package com.mycompany.laboratorio2.laboratorio4;

// Autor: Chisus
// Fecha de creación: 07/05/2026
abstract public class Empleado {

    private static int nroDeLegajo = 1;

    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private int codigoEmpleado;
    private double sueldoBasico;

    public Empleado(String nombre, String apellido, int dni, String email, double sueldoBasico) {
        this.codigoEmpleado = nroDeLegajo;
        nroDeLegajo++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.sueldoBasico = sueldoBasico;
    }

    public abstract double calcularSueldo();

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("ID:" + codigoEmpleado);
        System.out.println("e-mail: " + email);
        System.out.println("Sueldo: $" + sueldoBasico);
    }

}
