import java.util.Scanner;

public class ExAvaliacaoIIIex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m [][] = new int[3][3];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[0].length;j++){
                m[i][j] = in.nextInt();
            }
        }
        System.out.println("Informe o valor X:");
        int x = in.nextInt();

        for(int i = 0;i<m.length;i++){
            int somal = 0;
            int somac = 0;
            for(int j = 0;j<m[0].length;j++){
                somal += m[i][j];
                somac += m[j][i];
            }
            if(somal == x){
                System.out.println("Linha " + i + " tem a soma igual a X");
            }
            if(somac == x){
                System.out.println("Coluna " + i + " tem a soma igual a X");
            }
        }

        in.close();
    }
}
