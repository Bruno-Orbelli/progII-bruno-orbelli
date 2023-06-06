import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
@Setter(AccessLevel.NONE)
@NoArgsConstructor
public class FechaPropia {
    private String anio;
    private String mes;
    private String dia;
    private HashMap<Integer, Integer> mesesConDias = new HashMap<>(Map.ofEntries(
            Map.entry(1, 31),
            Map.entry(2, 28),
            Map.entry(3, 31),
            Map.entry(4, 30),
            Map.entry(5, 31),
            Map.entry(6, 30),
            Map.entry(7, 31),
            Map.entry(8, 31),
            Map.entry(9, 30),
            Map.entry(10, 31),
            Map.entry(11, 30),
            Map.entry(12, 31)
            ));

    public FechaPropia(String anioMesDia) {
        Pattern fechaValida = Pattern.compile("[0-9]{4}-[0-1][0-9]-[0-3][0-9]");
        Matcher matcher = fechaValida.matcher(anioMesDia);

        Integer anioIngresado = Integer.valueOf(anioMesDia.substring(0, 4));
        Integer mesIngresado = anioMesDia.charAt(5) == 0 ? Integer.valueOf(anioMesDia.charAt(6)) : Integer.valueOf(anioMesDia.substring(5, 7));
        Integer diaIngresado = anioMesDia.charAt(8) == 0 ? Integer.valueOf(anioMesDia.charAt(9)) : Integer.valueOf(anioMesDia.substring(8, 10));

        if (!matcher.matches()) {
            throw new RuntimeException("La fecha ingresada no posee un formato válido.");
        } else if (mesIngresado > 12 || diaIngresado > 31) {
            throw new RuntimeException("La fecha ingresada no es una fecha existente.");
        } else {
            adjustForBisiesto(anioIngresado);
            if (diaIngresado > this.mesesConDias.get(mesIngresado)) {
                throw new RuntimeException("La fecha ingresada no es una fecha existente.");
            }
        }

        this.anio = anioMesDia.substring(0, 4);
        this.mes = anioMesDia.substring(5, 7);
        this.dia = anioMesDia.substring(8, 10);

    }

    public void setDia(String dia) {
        try {
            Integer diaAsInteger = Integer.parseInt(dia);
            if (dia.length() != 2) {
                throw new RuntimeException("El día ingresado no posee un formato válido.");
            }
            else if (diaAsInteger > this.mesesConDias.get(Integer.valueOf(this.mes))) {
                throw new RuntimeException("El día ingresado no existe para la fecha actual.");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("El día ingresado no posee un formato válido.");
        }
        this.dia = dia;
    }

    public void setMes(String mes) {
        try {
            Integer mesAsInteger = Integer.parseInt(mes);
            if (mes.length() != 2) {
                throw new RuntimeException("El mes ingresado no posee un formato válido.");
            }
            else if (mesAsInteger > 12) {
                throw new RuntimeException("El mes ingresado no existe.");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("El mes ingresado no posee un formato válido.");
        }
        this.mes = mes;
    }

    public void setAnio(String anio) {
        try {
            Integer anioAsInteger = Integer.parseInt(anio);
            if (anio.length() != 4) {
                throw new RuntimeException("El año ingresado no posee un formato válido.");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("El año ingresado no posee un formato válido.");
        }
        this.anio = anio;
        adjustForBisiesto(Integer.valueOf(anio));
    }
    public void adjustForBisiesto(Integer anio) {
        if ((anio % 4) == 0) {
            if (((anio % 100) == 0) && !((anio % 400) != 0)) {
                this.mesesConDias.remove(2);
                this.mesesConDias.put(2, 28);
                return;
            }
            this.mesesConDias.remove(2);
            this.mesesConDias.put(2, 29);
        } else {
            this.mesesConDias.remove(2);
            this.mesesConDias.put(2, 28);
        }
    }

    public void sumarDias(Integer cantDias) {
        Integer nuevoDia = this.dia.charAt(0) == 0 ? Integer.valueOf(this.dia.charAt(1)) + cantDias : Integer.valueOf(this.dia) + cantDias;
        Integer nuevoMes = this.mes.charAt(0) == 0 ? Integer.valueOf(this.mes.charAt(1)) : Integer.valueOf(this.mes);
        Integer nuevoAnio = Integer.valueOf(this.anio);

        while (true) {
            if (((nuevoDia / this.mesesConDias.get(Integer.valueOf(this.mes))) != 0) && ((nuevoDia % this.mesesConDias.get(Integer.valueOf(this.mes))) != 0)) {
                nuevoDia = nuevoDia - this.mesesConDias.get(Integer.valueOf(nuevoMes));
                nuevoDia = nuevoDia == 0 ? 1 : nuevoDia;
                nuevoMes = nuevoMes + 1;
            } else {
                break;
            }

            if ((nuevoMes / 12) != 0 && (nuevoMes % 12 != 0)) {
                nuevoAnio = nuevoAnio + 1;
                adjustForBisiesto(nuevoAnio);
                nuevoMes = nuevoMes - 12;
                nuevoMes = nuevoMes == 0 ? nuevoMes + 1 : nuevoMes;
            }
        }

        this.dia = String.format("%02d", nuevoDia);
        this.mes = String.format("%02d", nuevoMes);
        this.anio = String.format("%04d", nuevoAnio);
    }

    public void restarDias(Integer cantDias) {
        Integer nuevoDia = this.dia.charAt(0) == 0 ? Integer.valueOf(this.dia.charAt(1)) - cantDias : Integer.valueOf(this.dia) - cantDias;
        Integer nuevoMes = this.mes.charAt(0) == 0 ? Integer.valueOf(this.mes.charAt(1)) : Integer.valueOf(this.mes);
        Integer nuevoAnio = Integer.valueOf(this.anio);

        while (true) {
            if (nuevoDia < 1) {
                nuevoMes = nuevoMes - 1;
            } else {
                break;
            }

            if (nuevoMes < 1) {
                nuevoAnio = nuevoAnio - 1;
                adjustForBisiesto(nuevoAnio);
                nuevoMes = nuevoMes + 12;
            }

            nuevoDia = nuevoDia + this.mesesConDias.get(Integer.valueOf(nuevoMes));
        }

        this.dia = String.format("%02d", nuevoDia);
        this.mes = String.format("%02d", nuevoMes);
        this.anio = String.format("%04d", nuevoAnio);
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%s", this.anio, this.mes, this.dia);
    }
}
