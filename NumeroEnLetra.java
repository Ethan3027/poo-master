import java.util.Scanner;

    public class NumeroEnLetra {
        private int numero;

        public NumeroEnLetra(int numero) {
            this.numero = numero;
        }

        public String convertirANumerosEnLetra() {
            if (numero == 0) {
                return "cero";
            }

            String letras = "";

            // Manejo de miles
            if (numero >= 1000) {
                letras += convertirMiles(numero / 1000);
                numero %= 1000; // Actualiza el número para manejar las centenas
            }

            // Manejo de centenas
            if (numero >= 100) {
                letras += convertirCentenas(numero / 100);
                numero %= 100; // Actualiza el número para manejar las decenas
            }

            // Manejo de decenas y unidades
            if (numero >= 10) {
                letras += convertirDecenas(numero);
                numero %= 10; // Actualiza el número para manejar las unidades
            }

            // Manejo de unidades
            if (numero > 0) {
                letras += convertirUnidades(numero);
            }

            return letras.trim();
        }

        private String convertirMiles(int miles) {
            switch (miles) {
                case 1: return "mil ";
                case 2: return "dos mil ";
                case 3: return "tres mil ";
                case 4: return "cuatro mil ";
                case 5: return "cinco mil ";
                case 6: return "seis mil ";
                case 7: return "siete mil ";
                case 8: return "ocho mil ";
                case 9: return "nueve mil ";
                default: return "";
            }
        }

        private String convertirCentenas(int centenas) {
            switch (centenas) {
                case 1: return "cien ";
                case 2: return "doscientos ";
                case 3: return "trescientos ";
                case 4: return "cuatrocientos ";
                case 5: return "quinientos ";
                case 6: return "seiscientos ";
                case 7: return "setecientos ";
                case 8: return "ochocientos ";
                case 9: return "novecientos ";
                default: return "";
            }
        }

        private String convertirDecenas(int decenas) {
            if (decenas == 10) return "diez ";
            if (decenas == 11) return "once ";
            if (decenas == 12) return "doce ";
            if (decenas == 13) return "trece ";
            if (decenas == 14) return "catorce ";
            if (decenas == 15) return "quince ";
            if (decenas < 20) return "dieci" + convertirUnidades(decenas - 10);

            switch (decenas / 10) {
                case 2: return "veinte ";
                case 3: return "treinta ";
                case 4: return "cuarenta ";
                case 5: return "cincuenta ";
                case 6: return "sesenta ";
                case 7: return "setenta ";
                case 8: return "ochenta ";
                case 9: return "noventa ";
                default: return "";
            }
        }

        private String convertirUnidades(int unidades) {
            switch (unidades) {
                case 1: return "uno ";
                case 2: return "dos ";
                case 3: return "tres ";
                case 4: return "cuatro ";
                case 5: return "cinco ";
                case 6: return "seis ";
                case 7: return "siete ";
                case 8: return "ocho ";
                case 9: return "nueve ";
                default: return "";
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número entre 0 y 9999: ");
            int numero = scanner.nextInt();

            if (numero < 0 || numero > 9999) {
                System.out.println("El número debe estar entre 0 y 9999.");
            } else {
                NumeroEnLetra numeroEnLetra = new NumeroEnLetra(numero);
                String resultado = numeroEnLetra.convertirANumerosEnLetra();
                System.out.println("El número " + numero + " en letras es: " + resultado);
            }

            scanner.close();
        }
    }

