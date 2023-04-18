package ej2;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        //Parte 1

        int[] numeros = new int[40];
        for(int i = 0; i < 40; i++) {
            numeros[i] = 3 + (int) (Math.random() * 12);
        }

        HiloFactorial hImplementado1 = new HiloFactorial("HiloFactorial1", numeros);
        Thread h1 = new Thread(hImplementado1);

        h1.start();

        System.out.println();

        //Parte 2

        HiloFactorial hImplementado2 = new HiloFactorial("HiloFactorial2", numeros);
        HiloFactorial hImplementado3 = new HiloFactorial("HiloFactorial3", numeros);
        HiloFactorial hImplementado4 = new HiloFactorial("HiloFactorial4", numeros);
        Thread h2 = new Thread(hImplementado2);
        Thread h3 = new Thread(hImplementado3);
        Thread h4 = new Thread(hImplementado4);

        h2.start();
        h3.start();
        h4.start();

    }
}