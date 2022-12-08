import java.util.Scanner;

public class Lista09ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = new int[10][10];
        for (int l = 0; l < m1.length; l++) {
            for (int c = 0; c < m1.length; c++) {
                m1[l][c] = in.nextInt();
            }
            System.out.println();
        }
        m1[4][5] = 5;
        int posl = 4;
        int posc = 5;

        while(true){
            for (int l = 0; l < m1.length; l++) {
                for (int c = 0; c < m1.length; c++) {
                    System.out.print(m1[l][c] + " ");
                }
                System.out.println();
            }
            char move = in.next().charAt(0);
            if(move == 'W'){
                int aux = m1[posl][posc];
                m1[posl][posc] = m1[posl-1][posc];
                m1[posl-1][posc] = aux;

                posl--;
            }
            if(move == 'S'){
                int aux = m1[posl][posc];
                m1[posl][posc] = m1[posl+1][posc];
                m1[posl+1][posc] = aux;

                posl++;
            }
            if(move == 'D'){
                int aux = m1[posl][posc];
                m1[posl][posc] = m1[posl][posc+1];
                m1[posl][posc+1] = aux;

                posc++;
            }
            if(move == 'A'){
                int aux = m1[posl][posc];
                m1[posl][posc] = m1[posl][posc-1];
                m1[posl][posc-1] = aux;

                posc--;
            }
            in.close();
        }
        

    }
}
