package ej2;

public class HiloFactorial implements Runnable {
    private String nombre;
    private int[] valores;

    public HiloFactorial() {
    }

    public HiloFactorial(String nombre, int[] valores) {
        this.nombre = nombre;
        this.valores = valores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }

    @Override
    public void run() {
        int numerosRestantes = this.getValores().length;
        for(int num: this.getValores()) {
            int fact = 1;

            for(int i = 2; i < num + 1; i++) {
                fact = fact * i;
            }

            numerosRestantes--;

            StringBuffer salida = new StringBuffer();
            salida.append("Hilo '" + this.getNombre() + "' procesando la lista. ");
            salida.append("Valor a calcular: " + num + ". ");
            salida.append("Resultado " + fact + ". ");
            salida.append("Quedan " + numerosRestantes + " elementos en la lista por procesar. ");

            System.out.println(salida);
        }
    }
}
