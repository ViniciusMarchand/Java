import java.util.Scanner;
public class Lista09ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1 [][] = new int[4][3];
        System.out.println("MATRIZ 1");
        int contador = 1;
        int bin = 0;
        for(int l = 0; l<m1.length;l++){
            for(int c = 0; c< m1.length-1;c++){
                if(contador%2==1){
                    bin = 0;
                }else{
                    bin =1;
                }
                m1[l][c] = bin;
                contador++; 
                System.out.print(m1[l][c]+" ");
            }
            System.out.println();
        }

        

        
        in.close();
    }
}
