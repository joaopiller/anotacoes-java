// Caderno 03 — seção "Condições compostas legíveis" (trechos)
package c03.anotacoes.s09_condicoes_compostas;

public class CompoundConditions {
    public static void main(String[] args) {
        String titulo = "Revisar PR";
        int prioridade = 4;
        int diasAtrasada = 2;
        boolean concluida = false;

        // dar nome pra cada pedaço numa boolean: o if vira uma frase e no debug dá pra ver cada parte
        boolean temTitulo = titulo != null && !titulo.isBlank(); // curto-circuito: se for null nem chama o isBlank
        boolean prioridadeValida = prioridade >= 1 && prioridade <= 5;
        boolean precisaDeAtencao = !concluida && diasAtrasada > 0 && prioridade >= 4;

        if (temTitulo && prioridadeValida) { // bem melhor que um if gigante com tudo junto
            System.out.println("válida"); // válida
        }

        System.out.println(precisaDeAtencao); // true
        // em código real cada uma vira um método: temTitulo(), estaAtrasada() (caderno 04)
    }
}
