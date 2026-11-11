// Caderno 03 — Exercício 4: Validar a conclusão com guard clauses
package c03.exercicios.ex4;

public class PodeConcluir {
    public static void main(String[] args) {
        System.out.println(podeConcluir("Revisar", false, 0)); // ok
        System.out.println(podeConcluir("  ", false, 0)); // erro: sem título
        System.out.println(podeConcluir("Revisar", true, 0)); // erro: já concluída
        System.out.println(podeConcluir("Revisar", false, 2)); // erro: 2 subtarefas abertas
    }

    static String podeConcluir(String titulo, boolean concluida, int subtarefasAbertas) {
        // cada guarda testa um caso inválido e sai com return; sem else
        if (titulo == null || titulo.isBlank()) return "erro: sem título"; // null primeiro, senão isBlank em null dá NullPointerException
        if (concluida) return "erro: já concluída";
        if (subtarefasAbertas > 0) return "erro: " + subtarefasAbertas + " subtarefas abertas";
        return "ok"; // só chega aqui se passou por todas as guardas
    }
}
