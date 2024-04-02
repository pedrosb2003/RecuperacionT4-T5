package Actividad1;

public class Mago extends Criatura{
    int nivelMagico;

    public Mago(String nombre, int edad, int nivelEnergia, int nivelMagico) {
        super(nombre, edad, nivelEnergia);
        this.nivelMagico = nivelMagico;
    }

    void realizarAccion() {
        if (nivelMagico >= 50){
            System.out.println(nombre + " lanza un poderoso hechizo");
        } else{
            System.out.println(nombre + " genera una pequeña chispa");
        }
    }

}
