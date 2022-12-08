import java.util.Scanner;


public class ExAvaliacaoIIIex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char m[][] = new char[3][5];
        char gabarito[] = new char[5];
        int pontos[] = new int[3];
        System.out.println("Insira o gabarito");
        for(int i = 0;i<gabarito.length;i++){
            gabarito[i] = in.next().toUpperCase().charAt(0);
        }
        for(int i = 0; i<m.length;i++){
            System.out.println("Insira as respostas do aluno " + (i+1));
            for(int j = 0; j<m[0].length;j++){
                m[i][j] = in.next().toUpperCase().charAt(0);
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j = 0; j<m[0].length;j++){
                if(m[i][j] == gabarito[j]){
                    pontos[i] += 2;
                }else if(m[i][j] != gabarito[j] && m[i][j] != 'N'){
                    pontos[i] -= 1;
                }
            }
        }
        
        for(int i=0;i<pontos.length;i++){
            System.out.println("Aluno " + (i+1) + " ficou com " + pontos[i] + " pontos.");
        }
        in.close();
    }
}
