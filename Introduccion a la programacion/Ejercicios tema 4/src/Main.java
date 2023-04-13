

public class Main {

    public static void main(String[] args) {

        int numeroIf = -5;
        if(numeroIf <0)
            System.out.println("El numero "+numeroIf +" es negativo");
        else if(numeroIf >0)
            System.out.println("El numero "+numeroIf +" es positivo");
        else
            System.out.println("El numero "+numeroIf +" es cero");

        //////////////////////////////////////////////////////////////////

        int numeroWhile=1;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("El valor actual del numeroWhile ahora es: "+numeroWhile);
        }

        /////////////////////////////////////////////////////////////////

        int numeroDoWhile=3;
        do{
            numeroDoWhile++;
            System.out.println("El valor actual del numeroDoWhile ahora es: "+numeroDoWhile);
        }while ( numeroDoWhile<3);

        ////////////////////////////////////////////////////////////////////

        for (int numeroFor =0;numeroFor<=3;numeroFor++){
            System.out.println("El valor actual del numeroFor ahora es: "+numeroFor);
        }

        //////////////////////////////////////////////////////////////////////

        String estacion="Otoño";

        switch (estacion){
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            default:
                System.out.println("Estacion mal ingresada");
        }


    }

}
