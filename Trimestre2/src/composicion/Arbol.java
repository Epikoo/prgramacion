/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author usuario
 */
public class Arbol {
    private double altura;
    private String especie;
    private int edad;
    private Rama []ramas;
    
    public Arbol(double alto, String tipo, int age, int nramas){
        this.altura=alto;
        this.especie=tipo;
        this.edad=age;
        ramas=new Rama[nramas];
        for (int i = 0; i < nramas; i++) {
         ramas[i]= new Rama(1, "Azul", 5);
        }
      
}
    public void crecer(){
        this.altura*=1.1;
    }

    @Override
    public String toString() {
        String res= "Arbol " + "altura=" + altura + ", especie=" + especie + ", edad=" + edad + "\n";
        res +=this.ramas[0].toString()+ "\n";
        return res;
    }
    
}


