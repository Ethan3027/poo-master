public class MainBoleta {
    public static void main(String[] args){
        Boleta_calif boleta1=new Boleta_calif();
        boleta1. nombre="David";
        boleta1. carrera="Ing.Sistemas";
        boleta1. num_control="24020708";
        boleta1.mat_1="POO";
        boleta1.calif_1=8;
        boleta1.mat_2="Calculo Integral";
        boleta1.calif_2=9;
        boleta1.mat_3="Contabilidad";
        boleta1.calif_3=7;
        boleta1.mat_4="Algebra lineal";
        boleta1.calif_4=9;
        boleta1.mat_5="Prob.estadistica";
        boleta1.calif_5=8;
        boleta1.mat_6="Quimica";
        boleta1.calif_6=8;
        boleta1.mat_7="Act.extraescolar";
        boleta1.calif_7=8;

        System.out.println(boleta1.obtener_datos());

        Boleta_calif b2=new Boleta_calif();
        b2. nombre="Paola";
        b2. carrera="Ing.Sistemas";
        b2. num_control="240200403";
        b2.mat_1="POO";
        b2.calif_1=8;
        b2.mat_2="Calculo Integral";
        b2.calif_2=7;
        b2.mat_3="Contabilidad";
        b2.calif_3=6;
        b2.mat_4="Algebra lineal";
        b2.calif_4=9;
        b2.mat_5="Prob.estadistica";
        b2.calif_5=10;
        b2.mat_6="Quimica";
        b2.calif_6=8;
        b2.mat_7="Act.extraescolar";
        b2.calif_7=10;

        String res=b2.obtener_datos();
        System.out.println(res);

        Boleta_calif b3=new Boleta_calif();
        b3. nombre="Katya";
        b3. carrera="Bioquimica";
        b3. num_control="24020601";
        b3.mat_1="POO";
        b3.calif_1=7;
        b3.mat_2="Calculo Integral";
        b3.calif_2=8;
        b3.mat_3="Contabilidad";
        b3.calif_3=9;
        b3.mat_4="Algebra lineal";
        b3.calif_4=8;
        b3.mat_5="Prob.estadistica";
        b3.calif_5=7;
        b3.mat_6="Quimica";
        b3.calif_6=9;
        b3.mat_7="Act.extraescolar";
        b3.calif_7=8;

        res = b3.obtener_datos();
        System.out.println(res);

    }
}
