package Ejercicio_extra2;

import java.util.Scanner;

public class Puntos {

    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public Puntos() {
    }

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    
    
    public void crearPuntos(Puntos p1) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la primera coordenada: ");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
        
        System.out.println("La primera coordenada es: " + "(" + x1 + "," + y1 + ")");
        
        System.out.println("Ingrese la segunda coordenada: ");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        
        System.out.println("La segunda coordenada es: " + "(" + x2 + "," + y2 + ")");
    }

    public void calcularDistancia(Puntos p1) {
        double result = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("La distancia entre los puntos es: "+ result);
    }
}
