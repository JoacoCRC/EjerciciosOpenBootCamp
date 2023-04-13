public class Main {
    public static void main(String[] args) {

        Persona persona=new Persona();
        persona.setEdad(24);
        persona.setNombre("Joaquin");
        persona.setTel(222222222);

        System.out.println("Los datos de la persona son: \n\tNombre: "+persona.getNombre()+"\n\tEdad: "+persona.getEdad()+
                "\n\tTelefono: "+persona.getTel());
    }
}