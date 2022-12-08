package JavaPOOaula10;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;
    

    public Aluno(String no, int id, String se, String cs) {
        super(no, id, se);
        this.setMatricula(true);
        this.setCurso(cs);
    }

    public void cancelarMatricula(){
        this.setMatricula(false);
    }

    public void statusAluno(){
        System.out.println(this.getMatricula());
        System.out.println(this.getCurso());
    }

    public boolean getMatricula(){
        return this.matricula;
    }
    public void setMatricula(boolean ma){
        this.matricula = ma;
    }

    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String cs){
        this.curso = cs;
    }

    
    
}
