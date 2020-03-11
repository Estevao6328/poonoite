
public class Main {

    public static void main(String[] args) {
        int[] x = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }
        int[] y = {3,5,7,9,11};
        for (int i = 0; i < 5; i++) {
            System.out.println(y[i]);
        }
        for (int valor:  y) {
            System.out.println(valor);
        }
        int[][] matriz = new int[9][9];
        for (int i = 0; i < 5; i++) {
           matriz[i][i] = 1;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%3d] ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Tamanho: " + y.length);
        String nome = "Marcos";
    }
}
