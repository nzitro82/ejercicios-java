package ejercicio3;

public class Coche {
    private int cantPuertas;

    public Coche(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public void incrementarPuerta() {
        this.cantPuertas += 1;
    }

    public static void main(String[] args) {
        Coche coche = new Coche(4);

        coche.incrementarPuerta();

        System.out.println("Cantidad de puertas del coche " + coche.cantPuertas);
    }
}
