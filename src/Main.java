public class Main {

public static void main (String [] args){

    Cuenta miCuenta = new Cuenta("123456", "corriente" , 150000);
    System.out.println("Saldo mínimo "+miCuenta.getSaldoMinimo());
    miCuenta.consignar(80000);


    Cuenta pedroCuenta = new Cuenta("585858", "prestamo",5000);
    System.out.println(pedroCuenta.toString());


    }

}
