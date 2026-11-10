// Caderno 02 — Exercício 2: Paginação com inteiros
package c02.exercicios.ex2;

import java.util.Locale;

public class Paginacao {
    public static void main(String[] args) {
        int total = 47, porPagina = 10;
        int cheias = total / porPagina; // 4, divisão inteira
        int sobra = total % porPagina; // 7, resto
        int paginas = (total + porPagina - 1) / porPagina; // 5, truque pra arredondar pra cima sem Math
        double media = (double) total / paginas; // o cast tem que vir ANTES da divisão senão divide em int
        System.out.println(cheias + " " + sobra + " " + paginas); // 4 7 5
        System.out.println(String.format(Locale.US, "%.2f", media)); // 9.40 com ponto por causa do Locale
    }
}
