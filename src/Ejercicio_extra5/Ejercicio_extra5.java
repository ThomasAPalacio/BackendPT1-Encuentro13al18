//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
//crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
//del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después 
//de realizar una transacción de retiro.
package Ejercicio_extra5;

import java.util.Scanner;

public class Ejercicio_extra5 {

    public static void main(String[] args) {
        String opcion;
        Scanner leer = new Scanner(System.in);

        Cuenta c1 = new Cuenta();

        c1.nombreYSaldo(c1);

        System.out.println("¿Quisiera retirar dinero? (S/N)");
        opcion = leer.next();

        while (opcion.equals("S")) {

            System.out.println("¿Cuanto dinero quisiera retirar?");
            c1.retirarDinero(leer.nextInt());
            
            if (c1.saldo < 0) {
                System.out.println("Usted no puede retirar mas dinero, debido a que tiene un saldo negativo");
                break;
            }
            
            System.out.println("Ahora en su cuenta se encuentra con: $" + c1.saldo + " de saldo");
            System.out.println("¿Quiere retirar mas? (S/N)");
            opcion = leer.next();
        }

        if (opcion.equals("N")) {
            System.out.println("Usted ha salido del cajero.");
        }

        if (c1.saldo < 0) {
            System.out.println("Ha salido del cajero.");
        }

    }
}
