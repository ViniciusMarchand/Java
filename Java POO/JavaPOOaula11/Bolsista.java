package JavaPOOaula11;

public class Bolsista extends Aluno{
    private int bolsa;
    
    public Bolsista(String no, int id, String se, String cs) {
        super(no, id, se, cs);

    }

    public void renovarBolsa(int b){
        this.setBolsa(b);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga. Valor: " + (500- this.getBolsa()));
    }

    public int getBolsa(){
        return this.bolsa;
    }
    public void setBolsa(int b){
        this.bolsa = b;
    }
    
}
