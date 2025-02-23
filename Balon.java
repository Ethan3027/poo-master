public class Balon {
private String material;
private int size;
private double costo;


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Balon" +
                "material=" + material +
                ", size=" + size +
                ", costo=" + costo +' '+"mxn";
    }
}
