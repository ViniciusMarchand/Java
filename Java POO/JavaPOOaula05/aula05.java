package JavaPOOaula05;
public class aula05 {
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(11111);
        p1.setDono("JUBILEU");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();

        p2.setNumConta(22222);
        p2.setDono("CLAUDIA");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();
    }
}