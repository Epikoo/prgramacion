package ArraysBi;

public class EjClase1 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int matrizaux[][]= new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 10;
                } else {
                    matriz[i][j] = 20;
                }

            }

        }
        System.out.println("La matriz ordenada es :");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length-1; j++) {
                System.out.print(matriz[i][j] + " , ");
            }
            System.out.println(matriz[i][matriz[i].length-1] + "]");
        }
        
        
        
          System.out.println("La matriz desordenada es :");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==10) {
                    System.out.print("20 ");
                }else{
                       System.out.print("10 "); 
            }
        }
            System.out.println("] ");
    

}
    }
}
