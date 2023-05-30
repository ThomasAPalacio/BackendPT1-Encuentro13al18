package Ejercicio_extra3;

import java.util.Scanner;

public class Juego {

    public int num1;
    public int num2;

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void iniciarJuego(Juego j1) {
        int i, cont = 0, acum = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Player 1, ingrese un numero para que el Player 2 adivine: ");
        num1 = leer.nextInt();
        
        System.out.println("¿Cuantos intentos quiere darle a su rival?");
        acum = leer.nextInt();
        cont = acum;

        System.out.println("Ahora es su turno Player 2, intente adivinar el numero que ingreso el Player 1");

        for (i = 1; i <= acum; i++) {
            System.out.println("Tienes " + cont + " intentos");
            num2 = leer.nextInt();
            
            cont = cont - 1;

            if (num2 < num1) {
                System.out.println("Mas alto");
            } else {
            if (num2 > num1) {
            System.out.println("Mas bajo");
            }
            }
            if (num2 == num1) {
                cont = cont + 1;
                System.out.println("Felicidades, Player 2 has ganado el juego!!!!!!!");
                break;
            }
        }
        if (cont == 0) {
            System.out.println("Lo sentimos... se ha quedado sin oportunidades");
        }
    }

}
