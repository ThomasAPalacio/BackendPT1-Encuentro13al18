
package Ejercicio_guia01;

import java.util.Scanner;

public class Ejercicio_guia1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el apellido del usuario:");
        
        System.out.println("El nombre es: ");
        
        Persona persona1 = new Persona("Thomas", "Alberdi", 20);
        
        
        //CON ESTO PUEDO CAMBIAR EL NOMBRE (EN ESTE EJEMPLO) Y LUEGO LO IMPRIMO POR PANTALLA
        persona1.setNombre("Santiago");
        
        System.out.println(persona1.getNombre());
        
        System.out.println(persona1.toString());
        
    }
    
}
