public class MainDemoContrustor {
    public static void main(String[] args) {
        //Aquí estas invocado al constructor
        DemoConstructor_01 obj=new DemoConstructor_01();
        System.out.println(obj.atributo1);
        obj.atributo1="Nuevo valor";
        System.out.println(obj.atributo1);

        DemoConstructor_01 obj2=new DemoConstructor_01("Este es mi valor");
        System.out.println(obj2.atributo1);


        DemoConstructor_01 obj3=new DemoConstructor_01( "Valor String",20.5);






        //Esto ya no es necesario
        /*new r=Alumno("Rebeca", 18, "E203628","Segundo");
        r.nombre="Rebeca";
        r.edad=18;
        r.control="E202834";
        r,semestre="Segundo";*/

    }
}
