public class Boleta_calif {
    String nombre;
    String carrera;
    String num_control;
    String mat_1;
    int calif_1;
    String mat_2;
    int calif_2;
    String mat_3;
    int calif_3;
    String mat_4;
    int calif_4;
    String mat_5;
    int calif_5;
    String mat_6;
    int calif_6;
    String mat_7;
    int calif_7;


    String obtener_datos(){
        String cad="";
        cad=cad+"Persona{nombre:"+nombre+";";
        cad=cad+"carrera:"+carrera+";";
        cad=cad+"numeroControl:"+num_control+"; ";
        cad=cad+"mat_1:"+mat_1+"; ";
        cad=cad+"calificacion 1:"+calif_1+"}";
        cad=cad+"mat_2:"+mat_2+"}";
        cad=cad+"calificacion 2:"+calif_2+"}";
        cad=cad+"mat_3:"+mat_3+"}";
       cad=cad+"calificacion3:"+calif_3+"}";
        cad=cad+"mat_4:"+mat_4+"}";
        cad=cad+"calificacion 4:"+calif_4+"}";
        cad=cad+"mat_5:"+mat_5+"}";
        cad=cad+"calificacion 5"+calif_5+"}";
        cad=cad+"calificacion 6"+calif_6+"}";
        cad=cad+"mat_6:"+mat_6+"}";
        cad=cad+"calificacion 6:"+calif_6+"}";
        cad=cad+"mat_7:"+mat_7+"}";
        cad=cad+"calificacion 7"+calif_7+"}";

        return cad;
    }

}

