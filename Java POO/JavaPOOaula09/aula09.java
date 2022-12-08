package JavaPOOaula09;

public class aula09 {
    public static void main(String[] args) {
        Pessoa vinico = new Pessoa("Vinicius", 19, "Masculino");
        Livro livroDoVinico = new Livro("Como ser um alpha" , "Breier", 1500, vinico);
        livroDoVinico.abrir();
        livroDoVinico.folhear();
        livroDoVinico.detalhes();
    }
    
    
    

}
