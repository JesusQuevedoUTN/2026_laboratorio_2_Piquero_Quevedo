package com.mycompany.automg;

public class Motor {
    private final int CAMBIO_DE_ACEITE = 1000000;
    
    private int kilometrosRecorridos;
    private float cilindrada;
    private int caballosFuerza;

    public Motor(int kilometrosRecorridos, float cilindrada, int caballosFuerza) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cilindrada = cilindrada;
        this.caballosFuerza = caballosFuerza;
    }
    
    public boolean requiereCambioAceite(){
        return this.kilometrosRecorridos > CAMBIO_DE_ACEITE;
    }

    
}
