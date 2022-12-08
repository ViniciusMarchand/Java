//DIAGRAMA DE CLASSE 

/*numConta +
 * tipo (CC/CP) if(cc) saldo = 50 else if(cp) = 150 #
 * dono-
 * saldo-
 * status-
 * ==========
 * abrirConta() +
 * fecharConta() não pode ter dinheiro e não pode estar devendo +
 * depositar()  status tem que ser true +
 * sacar()  status tem que ser true e saldo maior ou igual ao saque +
 * pagarMensalidade() CC = 12 e  CP 20 +
 * 
 * MÉTODO CONSTRUTOR{
 * STATUS FALSE
 * SALDO = 0
 * }
 */

package JavaPOOaula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("==========================");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("DONO: " + this.getDono());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50);
        }else if (t.equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(saldo == 0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }else{
            System.out.println("Conta só pode ser fechado se o saldo for igual a 0");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() -v );
                System.out.println("Saque realizado na conta de "  + this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }
    }
    public void pagarMensalidade(){
        
        if(this.getStatus()){
            int v = 0;
            if(this.getTipo().equals("CC")){
                v = 12;
            }else{
                v = 20;
            }
            System.out.println("MENSALIDADE PAGA");
            this.setSaldo(this.getSaldo() - v);
        }
    }
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }


    //NUMCONTA
    public int getNumConta(){
            return numConta;
        }


    public void setNumConta(int n){
        this.numConta = n;
    }

    //DONO
    
    
    public String getDono(){
        return this.dono;
    }

    public void setDono(String n){
        this.dono = n;
    }
    

    //TIPO

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String n){
        this.tipo = n;
    }

    //SALDO

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    //STATUS 

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

}
