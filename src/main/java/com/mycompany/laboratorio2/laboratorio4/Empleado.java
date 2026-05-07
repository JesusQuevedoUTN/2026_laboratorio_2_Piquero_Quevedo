package com.mycompany.laboratorio2.laboratorio4;

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

    public static int getNroDeLegajo() {
        return nroDeLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public static void setNroDeLegajo(int nroDeLegajo) {
        Empleado.nroDeLegajo = nroDeLegajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

}
