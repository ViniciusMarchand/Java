
import java.util.Scanner;

public class ExAvaliacao03ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[] v = new int[3];
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
            int achou = 0;
            for (int j = 0; j < m[0].length; j++) {
                for (int a = 0; a < v.length; a++) {
                    if (m[i][j] == v[a]) {
                        achou++;
                        break;
                    }
                }
                if (achou == 3) {
                    System.out.println("Linha " + i + " é igual");
                }
            }

        }

        in.close();
    }
}