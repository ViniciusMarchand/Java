package JavaPOOaula09;
//nome, idade, sexo (tudo privado)
//fazerAniver();
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String se){
        this.setNome(no);
        this.setIdade(id);
        this.setSexo(se);
    }

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String se){
        this.sexo = se;
    }
}
