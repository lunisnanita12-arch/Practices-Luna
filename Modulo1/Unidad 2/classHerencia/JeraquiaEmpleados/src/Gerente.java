public class Gerente extends Empleado{

private double bonoAnual;

public Gerente(String nombre, String id, double salarioBase, double bonoAnual) {
    super(nombre, id, salarioBase);
    this.bonoAnual = bonoAnual;
}

public double getBonoAnual() {
    return bonoAnual;
}

@Override
public double calcularSalario() {
    return super.calcularSalario() +  getBonoAnual();
}

@Override
public void mostrarDetalles() {
    super.mostrarDetalles();
    getBonoAnual();
}


}