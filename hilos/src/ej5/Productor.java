package ej5;

import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class Productor implements Callable<Void> {
    private String nombre;
    private Almacenamiento buffer;
    private int cantDeNumerosAProducir;

    public Productor() {
    }

    public Productor(String nombre, Almacenamiento buffer, int cantDeNumerosAProducir) {
        this.nombre = nombre;
        this.buffer = buffer;
        this.cantDeNumerosAProducir = cantDeNumerosAProducir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantDeNumerosAProducir() {
        return cantDeNumerosAProducir;
    }

    public void setCantDeNumerosAProducir(int cantDeNumerosAProducir) {
        this.cantDeNumerosAProducir = cantDeNumerosAProducir;
    }

    public Almacenamiento getBuffer() {
        return buffer;
    }

    public void setBuffer(Almacenamiento buffer) {
        this.buffer = buffer;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0; i < this.getCantDeNumerosAProducir(); i++) {
            int numeroProducido = 3 + (int) (Math.random() * 12);
            this.getBuffer().agregarValor(numeroProducido);
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException("Se interrumpió el programa.");
            }
        }
        return null;
    }
}
