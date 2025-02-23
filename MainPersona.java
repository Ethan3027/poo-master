public class MainPersona {
    public static void main(String[] args) {
        Persona p1=new Persona();//instanciamiento

        //config el objeto dando valores a los atributos
        p1.nombre="David";
        p1.genero="Masculino";
        p1.estatura=1.75;
        p1.peso=81;
        p1.edad=18;
        //usando uno de los metodos de la clase
        System.out.println(p1.obtener_datos());

        Persona p2=new Persona();
        p2.nombre="Emiliano";
        p2.genero="Masculino";
        p2.peso=42;
        p2.estatura=1.61;
        p2.edad=18;

        String res=p2.obtener_datos();
        System.out.println(res);
        //reutilizacion de codigo
        System.out.println(p1.calcula_imc());
        System.out.println(p2.calcula_imc());


    }
}
