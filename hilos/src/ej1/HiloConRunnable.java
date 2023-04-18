package ej1;

public class HiloConRunnable implements Runnable {
    private String nombre;
    private int iteraciones;
    private int demora;

    public HiloConRunnable() {
    }

    public HiloConRunnable(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        if(demora < 50 || demora > 999) {
            throw new RuntimeException("El valor de la demora debe encontrarse entre 50 y 999ms.");
        }
        this.demora = demora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        if(demora < 50 || demora > 999) {
            throw new RuntimeException("El valor de la demora debe encontrarse entre 50 y 999ms.");
        }
        this.demora = demora;
    }

    @Override
    public void run() {
        for(int i = 1; i < this.getIteraciones() + 1; i++) {
            System.out.println(String.format("Este es el hilo '%s' y esta es la iteración %s.", this.getNombre(), i));
            try {
                Thread.sleep(this.getDemora());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
