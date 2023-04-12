package clases;

import interfaces.FiguraGeometrica;
import excepciones.ValorNegativoException;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double coordenadaX;
    private double coordenadaY;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double coordenadaX, double coordenadaY) throws ValorNegativoException {
        if(base < 0 || altura < 0 || coordenadaX < 0 || coordenadaY < 0) {
            throw new ValorNegativoException("Ninguno de los parámetros puede tener valor negativo.");
        }
        this.base = base;
        this.altura = altura;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws ValorNegativoException {
        if(base < 0) {
            throw new ValorNegativoException("La base no puede tener valor negativo");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws ValorNegativoException {
        if(altura < 0) {
            throw new ValorNegativoException("La altura no puede tener valor negativo");
        }
        this.altura = altura;
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
    public double calcularSuperficie() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return this.getBase() * 2 + this.getAltura() * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + this.getBase() +
                ", altura=" + this.getAltura() +
                ", coordenadaX=" +  this.getCoordenadaX() +
                ", coordenadaY=" + this.getCoordenadaY() +
                ", perímetro=" + this.calcularPerimetro() +
                ", superficie=" + this.calcularSuperficie() +
                '}';
    }
}
