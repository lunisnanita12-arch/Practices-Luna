public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String nombre, String id, double salarioBase, String lenguajePrincipal) {
        super(nombre, id, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        getLenguajePrincipal();
    }
    

}

