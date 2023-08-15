package um.progII.practicoParteI;

import org.springframework.beans.factory.annotation.Autowired;

public class Arranque {

    @Autowired
    MathService servicio;

    @Autowired
    Config mathConfig;

    public void arranque() {
        System.out.println("Calculando 5 elevado a la 3...");
        System.out.println(String.format("Resultado: %s", this.servicio.pow(5.0, 3.0)));

        System.out.println("Calculando 4 elevado a la 12...");
        System.out.println(String.format("Resultado: %s", this.servicio.pow(4.0, 12.0)));

        System.out.println(String.format("Calculando 8 elevado al valor por defecto (%s)...", mathConfig.getDefExp()));
        System.out.println(String.format("Resultado: %s", this.servicio.pow(8.0)));

        System.out.println(String.format("Calculando 3 elevado al valor por defecto (%s)...", mathConfig.getDefExp()));
        System.out.println(String.format("Resultado: %s", this.servicio.pow(3.0)));

        System.out.println();

        System.out.println("Calculando la raíz cúbica de 125");
        System.out.println(String.format("Resultado: %s", this.servicio.root(125.0, 3.0)));

        System.out.println("Calculando la raíz cuadrada de 7");
        System.out.println(String.format("Resultado: %s", this.servicio.root(7.0, 2.0)));

        System.out.println(String.format("Calculando la raíz de 4 con el valor por defecto (%s)...", mathConfig.getDefIndex()));
        System.out.println(String.format("Resultado: %s", this.servicio.root(4.0)));

        System.out.println(String.format("Calculando la raíz de 16 con el valor por defecto (%s)...", mathConfig.getDefIndex()));
        System.out.println(String.format("Resultado: %s", this.servicio.pow(16.0)));
    }
}

