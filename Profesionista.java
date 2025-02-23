public class Profesionista {
private String puesto;
private int antiguedad;
private String nombre;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Profesionista" +
                "puesto='" + puesto + '\'' +
                ", antiguedad=" + antiguedad + ' '+
                "años de trabajo duro"+
                ", nombre=" + nombre +'.';
    }
}
