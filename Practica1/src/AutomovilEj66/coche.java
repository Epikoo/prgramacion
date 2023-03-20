/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutomovilEj66;

/**
 *
 * @author usuario
 */
public class coche {

    int ruedas, puertas;
    String color;
    double altura;
    boolean encendido, haygasofa;
    int gasolina;

    public coche(int ruedas, int puertas, String color, double altura, int gasolina) {
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.color = color;
        this.altura = altura;
        this.encendido = false;
        this.haygasofa=false;
        this.gasolina = gasolina;
    }

    public void arrancar() {
        chequear();
        if (encendido) {
            System.out.println("Error no se puede encender algo encendido");
        } else {
            if (this.gasolina >= 5) {
                System.out.println("....................Arrancando coche.............................");
                System.out.println("BRRRRRRRRRRUM");
                encendido = true;
                this.gasolina -= 5;
                System.out.println("Le quedan " + this.gasolina + "L de gasolina");
            } else {
                System.out.println("Echa gasoil tieso que no vas a pasar ni la esquina");
            }
        }
    }

    public void apargar() {
        if (encendido) {
            System.out.println("........................Apagando coche.............................");
            encendido = false;
        } else {
            System.out.println("El coche esta apagado no se puede apagar");
        }
    }

    public void moverse() {
        if (this.gasolina>=20) {
            if (encendido) {
            System.out.println("el coche se esta desplazando ........");
            this.gasolina-=20;
                System.out.println("Le quedan " + this.gasolina + "L de gasolina");
        } else {
            System.out.println("Para mover el coche hay que encenderlo antes");
        }
        }else{
            System.out.println("Si quieres andar echale caldo");
        }
        
    }

    public void repostar(int L) {
   
           if (this.gasolina+L>50){
               System.out.println("No entran tantos litros");
           }else{
               System.out.println("Reporstando gasolina............................");
               System.out.println("Tiene usted " + this.gasolina + "L de gasofa");
           }
        }
    public void chequear(){
        if(this.gasolina>0){
            this.haygasofa=true;
        }else{
            this.haygasofa=false;
        }
    }
    public String toString(){
        String res="";
        
        res+="Mi coche tiene" + this.ruedas+ " ruedas y  " + this.puertas+" puertas, es de color " + this.color + "\n Mide " + this.altura + " en cm, con una gasolina de  " + this.gasolina+ "  Litros";
        
        return res;
    }
    public void pintar(String color ){
        this.color=color;
        
}
}