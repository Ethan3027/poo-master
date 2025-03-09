public class MainProfesionista {
    public static void main(String[] args) {
        Profesionista pro1=new Profesionista();
        pro1.setPuesto("Electricista");
        pro1.setAntiguedad(30);
        pro1.setNombre("Margarito");


        Profesionista pro2=new Profesionista();
        pro2.setPuesto("Contador público");
        pro2.setAntiguedad(36);
        pro2.setNombre("Paola");

        System.out.println(pro1);
        System.out.println(pro2);
    }
}
