public class App {
    public static void main(String[] args) throws Exception {
        

        // instancias de gerente y Desarrollador


        Empleado luis = new Gerente("luis",1021,20000000, 2000000);
        Empleado luna = new Desarrollador("Luna", 102928383, 2200000, "Java" );
    // uso de apuntadores 

        Empleado miG = luis;
        Empleado miD = luna;

// sobrecarga en metodo de mostrarDetalles
        luis.mostrarDetalles();
        miG.mostrarDetalles("Detalles de Empleado Base: ");
        
        luis.calcularSalario();
        

        luna.mostrarDetalles();
        miD.mostrarDetalles("Desarrolladora");
        luna.calcularSalario();

        SistemaDeTarea sis = new SistemaDeTarea();

        sis.asignarTrabajo(luis);
        sis.asignarTrabajo(luna);
    

    }
}
