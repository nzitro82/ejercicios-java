package Ejercicio9;

public class Cliente extends Persona{
    private int credito;

    @Override
    public String toString() {
        return "Cliente{" + "edad=" + getEdad() +
                " nombre=" + getNombre() +
                " telefono=" + getTelefono() +
                " credito=" + credito +
                '}';
    }

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente(28, "Natasha", 1122423523,1500);

        System.out.println(cliente.toString());
    }
}
