// Caderno 02 — Exercício 1: Ficha de uma tarefa com String.format
package c02.exercicios.ex1;

public class FichaTarefa {
    public static void main(String[] args) {
        long id = 1001L;
        String titulo = "Configurar ambiente";
        int prioridade = 1;
        double horas = 2.5;
        boolean concluida = true;
        String linha = String.format("#%d %s | prio %d | %.1fh | concluída: %b",
                id, titulo, prioridade, horas, concluida); // cada marcador pega um valor na ordem
        System.out.println(linha); // #1001 Configurar ambiente | prio 1 | 2,5h | concluída: true
    }
}
