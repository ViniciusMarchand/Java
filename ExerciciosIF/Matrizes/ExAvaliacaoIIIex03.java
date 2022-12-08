import java.util.Scanner;
import java.util.Random;

public class ExAvaliacaoIIIex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int m [][] = new int[5][5];
        for(int i = 0; i<m.length;i++){
            for(int j = 0;j<m[0].length;j++){
                int random = r.nextInt(10);
                m[i][j] = random;
            }
        }
        for(int i = 0; i<m.length;i++){
            for(int j = 0;j<m[0].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        while(true){
        System.out.println("Insira um valor para linha e outro para coluna.");
        int valorl = in.nextInt();
        int valorc = in.nextInt();
        if(valorc < 0 || valorl<0){
            break;
        }
        int somal = 0;
        int somac = 0;
        for(int i = 0; i<m.length;i++){
            somal += m[valorl][i];
            somac += m[i][valorc];
        }
        System.out.println("soma da linha " + valorl + " é igual a " + somal);
        System.out.println("soma da linha " + valorc + " é igual a " + somac);
        }
        in.close();
    }
}
