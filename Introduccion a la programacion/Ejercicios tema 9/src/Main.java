public class Main {
    public static void main(String[] args) {

        Cliente cliente=new Cliente();
        cliente.setNombre("Martin");
        cliente.setTel(333333333);
        cliente.setEdad(24);
        cliente.setCredito(7500.0);

        System.out.println("Datos cliente: \n\tNombre: "+cliente.getNombre()+"\n\tEdad: "+cliente.getEdad()+
        "\n\tTelefono: "+cliente.getTel()+"\n\tCredito: "+cliente.getCredito());

        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Joaquin");
        trabajador.setTel(222222222);
        trabajador.setEdad(24);
        trabajador.setSalario(165000.5);

        System.out.println("Datos trabajador: \n\tNombre: "+trabajador.getNombre()+"\n\tEdad: "+trabajador.getEdad()+
                "\n\tTelefono: "+trabajador.getTel()+"\n\tSalario: "+trabajador.getSalario());

    }
}