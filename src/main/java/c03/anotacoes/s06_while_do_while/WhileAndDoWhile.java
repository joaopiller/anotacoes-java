// Caderno 03 — seção "while e do/while" (trechos)
package c03.anotacoes.s06_while_do_while;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        int pendentes = 5;
        while (pendentes > 0) { // testa ANTES de cada volta
            pendentes -= 2; // a condição tem que ficar falsa em algum momento, senão trava pra sempre
            System.out.print(pendentes + " "); // 3 1 -1
        }
        System.out.println();

        int tentativas = 0;
        boolean conseguiu;
        do { // testa DEPOIS: roda pelo menos uma vez
            tentativas++;
            conseguiu = tentativas == 3; // "dá certo" na terceira
        } while (!conseguiu && tentativas < 5); // tenta de novo, no máximo 5 vezes

        System.out.println(tentativas); // 3

        while (pendentes > 0) { // condição já começa falsa: zero execuções
            System.out.println("Não aparece");
        }
        // loop infinito não dá erro, só trava; se o programa não termina procurar um while que nunca muda
    }
}
