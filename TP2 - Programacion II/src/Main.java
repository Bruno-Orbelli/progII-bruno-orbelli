import java.util.HashSet;
import clases.*;

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

        //Ejercicio 2 y 3



    }
}