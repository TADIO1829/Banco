public class Cuenta {
    int numero;
    double saldo;
    String clave;


    public Cuenta() {
    }

    public Cuenta(int numero, double saldo, String clave) {
        this.numero = numero;
        this.saldo = saldo;
        this.clave = clave;
    }

    public boolean ingresar(String clave){
        return this.clave.equals(clave);
    }

    public void depositar(double monto){
        System.out.println("a");
        }

     public void retirar(double monto){
         System.out.println("a");
     }

    public void transferir(double monto, Cuenta cuentadestino){
        System.out.println("a");
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}







