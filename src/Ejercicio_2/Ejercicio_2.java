//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
//A continuación, se deben crear los siguientes métodos:

//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de radio: ");
        
        Circunferencia p1 = new Circunferencia(leer.nextDouble());
        
        System.out.println("El area de la circunferencia es: ");
        System.out.println(p1.area());
        
        System.out.println("El perimetro de la circunferencia es: ");
        System.out.println(p1.perimetro());
    }
    
}
