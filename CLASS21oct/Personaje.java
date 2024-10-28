import java.util.Random;
import java.util.Scanner;

class Personaje {
    private String nombre;
    private int puntosDeVida; 
    private int incremetarPuntosDeVida; 
    private final int MAX_DAÑO = 30;
    private final int MIN_DAÑO = 10;

    public Personaje (String nombre){
        this.nombre = nombre;
        this.puntosDeVida = 100;
       
    }
    public void atacar (Personaje oponente) {
        Random rand = new Random();
        final int daño = rand.nextInt ((MAX_DAÑO - MIN_DAÑO) + 1) + MIN_DAÑO;
        oponente.recibirDaño (daño);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causado " + daño + " puntos de daño. "); }

        public void recibirDaño(int daño) {
            this.puntosDeVida -= daño;
            if (this.puntosDeVida < 0){
                this.puntosDeVida = 0;
                if (this.incremetarPuntosDeVida > 20) {
                }
                
            }

        }
        public boolean estaVivo () {
            return this.puntosDeVida > 0;
        }
        public String getNombre () {
            return this.nombre; 
        }
        public String AsignarArma () {
            String arma = (" llamada tridente de poseidon. ");
            return arma; 
        }
        public int getPuntosDeVida () {
            return this.puntosDeVida;
        }
            public int getIncrementarPuntosDeVida () {
                return this.incremetarPuntosDeVida;
    }

}

