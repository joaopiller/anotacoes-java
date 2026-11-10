// Caderno 01 — Exercício 2: Lista de tarefas com printf
package c01.exercicios.ex2;

public class ListaComPrintf {
    static final String TITULO_LISTA = "Minhas tarefas"; // constante fica fora do main

    public static void main(String[] args) {
        System.out.printf("%s%n", TITULO_LISTA);
        System.out.printf("Tarefa: %s | prioridade %d | %.2fh%n", "Estudar Java", 1, 2.0);
        System.out.printf("Tarefa: %s | prioridade %d | %.2fh%n", "Revisar PR", 2, 0.5);
        System.out.printf("Tarefa: %s | prioridade %d | %.2fh%n", "Reunião de equipe", 3, 1.25);
        // no meu sistema sai 2,00h com vírgula, o caderno 02 mostra o Locale.US pra fixar o ponto
    }
}
