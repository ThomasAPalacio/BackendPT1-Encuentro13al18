//Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
//Se deberá definir además dos constructores: uno vacío que inicializa el título 
//y el autor a cadenas vacías y otro que reciba como parámetros el título 
//y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
package Ejercicio_extra1;

public class Ejercicio_extra1 {

    public static void main(String[] args) {
       
        Cancion c1 = new Cancion();
        
        c1.escribirAutor(c1);
        c1.escribirTitulo(c1);
        
        System.out.println(c1.toString());
        
    }
    
}
