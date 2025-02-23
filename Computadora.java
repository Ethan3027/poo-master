public class Computadora {
private String marca;
private String procesador;
private int memoria_ram;
private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }
    public String getModelo(String modelo){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Computadora" +
                "marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria_ram=" + memoria_ram + "GB"+
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
