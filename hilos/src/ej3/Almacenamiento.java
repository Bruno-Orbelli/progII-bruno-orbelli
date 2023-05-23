package ej3;

import java.util.LinkedList;
import java.util.Queue;

public class Almacenamiento {
    private Queue<Integer> buffer;
    private int capacidad;

    public Almacenamiento() {
    }

    public Almacenamiento(int capacidad) {
        this.buffer = new LinkedList<Integer>();
        this.capacidad = capacidad;
    }

    public Queue<Integer> getBuffer() {
        return buffer;
    }

    public void setBuffer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public synchronized void agregarValor(int valor) {
        while(buffer.size() == capacidad) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException("Se interrumpió el programa.");
            }
        }
        this.getBuffer().add(valor);
        System.out.println(String.format("Se agregó el valor '%s' al buffer.", valor));
        notifyAll();
    }

    public synchronized int retirarValor() {
        while(buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException("Se interrumpió el programa.");
            }
        }
        int valor = this.getBuffer().remove();
        System.out.println(String.format("Se consumió el valor %s del buffer.", valor));
        notifyAll();
        return valor;
    }
}
