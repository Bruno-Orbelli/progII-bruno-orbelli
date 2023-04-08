public class EmpleadoSet extends Empleado {

    public EmpleadoSet() {
    }

    public EmpleadoSet(String nombre, String apellido, String legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public int hashCode() {
        return (int) this.getNombre().hashCode() * this.getApellido().hashCode() * this.getLegajo().hashCode() * getAniosTrabajados();
    }

    @Override
    public boolean equals(Object e) {
        if (e instanceof EmpleadoSet){
            EmpleadoSet emp = (EmpleadoSet) e;
            return this.getNombre().equals(emp.getNombre()) &&
                    this.getApellido().equals((emp.getApellido())) &&
                    this.getLegajo().equals(emp.getLegajo()) &&
                    this.getAniosTrabajados() == emp.getAniosTrabajados();
        }
        return false;
    }
}
