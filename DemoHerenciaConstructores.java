public class DemoHerenciaConstructores {
    public static void main(String[] args) {
        Elefante dumbo = new Elefante("Elephantoide", "Mamifero", "Asiatica", 800.70);
        Animal animal = new Animal("Canis Lopus", "Mamifero");
        System.out.println(dumbo);
        System.out.println(animal);
    }
}

    class Animal {
        private String especie;
        private String tipo_nacimiento;

        public Animal(){}

        public Animal(String especie, String tipo_nacimiento) {
            this.especie = especie;
            this.tipo_nacimiento = tipo_nacimiento;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getTipo_nacimiento() {
            return tipo_nacimiento;
        }

        public void setTipo_nacimiento(String tipo_nacimiento) {
            this.tipo_nacimiento = tipo_nacimiento;
        }
        @Override
        public String toString() {
            return "Animal{" +
                    "especie='" + especie + '\'' +
                    ", tipo_nacimiento='" + tipo_nacimiento + '\'' +
                    '}';
        }


    }

    class Elefante extends Animal {
        private String raza;
        private double peso;

        public Elefante() {
        }
        /*super refiere a la clase padre a los constructores ()
        this refiere al constructor local
        this. para atributos de la clase
        super. atributos del padre clase*/

        public Elefante(String especie, String tipo_nacimiento, String raza, double peso) {
            super(especie, tipo_nacimiento);
            this.peso = peso;
            this.raza = raza;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "Elefante{" +
                    "especie='" + super.getEspecie() + '\'' +
                    ", tipo_nacimiento='" + super.getTipo_nacimiento() + '\'' +" "+
                    "raza=" + raza + "peso=" + peso;

        }
    }
