package um.progII.practicoParteII;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
    public class DomicilioMemoriaService implements DomicilioRepositorio {

    private Map<Long,Domicilio> domicilios;
    public DomicilioMemoriaService() { this.domicilios = new HashMap<>(); }

    @Override
    public Domicilio get(long codigo) {
        Domicilio d = this.domicilios.get(codigo);
        return d;
    }

    @Override
    public void add(Domicilio d) {
        this.domicilios.put(d.getCodigo(), d);
    }

    @Override
    public void put(long codigo, HashMap<String, String> modificaciones) {
        Domicilio domicilio = this.domicilios.get(codigo);
        for (Map.Entry<String, String> set : modificaciones.entrySet()) {
            if (set.getKey().equals("localidad")) {
                domicilio.setLocalidad(set.getValue());
            } else if (set.getKey().equals("calle")) {
                domicilio.setCalle(set.getValue());
            } else if (set.getKey().equals("numero")) {
                domicilio.setNumero(Long.getLong(set.getValue()));
            } else if (set.getKey().equals("localidad")) {
                domicilio.setLocalidad(set.getValue());
            } else if (set.getKey().equals("codigo")) {
                long codigoViejo = domicilio.getCodigo();
                domicilio.setCodigo(Long.parseLong(set.getValue()));
                this.add(domicilio);
                domicilios.remove(codigoViejo);
            }
        }
    }

    @Override
    public void remove(long codigo) {
        this.domicilios.remove(codigo);
    }

    @Override
    public void remove(Domicilio domicilio) {
        this.domicilios.remove(domicilio.getCodigo());
    }

    @Override
    public List<Domicilio> getAll() {
        List<Domicilio> doms;
        doms = this.domicilios.values().stream().collect(Collectors.toCollection(ArrayList::new));
        return doms;
    }
}

