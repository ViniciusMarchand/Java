
import java.util.Random;
import java.util.Scanner;

public class ExAvaliacao03ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        char[][] m = new char[10][10];
        int contador = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = '-';
            }
        }
        while (contador < 10) {
            char valor = ' ';
            if (contador < 3) {
                valor = 'A';
            } else if (contador < 6) {
                valor = 'B';
            } else if (contador < 8) {
                valor = 'C';
            } else if (contador < 10) {
                valor = 'D';
            }

            int posl = r.nextInt(m.length);
            int posc = r.nextInt(m[0].length);
            m[posl][posc] = valor;

            contador++;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        int pontos = 0;
        contador = 0;
        while(contador <10){
            System.out.println("Chute uma posição, colocando primeiro o valor da linha e depois o valor da coluna. Chute " + (contador+1));
            int posl = in.nextInt();
            int posc = in.nextInt();

            switch(m[posl][posc]){
                case 'A':
                    pontos += 1;
                break;

                case 'B':
                    pontos += 2;
                break;
                case 'C':
                    pontos += 6;
                break;
                case 'D':
                    pontos += 8;
                break;
            }
            contador++;
        }
        
        System.out.println("==========TABELA==========");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        System.out.println("Pontuação Total: " + pontos);

        in.close();
    }
}