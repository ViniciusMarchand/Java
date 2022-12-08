import java.util.Scanner;

public class Lista09ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = new int[12][4];
        int mesq =12;
        for (int l = 0; l < 12; l++) {
            System.out.println("Mês "+(l+1) + ":");
            for (int c = 0; c < 4; c++) {
                m1[l][c] = in.nextInt();
            }
            System.out.println();
        }
        for(int mes = 0; mes<mesq;mes++){
            int soma = 0;
            for(int quant = 0; quant<4;quant++){
                soma+= m1[mes][quant];
            }
            System.out.println("Mês " + (mes+1) + " você ganhou: R$ " +soma);
        }
        System.out.println();
        for(int mes = 0; mes<mesq;mes++){
            for(int quant = 0; quant<4;quant++){
                System.out.println("Semana " + (quant+1) + " do mês " + (mes+1)+ " foi um total de "+ m1[mes][quant]);
            }
        }
        System.out.println();
        int TOTAL = 0;
        for(int mes = 0; mes<mesq;mes++){
            for(int quant = 0; quant<4;quant++){
                TOTAL+= m1[mes][quant];
            }
        }
        System.out.println("TOTAL DO ANO = R$ " + TOTAL );
            
        in.close(); 
    }
}
