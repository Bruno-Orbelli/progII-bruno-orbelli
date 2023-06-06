public class FechaPropiaMockService {
    public String sumarDias(FechaPropia fecha, Integer dias) {
        fecha.sumarDias(dias);
        return fecha.toString();
    }

    public String restarDias(FechaPropia fecha, Integer dias) {
        fecha.restarDias(dias);
        return fecha.toString();
    }
}
