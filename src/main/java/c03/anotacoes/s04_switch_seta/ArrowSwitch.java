// Caderno 03 — seção "switch moderno: a seta ->" (trechos)
package c03.anotacoes.s04_switch_seta;

enum Status { PENDENTE, EM_ANDAMENTO, CONCLUIDA, CANCELADA } // tipo com valores fixos (caderno 08)

public class ArrowSwitch {
    public static void main(String[] args) {
        Status status = Status.EM_ANDAMENTO; // fora do switch precisa do Status. na frente

        switch (status) {
            case PENDENTE -> System.out.println("Não começou."); // dentro do case não precisa, o Java já sabe que é Status
            case EM_ANDAMENTO -> System.out.println("Em andamento."); // só esse roda e acabou, sem break
            case CONCLUIDA, CANCELADA -> System.out.println("Encerrada."); // vários valores no mesmo case
        }
        // sem default: os 4 valores já têm case
        // se faltasse um, ainda compila (como instrução): o switch só não faz nada e segue pra linha de baixo
    }
}
