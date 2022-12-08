/*3 pilares do POO
 * E H P
 * ENCAPSULAMENTO
 * HERANÇA
 * POLIMORFISMO 
 * 
 * ========ENCAPSULAMENTO========
 * Capsula
 * EXEMPLO: PILHA
 * Por que a pilha é uma capsula?
 * 1º Proteger o usuário do seu interior 
 * 2º Proteção da pilha contra o usuário
 * 3º Padronização 
 * OBS: Não funcionam da mesma maneira em seu interior
 * Objetivo: Ocultar partes independentes da implementação, permitindo construir partes invisíveis  * ao mundo exterior.
 * Mandar mensagens para a capsula e essa capsula de dara uma resposta 
 * Interface: Lista de serviços fornecidos por um componente. É o contato com o mundo exterior que  * define o que pode ser feito com um objeto dessa classe.
 * exemplo, os polos da pilha são uma interface.
 * AVISO: Encapsular não é obrigatório, mas é uma boa prática para produzir Classes mais eficientes.
 * 
 * VANTAGENS:
 * 1º Tornar mudanças invisíveis
 * 2º Facilitar a reutilização de código
 * 3º Reduzir os efeitos colaterais
 * 
 * Todos os métodos de uma interface são públicos e utilizam métodos abstratos 
 */

package JavaPOOaula06;

public class aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.pause();
        c.abrirMenu();
    }
}
