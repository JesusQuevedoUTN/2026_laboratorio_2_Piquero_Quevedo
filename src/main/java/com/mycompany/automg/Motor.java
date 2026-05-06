package com.mycompany.automg;

public class Motor {
    private int kilometrosRecorridos;
    private float cilindrada;
    private int caballosFuerza;

    public Motor(int kilometrosRecorridos, float cilindrada, int caballosFuerza) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cilindrada = cilindrada;
        this.caballosFuerza = caballosFuerza;
    }
    
    public boolean requiereCambioAceite(){
        
        return true;
    }

    
}
