// Caderno 03 — seção "for clássico e for-each" (trechos)
package c03.anotacoes.s07_for_for_each;

public class ForAndForEach {
    public static void main(String[] args) {
        String[] titulos = {"Estudar", "Revisar", "Testar"};
        double[] horas = {2.0, 0.5, 1.5};

        for (int i = 0; i < titulos.length; i++) { // inicio; condição; passo. Tem que ser <, com <= estoura na última volta
            System.out.println((i + 1) + ". " + titulos[i]); // 1. Estudar / 2. Revisar / 3. Testar
        }
        // o i só existe dentro do for

        double total = 0;
        for (double h : horas) { // "para cada h em horas": sem índice, não tem como estourar
            total += h;
        }
        System.out.println(total); // 4.0

        for (int i = titulos.length - 1; i >= 0; i--) { // de trás pra frente precisa de índice
            System.out.print(titulos[i].charAt(0)); // TRE
        }
        System.out.println();

        for (int i = 0; i < 10; i += 3) System.out.print(i + " "); // 0 3 6 9, passo diferente vai no cabeçalho
        System.out.println();

        // for-each quando só preciso dos itens
        // for com índice quando preciso da posição, de passo diferente (2 em 2) ou ordem inversa
        // não mexer no i dentro do corpo: pula elementos sem ninguém perceber
    }
}
