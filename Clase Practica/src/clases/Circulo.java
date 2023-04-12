package clases;

import interfaces.FiguraGeometrica;
import excepciones.ValorNegativoException;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double coordenadaX;
    private double coordenadaY;

    public Circulo() {
    }

    public Circulo(double radio, double coordenadaX, double coordenadaY) throws ValorNegativoException {
        if(radio < 0 || coordenadaX < 0 || coordenadaY < 0){
            throw new ValorNegativoException("Ninguno de los parámetros puede tener valor negativo.");
        }
        this.radio = radio;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws ValorNegativoException {
        if(radio < 0) {
            throw new ValorNegativoException("El radio no puede tener valor negativo");
        }
        this.radio = radio;
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
        return 2 * Math.PI * this.getRadio();
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" +  this.getRadio() +
                ", coordenadaX=" +  this.getCoordenadaX() +
                ", coordenadaY=" + this.getCoordenadaY() +
                ", perímetro=" + this.calcularPerimetro() +
                ", superficie=" + this.calcularSuperficie() +
                '}';
    }
}
