package Ej70;

public class Rectangulo {

    private double altura, base;

    public Rectangulo(double altura, double base) {
        this.altura=altura;
        this.base=base;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * ( this.base + this.altura);
    }
    
    public String toString(){
        return "Rectangulo con base " + this.base + " y altura " + this.altura 
                +"\nArea: " + this.calcularArea() + "\nPerimetro: " +this.calcularPerimetro();
    }

}
