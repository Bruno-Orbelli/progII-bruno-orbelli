package um.progII.practicoParteII;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/domicilio/")
public class DomicilioController {

    @Autowired
    DomicilioRepositorio domicilios;

    @GetMapping("/{codigo}")
    public Domicilio get(@PathVariable long codigo) {
        Domicilio d = this.domicilios.get(codigo);
        return d;
    }

    @GetMapping
    public List<Domicilio> getAll() {
        List<Domicilio> doms = this.domicilios.getAll();
        return doms;
    }

    @PostMapping
    public Domicilio post(@RequestBody Domicilio domicilio) {
        this.domicilios.add(domicilio);
        return domicilio;
    }

    @DeleteMapping("/{codigo}")
    public void deleteWithCode(@PathVariable long codigo) {
        this.domicilios.remove(codigo);
    }

    @DeleteMapping
    public void deleteWithDomicilio(@RequestBody Domicilio domicilio) {
        this.domicilios.remove(domicilio);
    }

    @PutMapping("/{codigo}")
    public Domicilio put(@PathVariable long codigo, @RequestBody HashMap<String, String> modificaciones) {
        this.domicilios.put(codigo, modificaciones);
        return domicilios.get(codigo);
    }
}

