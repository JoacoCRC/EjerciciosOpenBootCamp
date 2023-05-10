public class Main {

    public static void main(String[] args) {
        SmartDevice telefono=new SmartPhone("Samsung","S23","blanco",256,"Android");
        SmartDevice reloj=new SmartWatch("Xiaomi","Mi band 6","negro",3.5,"Bluetooth");

        System.out.println("SmartPhone: "+telefono);
        System.out.println("SmartWatch: "+reloj);
    }
}