//Crear una clase llamada Libro que contenga los siguientes atributos: 
//ISBN, Título, Autor, Número de páginas, y un constructor con todos 
//los atributos pasados por parámetro y un constructor vacío. 
//Crear un método para cargar un libro pidiendo los datos al usuario 
//y luego informar mediante otro método el número de ISBN, el título, el autor del libro 
//y el número de páginas.
package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Primero - el numero del ISBN: ");
        System.out.println("Segundo - el nombre del titulo: ");
        System.out.println("Tercero - el nombre del autor: ");
        System.out.println("Cuarto - la cantidad de paginas: ");

       Libro persona1 = new Libro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
       
        System.out.println(persona1.toString());
       
    }

}
