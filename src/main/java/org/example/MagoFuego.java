package org.example;

public class MagoFuego extends Mago{

    private int danoFuego;


    public MagoFuego(String nombre) {
        super(nombre, 100, 80, 40, "Fuego");
        this.danoFuego = 45;
    }

    @Override
    public String lanzarHechizo(Mago rival) {
        rival.setVida(rival.getVida() - danoFuego);
        return getNombre() + " LANZÓ UNA BOLA DE FUEGO! ";
    }
}
