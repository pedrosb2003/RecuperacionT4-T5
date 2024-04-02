package Actividad1;

public class P1Principal {
    public static void main(String[] args) {
        Mago m1 = new Mago("Mago1", 20, 20, 60);
        Mago m2 = new Mago("Mago2", 15, 19, 30);
        Elfo e1 = new Elfo("Elfo1", 2, 10);
        Elfo e2 = new Elfo("Elfo2", 0, 10);
        Dragon d1 = new Dragon("Dragon1", 30, 60);

        System.out.println(m1);
        System.out.println(e1);
        System.out.println(d1);

        m1.realizarAccion();
        m2.realizarAccion();
    }
}
