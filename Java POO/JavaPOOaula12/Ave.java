package JavaPOOaula12;

public class Ave extends Animal {
    private String corPena;
    @Override
    public void locomover() {
        System.out.println("VOANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("MINHOCAS");
    }

    @Override
    public void emitirSom() {
        System.out.println("SONS DE AVE");
    }

    public void fazerNinho(){
        System.out.println("CONSTRUIU NINHO");
    }

    public String corPena(){
        return this.corPena;
    }
    public void corPena(String co){
        this.corPena = co;
    }
    
}
