import java.util.Scanner;

public class Lista09ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = new int[10][10];
        int contador =0;
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                m1[l][c] = contador;
                contador++;
            }
        }
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                System.out.print(m1[l][c] + " ");
                if(l ==0) System.out.print(" ");
            }
            System.out.println();
        }
        //SEGUNDA LINHA PELA OITAVA LINHA
        int lin[] = new int[10];
        for(int i = 0; i<10; i++){
            lin[i] = m1[1][i];
        }
        for(int i = 0;i<10;i++){
            m1[1][i] = m1[7][i];
            m1[7][i] = lin[i];
        }
        System.out.println("=============TROCA SEGUNDA LINHA PELA OITAVA LINHA==========");
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                System.out.print(m1[l][c] + " ");
            }
            System.out.println();
        }
        //QUARTA COLUNA PELA DÉCIMA COLUNA
        for(int i = 0; i<10; i++){
            lin[i] = m1[i][3];
        }
        for(int i = 0;i<10;i++){
            m1[i][3] = m1[i][9];
            m1[i][9] = lin[i];
        }
        System.out.println("=============TROCA QUARTA COLUNA PELA DÉCIMA COLUNA==========");
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                System.out.print(m1[l][c] + " ");
                if(l ==0) System.out.print(" ");
            }
            System.out.println();
        }
        //DIAGONAL PRINCIPAL PELA SECUNDARIA

        for(int i = 0; i<10; i++){
            lin[i] = m1[i][i];
        }
        for(int i = 0;i<10;i++){
            m1[i][i] = m1[i][9-i];
            m1[i][9-i] = lin[i];
        }
        System.out.println("=============TROCA DE DIAGONAL==========");
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                System.out.print(m1[l][c] + " ");
                if(l ==0) System.out.print(" ");

            }
            System.out.println();
        }

        in.close(); 
    }
}
