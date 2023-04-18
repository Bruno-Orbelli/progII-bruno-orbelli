package ej1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        ArrayList<Thread> hilos = new ArrayList<Thread>();

        hilos.add(new HiloConThread("HiloExtendido1"));
        hilos.add(new HiloConThread("HiloExtendido2"));
        hilos.add(new HiloConThread("HiloExtendido3"));
        hilos.add(new HiloConThread("HiloExtendido4"));

        HiloConRunnable hImplements1 = new HiloConRunnable("HiloImplementado1", 10, 400);
        HiloConRunnable hImplements2 = new HiloConRunnable("HiloImplementado2", 16, 125);
        HiloConRunnable hImplements3 = new HiloConRunnable("HiloImplementado3", 22, 566);
        HiloConRunnable hImplements4 = new HiloConRunnable("HiloImplementado4", 18, 767);

        hilos.add(new Thread(hImplements1));
        hilos.add(new Thread(hImplements2));
        hilos.add(new Thread(hImplements3));
        hilos.add(new Thread(hImplements4));

        for(Thread hilo: hilos) {
            hilo.start();
        }
    }
}