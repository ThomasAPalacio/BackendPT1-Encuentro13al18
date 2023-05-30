package Ejercicio_extra5;

import java.util.Scanner;

public class Cuenta {

    public int saldo;
    public String titular;

    public Cuenta() {
        saldo = 100;
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = 100;
        this.titular = titular;
    }

    public void nombreYSaldo(Cuenta c1) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        titular = leer.next();
        System.out.println("Hola, " + titular + " BIENVENIDO a su cuenta bancaria...");
        System.out.println("Actualmente usted tiene: $" + saldo + " de saldo");

    }

    public int retirarDinero(int restarSaldo) {

        saldo = saldo - restarSaldo;

        return saldo;
    }

}
