package Ejercicio_1_V2;

import java.util.Scanner;

public class Libro_V2 {
    
        public int isbn;
        public String titulo;
        public String autor;
        public int paginas;

        public Libro_V2 (int isbn, String titulo, String autor, int paginas) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }

        public Libro_V2() {
        }

        public void cargarLibro(Libro_V2 l1) {
            Scanner leer1 = new Scanner(System.in);
            Scanner leer2 = new Scanner(System.in);
            System.out.println("Ingrese los ISBN");
            this.isbn = leer1.nextInt();
            System.out.println("Ingrese el titulo");
            this.titulo = leer2.nextLine();
            System.out.println("Ingrese el nombre del autor");
            this.autor = leer2.nextLine();
            System.out.println("Ingrese cantidad de paginas");
            this.paginas = leer1.nextInt();

        }

        @Override
        public String toString() {
            return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
        }

    }
