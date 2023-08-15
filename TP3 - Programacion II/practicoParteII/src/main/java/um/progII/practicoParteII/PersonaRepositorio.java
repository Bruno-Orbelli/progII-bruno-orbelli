package um.progII.practicoParteII;

import java.util.HashMap;
import java.util.List;

public interface PersonaRepositorio {
    public Persona get(long codigo);
    public void add(Persona persona);
    public void put(long codigo, HashMap<String, String> modificaciones);
    public void remove(long codigo);
    public void remove(Persona persona);
    public List<Persona> getAll();
}
