public class SmartWatch extends SmartDevice{
    public double pulgadas;
    public String conecvtividad;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String color, double pulgadas, String conecvtividad) {
        super(marca, modelo, color);
        this.pulgadas = pulgadas;
        this.conecvtividad = conecvtividad;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas=" + pulgadas +
                ", conecvtividad='" + conecvtividad + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
