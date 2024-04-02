package Actividad1;

public class Elfo extends Criatura{
    public String toString() {
        return nombre + " dispara una flecha magica";
    }

    public Elfo(String nombre, int edad, int nivelEnergia) {
        super(nombre, edad, nivelEnergia);
    }
}
