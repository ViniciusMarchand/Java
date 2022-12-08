import java.util.Scanner;

public class Lista09ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = new int[5][5];
        boolean tem = false;
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                m1[l][c] = in.nextInt();
            }
            System.out.println();
        }
        System.out.println("ESCOLHA A VARIÁVEL X:");
        int x = in.nextInt();
        for (int l = 0; l < m1.length; l++) {
            int soma = 0;
            for (int c = 0; c < m1.length; c++) {
                soma += m1[l][c];
            }
            if(soma == x){
                System.out.println("Linha " + l);
                tem = true;
            }
        }
        if(!tem)
            System.out.println("Nenhuma linha soma o valor informado.");
        in.close();
    }
}
