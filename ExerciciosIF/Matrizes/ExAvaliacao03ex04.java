
import java.util.Scanner;

public class ExAvaliacao03ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra = in.next();
        int padrao = in.nextInt();
        String resposta = "";

        for(int i = 0;i<palavra.length();i++){
            char letra = palavra.charAt(i);
            if(letra == ' '){
                resposta += ' ';
                continue;
            }
            int conversor = (int)letra;
            conversor += padrao;
            if(conversor > 122){
                conversor -= 26;
            }
            letra = (char) conversor;
            resposta += letra;

        }
        System.out.println(resposta);
        in.close();
    }
}