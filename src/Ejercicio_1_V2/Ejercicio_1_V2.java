//Crear una clase llamada Libro que contenga los siguientes atributos: 
//ISBN, Título, Autor, Número de páginas, y un constructor con todos 
//los atributos pasados por parámetro y un constructor vacío. 
//Crear un método para cargar un libro pidiendo los datos al usuario 
//y luego informar mediante otro método el número de ISBN, el título, el autor del libro 
//y el número de páginas.
package Ejercicio_1_V2;

public class Ejercicio_1_V2 {

    public static void main(String[] args) {

        Libro_V2 l1 = new Libro_V2();

        l1.cargarLibro(l1);

        System.out.println(l1.toString());

    }

}
