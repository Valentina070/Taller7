
package ejercicio2;

public class Prueba {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria("17212712126", 40005879.2, "Ahorros");
        
        System.out.println(cuenta.numeroCuenta);
        System.out.println(cuenta.tipoCuenta);
        
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.setSaldo(70598890.0);
        System.out.println("Saldo actualizado: " + cuenta.getSaldo());
        cuenta.mostrarDetalles();
    }
    
}
