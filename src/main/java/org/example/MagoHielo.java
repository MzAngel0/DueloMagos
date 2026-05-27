package org.example;

public class MagoHielo extends Mago{

    private int turnoCongelado;

    public MagoHielo(String nombre){
        super(nombre, 90, 75, 25, "Hielo");

        this.turnoCongelado = 0;
    }

    @Override
    public String lanzarHechizo(Mago rival) {
        rival.setVida(rival.getVida() - 30);
        // 40% de probabilidad de congelar
        if (Math.random() < 0.4) {
            turnoCongelado = 1;
        }
        return getNombre() + " lanza Ventisca! (-30 vida)";
    }
    public int getTurnoCongelado() { return turnoCongelado; }

    public void setTurnoCongelado(int t) { this.turnoCongelado = t; }
}
