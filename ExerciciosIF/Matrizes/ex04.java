import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m[][] = new int[12][4];
        System.out.println("Insira os valores.");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextInt();
            }
        }

        // Total vendido em cada mes
        System.out.println("Total vendido em cada mês.");
        for (int i = 0; i < m.length; i++) {
            int soma = 0;
            for (int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
            }
            System.out.println("Total do mês " + (i + 1) + " é de R$ " + soma);
        }
        System.out.println();
        // Total vendido em cada semana
        System.out.println("Total vendido em cada semana.");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Total da semana " + (j + 1) + " do mês " + (i + 1) + " é de R$ " + m[i][j]);
            }
        }
        System.out.println();
        // Total vendido no ano
        System.out.println("Total vendido no ano.");
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
            }
        }
        System.out.println();
        System.out.println("Total vendido no ano foi de R$ " + soma);
        in.close();
    }
}