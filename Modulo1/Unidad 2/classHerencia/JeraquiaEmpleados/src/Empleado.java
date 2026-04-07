public class Empleado {
private String nombre, id;
private double salarioBase;

public Empleado(String nombre, String id, double salarioBase) {
    this.nombre = nombre;
    this.id = id;
    this.salarioBase = salarioBase;
}

public Empleado(String nombre, String id) {
    this.nombre = nombre;
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public String getId() {
    return id;
}

public double getSalarioBase() {
    return salarioBase;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setId(String id) {
    this.id = id;
}

public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
}


public double calcularSalario(int salario){
    System.out.println("calcular ");
    return salario;
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
