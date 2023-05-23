package ej4;

import java.util.concurrent.Callable;

public class HiloConCallable implements Callable<Void> {
    private String nombre;
    private int iteraciones;
    private int demora;

    public HiloConCallable() {
    }

    public HiloConCallable(String nombre, int iteraciones, int demora) {
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
    public Void call() throws Exception {
        for(int i = 1; i < this.getIteraciones() + 1; i++) {
            System.out.println(String.format("Este es el hilo '%s' y esta es la iteración %s.", this.getNombre(), i));
            try {
                Thread.sleep(this.getDemora());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
