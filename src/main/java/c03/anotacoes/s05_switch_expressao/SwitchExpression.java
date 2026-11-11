// Caderno 03 — seção "switch como expressão" (trechos)
package c03.anotacoes.s05_switch_expressao;

enum Status { PENDENTE, EM_ANDAMENTO, CONCLUIDA, CANCELADA }

public class SwitchExpression {
    public static void main(String[] args) {
        int prioridade = 5;

        // switch como INSTRUÇÃO: variável vazia e cada ramo preenche
        String rotuloInstrucao;
        switch (prioridade) {
            case 1, 2 -> rotuloInstrucao = "baixa";
            case 3 -> rotuloInstrucao = "média";
            case 4, 5 -> rotuloInstrucao = "alta";
            default -> rotuloInstrucao = "inválida"; // sem esse o compilador reclama que pode ficar sem valor
        }
        System.out.println(rotuloInstrucao); // alta

        // switch como EXPRESSÃO: o switch inteiro "vale" o resultado do case escolhido
        final String rotulo = switch (prioridade) { // pode até ser final, já nasce com valor
            case 1, 2 -> "baixa"; // à direita da seta vai o VALOR, não uma instrução
            case 3 -> "média";
            case 4, 5 -> "alta";
            default -> "inválida"; // obrigatório: int tem bilhões de valores; se fosse enum, dispensaria
        }; // precisa do ;, porque a linha inteira é uma atribuição

        System.out.println(rotulo); // alta
        // dica: se eu declarei uma variável vazia antes do switch, é expressão

        Status status = Status.EM_ANDAMENTO;
        int peso = switch (status) {
            case CONCLUIDA, CANCELADA -> 0;
            case PENDENTE -> 1;
            case EM_ANDAMENTO -> { // mais de uma linha: abre bloco
                int base = 2;
                yield base * prioridade; // yield entrega o valor desse ramo; return sairia do main inteiro
            }
        }; // enum com todos os valores cobertos: sem default
        System.out.println(peso); // 10
    }
}
