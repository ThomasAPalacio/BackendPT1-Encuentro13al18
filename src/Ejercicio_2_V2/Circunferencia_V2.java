package Ejercicio_2_V2;

import java.util.Scanner;

public class Circunferencia_V2 {

    private double radio;

    public Circunferencia_V2() {
    }

    public Circunferencia_V2(double radio) {
        this.radio = radio;
    }

    //muestra(retorna)
    public double getRadio() {
        return radio;
    }

    //escribir o modificar
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(Circunferencia_V2 c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        c1.radio = leer.nextDouble();

    }

    public void calcularArea(Circunferencia_V2 c1) {

        System.out.println("El area es de: " + Math.PI * Math.pow(c1.getRadio(), 2));
    }

    public void calcularPerimetro(Circunferencia_V2 c1) {
        //Perimetro=2*π*radio

        System.out.println("El perimetro es de: " + Math.PI * c1.getRadio() * 2);

    }

}
