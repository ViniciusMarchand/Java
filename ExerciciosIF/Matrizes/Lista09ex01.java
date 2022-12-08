import java.util.Scanner;
public class Lista09ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1 [][] = new int[3][3];
        int m2 [][] = new int[3][3];
        int m3 [][] = new int[3][3];
        System.out.println("MATRIZ 1");
        for(int l = 0; l<m1.length;l++){
            for(int c = 0; c< m2.length;c++){
                m1[l][c] = in.nextInt();
            }
        }
        System.out.println("MATRIZ 2");
        for(int l = 0; l<m1.length;l++){
            for(int c = 0; c< m2.length;c++){
                m2[l][c] = in.nextInt();
            }
        }
        //SOMA
        for(int l = 0; l<m1.length;l++){
            for(int c = 0; c< m2.length;c++){
                m3[l][c] = m1[l][c] + m2[l][c];
                System.out.print(m3[l][c]+" ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
