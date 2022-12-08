import java.util.Scanner;
import java.util.Random;

public class ExAvaliacaoIIIex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int bingo[][] = new int [5][5];
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                int valor = r.nextInt(26);
                boolean veri = false;
                for (int i1 = 0; i1 < bingo.length; i1++) {
                    int colunaLinha = 4;
                    if(i1 == i){
                        colunaLinha = j;
                    }
                    for (int j1 = 0; j1 <= colunaLinha; j1++) {
                        if(bingo[i1][j1] == valor){
                            veri = true;
                            break;
                        }
                    }
                }
                if(!veri){
                    bingo[i][j] = valor;
                }else{
                    j--;
                }
            }
        }

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                System.out.print(bingo[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
