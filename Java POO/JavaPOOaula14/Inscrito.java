package JavaPOOaula14;
public class Inscrito extends Pessoa{
    private String login;
    private int totAssistido;
    
    public Inscrito(String no, int id, String se, String lo) {
        super(no, id, se);
        this.setLogin(lo);
        this.setTotAssistidos(0);
    }
    

    public void viuMaisUm(){
        this.setTotAssistidos(this.getTotAssistidos() +1);
    }

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String lo){
        this.login = lo;
    }

    public int getTotAssistidos(){
        return this.totAssistido;
    }
    public void setTotAssistidos(int tot){
        this.totAssistido = tot;
    }
}