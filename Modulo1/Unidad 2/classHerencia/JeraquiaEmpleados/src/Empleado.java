public class Empleado {
private String nombre ;
private double salarioBase, id;

public Empleado(String nombre, int id, double salarioBase) {
    this.nombre = nombre;
    this.id = id;
    this.salarioBase = salarioBase;
}

public Empleado(String nombre, int id) {
    this.nombre = nombre;
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public double getId() {
    return id;
}

public double getSalarioBase() {
    return salarioBase;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setId(double id) {
    this.id = id;
}

public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
}


public double calcularSalario(){
    return salarioBase;
}

public void mostrarDetalles() {
    System.out.println("Detalles del Empleador \n"+ getNombre() +"\n"+ getId()+"\n"+ getSalarioBase());
    
    
}
public void mostrarDetalles(String prefijo) {
    System.out.println("Detalles del Empleador");
    System.out.println(prefijo);
    getNombre(); 
    getId(); 
    getSalarioBase();
}
}
