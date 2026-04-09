public class Gerente extends Empleado implements Trabajable{

private double bonoAnual;


public Gerente(String nombre, int id, double salarioBase) {
    super(nombre, id, salarioBase);
}

public Gerente(String nombre, int id, double salarioBase, double bonoAnual) {
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

@Override
public void trabajar() {
System.out.println("Trabajo de gerente empieza");


}
}