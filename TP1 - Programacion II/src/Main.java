import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.crearPersonas();
    }

    public static void crearPersonas() {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Juan");
        nombres.add("Matías");
        nombres.add("Gonzalo");
        nombres.add("Julieta");
        nombres.add("Romina");

        ArrayList<String> apellidos = new ArrayList<String>();

        apellidos.add("González");
        apellidos.add("Juárez");
        apellidos.add("Bernardi");
        apellidos.add("Martínez");
        apellidos.add("Holms");

        ArrayList<Persona> personas = new ArrayList<Persona>();

        for(int i = 0; i < 5; i++) {
            personas.add(new Persona(nombres.get(i), apellidos.get(i), 20 + (int) (Math.random() * 30)));
        }

        System.out.println(personas);

        Persona personaConMayorEdad = new Persona("Prueba", "Prueba", 0);
        for(Persona p: personas) {
            if(p.getEdad() >= personaConMayorEdad.getEdad()) {
                personaConMayorEdad = p;
            }
        }

        System.out.println((String.format("La persona con mayor edad es %s.", personaConMayorEdad)));
    }
}