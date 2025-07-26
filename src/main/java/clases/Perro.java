package clases;


public class Perro extends Mascota implements Vacunable {

    @Override
    public void hacerSonido() {
        System.out.println("El perro te saluda.");
    }

    @Override
    public void vacunar() {
        System.out.println("El perro ha sido vacunado.");
    }
}
