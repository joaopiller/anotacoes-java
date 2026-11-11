// Caderno 03 — Exercício 3: Achar a primeira tarefa atrasada com break
package c03.exercicios.ex3;

public class PrimeiraAtrasada {
    public static void main(String[] args) {
        String[] titulos = {"Estudar", "Revisar", "Testar"};
        System.out.println(primeiraAtrasada(titulos, new int[]{0, 3, 7})); // Revisar
        System.out.println(primeiraAtrasada(titulos, new int[]{0, 0, 0})); // nenhuma
        // new int[]{...} cria o array direto na chamada
    }

    static String primeiraAtrasada(String[] titulos, int[] diasAtraso) {
        String achada = "nenhuma"; // valor padrão caso o loop não ache nada
        for (int i = 0; i < titulos.length; i++) {
            if (diasAtraso[i] > 0) {
                achada = titulos[i];
                break; // achou: sai do loop e nem olha "Testar", que também tá atrasada
            }
        }
        return achada;
    }
}
