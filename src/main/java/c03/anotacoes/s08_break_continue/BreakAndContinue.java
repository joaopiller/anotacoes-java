// Caderno 03 — seção "break, continue e loops aninhados" (trechos)
package c03.anotacoes.s08_break_continue;

public class BreakAndContinue {
    public static void main(String[] args) {
        String[] titulos = {"Estudar", "Revisar", "Testar"};
        boolean[] concluidas = {true, false, false};

        for (int i = 0; i < titulos.length; i++) {
            if (concluidas[i]) continue; // pula o resto do corpo e vai pra próxima volta
            System.out.println("pendente: " + titulos[i]); // Revisar, Testar
        }

        int posicao = -1; // convenção de "não encontrado"
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i].equals("Testar")) {
                posicao = i;
                break; // achou, sai do loop na hora e não olha o resto
            }
        }
        System.out.println(posicao); // 2

        for (String usuario : new String[]{"ana", "bia"}) { // cada volta do externo roda o interno inteiro
            for (String t : titulos) {
                if (t.startsWith("R")) continue; // só afeta o loop mais interno
                System.out.println(usuario + " -> " + t); // ana -> Estudar, ana -> Testar, bia -> Estudar, bia -> Testar
            }
        }
        // pra sair dos dois de uma vez existe rótulo (externo: for ... break externo;), mas é raro
        // normalmente é sinal que o loop interno devia virar um método (caderno 04)
    }
}
