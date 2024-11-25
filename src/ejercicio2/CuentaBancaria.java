
package ejercicio2;

public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
   public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
   public double getSaldo() {
        return saldo;
    }
   public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
