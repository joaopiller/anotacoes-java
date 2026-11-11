// Caderno 03 — seção "if / else if / else" (trechos)
package c03.anotacoes.s01_if_else;

public class IfElse {
    public static void main(String[] args) {
        int prioridade = 4;
        boolean concluida = false;
        int diasAtrasada = 3;

        if (concluida) { // if (concluida == true) é redundante, já é boolean
            System.out.println("Nada a fazer!");
        } else if (diasAtrasada > 0 && prioridade >= 4) { // o caso específico vem ANTES do genérico
            System.out.println("Urgente: atrasada " + diasAtrasada + " dias."); // esse roda, os outros nem são testados
        } else if (diasAtrasada > 0) {
            System.out.println("Atrasada!");
        } else {
            System.out.println("Em dia.");
        }

        if (prioridade >= 4) System.out.println("Alta."); // sem chaves, só a próxima instrução entra no if
        // melhor usar chaves sempre, senão uma segunda linha parece que tá dentro do if mas não tá

        boolean ativo = false;
        if (ativo = true) { // CUIDADO: um = só ATRIBUI e compila, não compara
            System.out.println("entrou mesmo com ativo = false"); // roda, porque a atribuição vale true
        }
        // comparação é ==, e pra boolean nem precisa: if (ativo)
    }
}
