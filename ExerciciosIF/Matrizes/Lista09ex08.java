import java.util.Scanner;

public class Lista09ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = new int[3][3];
        int comparacao = 0;
        boolean igual = true;
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                m1[l][c] = in.nextInt();
            }
            System.out.println();
        }
        for (int l = 0; l < m1.length; l++) {
            int soma = 0;
            int somac =0;
            for (int c = 0; c < m1.length; c++) {
                soma += m1[l][c];
                somac += m1[c][l];
            }
            if(l ==0){
                comparacao =soma;
                continue;
            }
            if(soma != comparacao || somac != comparacao){
                igual = false;
                break;
            }
        }
        if(!igual)
        System.out.println("Não é mágico");
        else
        System.out.println("Mágico");
        in.close();
    }
}
