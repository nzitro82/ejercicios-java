package Ejercicio9;

public class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public String toString() {
        return "Cliente{" + "edad=" + getEdad() +
                " nombre=" + getNombre() +
                " telefono=" + getTelefono() +
                " salario=" + salario +
                '}';
    }

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador(35, "Carlos", 1122432342, 150000);
        System.out.println(trabajador);

    }
}
