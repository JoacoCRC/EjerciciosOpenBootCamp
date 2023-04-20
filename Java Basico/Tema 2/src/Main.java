import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.println("Ingrese un valor sin IVA");
        double numero= scaner.nextDouble();
        double total=precioMasIVA(numero);
        System.out.println("El precio total con el IVA es: "+total);

    }

    public static double precioMasIVA(double precio){
        return precio * 1.21;
    }
}