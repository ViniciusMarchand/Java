package JavaPOOaula10;
public class aula10{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Claudio",45, "Masculino");
        Aluno p2 = new Aluno("Pedro", 14, "Masculino", "Programação");
        Professor p3 = new Professor("Roberto", 67, "Masculino","Físico", 3516.60f);
        Funcionarios p4 = new Funcionarios("Vanessa", 25, "Feminino", "Secretária");


        p1.statusPessoa();
        p2.statusAluno();
        p3.statusProfessor();
        p4.statusFuncio();
        System.out.println();
        p2.cancelarMatricula();
        p3.receberAumento(100);
        p4.mudarTrabalho();
        p2.statusAluno();
        p3.statusProfessor();
        p4.statusFuncio();
        
        
        
        

        

    }
}