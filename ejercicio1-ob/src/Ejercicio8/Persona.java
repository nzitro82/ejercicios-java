package Ejercicio8;

public class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + getEdad() +
                ", nombre='" + getNombre() + '\'' +
                ", telefono=" + getTelefono() +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Micaela");
        persona.setTelefono(1124523425);

        System.out.println("Datos de la persona" + persona.toString());
    }
}
