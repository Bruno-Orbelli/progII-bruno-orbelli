package um.progII.practicoParteII;

import java.util.HashMap;
import java.util.List;

public interface DomicilioRepositorio {
    public Domicilio get(long codigo);
    public void add(Domicilio domicilio);
    public void put(long codigo, HashMap<String, String> modificaciones);
    public void remove(long codigo);
    public void remove(Domicilio domicilio);
    public List<Domicilio> getAll();
}
