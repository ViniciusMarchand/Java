package JavaPOOaula11;

abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String se){
        this.setNome(no);
        this.setIdade(id);
        this.setSexo(se);
    }
    public final void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

    public void statusPessoa(){
        System.out.println("NOME: " + this.getNome());
        System.out.println("IDADE: "  + this.getIdade());
        System.out.println("SEXO: "  + this.getSexo());
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
