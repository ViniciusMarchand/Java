package JavaPOOaula13;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("NADANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("COMENDO ALGAS OU PEIXES MENORES");
    }

    @Override
    public void emitirSom() {
        System.out.println("SPEIXE NÃO FAZ SOM ");
    }

    public void soltarBolhas(){
        System.out.println("SOLTANDO BOLHAS");
    }

    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String es){
        this.corEscama = es;
    }
    
}
