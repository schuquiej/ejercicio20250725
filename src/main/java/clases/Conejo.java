package clases;


public class Conejo extends Mascota implements AtencionEspecial {

    @Override
    public void hacerSonido() {
        System.out.println("El conejo saluda.");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("El conejo recibe terapia.");
    }
}