public class Transacciones extends Cuenta{
    double monto;

    public Transacciones(int numero, double saldo, String clave, double monto) {
        super(numero, saldo, clave);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void retirar(double monto){
        if(monto > 0 && this.saldo >= monto){
            this.saldo -= monto;
        }
    }
    public void transferir(double monto, Cuenta cuentadestino){
        if(monto > 0 && this.saldo >= monto){
            this.saldo -= monto;
            cuentadestino.depositar(monto);
            System.out.println("Transferencia exitosa");

        }else {
            System.out.println("Transferencia Fallido");
        }
    }
    public void depositar(double monto){
        if(monto > 0){
            this.saldo += monto;
            System.out.println("Deposito realizado con exito");

        }else {
            System.out.println("Deposito Fallido");
        }
    }
}
