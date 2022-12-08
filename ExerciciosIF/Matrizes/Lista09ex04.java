import java.util.Scanner;

public class Lista09ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = new int[10][10];
        int contador = 1;
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                if (c != contador) {
                    m1[l][c] = 2;
                }else{
                    m1[l][c] = in.nextInt();
                }
            }
            contador++;
            System.out.println();
        }
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                System.out.print(m1[l][c] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
