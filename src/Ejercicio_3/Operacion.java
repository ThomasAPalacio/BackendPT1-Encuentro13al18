package Ejercicio_3;

import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;

    public Operacion() {

    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void crearOperacion(Operacion p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero (mayor a 0):");
        p1.num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero (mayor a 0): ");
        p1.num2 = leer.nextDouble();
    }

    public void sumar(Operacion p1) {
        System.out.println("El resultado de la suma entre los dos numero es: " + (num1 + num2));
    }

    public void restar(Operacion p1) {
        System.out.println("El resultado de la resta entre los dos numero es: " + (num1 - num2));
    }

    public void multiplicar(Operacion p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("El resultado de la multiplicacion entre los dos numero es: " + (num1 * num2));
        do  {
            System.out.println("ERROR! ingrese nuevamente ambos numeros y que sean mayor a 0 para poder hacer la multiplicacion");
            p1.num1 = leer.nextDouble();
            p1.num2 = leer.nextDouble();
        } while (num1 <= 0 && num2 <= 0);
        System.out.println("Ahora si el resultado de la multiplicacion entre los dos numero es: " + (num1 * num2));

    }

    public void dividir(Operacion p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("El resultado de la division entre los dos numero es: " + (num1 / num2));
        do { 
            System.out.println("ERROR! ingrese nuevamente ambos numeros y que sean mayor a 0 para poder hacer la division");
            p1.num1 = leer.nextDouble();
            p1.num2 = leer.nextDouble();
        } while (num1 <= 0 && num2 <= 0);
        System.out.println("Ahora si, el resultado de la division entre los dos numero es: " + (num1 / num2));
    }
    }
