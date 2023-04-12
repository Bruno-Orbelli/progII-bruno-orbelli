import clases.*;
import excepciones.CantidadDeParametrosIncorrectaException;
import excepciones.ParametroInexistenteException;
import excepciones.ParametroVacíoException;
import excepciones.ValorNegativoException;
import interfaces.FiguraGeometrica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1

        HashSet<Empleado> empleados = new HashSet<Empleado>();

        Empleado emp1 = new Empleado("Pedro", "Rodriguez", "AC45", 10);
        Empleado emp2 = new Empleado("Pedro", "Rodriguez", "AC45", 10);
        Empleado emp3 = new Empleado("Roberto", "González", "DFR5", 12);
        Empleado emp4 = new Empleado("Julián", "Sánchez", "WR98", 4);
        Empleado emp5 = new Empleado("Martín", "Castañeira", "MJ75", 20);

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);

        for(Empleado emp: empleados) {
            System.out.println(emp);
        }

        System.out.println();

        HashSet<EmpleadoSet> empleados2 = new HashSet<EmpleadoSet>();

        EmpleadoSet empS1 = new EmpleadoSet("Pedro", "Rodriguez", "AC45", 10);
        EmpleadoSet empS2 = new EmpleadoSet("Pedro", "Rodriguez", "AC45", 10);
        EmpleadoSet empS3 = new EmpleadoSet("Roberto", "González", "DFR5", 12);
        EmpleadoSet empS4 = new EmpleadoSet("Julián", "Sánchez", "WR98", 4);
        EmpleadoSet empS5 = new EmpleadoSet("Martín", "Castañeira", "MJ75", 20);

        if(!empleados2.contains(empS1)) {
            empleados2.add(empS1);
        }
        if(!empleados2.contains(empS2)) {
            empleados2.add(empS2);
        }
        if(!empleados2.contains(empS3)) {
            empleados2.add(empS3);
        }
        if(!empleados2.contains(empS4)) {
            empleados2.add(empS4);
        }
        if(!empleados2.contains(empS5)) {
            empleados2.add(empS5);
        }

        for(EmpleadoSet emp: empleados2) {
            System.out.println(emp);
        }

        System.out.println();

        //Ejercicio 4 y 5

        ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

        try {
            figuras.add(new Circulo(3, 2, 1));
            figuras.add(new Rectangulo(10.23, 12.035, 9, 23));
            figuras.add(new Pentagono(5, 2.24, 7.56, 1.23));
            figuras.add(new Rectangulo(4, 10.1212, 8.92, 0.12));
            figuras.add(new Circulo(8.6, 4, 5));
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }


        for(FiguraGeometrica f: figuras){
            System.out.println(f);
        }

        System.out.println();

        //Excepciones circulo

        try {
            Circulo circulo1 = new Circulo(-2, 8, -9);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Circulo circulo1 = new Circulo(5, 12, 23);
            circulo1.setRadio(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Circulo circulo1 = new Circulo(5, 12, 23);
            circulo1.setCoordenadaX(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Circulo circulo1 = new Circulo(5, 12, 23);
            circulo1.setCoordenadaY(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        System.out.println();

        //Excepciones rectángulo

        try {
            Rectangulo rectangulo1 = new Rectangulo(-2, -5.2, 8, -9);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulo1 = new Rectangulo(32, 6.82, 8, 1);
            rectangulo1.setBase(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulo1 = new Rectangulo(32, 6.82, 8, 1);
            rectangulo1.setAltura(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulo1 = new Rectangulo(32, 6.82, 8, 1);
            rectangulo1.setCoordenadaX(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulo1 = new Rectangulo(32, 6.82, 8, 1);
            rectangulo1.setCoordenadaY(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        System.out.println();

        //Excepciones pentágono

        try {
            Pentagono pentagono1 = new Pentagono(-7, -4.21, -5, 1);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagono1 = new Pentagono(5, 9.34, 10, 11);
            pentagono1.setLado(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagono1 = new Pentagono(5, 9.34, 10, 11);
            pentagono1.setApotema(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagono1 = new Pentagono(5, 9.34, 10, 11);
            pentagono1.setCoordenadaX(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagono1 = new Pentagono(5, 9.34, 10, 11);
            pentagono1.setCoordenadaY(-4);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        System.out.println();

        //Ejercicio 6

        ArrayList<Empleado> empleados3 = new ArrayList<Empleado>();

        Empleado emp6 = new Empleado("Pedro", "Rodriguez", "AC45", 10);
        Empleado emp7 = new Empleado("Pedro", "Rodriguez", "AC45", 10);
        Empleado emp8 = new Empleado("Roberto", "González", "DFR5", 12);
        Empleado emp9 = new Empleado("Julián", "Sánchez", "WR98", 4);
        Empleado emp10 = new Empleado("Martín", "Castañeira", "MJ75", 20);

        empleados3.add(emp6);
        empleados3.add(emp7);
        empleados3.add(emp8);
        empleados3.add(emp9);
        empleados3.add(emp10);

        HashMap<String, Empleado> mapaEmpleados = new HashMap<String, Empleado>();

        for(Empleado emp: empleados2){
            mapaEmpleados.put(emp.getApellido() + ", " + emp.getNombre(), emp);
        }

        mapaEmpleados.forEach((clave, valor) -> System.out.println(clave + " = " + valor));

        System.out.println();

        //Ejercicio 7

        try {
            Empleado empleado = Empleado.construirEmpleado("NoMBRe=Juan,       aPElliDo =  Márquez   , LeGajo=ED2E,   anIOsTrAbAjAdos    = 45");
            System.out.println(empleado);
        } catch (CantidadDeParametrosIncorrectaException | ParametroVacíoException |
                 ParametroInexistenteException | ValorNegativoException | NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println();

        //Excepciones

        try {
            Empleado empleado = Empleado.construirEmpleado("NoMBRe=Juan,       aPElliDo =  Márquez   , LeGajo=ED2E");
            System.out.println(empleado);
        } catch (CantidadDeParametrosIncorrectaException | ParametroVacíoException |
                 ParametroInexistenteException | ValorNegativoException | NumberFormatException e) {
            System.out.println(e);
        }

        try {
            Empleado empleado = Empleado.construirEmpleado("NoMBRe=,       aPElliDo =  Márquez   , LeGajo=ED2E, anIOsTrAbAjAdos   = 45");
            System.out.println(empleado);
        } catch (CantidadDeParametrosIncorrectaException | ParametroVacíoException |
                 ParametroInexistenteException | ValorNegativoException | NumberFormatException e) {
            System.out.println(e);
        }

        try {
            Empleado empleado = Empleado.construirEmpleado("NoMBe=Juan,       aP5liDo =  Márquez   , LeGadso=ED2E,   anIOsTrAbAjA1w1wdos    = 45");
            System.out.println(empleado);
        } catch (CantidadDeParametrosIncorrectaException | ParametroVacíoException |
                 ParametroInexistenteException | ValorNegativoException | NumberFormatException e) {
            System.out.println(e);
        }

        try {
            Empleado empleado = Empleado.construirEmpleado("NoMBRe=Juan,       aPElliDo =  Márquez   , LeGajo=ED2E,   anIOsTrAbAjAdos    = -45");
            System.out.println(empleado);
        } catch (CantidadDeParametrosIncorrectaException | ParametroVacíoException |
                 ParametroInexistenteException | ValorNegativoException | NumberFormatException e) {
            System.out.println(e);
        }

        try {
            Empleado empleado = Empleado.construirEmpleado("NoMBRe=Juan,       aPElliDo =  Márquez   , LeGajo=ED2E,   anIOsTrAbAjAdos    = fef3");
            System.out.println(empleado);
        } catch (CantidadDeParametrosIncorrectaException | ParametroVacíoException |
                 ParametroInexistenteException | ValorNegativoException | NumberFormatException e) {
            System.out.println(e);
        }

    }
}