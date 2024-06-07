//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(123549,1253,"2004");
        Cuenta cuenta2 = new Cuenta(125549,200,"2006");

        Scanner sc = new Scanner(System.in);
        if(cuenta1.ingresar("2004")){
            System.out.println("Ingreso Exitoso");

        }
        double monto=0;
        Transacciones t=new Transacciones(cuenta1.numero, cuenta1.saldo, cuenta1.clave, monto);
        Transacciones t2=new Transacciones(cuenta2.numero, cuenta2.saldo, cuenta2.clave, monto);
        int opcion;
        do {
            System.out.println("Bienvenido");
            System.out.println("Que desea hacer");
            System.out.println("1) Depositar");
            System.out.println("2) Retirar");
            System.out.println("3) Realizar Transferencia");
            System.out.println("4) Salir");
             opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto que desea depositar: ");
                     monto = sc.nextDouble();
                    t.depositar(monto);
                    System.out.println("Nuevo saldo : " + t.getSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea retirar: ");
                    double montoRet = sc.nextDouble();
                    t.retirar(montoRet);
                    System.out.println("Nuevo saldo : " + t.getSaldo());
                    break;

                case 3:
                    System.out.println("Ingrese el monto que desea transferir: ");
                    double montoTransfer = sc.nextDouble();
                    System.out.println("Su unico contacto a transferir es" + t2);
                    t.transferir(montoTransfer, t2);
                    System.out.println("Nuevo saldo : " + t.getSaldo());
                    System.out.println(t2.getSaldo());
                    break;

            }

        }while(opcion!=4)
        ;
    }

}