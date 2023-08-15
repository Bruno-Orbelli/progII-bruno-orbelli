package um.progII.practicoParteII;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/persona/")
public class DomicilioController {

    @Autowired
    PersonaRepositorio personas;

    @GetMapping("/{codigo}")
    public Persona get(@PathVariable long codigo) {
        Persona p = this.personas.get(codigo);
        return p;
    }

    @GetMapping
    public List<Persona> getAll() {
        List<Persona> personas = this.personas.getAll();
        return personas;
    }

    @PostMapping
    public Persona post(@RequestBody Persona persona) {
        this.personas.add(persona);
        return persona;
    }

    @DeleteMapping("/{codigo}")
    public void deleteWithCode(@PathVariable long codigo) {
        this.personas.remove(codigo);
    }

    @DeleteMapping
    public void deleteWithPersona(@RequestBody Persona persona) {
        this.personas.remove(persona);
    }

    @PutMapping("/{codigo}")
    public Persona put(@PathVariable long codigo, @RequestBody HashMap<String, String> modificaciones) {
        this.personas.put(codigo, modificaciones);
        return personas.get(codigo);
    }
}

