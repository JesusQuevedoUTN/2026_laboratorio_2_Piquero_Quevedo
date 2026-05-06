package com.mycompany.automg;

public class AutoDeportivo extends Auto{
    private boolean turbo;
    private boolean cuatroPorCuatro;

    public AutoDeportivo(String marca, String modelo, String color, double precio, Motor motor, boolean turbo, boolean cuatroPorCuatro) {
        super(marca, modelo, color, precio, motor);
        this.turbo = turbo;
        this.cuatroPorCuatro = cuatroPorCuatro;
    }
    
    
}
