package Ejercicio_4;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void crearRectangulo(Rectangulo n1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de la base del 1 al 10: ");
        base = leer.nextDouble();
        System.out.println("Ingrese le numero de la altura del 1 al 10: ");
        altura = leer.nextDouble();

        while (base < 0 && base > 10 || altura < 0 && altura > 10) {
            System.out.println("ERROR! Ingrese nuevamente los dos numeros: ");
            System.out.println("Ingrese la base: ");
            base = leer.nextDouble();
            System.out.println("Ingrese la altura: ");
            altura = leer.nextDouble();
        }
    }

    public void calcularSuperficie(Rectangulo n1) {
        System.out.println("La superficie del rectangulo es: " + (base * altura));
    }

    public void calcularPerimetro(Rectangulo n1) {
        System.out.println("El perimetro del rectangulo es: " + (base + altura) * 2);
    }
    
    public void dibujarRectangulo(Rectangulo n1) {
         for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i==0 || i==base-1 || j==0 || j==altura-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
