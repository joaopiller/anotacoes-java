// Caderno 03 — seção "switch clássico e o break esquecido" (trechos)
package c03.anotacoes.s03_switch_classico;

public class ClassicSwitch {
    public static void main(String[] args) {
        // funciona com int, char, String e enum; com String compara usando equals
        // se status for null lança NullPointerException
        String status = "EM_ANDAMENTO";
        switch (status) {
            case "PENDENTE":
                System.out.println("Não começou.");
                break;
            case "EM_ANDAMENTO":
                System.out.println("Em andamento."); // roda
                // esqueci o break de propósito: cai no próximo case!
            case "CONCLUIDA":
                System.out.println("Pronta."); // roda também, errado
                break; // aqui para
            default: // roda quando nenhum case bate, igual o else
                System.out.println("Desconhecido: " + status);
        }
        // o case não é testado de novo, é só um ponto de entrada
        // o switch compara uma vez, pula pro case que bateu e vai linha por linha até achar um break
        // em código legado conferir o break de cada case; em código novo usar a seta ->
    }
}
