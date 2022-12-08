
import java.util.Scanner;

public class ExAvaliacao03ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho = in.nextInt();
        int v1[] = new int [tamanho];
        tamanho = in.nextInt();
        int v2[] = new int[tamanho];
        int res[] = new int[2];
        int menorDiferenca = 0;
        for(int i = 0;i<v1.length;i++){
            v1[i] = in.nextInt();
        }
        for(int i = 0;i<v2.length;i++){
            v2[i] = in.nextInt();
        }
        for(int i = 0;i<v1.length;i++){
            for(int j = 0;j<v2.length;j++){
                if((Math.abs(v1[i] - v2[j]) < menorDiferenca) || i ==0){
                    menorDiferenca = Math.abs(v1[i] - v2[j]);
                    res[0] = v1[i];
                    res[1] = v2[j];
                }  
            }
        }
        for(int i = 0;i<res.length;i++){
            System.out.println(res[i] + " ");
        }
        System.out.println("DIFERENÇA: "  + menorDiferenca);
        in.close();
    }
}