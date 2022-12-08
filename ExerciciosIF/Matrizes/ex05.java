import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m[][] = new int[9][9];
        boolean valido = true;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                for (int a = 0; a < m[0].length; a++) {
                    if (m[i][j] == m[i][a] && j != a) {
                        valido = false;
                        break;
                    }
                }
                if (!valido)
                    break;
            }
            if (!valido)
                break;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                for (int a = 0; a < m[0].length; a++) {
                    if (m[j][i] == m[a][i] && j != a) {
                        valido = false;
                        break;
                    }
                }
                if (!valido)
                    break;
            }
            if (!valido)
                break;
        }

        
        for (int b = 0; b < 9; b += 3) {
            for (int a = 0; a < 9; a += 3) {
                for (int i = a; i < a + 3; i++) {
                    for (int j = b; j < b + 3; j++) {
                        for (int i1 = a; i1 < a + 3; i1++) {
                            for (int j1 = b; j1 < b + 3; j1++) {
                                if (j1 != j && i != i1 && m[i][j] == m[i1][j1]) {
                                    valido = false;
                                    break;
                                }
                            }
                            if (!valido)
                                break;
                        }
                        if (!valido)
                            break;
                    }
                    if (!valido)
                        break;
                }
                if (!valido)
                    break;
            }
        }

        if (!valido) {
            System.out.println("O jogo não é válido...");
        } else {
            System.out.println("O jogo é válido!");
        }
        in.close();
    }
}