public class Desarrollador extends Empleado implements Trabajable{
    private String lenguajePrincipal;

    public Desarrollador(String nombre, int id, double salarioBase, String lenguajePrincipal) {
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

    @Override
    public void trabajar() {
       System.out.println("El trabajo de Desarrollador empieza");
    

}

