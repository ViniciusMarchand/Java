import java.util.Scanner;

public class ex032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m[][] = {
                { "BRASIL", "ALEMANHA" },
                { "FRANCA", "ITALIA" },
                { "ITALIA", "BRASIL" },
                { "FRANCA", "ALEMANHA" }
        };
        int brasil = 0;
        int alemanha = 0;
        int franca = 0;
        int italia = 0;
        System.out.println("JOGOS: ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Insira os resultados:");
        int resultados[] = new int[4];

        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = in.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < 4; i++) {

            if (resultados[i] == 2) {
                pos = 1;
            } else if (resultados[i] == 1) {
                pos = 0;
            }
            if (resultados[i] == 0) {
                if (m[i][0].equals("BRASIL") || m[i][1].equals("BRASIL")) {
                    brasil++;
                } if (m[i][0].equals("FRANCA") || m[i][1].equals("FRANCA")) {
                    franca++;
                } if (m[i][0].equals("ITALIA") || m[i][1].equals("ITALIA")) {
                    italia++;
                } if (m[i][0].equals("ALEMANHA") || m[i][1].equals("ALEMANHA")) {
                    alemanha++;
                }
            } else {
                switch (m[i][pos]) {
                    case "BRASIL":
                        brasil += 3;
                        break;
                    case "ALEMANHA":
                        alemanha += 3;
                        break;
                    case "FRANCA":
                        franca += 3;
                        break;
                    case "ITALIA":
                        italia += 3;
                        break;
                }
            }
        }

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