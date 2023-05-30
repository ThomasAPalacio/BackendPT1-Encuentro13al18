package Ejercicio_1;

public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;
    
    public Libro() {
        
    }
    
    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro: " + " isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas;
    }

   
    
}
