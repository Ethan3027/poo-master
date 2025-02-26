public class Mousse {
    private String color;
    private String tipo;
    private int uso;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUso() {
        return uso;
    }

    public void setUso(int uso) {
        this.uso = uso;
    }

    public Mousse(int uso, String color) {
        this.uso = uso;
        this.color = color;
    }

    public Mousse(String v1){
        color=v1;
    }
    public Mousse(String v2,int v3){
        tipo=v2;
        uso=v3;
    }
    public Mousse(int uso) {
        this.uso = uso;
    }


    @Override
    public String toString() {
        return "Mousse{" +
                "color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", uso=" + uso + ' '+ "años"+
                '}';
    }


}
