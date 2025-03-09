import javax.swing.*;

public class Fruta {
    private String color;
    private String textura;
    private String tipo_fruta;
    private double precio;

    public Fruta(String color) {
        this.color = color;
    }

    public Fruta(String color, String textura) {
        this.color = color;
        this.textura = textura;
    }

    public Fruta(String color, String tipo_fruta, double precio) {
        this.color = color;
        this.tipo_fruta = tipo_fruta;
        this.precio = precio;
    }

    public Fruta(double precio, String tipo_fruta) {
        this.precio = precio;
        this.tipo_fruta = tipo_fruta;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getTipo_fruta() {
        return tipo_fruta;
    }

    public void setTipo_fruta(String tipo_fruta) {
        this.tipo_fruta = tipo_fruta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
