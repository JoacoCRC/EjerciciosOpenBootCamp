import java.io.*;
import java.io.InputStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

        String texto= "Hola mundo!";

        System.out.println("El texto original es:\n\t"+texto);
        System.out.println("El texto invertido es:\n\t"+reverse(texto));

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************************************************");
        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        String[] arrayString = {"hola,","como","te","va?"};

        for(String cadena: arrayString){
            System.out.println(cadena);
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************************************************");
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        int[][] matriz ={{1,2,3},
                        {4,5,6},
                        {7,8,9} };

        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("En la posicion fila: "+i+", columna: "+j+" el valor es: "+matriz[i][j]);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************************************************");
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<Integer> vector= new Vector<>();
        System.out.println(vector);

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println(vector);
        vector.remove(2);
        vector.remove(1);
        System.out.println(vector);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************************************************");
        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Auto");
        arrayList.add("Moto");
        arrayList.add("Barco");
        arrayList.add("Avion");

        LinkedList<String> linkedList= new LinkedList<>();

        for(int l=0;l<arrayList.size();l++){
            linkedList.add(l,arrayList.get(l));
        }

        System.out.println("ArrayList: ");
        for(String cad:arrayList){
            System.out.print(cad+" ");
        }
        System.out.println("\nLinkedList: ");
        for(String cad:linkedList){
            System.out.print(cad+" ");
        }
        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************************************************");
        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
        // puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> arrayListInt=new ArrayList<>();
        for(int i=1;i<11;i++){
            arrayListInt.add(i);
        }


        int aux=0;
        while(aux<arrayListInt.size()){
            if(arrayListInt.get(aux) % 2 == 0)
                arrayListInt.remove(aux);
            else
                aux++;
        }

        System.out.println("ArrayListInt final: ");
        for(int element:arrayListInt){
            System.out.print(element+" ");
        }
        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************************************************");
        //Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
        // a su llamante del tipo ArithmeticException que será capturada por su llamante
        // (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".

        double resultado;
        try{
            resultado=dividePorCero(8,0);
            System.out.println("El resultado de dividir 8 entre 0 es: "+resultado);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally{
            System.out.println("Demo de codigo");
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("************************************************************************************");
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
        // "fileIn" y "fileOut". La tarea de la función será realizar la copia del
        // fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

        File fileIn=new File("ArchivoIn.txt");
        File fileOut=new File("ArchivoOut.txt");
        copiar(fileIn,fileOut);



    }

    public static String reverse(String texto){
        StringBuilder cadInvertida= new StringBuilder();
        for(int i=texto.length()-1;i>=0;i--){
            cadInvertida.append(texto.charAt(i));
        }
        return cadInvertida.toString();
        /*
        String cadInvertida="";
        for(int i=texto.length()-1;i>=0;i--){
            cadInvertida+=texto.charAt(i);
        }
        return cadInvertida;
        */
    }

    public static double dividePorCero(double a,double b){
        if(b==0)
            throw new ArithmeticException();
        else
            return a/b;
    }

    public static void copiar(File fileIn,File fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            OutputStream out = new FileOutputStream(fileOut);

            byte[] datos = new byte[1024];
            int bytesRead;

            while((bytesRead=in.read(datos))!=-1){
                out.write(datos,0,bytesRead);

            }

            in.close();
            out.close();

            System.out.println("Archivo copiado con exito");
        }catch (FileNotFoundException e){
            System.out.println("archivo no enconttrado "+e.getMessage());
        }catch (IOException e1){
            System.out.println("IOException "+e1.getMessage());
        }
    }


}