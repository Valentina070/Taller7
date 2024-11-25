package ejercicio1;


public class Empleado {
    
    public String nombre;
    private double salario;
    
    // Constructor 
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }
 
    public double getSalario() {
        return salario;
    }
//validación
    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Para el salario no se permite numeros menores a 0");
        }
        this.salario = salario;
    }
}
