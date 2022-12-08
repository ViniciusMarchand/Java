import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m[][] = new int[3][3];
        System.out.println("Insira os valores da matriz.");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextInt();
            }
        }
        int soma;
        int menor = 0;
        int maior = 0;
        for (int i = 0; i < m.length; i++) {
            soma = 0;

            for (int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
            }

            if (soma > maior || i == 0) {
                maior = soma;
            }
            if (soma < menor || i == 0) {
                menor = soma;
            }
        }
        int diferenca = maior - menor;
        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);
        System.out.println("DIFERENÇA: " + diferenca);

        in.close();
    }
}