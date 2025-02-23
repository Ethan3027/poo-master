public class Boleto {
private String tipo;
private double precio;
private String zone;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Boleto" +
                "tipo='" + tipo + '\'' +
                ", precio=" + precio +"mxn"+
                ", zone='" + zone + '\'' +
                '}';
    }
}
