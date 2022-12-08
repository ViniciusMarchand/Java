
package JavaPOOaula07;
import java.util.Random;
public class Luta {
    Random r = new Random();
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador dd, Lutador dt){
        if(dd.getCategoria() == dt.getCategoria() && dd != dt){
            this.aprovada = true;
            this.setDesafiado(dd);
            this.setDesafiante(dt);
        }else{
            this.aprovada =false;
            this.desafiado = null;
            this.desafiante = null;
            
        }
    }

    public void lutar(){
        if(this.getAprovada()){
            this.desafiado.apresentar();
            System.out.println();
            this.desafiante.apresentar();
            int random = r.nextInt(3);

            if(random == 0){
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                System.out.println("VITORIA DO DESAFIANTE " + this.desafiante.getNome());
            }else if(random == 1){
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("VITORIA DO DESAFIADO " + this.desafiado.getNome());
            }else{
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                System.out.println("EMPATE");
            }
            System.out.println("===========================");
            this.desafiado.status();
            System.out.println();
            this.desafiante.status();

        }else{
            System.out.println("A luta não pode acontecer");
        }
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setRounds(int rd){
        this.rounds = rd;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }


}
