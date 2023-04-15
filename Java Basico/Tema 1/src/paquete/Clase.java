package paquete;

public class Clase {
    public static void main(String[] args) {

        byte numero1 = 5; // 1 byte
        short numero2 = 880; // 2 bytes
        int numero3 = 6868; // 4 bytes
        long numero4 = 444545457; // 8 bytes

        System.out.println("byte " + numero1 + " , short " + numero2 + " , int " + numero3 + " , long " + numero4);

        float numero5 = 4.9f;
        double numero6 = 9.99d;

        System.out.println("float " + numero5 + " , double " + numero6);


        String cadena = "Hola mundo!";

        System.out.println("String "+ cadena);


        char caracter = 'a';

        System.out.println("char " + caracter);

        boolean verdadero = true;
        boolean falso = false;

        System.out.println("boolean "+ verdadero+" / "+falso);
    }
}