package clases;

import excepciones.CantidadDeParametrosIncorrectaException;
import excepciones.ParametroInexistenteException;
import excepciones.ParametroVacíoException;
import excepciones.ValorNegativoException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private int aniosTrabajados;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", aniosTrabajados=" + aniosTrabajados +
                '}';
    }

    public static Empleado construirEmpleado(String strDeParametros) throws CantidadDeParametrosIncorrectaException, ParametroVacíoException, ParametroInexistenteException, ValorNegativoException, NumberFormatException {
        String str = strDeParametros.replaceAll(" ", "");
        String[] pairs = str.split(",");
        ArrayList<String> values = new ArrayList<String>();
        for(String pair: pairs){
            String key = pair.split("=")[0].toLowerCase();
            try {
                String value = pair.split("=")[1];
                if(!(key.equals("nombre") || key.equals("apellido") || key.equals("legajo") || key.equals("aniostrabajados"))) {
                    throw new ParametroInexistenteException("Uno o más de los parámetros especificados no existe en la clase Empleado.");
                }
                values.add(value);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ParametroVacíoException("Uno o más parámetros no tiene ningún valor asociado.");
            }
        }
        if(values.size() < 4) {
            throw new CantidadDeParametrosIncorrectaException("Se han especificado menos parámetros de los requeridos.");
        }
        try {
            if(Integer.valueOf(values.get(3)) < 0) {
                throw new ValorNegativoException("El parámetro 'aniosTrabajados' no puede ser negativo.");
            }
            return new Empleado(values.get(0), values.get(1), values.get(2), Integer.valueOf(values.get(3)));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El String recibido como parámetro no puede convertirse a un Integer.");
        }

    }
}
