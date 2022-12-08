
import java.util.Scanner;
public class ExAvaliacao03ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] [] m = new int [3][3];
        //lendo a matriz
        for(int i = 0;i<m.length;i++){
            for(int j = 0; j<m[0].length;j++){
                m[i][j] = in.nextInt();
            }
        }
        //Mostrando a matriz
        for(int i = 0;i<m.length;i++){
            for(int j = 0; j<m[0].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        //Execução da lógica
        //MENOR LINHA SOMA 
        int menorSomaLinha = 0;
        int posLinhaMenor = 0;

        for(int i = 0;i<m.length;i++){
            int soma = 0;
            for(int j = 0; j<m[0].length;j++){
                soma += m[i][j];
            }
            if((soma<menorSomaLinha) || i==0){
                menorSomaLinha = soma;
                posLinhaMenor = i;
            }
        }
        //MAIOR COLUNA SOMA
        int maiorSomaColuna = 0;
        int posColunaMaior = 0;

        for(int i = 0;i<m.length;i++){
            int soma = 0;
            for(int j = 0; j<m[0].length;j++){
                soma += m[j][i];
            }
            if(soma>maiorSomaColuna|| i==0){
                maiorSomaColuna = soma;
                posColunaMaior = i;
            }
        }

        System.out.println("Menor Linha:" + posLinhaMenor);
        System.out.println("MaiorColuna:" + posColunaMaior);
        in.close();
    }
}