package JavaPOOaula11;
public class aula11{
    public static void main(String[] args) {

        Aluno a1 = new Aluno("PEDRO",16, "MASC", "INFORMARICA");

        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista("JUBILEU", 17, "MASC", "INFORMATICA");
        b1.setBolsa(10);
        b1.pagarMensalidade();
        

    }
}