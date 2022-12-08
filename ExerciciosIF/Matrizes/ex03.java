import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m[][] = {
                { "BRASIL", "ALEMANHA" },
                { "FRANCA", "ITALIA" },
                { "ITALIA", "BRASIL" },
                { "FRANCA", "ALEMANHA" }
        };
        System.out.println("JOGOS: ");
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int ma[][] = new int[4][2];
        System.out.println("Insira os resultados:");
        int resultados[] = new int[4];
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = in.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if (resultados[i] == 0) {
                ma[i][0]++;
                ma[i][1]++;
            } else if (resultados[i] == 1) {
                ma[i][0] += 3;
            } else if (resultados[i] == 2) {
                ma[i][1] += 3;
            }
        }
        int brasil = ma[0][0] + ma[2][1];
        int franca = ma[1][0] + ma[3][0];
        int italia = ma[1][1] + ma[2][0];
        int alemanha = ma[0][1] + ma[3][1];

        System.out.println("========TABELA DE PONTOS=======");
        System.out.println("BRASIL: " + brasil);
        System.out.println("ITALIA: " + italia);
        System.out.println("FRANCA: " + franca);
        System.out.println("ALEMANHA " + alemanha);
        System.out.println("===============================");

        if (brasil > franca && brasil > italia && brasil > alemanha) {
            System.out.println("A MAIOR PONTUAÇÃO FOI DO BRASIL");
        }
        if (franca > brasil && franca > italia && franca > alemanha) {
            System.out.println("A MAIOR PONTUAÇÃO FOI DA FRANÇA");
        }
        if (italia > franca && italia > brasil && italia > alemanha) {
            System.out.println("A MAIOR PONTUAÇÃO FOI DA ITALIA");
        }
        if (alemanha > franca && alemanha > italia && alemanha > brasil) {
            System.out.println("A MAIOR PONTUAÇÃO FOI DO BRASIL");
        }

        in.close();
    }
}