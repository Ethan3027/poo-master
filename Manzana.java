public class Manzana {
private String tipo;
private String color;
private double precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Manzana" +' '+
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio + ' '+"el kg.";
    }
}
