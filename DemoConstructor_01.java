//Vamos a agregar un constructor a nuestra clase
//Constructor: Un método especial que es invocado
//en el proceso de instanciamiento de la clase.
//Es público, se llama igual que la clase y no tiene
//tipo de retorno
public class DemoConstructor_01 {
    String atributo1;               //valor predeterminados
    double atributo2;
    String atributo3;

    public DemoConstructor_01(){
        System.out.println("Crea el objeto");   //aunque no lo veias existía
        atributo1="Valor del atributo 1";           //valores asignados en la construccion del objeto

    }

    public DemoConstructor_01(String valor){        //(String)
        atributo1=valor;
    }
    public DemoConstructor_01(double valor1, String valor2){        //(double , string)
        atributo2=valor1;
        atributo1=valor2;

    }
    public DemoConstructor_01(double valor1){           //(double)
        atributo2=valor1;
    }
    public DemoConstructor_01(String valor2, double valor1){
        atributo2=valor1;
        atributo1=valor2;
    }
    public DemoConstructor_01(String valor, String valor2){     // (String, String)
        atributo3=valor;
        atributo1=valor2;
    }

}
