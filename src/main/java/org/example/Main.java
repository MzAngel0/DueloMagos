package org.example;
public class Main {
    public static void main(String[] args) {

        // Demostración de polimorfismo
        Mago[] magos = {
                new MagoFuego("Melchor"),
                new MagoHielo("Gaspar"),
                new MagoRayo("Baltasar")
        };

        Mago objetivo = new MagoFuego("Dummy");
        for (Mago m : magos) {
            System.out.println(m.lanzarHechizo(objetivo));
        }

        System.out.println("--------COMBATE REAL--------");

        // Duelo: MagoFuego vs MagoHielo
        Mago mago1 = new MagoFuego("Melchor");
        Mago mago2 = new MagoHielo("Gaspar");
        boolean mago1Congelado = false;
        int turno = 1;
        int turnosMaximos = 15;

        while (mago1.estadoVivo() && mago2.estadoVivo() && turno <= turnosMaximos) {
            System.out.println("--- Turno " + turno++ + " ---");

            // Turno de mago1
            if (mago1Congelado) {
                System.out.println(mago1.getNombre() + " está congelado! Pierde su turno.");
                mago1Congelado = false;
            } else {
                System.out.println(mago1.lanzarHechizo(mago2));
                if (!mago2.estadoVivo()) break;
            }

            // Turno de mago2
            System.out.println(mago2.lanzarHechizo(mago1));
            if (!mago1.estadoVivo()) break;

            // Verificar si mago2 congeló a mago1
            if (mago2 instanceof MagoHielo) {
                MagoHielo hielo = (MagoHielo) mago2;
                if (hielo.getTurnoCongelado() > 0) {
                    mago1Congelado = true;
                    hielo.setTurnoCongelado(0);
                }
            }
        }

        // Determinar ganador
        if (!mago1.estadoVivo() && !mago2.estadoVivo()) {
            System.out.println("¡Empate!");
        } else if (turno > turnosMaximos) {
            System.out.println("¡Límite de turnos! Sin ganador.");
        } else {
            Mago ganador = mago1.estadoVivo() ? mago1 : mago2;
            System.out.println(ganador.getNombre() + " gana el duelo!");
        }
    }
}