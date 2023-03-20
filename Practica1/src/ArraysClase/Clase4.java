
package ArraysClase;

public class Clase4 {
    public static void main(String[] args){
        int notas[] =new int[100], pares[], contadorpar=0, k=0;
        for (int i = 0; i <= notas.length-1; i++) {
            notas[i]=(int)(Math.random()*100+1);
            System.out.println(notas[i] + " ");
            if (notas[i]%2==0) {
                contadorpar++;
                
            }
    
          }
         pares=new int[contadorpar];
          
              for (int j = 0; j <= notas.length-1; j++) {
                  if (notas[j]%2==0) {
                      pares[k]=notas[j];
                      k++;
                 }
              
        }
          for(int i = 0; i <= pares.length-2; i++){
          System.out.print(pares[i] + " , ");
          }
          System.out.println(pares[pares.length-1]);
    }

}
