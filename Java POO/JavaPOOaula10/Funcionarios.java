package JavaPOOaula10;

public class Funcionarios extends Pessoa {
    
    private String setor;
    private boolean trabalhando;

    public Funcionarios(String no, int id, String se, String set) {
        super(no, id, se);
        this.setTrabalhando(true);
        this.setSetor(set);
    }

    public void mudarTrabalho(){
        if(trabalhando){
            this.setTrabalhando(false);
        }else{
            this.setTrabalhando(true);
        }
    }

    public void statusFuncio(){
        System.out.println(this.getTrabalhando());
        System.out.println(this.getSetor());
    }

    public String getSetor(){
        return this.setor;
    }
    public void setSetor(String se){
        this.setor = se;
    }

    public boolean getTrabalhando(){
        return this.trabalhando;
    }
    public void setTrabalhando(boolean tra){
        this.trabalhando = tra;
    }
}
