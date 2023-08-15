package um.progII.practicoParteII;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio {
    private String calle;
    private long numero;
    private String localidad;
    private String provincia;
    private long codigo;
}
