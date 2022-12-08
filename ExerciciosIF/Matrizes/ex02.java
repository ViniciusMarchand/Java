import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o tamanho da matriz:");
        int n = in.nextInt();

        int m[][] = new int[n][n];
        System.out.println("Insira os valores da matriz:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextInt();
            }
        }

        int mT[][] = new int[n][n];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                mT[i][j] = m[j][i];
            }
        }

        // OPERAÇÕES
        int mSOMA[][] = new int[n][n];
        int mSUB[][] = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                mSOMA[i][j] = m[i][j] + mT[i][j];
                mSUB[i][j] = m[i][j] - mT[i][j];
            }
        }

        // MOSTRANDO OS RESULTADOS
        // TRANSPOSTA
        System.out.println("Resultado da transposta:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(mT[i][j] + " ");
            }
            System.out.println();
        }
        // SOMA
        System.out.println("Resultado da soma:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(mSOMA[i][j] + " ");
            }
            System.out.println();
        }
        // SUB
        System.out.println("Resultado da subtração:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(mSUB[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
