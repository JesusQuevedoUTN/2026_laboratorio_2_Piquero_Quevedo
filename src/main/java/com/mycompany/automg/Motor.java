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

    public void sumarKms(int suma){
        this.kilometrosRecorridos+= suma;
    }
    
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    
}
