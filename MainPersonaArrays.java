import javax.swing.*;
import java.util.ArrayList; //coleccion de clases o paquetes
import java.util.Scanner;

//intefaz de programacion de aplicaciones API
public class MainPersonaArrays {
    public static void main(String[] args) {
  /* Persona p = new Persona();*/
        ArrayList<String> lista = new ArrayList();
        Scanner teclado=new Scanner(System.in);
        String frase="";
        System.out.println("Escribe quit para salir");
        while(true){

            System.out.println("Dame una frase:");
            frase=teclado.nextLine();
            if (frase.equals("quit"))
                break;
            lista.add(frase);
        }
        //iterador
        for (String s: lista) {
            System.out.println(s);

        }

        /*String frase="Feliz San Valentin";
        lista.add(frase);
        frase="Que reciban muchos apapachos";
        lista.add(frase);
        frase="Hoy sera un dia maravilloso... para otros";

        System.out.println(frase);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));


        if (lista.contains(frase));
        System.out.println("Tristemente asi sera");
        else
        System.out.println("Eres afortunado");*/
    }

}
