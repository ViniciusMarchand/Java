import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        // Multiplicação de Matrizes
        Scanner in = new Scanner(System.in);
        System.out.println("DIGITE O TAMANHO DO VETOR A, LINHA E COLUNA");

        int la = in.nextInt();
        int ca = in.nextInt();
        int a[][] = new int[la][ca];
        System.out.println("DIGITE O VALOR DA MATRIZ A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("DIGITE O TAMANHO DO VETOR B, LINHA E COLUNA");

        int lb = in.nextInt();
        int cb = in.nextInt();
        int b[][] = new int[lb][cb];

        System.out.println("DIGITE O VALOR DA MATRIZ B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = in.nextInt();
            }
        }

        System.out.println("-----------------");

        if (ca == lb && la == cb) {
            int res[][] = new int[cb][la];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int x = 0; x < a[0].length; x++) {
                        res[i][j] += a[i][x] * b[x][j];

                    }

                }
            }


            for(int i = 0; i<res.length;i++){
                for(int j = 0; j<res.length;j++){
                    System.out.print(res[i][j] +" ");
                }
                System.out.println();
            }




            boolean isIdentidade = true;
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[0].length; j++) {
                    if(i != j && res[i][j] != 0 ){
                        isIdentidade = false;
                    }
                    if(i == j && res[i][j] != 1){
                        isIdentidade = false;
                    }
                    if(!isIdentidade){
                        break;
                    }
                }

                if(!isIdentidade){
                    break;
                }

            }

            if(isIdentidade){
                System.out.println("São Inversas");
            }else{
                System.out.println("Não são Inversas");
            }
        }

        in.close();
    }
}