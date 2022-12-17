package JavaPOOaula13;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("RASTEJANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("COMENDO INSETOS FOLHAS ETC");
    }

    @Override
    public void emitirSom() {
        System.out.println("SONS DE REPTEIS");
    }

    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String es){
        this.corEscama = es;
    }
    
}
