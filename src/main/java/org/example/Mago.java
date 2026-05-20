package org.example;

public class Mago {

    private String nombre;
    private int vida;
    private int mana;
    protected int danoBase;
    private String tipo;

    // Metodo constructor

    public Mago(String nombre, int vida, int mana, int danoBase, String tipo){
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
        this.danoBase = danoBase;
        this.tipo = tipo;
    }

    // Metodos Getter y Setter

    public String getNombre() {return nombre;}

    public int getVida() {return vida;}

    public void setVida(int v) {
        if(v >= 0){
            this.vida = v;
        }
    }

    public int getMana() {return mana;}

    public void setMana(int m){
        this.mana = m;
    }

    public int getDanoBase() {return danoBase;}

    public String lanzarHechizo(Mago rival){
        return "";
    }

    public boolean estadoVivo(){

        return vida > 0;
    }

    @Override
    public String toString() {
        return nombre + " | Vida: " + vida + " | Mana: " + mana;
    }
}
