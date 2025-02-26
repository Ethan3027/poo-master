public class MainMousse {
    public static void main(String[] args) {
        Mousse m1= new Mousse("Negro");
        Mousse m2= new Mousse("Oficinista",8);
        Mousse m3=new Mousse(1);
        Mousse m4=new Mousse(1,"Blanco");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        m1.setColor("Blanco");
        System.out.println(m1);
    }
}
