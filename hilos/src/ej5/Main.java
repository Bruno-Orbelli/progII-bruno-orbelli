package ej5;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.ejecutar();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void ejecutar() throws ExecutionException, InterruptedException {
        // Parte 1

        ExecutorService exService = Executors.newFixedThreadPool(4);

        Almacenamiento buffer = new Almacenamiento(40);

        Productor productorCallable1 = new Productor("productorCallable1", buffer, 40);
        Consumidor consumidorCallable1 = new Consumidor("consumidorCallable1", buffer);

        exService.submit(productorCallable1);
        Future<ArrayList> resultados1 = (Future<ArrayList>) exService.submit(consumidorCallable1);

        ArrayList<Long> factoriales1 = resultados1.get();
        for (long fact: factoriales1) {
            if (fact > 30000000) {
                System.out.println("Al menos uno de los factoriales calculados es mayor a 30.000.000.");
                break;
            }
        }

        exService.shutdown();
        System.out.println();

        //Parte 2

        ExecutorService exService2 = Executors.newFixedThreadPool(4);

        Productor productorCallable2 = new Productor("productorCallable2", buffer, 120);

        Consumidor consumidorCallable2 = new Consumidor("consumidorCallable2", buffer);
        Consumidor consumidorCallable3 = new Consumidor("consumidorCallable3", buffer);
        Consumidor consumidorCallable4 = new Consumidor("consumidorCallable4", buffer);

        exService2.submit(productorCallable2);
        Future<ArrayList> resultados2 = (Future<ArrayList>) exService2.submit(consumidorCallable2);
        Future<ArrayList> resultados3 = (Future<ArrayList>) exService2.submit(consumidorCallable3);
        Future<ArrayList> resultados4 = (Future<ArrayList>) exService2.submit(consumidorCallable4);

        ArrayList<Long> factoriales2 = resultados2.get();
        ArrayList<Long> factoriales3 = resultados3.get();
        ArrayList<Long> factoriales4 = resultados4.get();

        ArrayList<ArrayList> listasFactoriales = new ArrayList<>();
        listasFactoriales.add(factoriales2);
        listasFactoriales.add(factoriales3);
        listasFactoriales.add(factoriales4);

        int i = 0;
        for (ArrayList<Long> arrList : listasFactoriales) {
            i++;
            for (long fact : arrList) {
                if (fact > 30000000) {
                    System.out.println(
                            String.format("Al menos uno de los factoriales calculados del hilo Nº%s es mayor a 30.000.000.", i)
                    );
                    break;
                }
            }
        }

        exService2.shutdown();
    }
}
