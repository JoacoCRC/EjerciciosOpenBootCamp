

public class Main {
    public static void main(String[] args) {
        String[] array= {"hola","mucho gusto","adios"};

        concatenador(array);
    }

    public static void concatenador(String[] array){
        String cadenaFinal="";
        for(int i=0;i<array.length;i++){
            cadenaFinal= cadenaFinal + " "+array[i];
        }
        System.out.println(cadenaFinal);
    }
}