package Ejercicio_extra6;

import java.util.Scanner;

public class Empleado {

    public String nombre;
    public int edad;
    public int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void datos(Empleado e1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        
        System.out.println("Ingrese su salario actual: ");
        salario = leer.nextInt();
    }

    public void calcularAumento(Empleado e1) {

        if (edad > 30) {
            System.out.println("Debido que tu edad es mayor a 30 edad tu salario aumento un 10%");
            System.out.println("Quedandote con un sueldo de : $" + (salario*1.10));
        } else if (edad < 30) {
             System.out.println("Debido que tu edad es mayor a 30 edad tu salrio aumento un 5%");
             System.out.println("Quedandote con un sueldo de : $" + (salario*1.05));
        } else if (edad == 30) {
            System.out.println("Debido a que usted tiene 30 edad su salario no se modifica.");
        }
        
        
    }
}
