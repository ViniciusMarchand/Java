package JavaPOOaula09;

import java.util.Random;

//titulo , autor, totPaginas, pagAtual, aberto, leitor
//detalhes()
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    Random r = new Random();

    public Livro(String ti, String au, int tot, Pessoa le){
        this.setTitulo(ti);
        this.setAutor(au);
        this.setTotPaginas(tot);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(le);
    }

    public void detalhes(){
        System.out.println("=========DETALHES DO LIVRO========");
        System.out.println("TITULO: " + this.getTitulo());
        System.out.println("AUTOR: " + this.getAutor());
        System.out.println("TOTAL DE PAGINAS: " + this.getTotPaginas());
        System.out.println("PAGINA ATUAL: "  + this.getPagAtual());
        System.out.println("ABERTO: "  + this.getAberto());
        System.out.println("LEITOR: " + this.leitor.getNome());
        System.out.println("=================================");
        System.out.println();
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String ti){
        this.titulo = ti;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String au){
        this.autor = au;
    }

    public int getTotPaginas(){
        return this.totPaginas;
    }

    public void setTotPaginas(int tot){
        this.totPaginas = tot;
    }

    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setPagAtual(int pa){
        this.pagAtual = pa;
    }

    public boolean getAberto(){
        return this.aberto;
    }

    public void setAberto(boolean ab){
        this.aberto = ab;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }

    public void setLeitor(Pessoa le){
        this.leitor = le;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        if(this.getAberto()){
            int random  = r.nextInt(this.getTotPaginas());
            this.setPagAtual(random);
        }
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
