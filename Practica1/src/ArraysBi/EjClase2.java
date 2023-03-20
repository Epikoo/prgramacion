package ArraysBi;

public class EjClase2 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int matrizaux[][] = new int[5][5], suma=0, multi=1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 20) + 1;
            }
        }
        /*IMPRIMIR RAIZ*/
        System.out.println("LA MATRIZ PRINCIPAL ES");
        for (int i = 0; i < matrizaux.length; i++) {
            for (int j = 0; j < matrizaux[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        /*COPIAR MATRIZ*/
        for (int i = 0; i < matrizaux.length; i++) {
            for (int j = 0; j < matrizaux[i].length; j++) {
                matrizaux[i][j] = matriz[i][j];
            }
        }
        /*IMPRIMIR  COPIADA*/
        System.out.println("LA MATRIZ COPIADA");
        for (int i = 0; i < matrizaux.length; i++) {
            for (int j = 0; j < matrizaux[i].length; j++) {
                System.out.print(matrizaux[i][j] + " ");
            }
            System.out.println("");
        }
        /*CAMBIAR MATRIZ2 E IMPRIMIMOS*/
        System.out.println("CAMBIAMBOS LOS MAYORES DE 10 POR 9 E IMPRIMIMOS");
        for (int i = 0; i < matrizaux.length; i++) {
            for (int j = 0; j < matrizaux[i].length; j++) {
                if (matriz[i][j] >= 10) {
                    matrizaux[i][j] = 9;
                }
                suma+=matriz[i][j];
           
                System.out.print(matrizaux[i][j] + " ");
            }
            System.out.println("");
         
        }
         for (int i = 0; i < matrizaux.length; i++) {
            multi*=matriz[i][i];
          }
          System.out.println("LA SUMA DE LA MATRIZ: " + suma);
             System.out.println("LA MULTIPLICACIÓN DE LA MATRIZ: " + multi);
    }
}
