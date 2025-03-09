public class DemoString {
    public static void main(String[] args) {
        String nombre = new String("Shakira"); //instanciamiento(toda linea) (nombre,objeto)(String_clase)
        System.out.println(nombre.length());  //metodos(.length,.charAT) cuantos caracter tiene la cadena
        System.out.println(nombre.charAt(0));//imprime la posicion
        System.out.println(nombre.toUpperCase());  //metodo de api mayusculas
        System.out.println(nombre.toLowerCase());  //metodo de api minusculas
        nombre=nombre.toUpperCase(); //asigancion del "metodo" en la cadena original
        System.out.println(nombre);


        //nombre=="SHAKIRA"
        System.out.println(nombre.equals("SHAKIRA"));  //METODO EQUALS
        //Crear una rutina para cada una frase, buscar si existe la
        //palabra "AMOR"
       /* String frase="Leo anda en busca del amor";
        String[] resultado=frase.split(" ");//

        for (String s:resultado){
            System.out.println(s);
        }*/
        String cad="hola        mundo";
        String[]res=cad.split(" ");

        for (int i=0; i< res.length;i++){
            System.out.println(res[i]);
        }

        for (String s:res){
            System.out.println(s);
        }

    }
}
//Tarea crear una clase que reciba un numero entre 0 y 9999
//y que tenga un metodo para imprimir la cantidad con letra.

//ejemplo: 1650
//salida: Mil Seiscientos Cincuenta
