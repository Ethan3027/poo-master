public class Asignatura {
private String nombre;
private int creditos;
private int teoricas;
private int practicas;
private String clave;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getPracticas() {
        return practicas;
    }

    public void setPracticas(int practicas) {
        this.practicas = practicas;
    }
    public int getTeoricas(int teoricas){
        return teoricas;
    }

    public void setTeoricas(int teoricas) {
        this.teoricas = teoricas;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                ", teoricas=" + teoricas +
                ", practicas=" + practicas +
                ", clave='" + clave + '\'' +
                '}';                       //Se puede poner cualquier cosa
    }
}
