// Caderno 03 — Exercício 1: Rótulo de prioridade com switch expressão
package c03.exercicios.ex1;

public class RotuloPrioridade {
    public static void main(String[] args) {
        int[] prioridades = {2, 3, 5, 9};
        for (int p : prioridades) { // só preciso do item, não da posição: for-each
            String rotulo = switch (p) { // o switch devolve o valor direto, sem break
                case 1, 2 -> "baixa"; // vários valores no mesmo case
                case 3 -> "média";
                case 4, 5 -> "alta";
                default -> "inválida"; // obrigatório: int tem valores que nenhum case cobre
            };
            System.out.println(p + " = " + rotulo);
        }
    }
}
