public class CadenaHumana {
    public static void main(String[] args) {
        // Crear personas
        Persona p1 = new Persona("Alice");
        Persona p2 = new Persona("Bob");
        Persona p3 = new Persona("Charlie");
        Persona p4 = new Persona("Diana");

        // Unir personas
        p1.unirIzquierda(p2);
        p2.unirIzquierda(p3);
        p3.unirIzquierda(p4);

        // Mostrar la cadena humana
        System.out.println("Cadena humana:");
        p4.mostrarCadena(); // Comenzamos desde el extremo derecho
    }
}
