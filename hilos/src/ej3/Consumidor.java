package ej3;

import static java.lang.Thread.sleep;

public class Consumidor implements Runnable {
    private String nombre;
    private Almacenamiento buffer;

    public Consumidor() {
    }

    public Consumidor(String nombre, Almacenamiento buffer) {
        this.nombre = nombre;
        this.buffer = buffer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Almacenamiento getBuffer() {
        return buffer;
    }

    public void setBuffer(Almacenamiento buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int cantDeNumeros = this.buffer.getCapacidad();
        for(int i = 0; i < cantDeNumeros; i++) {
            long fact = 1, num = this.buffer.retirarValor();

            for(int j = 2; j < num + 1; j++) {
                fact = fact * j;
            }

            StringBuffer salida = new StringBuffer();
            salida.append("Hilo '" + this.getNombre() + "' procesando el buffer. ");
            salida.append("Valor a calcular: " + num + ". ");
            salida.append("Resultado " + fact + ". ");
            salida.append("Se procesará/n " + (cantDeNumeros - i - 1) + " elemento/s más. ");

            System.out.println(salida);

            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException("Se interrumpió el programa.");
            }
        }
    }
}
