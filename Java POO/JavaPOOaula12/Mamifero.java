package JavaPOOaula12;

public class Mamifero extends Animal {
    private String corPelo;
    @Override
    public void locomover() {
        System.out.println("CORRENDO");
    }

    @Override
    public void alimentar() {
        System.out.println("INGERINDO COMIDA PELA BOCA");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE MAMÍFERO");
    }

    public String getCorPelo(){
        return this.corPelo;
    }
    public void setCorPelo(String co){
        this.corPelo = co;
    }

}
