package clases;
import excepciones.ValorNegativoException;
import interfaces.FiguraGeometrica;

public class Pentagono implements FiguraGeometrica {
    private double lado;
    private double apotema;
    private double coordenadaX;
    private double coordenadaY;

    public Pentagono() {
    }

    public Pentagono(double lado, double apotema, double coordenadaX, double coordenadaY) throws ValorNegativoException {
        if(lado < 0 || apotema < 0 || coordenadaX < 0 || coordenadaY < 0){
            throw new ValorNegativoException("Ninguno de los parámetros puede tener valor negativo.");
        }
        this.lado = lado;
        this.apotema = apotema;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws ValorNegativoException {
        if(lado < 0) {
            throw new ValorNegativoException("El lado no puede tener valor negativo");
        }
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) throws  ValorNegativoException {
        if(apotema < 0) {
            throw new ValorNegativoException("El apotema no puede tener valor negativo");
        }
        this.apotema = apotema;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) throws ValorNegativoException {
        if(coordenadaX < 0) {
            throw new ValorNegativoException("La coordenada X no puede tener valor negativo");
        }
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) throws ValorNegativoException {
        if(coordenadaY < 0) {
            throw new ValorNegativoException("La coordenada Y no puede tener valor negativo");
        }
        this.coordenadaY = coordenadaY;
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado() * 5;
    }

    @Override
    public double calcularSuperficie() {
        return calcularPerimetro() * this.getApotema() / 2;
    }

    @Override
    public String toString() {
        return "Pentagono{" +
                "lado=" + this.getLado() +
                ", apotema=" + this.getApotema() +
                ", coordenadaX=" +  this.getCoordenadaX() +
                ", coordenadaY=" + this.getCoordenadaY() +
                ", perímetro=" + this.calcularPerimetro() +
                ", superficie=" + this.calcularSuperficie() +
                '}';
    }
}
