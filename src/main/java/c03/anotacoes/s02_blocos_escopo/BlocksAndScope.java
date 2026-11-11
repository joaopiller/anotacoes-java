// Caderno 03 — seção "Blocos e escopo" (trechos)
package c03.anotacoes.s02_blocos_escopo;

public class BlocksAndScope {
    public static void main(String[] args) {
        // bloco é tudo entre { e }; a variável nasce na declaração e morre na chave que fecha
        // blocos internos enxergam os externos, o contrário não
        int prioridade = 2;
        String rotulo; // declarada fora pra sobreviver ao if
        if (prioridade >= 4) {
            String motivo = "alta"; // só existe dentro desse bloco
            rotulo = "Urgente (" + motivo + ")";
            // int prioridade = 5; // não compila: variable prioridade is already defined
        } else {
            rotulo = "Normal";
        }

        System.out.println(rotulo); // Normal
        // System.out.println(motivo); // não compila: cannot find symbol, motivo morreu na chave
        // rotulo sem valor é aceito porque TODOS os caminhos atribuem antes do uso
        // sem o else daria: variable rotulo might not have been initialized
    }
}
