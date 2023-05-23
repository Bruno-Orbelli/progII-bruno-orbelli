package ej3;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        //Parte 1

        Almacenamiento buffer = new Almacenamiento(40);

        Productor productorImplementado1 = new Productor("productorImplementado1", buffer, 40);
        Thread h1 = new Thread(productorImplementado1);

        Consumidor consumidorImplementado1 = new Consumidor("consumidorImplementado1", buffer);
        Thread h2 = new Thread(consumidorImplementado1);

        h1.start();
        h2.start();

        System.out.println();

        //Parte 2

        Productor productorImplementado2 = new Productor("productorImplementado2", buffer, 120);
        Thread h3 = new Thread(productorImplementado2);

        Consumidor consumidorImplementado2 = new Consumidor("consumidorImplementado2", buffer);
        Thread h4 = new Thread(consumidorImplementado2);

        Consumidor consumidorImplementado3 = new Consumidor("consumidorImplementado3", buffer);
        Thread h5 = new Thread(consumidorImplementado3);

        Consumidor consumidorImplementado4 = new Consumidor("consumidorImplementado4", buffer);
        Thread h6 = new Thread(consumidorImplementado4);

        h3.start();
        h4.start();
        h5.start();
        h6.start();

    }
}