public class Main {
    public static void main(String[] args) {
        // PRIMER PARTE

        int respuesta;
        respuesta=suma(15,15,15);
        System.out.println(respuesta);
        respuesta=suma(25,55,90);
        System.out.println(respuesta);
        respuesta=suma(25,50,25);
        System.out.println(respuesta);

        // SEGUNDA PARTE

        Coche miCoche=new Coche();
        System.out.println( "El numero de puertas del coche es: "+miCoche.numPuertas);
        miCoche.agregarPuerta();
        System.out.println("El numero de puertas del coche es: "+miCoche.numPuertas);

    }

    public static int suma(int a,int b,int c){
        return a+b+c;
    }
}