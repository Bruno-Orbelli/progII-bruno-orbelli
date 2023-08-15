package um.progII.practicoParteII;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PersonaMemoriaService implements PersonaRepositorio {
    private Map<Long,Persona> personas;
    public PersonaMemoriaService() { this.personas = new HashMap<>(); }

    @Override
    public Persona get(long codigo) {
        Persona p = this.personas.get(codigo);
        return p;
    }

    @Override
    public void add(Persona p) {
        this.personas.put(p.getCodigo(), p);
    }

    @Override
    public void put(Persona persona, HashMap<String, String> modificaciones) {
        for (Map.Entry<String, String> set: modificaciones.entrySet()) {
            if (set.getKey().equals("nombre")) {
                persona.setNombre(set.getValue());
            } else if (set.getKey().equals("apellido")) {
                persona.setApellido(set.getKey());
            } else if (set.getKey().equals("codigo")) {
                long codigoViejo = persona.getCodigo();
                persona.setCodigo(Long.getLong(set.getValue()));
                this.add(persona);
                personas.remove(codigoViejo);
            }
        }
    }

    @Override
    public void remove(long codigo) {
        this.personas.remove(codigo);
    }

    @Override
    public void remove(Persona persona) {
        this.personas.remove(persona.getCodigo());
    }

    @Override
    public List<Persona> getAll() {
        List<Persona> personas;
        personas = this.personas.values().stream().collect(Collectors.toCollection(ArrayList::new));
        return personas;
    }
}

