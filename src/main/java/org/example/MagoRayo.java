package org.example;

public class MagoRayo extends Mago{
    private double probCritico;

    public MagoRayo(String nombre){
        super(nombre,  150, 90, 35, "Rayo");
        this.probCritico = 0.3; // Probabilidad del 30%
    }

    @Override
    public String lanzarHechizo(Mago rival) {
        int dano;
        double r = Math.random();
        if (r < 0.2) {
            return getNombre() + " falló el hechizo!";
        }
        if(r < 1 - probCritico){
            dano = 35;
        }else{
            dano = 70;
        }
        rival.setVida(rival.getVida() - dano);
        String tipo;
        if(dano == 70){
            tipo = " CRITICO!";
        }else{
            tipo = "";
        }
        return getNombre() + " lanza Rayo" + tipo + " (-" + dano + ")";
    }
}
