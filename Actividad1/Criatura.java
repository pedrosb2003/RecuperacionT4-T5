package Actividad1;

public abstract class Criatura {
    String nombre;
    int edad;
    int nivelEnergia;

    public Criatura() {
    }

    public Criatura(String nombre, int edad) throws Exception{
        this.nombre = nombre;
        this.edad = edad;
        /*Exception e1 = new Exception("La edad no puede ser 0 o menor");
        if (edad == 0){
            throw e1;
        }*/
    }

    public Criatura(String nombre, int edad, int nivelEnergia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEnergia = nivelEnergia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    void realizarAccion(){

    }

}
