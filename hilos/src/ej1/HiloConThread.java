package ej1;

public class HiloConThread extends Thread {
    private String nombre;
    private int iteraciones = 10 + (int) (Math.random() * 30);
    private int demora = 50 + (int) (Math.random() * 949);

    public HiloConThread() { }

    public HiloConThread(String nombre) {
        this.nombre = nombre;
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

    public int getDemora() {
        return demora;
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

