package JavaPOOaula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float Salario;
    public Professor(String no, int id, String se, String es,float sa) {
        super(no, id, se);
        this.setEspecialidade(es);
        this.setSalario(sa);
        
    }

    public void receberAumento(int au){
        this.setSalario(this.getSalario() + au);
    }

    public void statusProfessor(){
        System.out.println(this.getSalario());
        System.out.println(this.getEspecialidade());
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String es){
        this.especialidade = es;
    }

    public float getSalario(){
        return this.Salario;
    }
    public void setSalario(float sa){
        this.Salario = sa;
    }
    
}
