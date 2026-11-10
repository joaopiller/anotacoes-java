// Caderno 01 — seção "Convenções de nome"
package c01.anotacoes.s12_convencoes_de_nome;

public class NamingConventions {
    // classe/interface/enum/record = PascalCase, método e variável = camelCase
    // constante = UPPER_SNAKE_CASE, pacote = minúsculo com ponto (br.com.joao.tarefas)
    static final int LIMITE_DE_TAREFAS = 5; // constante: final trava o valor, static o caderno 06 explica

    public static void main(String[] args) {
        String tituloDaTarefa = "Revisar PR"; // nome diz o que é, nada de "t" ou "str"
        boolean concluida = false; // boolean lê como pergunta
        System.out.println(tituloDaTarefa + " " + concluida + " " + LIMITE_DE_TAREFAS);
        // no Spring a classe termina com o papel dela (TarefaService) e os métodos são verbos (buscarPorId)
    }
}
