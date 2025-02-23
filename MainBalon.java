 public class MainBalon {
    public static void main(String[]usage){
        Computadora com1=new Computadora();
        com1.setMarca("Lenovo");
        com1.setProcesador("INTEL_5");
        com1.setMemoria_ram(4);
        com1.setModelo("LV-6589");

        Computadora com2=new Computadora();
        com2.setMarca("HP");
        com2.setProcesador("INTEL_7");
        com2.setMemoria_ram(8);
        com2.setModelo("HP-300pro");

        System.out.println(com1);
        System.out.println(com2);

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

        Balon ball1=new Balon();
        ball1.setMaterial("Hule");
        ball1.setSize(5);
        ball1.setCosto(200.50);

        Balon ball2=new Balon();
        ball2.setMaterial("Cuero vegano");
        ball2.setSize(7);
        ball2.setCosto(399.99);

        System.out.println(ball1);
        System.out.println(ball2);

        Manzana man1=new Manzana();
        man1.setColor("Verde");
        man1.setTipo("Americana");
        man1.setPrecio(20.80);

        Manzana man2=new Manzana();
        man2.setColor("Amarilla");
        man2.setTipo("Golden");
        man2.setPrecio(21.50);

        System.out.println(man1);
        System.out.println(man2);

        Boleto bol1=new Boleto();
        bol1.setTipo("Adulto");
        bol1.setPrecio(499.99);
        bol1.setZone("General");

        Boleto bol2=new Boleto();
        bol2.setTipo("Adulto");
        bol2.setPrecio(1999.99);
        bol2.setZone("VIP");

        System.out.println(bol1);
        System.out.println(bol2);
    }

}
