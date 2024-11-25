
package ejercicio3;

public class Prueba {

    public static void main(String[] args) {
        
        double resultado1 = Utilidades.sumar(7, 8);
        System.out.println("Resultado de la suma: " + resultado1);
     
        double resultado2 = Utilidades.restar(7, 4);
        System.out.println("Resultado de la resta: " + resultado2);
        
        double resultado3 = Utilidades.multiplicar(10, 4);
        System.out.println("Resultado de la multiplicación: " + resultado3);
        
        // Acceso a método dividir
        try {
        double resultado4 = Utilidades.dividir(18, 4);
        System.out.println("Resultado de la división: " + resultado4);
        } catch (ArithmeticException excepcion) { 
            System.out.println("Error en la división: " + excepcion.getMessage());
        }
    }
}
