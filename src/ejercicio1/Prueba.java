
package ejercicio1;

public class Prueba {

    public static void main(String[] args) {
      
        Empleado empleado = new Empleado("Valentina Zuñiga", 5000000);
        
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());
        
        empleado.setSalario(9000000);
         System.out.println("Informacion actualizada");
        System.out.println("Salario: " + empleado.getSalario());
    }
}
