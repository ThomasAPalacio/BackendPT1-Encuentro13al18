package Ejercicio_extra7;

import java.util.Scanner;

public class Rectangulo {
    
    public int lado1;
    public int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void cacularArea(Rectangulo r1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        lado1 = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        lado2 = leer.nextInt();
        
         System.out.println("El area del rectangulo es: " + (lado1 * lado2));
    }
    
    public void calcuArea(Rectangulo rectangulo1) {
        System.out.println("---------------------------------------");
        System.out.println("La otra area del rectangulo es: " + (4*6));
    }
    
}
