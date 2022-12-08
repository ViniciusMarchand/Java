
public class aula04 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("NIC" , "Amarelo", 0.4f);
        Caneta c2 = new Caneta("BIC", "Azul", 0.5f);
        c1.status();
        System.out.println();
        c2.status();
    }
}