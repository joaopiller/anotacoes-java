// Caderno 03 — seção "Ternário vs if" (trechos)
package c03.anotacoes.s10_ternario;

public class TernaryVsIf {
    public static void main(String[] args) {
        int pendentes = 1;
        String plural = pendentes == 1 ? "tarefa" : "tarefas"; // condição ? a : b, escolhe um VALOR entre dois
        System.out.println(pendentes + " " + plural); // 1 tarefa

        int p = 3;
        String ruim = p >= 4 ? "alta" : p == 3 ? "média" : "baixa"; // funciona, mas ternário aninhado ninguém lê
        String bom = switch (p) { case 4, 5 -> "alta"; case 3 -> "média"; default -> "baixa"; }; // 3 ou mais opções: switch expressão
        System.out.println(ruim + " " + bom); // média média
        // ternário só quando os dois lados são simples; pra ação (imprimir, chamar método) usar if
    }
}
