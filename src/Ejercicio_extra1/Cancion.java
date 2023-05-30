package Ejercicio_extra1;

import java.util.Scanner;

public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void escribirAutor(Cancion c1) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de un autor: ");
        autor = leer.next();
    }
    
    public void escribirTitulo(Cancion c1) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo de una cancion: ");
        titulo = leer.next();
    }

    @Override
    public String toString() {
        return "El autor es: " + autor + "." + " El titulo es: " + titulo + ".";
    }
    
    
}
