package Ejercicio_2;

public class Circunferencia {

    private double radio;
    private int area;
    private int perimetro;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public int getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public double crearCircunferencia(double valorRadio) {

        radio = valorRadio;

        return radio;
    }

    public double area() {
        area = (int) ((3.14 * radio) * 2);
        
        return area;
    }

    public double perimetro() {
        perimetro = (int) (2 * 3.14 * radio);
        
        return perimetro;
    }

  
}
