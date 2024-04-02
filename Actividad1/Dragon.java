package Actividad1;

public class Dragon extends Criatura{
    public String toString() {
        return nombre + " escupe fuego";
    }

    public Dragon(String nombre, int edad, int nivelEnergia) {
        super(nombre, edad, nivelEnergia);
    }
}
