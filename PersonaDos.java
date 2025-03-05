public class Persona {
    private String nombre;
    private Persona izquierda;
    private Persona derecha;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void unirIzquierda(Persona persona) {
        this.izquierda = persona;
        persona.derecha = this;
    }

    public void mostrarCadena() {
        Persona actual = this;
        while (actual != null) {
            System.out.print(actual.nombre + " ");
            actual = actual.derecha;
        }
        System.out.println();
    }
}
